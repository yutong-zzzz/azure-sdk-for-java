// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.avs.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.avs.fluent.models.WorkloadNetworkDnsServiceInner;
import com.azure.resourcemanager.avs.models.DnsServiceLogLevelEnum;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class WorkloadNetworkDnsServiceInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        WorkloadNetworkDnsServiceInner model =
            BinaryData
                .fromString(
                    "{\"properties\":{\"displayName\":\"obzdopcjwvnhdl\",\"dnsServiceIp\":\"mgxcxrslpm\",\"defaultDnsZone\":\"wuoegrpk\",\"fqdnZones\":[\"niyqslui\",\"pdggkzzlvm\",\"mpaxmodfvuefywsb\"],\"logLevel\":\"ERROR\",\"status\":\"FAILURE\",\"provisioningState\":\"Updating\",\"revision\":5745486884853604754},\"id\":\"uyfta\",\"name\":\"kcpwiy\",\"type\":\"vqtmnub\"}")
                .toObject(WorkloadNetworkDnsServiceInner.class);
        Assertions.assertEquals("obzdopcjwvnhdl", model.displayName());
        Assertions.assertEquals("mgxcxrslpm", model.dnsServiceIp());
        Assertions.assertEquals("wuoegrpk", model.defaultDnsZone());
        Assertions.assertEquals("niyqslui", model.fqdnZones().get(0));
        Assertions.assertEquals(DnsServiceLogLevelEnum.ERROR, model.logLevel());
        Assertions.assertEquals(5745486884853604754L, model.revision());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        WorkloadNetworkDnsServiceInner model =
            new WorkloadNetworkDnsServiceInner()
                .withDisplayName("obzdopcjwvnhdl")
                .withDnsServiceIp("mgxcxrslpm")
                .withDefaultDnsZone("wuoegrpk")
                .withFqdnZones(Arrays.asList("niyqslui", "pdggkzzlvm", "mpaxmodfvuefywsb"))
                .withLogLevel(DnsServiceLogLevelEnum.ERROR)
                .withRevision(5745486884853604754L);
        model = BinaryData.fromObject(model).toObject(WorkloadNetworkDnsServiceInner.class);
        Assertions.assertEquals("obzdopcjwvnhdl", model.displayName());
        Assertions.assertEquals("mgxcxrslpm", model.dnsServiceIp());
        Assertions.assertEquals("wuoegrpk", model.defaultDnsZone());
        Assertions.assertEquals("niyqslui", model.fqdnZones().get(0));
        Assertions.assertEquals(DnsServiceLogLevelEnum.ERROR, model.logLevel());
        Assertions.assertEquals(5745486884853604754L, model.revision());
    }
}
