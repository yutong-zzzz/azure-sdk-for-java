// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.dataprotection.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.dataprotection.models.CustomCopyOption;
import org.junit.jupiter.api.Assertions;

public final class CustomCopyOptionTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        CustomCopyOption model =
            BinaryData
                .fromString("{\"objectType\":\"CustomCopyOption\",\"duration\":\"ldgmfpgvmpip\"}")
                .toObject(CustomCopyOption.class);
        Assertions.assertEquals("ldgmfpgvmpip", model.duration());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        CustomCopyOption model = new CustomCopyOption().withDuration("ldgmfpgvmpip");
        model = BinaryData.fromObject(model).toObject(CustomCopyOption.class);
        Assertions.assertEquals("ldgmfpgvmpip", model.duration());
    }
}
