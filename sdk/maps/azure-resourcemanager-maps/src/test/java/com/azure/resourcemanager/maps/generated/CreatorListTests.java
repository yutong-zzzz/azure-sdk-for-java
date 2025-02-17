// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.maps.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.maps.models.CreatorList;
import org.junit.jupiter.api.Assertions;

public final class CreatorListTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        CreatorList model =
            BinaryData
                .fromString(
                    "{\"value\":[{\"properties\":{\"provisioningState\":\"ljjgpbtoqcjmkl\",\"storageUnits\":232928194},\"location\":\"vbqid\",\"tags\":{\"dj\":\"jzyulpk\",\"xzlocxscp\":\"rlkhbzhfepgzgq\"},\"id\":\"ierhhbcsglummaj\",\"name\":\"j\",\"type\":\"odxobnbdxkqpxok\"}],\"nextLink\":\"ionpimexg\"}")
                .toObject(CreatorList.class);
        Assertions.assertEquals("ionpimexg", model.nextLink());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        CreatorList model = new CreatorList().withNextLink("ionpimexg");
        model = BinaryData.fromObject(model).toObject(CreatorList.class);
        Assertions.assertEquals("ionpimexg", model.nextLink());
    }
}
