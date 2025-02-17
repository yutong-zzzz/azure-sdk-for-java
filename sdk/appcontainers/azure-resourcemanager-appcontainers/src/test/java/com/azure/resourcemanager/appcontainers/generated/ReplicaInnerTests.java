// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appcontainers.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.appcontainers.fluent.models.ReplicaInner;
import com.azure.resourcemanager.appcontainers.models.ReplicaContainer;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class ReplicaInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ReplicaInner model =
            BinaryData
                .fromString(
                    "{\"properties\":{\"createdTime\":\"2021-12-02T10:26:58Z\",\"containers\":[{\"name\":\"slevufuztc\",\"containerId\":\"yhjtqedcgzu\",\"ready\":false,\"started\":false,\"restartCount\":201174669,\"logStreamEndpoint\":\"rr\",\"execEndpoint\":\"pglydz\"},{\"name\":\"rvqeevtoepryutn\",\"containerId\":\"tpzdmovzvfvaawzq\",\"ready\":false,\"started\":true,\"restartCount\":318308535,\"logStreamEndpoint\":\"iglaecx\",\"execEndpoint\":\"t\"},{\"name\":\"okpvzm\",\"containerId\":\"t\",\"ready\":true,\"started\":false,\"restartCount\":456968385,\"logStreamEndpoint\":\"irclnpk\",\"execEndpoint\":\"ayzri\"},{\"name\":\"hya\",\"containerId\":\"vjlboxqvk\",\"ready\":false,\"started\":false,\"restartCount\":715260705,\"logStreamEndpoint\":\"ynhdwdigum\",\"execEndpoint\":\"raauzzpt\"}]},\"id\":\"zysdzh\",\"name\":\"zwwva\",\"type\":\"qyuvvfonkp\"}")
                .toObject(ReplicaInner.class);
        Assertions.assertEquals("slevufuztc", model.containers().get(0).name());
        Assertions.assertEquals("yhjtqedcgzu", model.containers().get(0).containerId());
        Assertions.assertEquals(false, model.containers().get(0).ready());
        Assertions.assertEquals(false, model.containers().get(0).started());
        Assertions.assertEquals(201174669, model.containers().get(0).restartCount());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ReplicaInner model =
            new ReplicaInner()
                .withContainers(
                    Arrays
                        .asList(
                            new ReplicaContainer()
                                .withName("slevufuztc")
                                .withContainerId("yhjtqedcgzu")
                                .withReady(false)
                                .withStarted(false)
                                .withRestartCount(201174669),
                            new ReplicaContainer()
                                .withName("rvqeevtoepryutn")
                                .withContainerId("tpzdmovzvfvaawzq")
                                .withReady(false)
                                .withStarted(true)
                                .withRestartCount(318308535),
                            new ReplicaContainer()
                                .withName("okpvzm")
                                .withContainerId("t")
                                .withReady(true)
                                .withStarted(false)
                                .withRestartCount(456968385),
                            new ReplicaContainer()
                                .withName("hya")
                                .withContainerId("vjlboxqvk")
                                .withReady(false)
                                .withStarted(false)
                                .withRestartCount(715260705)));
        model = BinaryData.fromObject(model).toObject(ReplicaInner.class);
        Assertions.assertEquals("slevufuztc", model.containers().get(0).name());
        Assertions.assertEquals("yhjtqedcgzu", model.containers().get(0).containerId());
        Assertions.assertEquals(false, model.containers().get(0).ready());
        Assertions.assertEquals(false, model.containers().get(0).started());
        Assertions.assertEquals(201174669, model.containers().get(0).restartCount());
    }
}
