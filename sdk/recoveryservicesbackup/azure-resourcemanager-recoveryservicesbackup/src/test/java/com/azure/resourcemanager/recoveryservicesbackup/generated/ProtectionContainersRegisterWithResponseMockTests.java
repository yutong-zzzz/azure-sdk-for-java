// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesbackup.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.HttpResponse;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.resourcemanager.recoveryservicesbackup.RecoveryServicesBackupManager;
import com.azure.resourcemanager.recoveryservicesbackup.models.BackupManagementType;
import com.azure.resourcemanager.recoveryservicesbackup.models.ProtectionContainer;
import com.azure.resourcemanager.recoveryservicesbackup.models.ProtectionContainerResource;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public final class ProtectionContainersRegisterWithResponseMockTests {
    @Test
    public void testRegisterWithResponse() throws Exception {
        HttpClient httpClient = Mockito.mock(HttpClient.class);
        HttpResponse httpResponse = Mockito.mock(HttpResponse.class);
        ArgumentCaptor<HttpRequest> httpRequest = ArgumentCaptor.forClass(HttpRequest.class);

        String responseStr =
            "{\"properties\":{\"containerType\":\"ProtectionContainer\",\"friendlyName\":\"hueoijyzcqyp\",\"backupManagementType\":\"AzureWorkload\",\"registrationStatus\":\"fgsyfejyvdw\",\"healthStatus\":\"xptpqaya\",\"protectableObjectType\":\"ncfgybmxsnxoc\"},\"eTag\":\"llojkpoyhgwwdj\",\"location\":\"xdbdljzgdyrcvu\",\"tags\":{\"qogdx\":\"gzlrqhbj\",\"xxtjlflecomi\":\"bsfp\"},\"id\":\"xojjl\",\"name\":\"xxdhilzzdzzqjm\",\"type\":\"ezay\"}";

        Mockito.when(httpResponse.getStatusCode()).thenReturn(200);
        Mockito.when(httpResponse.getHeaders()).thenReturn(new HttpHeaders());
        Mockito
            .when(httpResponse.getBody())
            .thenReturn(Flux.just(ByteBuffer.wrap(responseStr.getBytes(StandardCharsets.UTF_8))));
        Mockito
            .when(httpResponse.getBodyAsByteArray())
            .thenReturn(Mono.just(responseStr.getBytes(StandardCharsets.UTF_8)));
        Mockito
            .when(httpClient.send(httpRequest.capture(), Mockito.any()))
            .thenReturn(
                Mono
                    .defer(
                        () -> {
                            Mockito.when(httpResponse.getRequest()).thenReturn(httpRequest.getValue());
                            return Mono.just(httpResponse);
                        }));

        RecoveryServicesBackupManager manager =
            RecoveryServicesBackupManager
                .configure()
                .withHttpClient(httpClient)
                .authenticate(
                    tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                    new AzureProfile("", "", AzureEnvironment.AZURE));

        ProtectionContainerResource response =
            manager
                .protectionContainers()
                .define("rsubklrxhjnl")
                .withRegion("klozkxbz")
                .withExistingBackupFabric("kerv", "choadhrsxqv", "vspabdsrgfajgl")
                .withTags(mapOf("tttk", "jplssan"))
                .withProperties(
                    new ProtectionContainer()
                        .withFriendlyName("tjdvqydieqqkwa")
                        .withBackupManagementType(BackupManagementType.DEFAULT_BACKUP)
                        .withRegistrationStatus("xv")
                        .withHealthStatus("xoebwg")
                        .withProtectableObjectType("bibanbau"))
                .withEtag("tzvp")
                .create();

        Assertions.assertEquals("xdbdljzgdyrcvu", response.location());
        Assertions.assertEquals("gzlrqhbj", response.tags().get("qogdx"));
        Assertions.assertEquals("hueoijyzcqyp", response.properties().friendlyName());
        Assertions.assertEquals(BackupManagementType.AZURE_WORKLOAD, response.properties().backupManagementType());
        Assertions.assertEquals("fgsyfejyvdw", response.properties().registrationStatus());
        Assertions.assertEquals("xptpqaya", response.properties().healthStatus());
        Assertions.assertEquals("ncfgybmxsnxoc", response.properties().protectableObjectType());
        Assertions.assertEquals("llojkpoyhgwwdj", response.etag());
    }

    @SuppressWarnings("unchecked")
    private static <T> Map<String, T> mapOf(Object... inputs) {
        Map<String, T> map = new HashMap<>();
        for (int i = 0; i < inputs.length; i += 2) {
            String key = (String) inputs[i];
            T value = (T) inputs[i + 1];
            map.put(key, value);
        }
        return map;
    }
}
