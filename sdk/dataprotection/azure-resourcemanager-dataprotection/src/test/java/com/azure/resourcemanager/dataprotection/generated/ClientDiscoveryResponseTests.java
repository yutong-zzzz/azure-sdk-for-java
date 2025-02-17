// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.dataprotection.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.dataprotection.fluent.models.ClientDiscoveryValueForSingleApiInner;
import com.azure.resourcemanager.dataprotection.models.ClientDiscoveryDisplay;
import com.azure.resourcemanager.dataprotection.models.ClientDiscoveryForProperties;
import com.azure.resourcemanager.dataprotection.models.ClientDiscoveryResponse;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class ClientDiscoveryResponseTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ClientDiscoveryResponse model =
            BinaryData
                .fromString(
                    "{\"nextLink\":\"sszdnru\",\"value\":[{\"display\":{\"description\":\"muouqfp\",\"operation\":\"zw\",\"provider\":\"g\",\"resource\":\"tnwu\"},\"name\":\"gazxuf\",\"isDataAction\":false,\"origin\":\"kyfi\",\"properties\":{}},{\"display\":{\"description\":\"fvzwdzuhty\",\"operation\":\"isdkfthwxmnteiw\",\"provider\":\"pvkmijcmmxdcuf\",\"resource\":\"srp\"},\"name\":\"zidnsezcxtbzsgfy\",\"isDataAction\":false,\"origin\":\"ewmdw\",\"properties\":{}},{\"display\":{\"description\":\"chboosflnrosf\",\"operation\":\"t\",\"provider\":\"hzzvypyq\",\"resource\":\"mzinpvswjdk\"},\"name\":\"soodqxhcrmnoh\",\"isDataAction\":false,\"origin\":\"whdsoifiyip\",\"properties\":{}}]}")
                .toObject(ClientDiscoveryResponse.class);
        Assertions.assertEquals("sszdnru", model.nextLink());
        Assertions.assertEquals("muouqfp", model.value().get(0).display().description());
        Assertions.assertEquals("zw", model.value().get(0).display().operation());
        Assertions.assertEquals("g", model.value().get(0).display().provider());
        Assertions.assertEquals("tnwu", model.value().get(0).display().resource());
        Assertions.assertEquals("gazxuf", model.value().get(0).name());
        Assertions.assertEquals(false, model.value().get(0).isDataAction());
        Assertions.assertEquals("kyfi", model.value().get(0).origin());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ClientDiscoveryResponse model =
            new ClientDiscoveryResponse()
                .withNextLink("sszdnru")
                .withValue(
                    Arrays
                        .asList(
                            new ClientDiscoveryValueForSingleApiInner()
                                .withDisplay(
                                    new ClientDiscoveryDisplay()
                                        .withDescription("muouqfp")
                                        .withOperation("zw")
                                        .withProvider("g")
                                        .withResource("tnwu"))
                                .withName("gazxuf")
                                .withIsDataAction(false)
                                .withOrigin("kyfi")
                                .withProperties(new ClientDiscoveryForProperties()),
                            new ClientDiscoveryValueForSingleApiInner()
                                .withDisplay(
                                    new ClientDiscoveryDisplay()
                                        .withDescription("fvzwdzuhty")
                                        .withOperation("isdkfthwxmnteiw")
                                        .withProvider("pvkmijcmmxdcuf")
                                        .withResource("srp"))
                                .withName("zidnsezcxtbzsgfy")
                                .withIsDataAction(false)
                                .withOrigin("ewmdw")
                                .withProperties(new ClientDiscoveryForProperties()),
                            new ClientDiscoveryValueForSingleApiInner()
                                .withDisplay(
                                    new ClientDiscoveryDisplay()
                                        .withDescription("chboosflnrosf")
                                        .withOperation("t")
                                        .withProvider("hzzvypyq")
                                        .withResource("mzinpvswjdk"))
                                .withName("soodqxhcrmnoh")
                                .withIsDataAction(false)
                                .withOrigin("whdsoifiyip")
                                .withProperties(new ClientDiscoveryForProperties())));
        model = BinaryData.fromObject(model).toObject(ClientDiscoveryResponse.class);
        Assertions.assertEquals("sszdnru", model.nextLink());
        Assertions.assertEquals("muouqfp", model.value().get(0).display().description());
        Assertions.assertEquals("zw", model.value().get(0).display().operation());
        Assertions.assertEquals("g", model.value().get(0).display().provider());
        Assertions.assertEquals("tnwu", model.value().get(0).display().resource());
        Assertions.assertEquals("gazxuf", model.value().get(0).name());
        Assertions.assertEquals(false, model.value().get(0).isDataAction());
        Assertions.assertEquals("kyfi", model.value().get(0).origin());
    }
}
