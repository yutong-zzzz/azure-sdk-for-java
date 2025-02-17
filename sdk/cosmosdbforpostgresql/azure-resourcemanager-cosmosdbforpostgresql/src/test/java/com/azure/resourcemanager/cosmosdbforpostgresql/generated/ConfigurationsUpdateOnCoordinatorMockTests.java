// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cosmosdbforpostgresql.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.HttpResponse;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.resourcemanager.cosmosdbforpostgresql.CosmosDBForPostgreSqlManager;
import com.azure.resourcemanager.cosmosdbforpostgresql.fluent.models.ServerConfigurationInner;
import com.azure.resourcemanager.cosmosdbforpostgresql.models.ServerConfiguration;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public final class ConfigurationsUpdateOnCoordinatorMockTests {
    @Test
    public void testUpdateOnCoordinator() throws Exception {
        HttpClient httpClient = Mockito.mock(HttpClient.class);
        HttpResponse httpResponse = Mockito.mock(HttpResponse.class);
        ArgumentCaptor<HttpRequest> httpRequest = ArgumentCaptor.forClass(HttpRequest.class);

        String responseStr =
            "{\"properties\":{\"value\":\"loayqcgw\",\"source\":\"zjuzgwyz\",\"description\":\"txon\",\"defaultValue\":\"ts\",\"dataType\":\"Enumeration\",\"allowedValues\":\"bp\",\"requiresRestart\":true,\"provisioningState\":\"Succeeded\"},\"id\":\"knftguvriuh\",\"name\":\"rwmdyvxqtay\",\"type\":\"iwwroyqbexrmc\"}";

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

        CosmosDBForPostgreSqlManager manager =
            CosmosDBForPostgreSqlManager
                .configure()
                .withHttpClient(httpClient)
                .authenticate(
                    tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                    new AzureProfile("", "", AzureEnvironment.AZURE));

        ServerConfiguration response =
            manager
                .configurations()
                .updateOnCoordinator(
                    "hniskxfbkpyc",
                    "klwndnhjdauwhv",
                    "l",
                    new ServerConfigurationInner().withValue("btdhxujznbm"),
                    com.azure.core.util.Context.NONE);

        Assertions.assertEquals("loayqcgw", response.value());
    }
}
