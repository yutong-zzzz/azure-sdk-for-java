// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.batch.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.batch.models.AutoScaleSettings;
import java.time.Duration;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class AutoScaleSettingsTests {
    @Test
    public void testDeserialize() {
        AutoScaleSettings model =
            BinaryData
                .fromString("{\"formula\":\"h\",\"evaluationInterval\":\"PT43H13M53S\"}")
                .toObject(AutoScaleSettings.class);
        Assertions.assertEquals("h", model.formula());
        Assertions.assertEquals(Duration.parse("PT43H13M53S"), model.evaluationInterval());
    }

    @Test
    public void testSerialize() {
        AutoScaleSettings model =
            new AutoScaleSettings().withFormula("h").withEvaluationInterval(Duration.parse("PT43H13M53S"));
        model = BinaryData.fromObject(model).toObject(AutoScaleSettings.class);
        Assertions.assertEquals("h", model.formula());
        Assertions.assertEquals(Duration.parse("PT43H13M53S"), model.evaluationInterval());
    }
}
