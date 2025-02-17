// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.networkcloud.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.networkcloud.models.ClusterMetricsConfigurationPatchParameters;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class ClusterMetricsConfigurationPatchParametersTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ClusterMetricsConfigurationPatchParameters model =
            BinaryData
                .fromString(
                    "{\"properties\":{\"collectionInterval\":7103604818912185763,\"enabledMetrics\":[\"kwr\",\"snkq\",\"hsyrqunj\"]},\"tags\":{\"ulkpakd\":\"enx\",\"wtqabpxuckp\":\"ifmjnn\"}}")
                .toObject(ClusterMetricsConfigurationPatchParameters.class);
        Assertions.assertEquals("enx", model.tags().get("ulkpakd"));
        Assertions.assertEquals(7103604818912185763L, model.collectionInterval());
        Assertions.assertEquals("kwr", model.enabledMetrics().get(0));
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ClusterMetricsConfigurationPatchParameters model =
            new ClusterMetricsConfigurationPatchParameters()
                .withTags(mapOf("ulkpakd", "enx", "wtqabpxuckp", "ifmjnn"))
                .withCollectionInterval(7103604818912185763L)
                .withEnabledMetrics(Arrays.asList("kwr", "snkq", "hsyrqunj"));
        model = BinaryData.fromObject(model).toObject(ClusterMetricsConfigurationPatchParameters.class);
        Assertions.assertEquals("enx", model.tags().get("ulkpakd"));
        Assertions.assertEquals(7103604818912185763L, model.collectionInterval());
        Assertions.assertEquals("kwr", model.enabledMetrics().get(0));
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
