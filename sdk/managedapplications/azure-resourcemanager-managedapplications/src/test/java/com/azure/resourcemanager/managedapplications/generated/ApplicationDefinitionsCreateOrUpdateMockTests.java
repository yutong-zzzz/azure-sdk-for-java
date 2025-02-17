// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.managedapplications.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.HttpResponse;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.resourcemanager.managedapplications.ApplicationManager;
import com.azure.resourcemanager.managedapplications.models.ApplicationDefinition;
import com.azure.resourcemanager.managedapplications.models.ApplicationLockLevel;
import com.azure.resourcemanager.managedapplications.models.Identity;
import com.azure.resourcemanager.managedapplications.models.ResourceIdentityType;
import com.azure.resourcemanager.managedapplications.models.Sku;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public final class ApplicationDefinitionsCreateOrUpdateMockTests {
    @Test
    public void testCreateOrUpdate() throws Exception {
        HttpClient httpClient = Mockito.mock(HttpClient.class);
        HttpResponse httpResponse = Mockito.mock(HttpResponse.class);
        ArgumentCaptor<HttpRequest> httpRequest = ArgumentCaptor.forClass(HttpRequest.class);

        String responseStr =
            "{\"properties\":{\"lockLevel\":\"None\",\"displayName\":\"lkthu\",\"isEnabled\":\"qolbgyc\",\"authorizations\":[],\"artifacts\":[],\"description\":\"tgccymvaolpss\",\"packageFileUri\":\"lfmmdnbbglzpswi\",\"mainTemplate\":\"datamcwyhzdxssadb\",\"createUiDefinition\":\"datanvdfznuda\"},\"managedBy\":\"vxzbncb\",\"sku\":{\"name\":\"lpstdbhhxsrzdz\",\"tier\":\"erscdntne\",\"size\":\"iwjmygtdssls\",\"family\":\"mweriofzpy\",\"model\":\"emwabnet\",\"capacity\":1149443455},\"identity\":{\"principalId\":\"h\",\"tenantId\":\"plvwiwubmwmbes\",\"type\":\"SystemAssigned\"},\"location\":\"k\",\"tags\":{\"flcxoga\":\"pp\",\"mkqzeqqkdltfzxmh\":\"konzmnsik\"},\"id\":\"v\",\"name\":\"gureodkwobdag\",\"type\":\"tibqdxbxwakb\"}";

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

        ApplicationManager manager =
            ApplicationManager
                .configure()
                .withHttpClient(httpClient)
                .authenticate(
                    tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                    new AzureProfile("", "", AzureEnvironment.AZURE));

        ApplicationDefinition response =
            manager
                .applicationDefinitions()
                .define("bpvjymjhx")
                .withRegion("pybsrfbjfdtw")
                .withExistingResourceGroup("nrmfqjhhk")
                .withLockLevel(ApplicationLockLevel.CAN_NOT_DELETE)
                .withAuthorizations(Arrays.asList())
                .withTags(
                    mapOf(
                        "tpvjzbexilzznfqq",
                        "t",
                        "taruoujmkcj",
                        "vwpm",
                        "ervnaenqpehi",
                        "wqytjrybnwjewgdr",
                        "mifthnzdnd",
                        "doy"))
                .withManagedBy("vxysl")
                .withSku(
                    new Sku()
                        .withName("hsfxoblytkb")
                        .withTier("pe")
                        .withSize("wfbkrvrns")
                        .withFamily("hqjohxcrsbfova")
                        .withModel("ruvw")
                        .withCapacity(1393923794))
                .withIdentity(new Identity().withType(ResourceIdentityType.SYSTEM_ASSIGNED))
                .withDisplayName("n")
                .withIsEnabled("divkrt")
                .withArtifacts(Arrays.asList())
                .withDescription("zvszj")
                .withPackageFileUri("uvjfdxxive")
                .withMainTemplate("datat")
                .withCreateUiDefinition("dataaqtdoqmcbx")
                .create();

        Assertions.assertEquals("k", response.location());
        Assertions.assertEquals("pp", response.tags().get("flcxoga"));
        Assertions.assertEquals("vxzbncb", response.managedBy());
        Assertions.assertEquals("lpstdbhhxsrzdz", response.sku().name());
        Assertions.assertEquals("erscdntne", response.sku().tier());
        Assertions.assertEquals("iwjmygtdssls", response.sku().size());
        Assertions.assertEquals("mweriofzpy", response.sku().family());
        Assertions.assertEquals("emwabnet", response.sku().model());
        Assertions.assertEquals(1149443455, response.sku().capacity());
        Assertions.assertEquals(ResourceIdentityType.SYSTEM_ASSIGNED, response.identity().type());
        Assertions.assertEquals(ApplicationLockLevel.NONE, response.lockLevel());
        Assertions.assertEquals("lkthu", response.displayName());
        Assertions.assertEquals("qolbgyc", response.isEnabled());
        Assertions.assertEquals("tgccymvaolpss", response.description());
        Assertions.assertEquals("lfmmdnbbglzpswi", response.packageFileUri());
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
