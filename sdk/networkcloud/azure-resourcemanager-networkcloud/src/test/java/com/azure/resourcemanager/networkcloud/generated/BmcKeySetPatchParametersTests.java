// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.networkcloud.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.networkcloud.models.BmcKeySetPatchParameters;
import com.azure.resourcemanager.networkcloud.models.KeySetUser;
import java.time.OffsetDateTime;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class BmcKeySetPatchParametersTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        BmcKeySetPatchParameters model =
            BinaryData
                .fromString(
                    "{\"properties\":{\"expiration\":\"2021-10-26T14:14:43Z\",\"userList\":[{\"azureUserName\":\"fvwbcb\",\"description\":\"mbnkb\"},{\"azureUserName\":\"vqvxk\",\"description\":\"vqihebwtswbzuwf\"}]},\"tags\":{\"vcjfelisdjubggb\":\"ragegi\",\"gacyrcmjdmspo\":\"igkxkbsazga\"}}")
                .toObject(BmcKeySetPatchParameters.class);
        Assertions.assertEquals("ragegi", model.tags().get("vcjfelisdjubggb"));
        Assertions.assertEquals(OffsetDateTime.parse("2021-10-26T14:14:43Z"), model.expiration());
        Assertions.assertEquals("fvwbcb", model.userList().get(0).azureUsername());
        Assertions.assertEquals("mbnkb", model.userList().get(0).description());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        BmcKeySetPatchParameters model =
            new BmcKeySetPatchParameters()
                .withTags(mapOf("vcjfelisdjubggb", "ragegi", "gacyrcmjdmspo", "igkxkbsazga"))
                .withExpiration(OffsetDateTime.parse("2021-10-26T14:14:43Z"))
                .withUserList(
                    Arrays
                        .asList(
                            new KeySetUser().withAzureUsername("fvwbcb").withDescription("mbnkb"),
                            new KeySetUser().withAzureUsername("vqvxk").withDescription("vqihebwtswbzuwf")));
        model = BinaryData.fromObject(model).toObject(BmcKeySetPatchParameters.class);
        Assertions.assertEquals("ragegi", model.tags().get("vcjfelisdjubggb"));
        Assertions.assertEquals(OffsetDateTime.parse("2021-10-26T14:14:43Z"), model.expiration());
        Assertions.assertEquals("fvwbcb", model.userList().get(0).azureUsername());
        Assertions.assertEquals("mbnkb", model.userList().get(0).description());
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
