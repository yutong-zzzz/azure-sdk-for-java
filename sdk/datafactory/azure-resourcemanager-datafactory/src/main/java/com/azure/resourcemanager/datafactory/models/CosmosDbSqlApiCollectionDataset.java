// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.datafactory.fluent.models.CosmosDbSqlApiCollectionDatasetTypeProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.List;
import java.util.Map;

/** Microsoft Azure CosmosDB (SQL API) Collection dataset. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("CosmosDbSqlApiCollection")
@Fluent
public final class CosmosDbSqlApiCollectionDataset extends Dataset {
    /*
     * CosmosDB (SQL API) Collection dataset properties.
     */
    @JsonProperty(value = "typeProperties", required = true)
    private CosmosDbSqlApiCollectionDatasetTypeProperties innerTypeProperties =
        new CosmosDbSqlApiCollectionDatasetTypeProperties();

    /** Creates an instance of CosmosDbSqlApiCollectionDataset class. */
    public CosmosDbSqlApiCollectionDataset() {
    }

    /**
     * Get the innerTypeProperties property: CosmosDB (SQL API) Collection dataset properties.
     *
     * @return the innerTypeProperties value.
     */
    private CosmosDbSqlApiCollectionDatasetTypeProperties innerTypeProperties() {
        return this.innerTypeProperties;
    }

    /** {@inheritDoc} */
    @Override
    public CosmosDbSqlApiCollectionDataset withDescription(String description) {
        super.withDescription(description);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public CosmosDbSqlApiCollectionDataset withStructure(Object structure) {
        super.withStructure(structure);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public CosmosDbSqlApiCollectionDataset withSchema(Object schema) {
        super.withSchema(schema);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public CosmosDbSqlApiCollectionDataset withLinkedServiceName(LinkedServiceReference linkedServiceName) {
        super.withLinkedServiceName(linkedServiceName);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public CosmosDbSqlApiCollectionDataset withParameters(Map<String, ParameterSpecification> parameters) {
        super.withParameters(parameters);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public CosmosDbSqlApiCollectionDataset withAnnotations(List<Object> annotations) {
        super.withAnnotations(annotations);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public CosmosDbSqlApiCollectionDataset withFolder(DatasetFolder folder) {
        super.withFolder(folder);
        return this;
    }

    /**
     * Get the collectionName property: CosmosDB (SQL API) collection name. Type: string (or Expression with resultType
     * string).
     *
     * @return the collectionName value.
     */
    public Object collectionName() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().collectionName();
    }

    /**
     * Set the collectionName property: CosmosDB (SQL API) collection name. Type: string (or Expression with resultType
     * string).
     *
     * @param collectionName the collectionName value to set.
     * @return the CosmosDbSqlApiCollectionDataset object itself.
     */
    public CosmosDbSqlApiCollectionDataset withCollectionName(Object collectionName) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new CosmosDbSqlApiCollectionDatasetTypeProperties();
        }
        this.innerTypeProperties().withCollectionName(collectionName);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
        if (innerTypeProperties() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property innerTypeProperties in model CosmosDbSqlApiCollectionDataset"));
        } else {
            innerTypeProperties().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(CosmosDbSqlApiCollectionDataset.class);
}
