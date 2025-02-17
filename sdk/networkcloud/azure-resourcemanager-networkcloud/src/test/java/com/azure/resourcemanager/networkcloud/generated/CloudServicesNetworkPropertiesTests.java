// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.networkcloud.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.networkcloud.fluent.models.CloudServicesNetworkProperties;
import com.azure.resourcemanager.networkcloud.models.CloudServicesNetworkEnableDefaultEgressEndpoints;
import com.azure.resourcemanager.networkcloud.models.EgressEndpoint;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class CloudServicesNetworkPropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        CloudServicesNetworkProperties model =
            BinaryData
                .fromString(
                    "{\"additionalEgressEndpoints\":[{\"category\":\"hybcibv\",\"endpoints\":[]},{\"category\":\"dcsi\",\"endpoints\":[]}],\"associatedResourceIds\":[\"aamdect\",\"hfiqscjeypvhe\"],\"clusterId\":\"kgqhcjrefovg\",\"detailedStatus\":\"Available\",\"detailedStatusMessage\":\"leyyvx\",\"enableDefaultEgressEndpoints\":\"False\",\"enabledEgressEndpoints\":[{\"category\":\"cattpngjcrcczsq\",\"endpoints\":[]}],\"hybridAksClustersAssociatedIds\":[\"mdajv\",\"ysou\",\"q\"],\"interfaceName\":\"a\",\"provisioningState\":\"Canceled\",\"virtualMachinesAssociatedIds\":[\"pfhyhl\"]}")
                .toObject(CloudServicesNetworkProperties.class);
        Assertions.assertEquals("hybcibv", model.additionalEgressEndpoints().get(0).category());
        Assertions
            .assertEquals(CloudServicesNetworkEnableDefaultEgressEndpoints.FALSE, model.enableDefaultEgressEndpoints());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        CloudServicesNetworkProperties model =
            new CloudServicesNetworkProperties()
                .withAdditionalEgressEndpoints(
                    Arrays
                        .asList(
                            new EgressEndpoint().withCategory("hybcibv").withEndpoints(Arrays.asList()),
                            new EgressEndpoint().withCategory("dcsi").withEndpoints(Arrays.asList())))
                .withEnableDefaultEgressEndpoints(CloudServicesNetworkEnableDefaultEgressEndpoints.FALSE);
        model = BinaryData.fromObject(model).toObject(CloudServicesNetworkProperties.class);
        Assertions.assertEquals("hybcibv", model.additionalEgressEndpoints().get(0).category());
        Assertions
            .assertEquals(CloudServicesNetworkEnableDefaultEgressEndpoints.FALSE, model.enableDefaultEgressEndpoints());
    }
}
