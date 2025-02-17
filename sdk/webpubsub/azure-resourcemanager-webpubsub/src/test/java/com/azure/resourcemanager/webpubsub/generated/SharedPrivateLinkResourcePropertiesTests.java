// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.webpubsub.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.webpubsub.fluent.models.SharedPrivateLinkResourceProperties;
import org.junit.jupiter.api.Assertions;

public final class SharedPrivateLinkResourcePropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        SharedPrivateLinkResourceProperties model =
            BinaryData
                .fromString(
                    "{\"groupId\":\"lcuhxwtctyqiklb\",\"privateLinkResourceId\":\"ovplw\",\"provisioningState\":\"Updating\",\"requestMessage\":\"gy\",\"status\":\"Rejected\"}")
                .toObject(SharedPrivateLinkResourceProperties.class);
        Assertions.assertEquals("lcuhxwtctyqiklb", model.groupId());
        Assertions.assertEquals("ovplw", model.privateLinkResourceId());
        Assertions.assertEquals("gy", model.requestMessage());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        SharedPrivateLinkResourceProperties model =
            new SharedPrivateLinkResourceProperties()
                .withGroupId("lcuhxwtctyqiklb")
                .withPrivateLinkResourceId("ovplw")
                .withRequestMessage("gy");
        model = BinaryData.fromObject(model).toObject(SharedPrivateLinkResourceProperties.class);
        Assertions.assertEquals("lcuhxwtctyqiklb", model.groupId());
        Assertions.assertEquals("ovplw", model.privateLinkResourceId());
        Assertions.assertEquals("gy", model.requestMessage());
    }
}
