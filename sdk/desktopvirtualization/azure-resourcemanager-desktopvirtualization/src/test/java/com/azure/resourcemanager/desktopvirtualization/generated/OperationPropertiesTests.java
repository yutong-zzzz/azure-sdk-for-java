// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.desktopvirtualization.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.desktopvirtualization.models.LogSpecification;
import com.azure.resourcemanager.desktopvirtualization.models.OperationProperties;
import com.azure.resourcemanager.desktopvirtualization.models.ServiceSpecification;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class OperationPropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        OperationProperties model =
            BinaryData
                .fromString(
                    "{\"serviceSpecification\":{\"logSpecifications\":[{\"name\":\"ymglzufcyz\",\"displayName\":\"hdbihan\",\"blobDuration\":\"hfcbjysa\"},{\"name\":\"th\",\"displayName\":\"hab\",\"blobDuration\":\"pikxwczbyscnpqxu\"},{\"name\":\"vyq\",\"displayName\":\"wby\",\"blobDuration\":\"k\"},{\"name\":\"dumjgrtfwvuk\",\"displayName\":\"audccsnhs\",\"blobDuration\":\"nyejhkryhtnap\"}]}}")
                .toObject(OperationProperties.class);
        Assertions.assertEquals("ymglzufcyz", model.serviceSpecification().logSpecifications().get(0).name());
        Assertions.assertEquals("hdbihan", model.serviceSpecification().logSpecifications().get(0).displayName());
        Assertions.assertEquals("hfcbjysa", model.serviceSpecification().logSpecifications().get(0).blobDuration());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        OperationProperties model =
            new OperationProperties()
                .withServiceSpecification(
                    new ServiceSpecification()
                        .withLogSpecifications(
                            Arrays
                                .asList(
                                    new LogSpecification()
                                        .withName("ymglzufcyz")
                                        .withDisplayName("hdbihan")
                                        .withBlobDuration("hfcbjysa"),
                                    new LogSpecification()
                                        .withName("th")
                                        .withDisplayName("hab")
                                        .withBlobDuration("pikxwczbyscnpqxu"),
                                    new LogSpecification().withName("vyq").withDisplayName("wby").withBlobDuration("k"),
                                    new LogSpecification()
                                        .withName("dumjgrtfwvuk")
                                        .withDisplayName("audccsnhs")
                                        .withBlobDuration("nyejhkryhtnap"))));
        model = BinaryData.fromObject(model).toObject(OperationProperties.class);
        Assertions.assertEquals("ymglzufcyz", model.serviceSpecification().logSpecifications().get(0).name());
        Assertions.assertEquals("hdbihan", model.serviceSpecification().logSpecifications().get(0).displayName());
        Assertions.assertEquals("hfcbjysa", model.serviceSpecification().logSpecifications().get(0).blobDuration());
    }
}
