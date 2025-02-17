// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.kubernetesconfiguration.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.kubernetesconfiguration.models.HelmOperatorProperties;
import org.junit.jupiter.api.Assertions;

public final class HelmOperatorPropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        HelmOperatorProperties model =
            BinaryData
                .fromString("{\"chartVersion\":\"m\",\"chartValues\":\"yvshxmz\"}")
                .toObject(HelmOperatorProperties.class);
        Assertions.assertEquals("m", model.chartVersion());
        Assertions.assertEquals("yvshxmz", model.chartValues());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        HelmOperatorProperties model = new HelmOperatorProperties().withChartVersion("m").withChartValues("yvshxmz");
        model = BinaryData.fromObject(model).toObject(HelmOperatorProperties.class);
        Assertions.assertEquals("m", model.chartVersion());
        Assertions.assertEquals("yvshxmz", model.chartValues());
    }
}
