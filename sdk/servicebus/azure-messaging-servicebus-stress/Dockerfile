FROM mcr.microsoft.com/openjdk/jdk:11-mariner as builder
WORKDIR application
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} application.jar
RUN java -Djarmode=layertools -jar application.jar extract

FROM mcr.microsoft.com/openjdk/jdk:11-mariner
WORKDIR application
COPY --from=builder application/dependencies/ ./
COPY --from=builder application/spring-boot-loader/ ./
COPY --from=builder application/snapshot-dependencies/ ./
COPY --from=builder application/application/ ./
ARG AGENT_URL=https://github.com/microsoft/ApplicationInsights-Java/releases/download/3.4.13/applicationinsights-agent-3.4.13.jar
ADD ${AGENT_URL} ./BOOT-INF/classes/
ENTRYPOINT ["java","org.springframework.boot.loader.JarLauncher", \
            "-javaagent:BOOT-INF/classes/applicationinsights-agent-3.4.13.jar", \
            "--TEST_CLASS=MessageSender"]

