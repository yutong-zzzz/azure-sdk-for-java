// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.managednetworkfabric.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.HttpResponse;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.resourcemanager.managednetworkfabric.ManagedNetworkFabricManager;
import com.azure.resourcemanager.managednetworkfabric.models.NetworkDevice;
import com.azure.resourcemanager.managednetworkfabric.models.NetworkDeviceRoleTypes;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public final class NetworkDevicesListMockTests {
    @Test
    public void testList() throws Exception {
        HttpClient httpClient = Mockito.mock(HttpClient.class);
        HttpResponse httpResponse = Mockito.mock(HttpResponse.class);
        ArgumentCaptor<HttpRequest> httpRequest = ArgumentCaptor.forClass(HttpRequest.class);

        String responseStr =
            "{\"value\":[{\"properties\":{\"version\":\"tp\",\"networkDeviceSku\":\"pz\",\"networkDeviceRole\":\"TS\",\"provisioningState\":\"Canceled\",\"networkRackId\":\"x\",\"hostName\":\"oqraswugyxpqi\",\"serialNumber\":\"eialwvskb\",\"annotation\":\"z\"},\"location\":\"aq\",\"tags\":{\"cujp\":\"tco\",\"bizt\":\"sxzakuejkm\"},\"id\":\"ofqcvovjufycsjm\",\"name\":\"bemyeji\",\"type\":\"iuxegth\"}]}";

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

        ManagedNetworkFabricManager manager =
            ManagedNetworkFabricManager
                .configure()
                .withHttpClient(httpClient)
                .authenticate(
                    tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                    new AzureProfile("", "", AzureEnvironment.AZURE));

        PagedIterable<NetworkDevice> response = manager.networkDevices().list(com.azure.core.util.Context.NONE);

        Assertions.assertEquals("aq", response.iterator().next().location());
        Assertions.assertEquals("tco", response.iterator().next().tags().get("cujp"));
        Assertions.assertEquals("pz", response.iterator().next().networkDeviceSku());
        Assertions.assertEquals(NetworkDeviceRoleTypes.TS, response.iterator().next().networkDeviceRole());
        Assertions.assertEquals("oqraswugyxpqi", response.iterator().next().hostname());
        Assertions.assertEquals("eialwvskb", response.iterator().next().serialNumber());
        Assertions.assertEquals("z", response.iterator().next().annotation());
    }
}
