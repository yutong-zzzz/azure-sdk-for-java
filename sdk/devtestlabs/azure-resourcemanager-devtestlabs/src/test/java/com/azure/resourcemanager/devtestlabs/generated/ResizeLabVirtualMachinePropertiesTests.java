// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.devtestlabs.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.devtestlabs.models.ResizeLabVirtualMachineProperties;
import org.junit.jupiter.api.Assertions;

public final class ResizeLabVirtualMachinePropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ResizeLabVirtualMachineProperties model =
            BinaryData.fromString("{\"size\":\"jfelisdjubggbqig\"}").toObject(ResizeLabVirtualMachineProperties.class);
        Assertions.assertEquals("jfelisdjubggbqig", model.size());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ResizeLabVirtualMachineProperties model = new ResizeLabVirtualMachineProperties().withSize("jfelisdjubggbqig");
        model = BinaryData.fromObject(model).toObject(ResizeLabVirtualMachineProperties.class);
        Assertions.assertEquals("jfelisdjubggbqig", model.size());
    }
}
