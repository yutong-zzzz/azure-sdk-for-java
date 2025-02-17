// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesbackup.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.recoveryservicesbackup.models.MabJobExtendedInfo;
import com.azure.resourcemanager.recoveryservicesbackup.models.MabJobTaskDetails;
import java.time.Duration;
import java.time.OffsetDateTime;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class MabJobExtendedInfoTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        MabJobExtendedInfo model =
            BinaryData
                .fromString(
                    "{\"tasksList\":[{\"taskId\":\"g\",\"startTime\":\"2021-09-03T22:46:11Z\",\"endTime\":\"2021-05-02T03:25:22Z\",\"duration\":\"PT204H13M37S\",\"status\":\"tdysnaquflq\"},{\"taskId\":\"tqhamzjrw\",\"startTime\":\"2021-03-16T10:38:44Z\",\"endTime\":\"2021-10-20T22:55:55Z\",\"duration\":\"PT95H8M24S\",\"status\":\"leziunjxdfzant\"}],\"propertyBag\":{\"amlbnseqacjjvpil\":\"eg\",\"ueio\":\"uooqjagmdit\",\"tdtpdelqacslmo\":\"kjbsah\",\"xofvcjk\":\"oebn\"},\"dynamicErrorMessage\":\"irazftxejwabmd\"}")
                .toObject(MabJobExtendedInfo.class);
        Assertions.assertEquals("g", model.tasksList().get(0).taskId());
        Assertions.assertEquals(OffsetDateTime.parse("2021-09-03T22:46:11Z"), model.tasksList().get(0).startTime());
        Assertions.assertEquals(OffsetDateTime.parse("2021-05-02T03:25:22Z"), model.tasksList().get(0).endTime());
        Assertions.assertEquals(Duration.parse("PT204H13M37S"), model.tasksList().get(0).duration());
        Assertions.assertEquals("tdysnaquflq", model.tasksList().get(0).status());
        Assertions.assertEquals("eg", model.propertyBag().get("amlbnseqacjjvpil"));
        Assertions.assertEquals("irazftxejwabmd", model.dynamicErrorMessage());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        MabJobExtendedInfo model =
            new MabJobExtendedInfo()
                .withTasksList(
                    Arrays
                        .asList(
                            new MabJobTaskDetails()
                                .withTaskId("g")
                                .withStartTime(OffsetDateTime.parse("2021-09-03T22:46:11Z"))
                                .withEndTime(OffsetDateTime.parse("2021-05-02T03:25:22Z"))
                                .withDuration(Duration.parse("PT204H13M37S"))
                                .withStatus("tdysnaquflq"),
                            new MabJobTaskDetails()
                                .withTaskId("tqhamzjrw")
                                .withStartTime(OffsetDateTime.parse("2021-03-16T10:38:44Z"))
                                .withEndTime(OffsetDateTime.parse("2021-10-20T22:55:55Z"))
                                .withDuration(Duration.parse("PT95H8M24S"))
                                .withStatus("leziunjxdfzant")))
                .withPropertyBag(
                    mapOf(
                        "amlbnseqacjjvpil", "eg", "ueio", "uooqjagmdit", "tdtpdelqacslmo", "kjbsah", "xofvcjk", "oebn"))
                .withDynamicErrorMessage("irazftxejwabmd");
        model = BinaryData.fromObject(model).toObject(MabJobExtendedInfo.class);
        Assertions.assertEquals("g", model.tasksList().get(0).taskId());
        Assertions.assertEquals(OffsetDateTime.parse("2021-09-03T22:46:11Z"), model.tasksList().get(0).startTime());
        Assertions.assertEquals(OffsetDateTime.parse("2021-05-02T03:25:22Z"), model.tasksList().get(0).endTime());
        Assertions.assertEquals(Duration.parse("PT204H13M37S"), model.tasksList().get(0).duration());
        Assertions.assertEquals("tdysnaquflq", model.tasksList().get(0).status());
        Assertions.assertEquals("eg", model.propertyBag().get("amlbnseqacjjvpil"));
        Assertions.assertEquals("irazftxejwabmd", model.dynamicErrorMessage());
    }

    @SuppressWarnings("unchecked")
    private static <T> Map<String, T> mapOf(Object... inputs) {
        Map<String, T> map = new HashMap<>();
        for (int i = 0; i < inputs.length; i += 2) {
            String key = (String) inputs[i];
            T value = (T) inputs[i + 1];
            map.put(key, value);
        }
        return map;
    }
}
