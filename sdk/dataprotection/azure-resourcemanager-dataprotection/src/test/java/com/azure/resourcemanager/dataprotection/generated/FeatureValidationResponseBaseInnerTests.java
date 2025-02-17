// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.dataprotection.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.dataprotection.fluent.models.FeatureValidationResponseBaseInner;

public final class FeatureValidationResponseBaseInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        FeatureValidationResponseBaseInner model =
            BinaryData
                .fromString("{\"objectType\":\"FeatureValidationResponseBase\"}")
                .toObject(FeatureValidationResponseBaseInner.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        FeatureValidationResponseBaseInner model = new FeatureValidationResponseBaseInner();
        model = BinaryData.fromObject(model).toObject(FeatureValidationResponseBaseInner.class);
    }
}
