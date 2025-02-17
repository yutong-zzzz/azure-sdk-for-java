// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.datafactory.fluent.models.AvroDatasetTypeProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.List;
import java.util.Map;

/** Avro dataset. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("Avro")
@Fluent
public final class AvroDataset extends Dataset {
    /*
     * Avro dataset properties.
     */
    @JsonProperty(value = "typeProperties")
    private AvroDatasetTypeProperties innerTypeProperties;

    /** Creates an instance of AvroDataset class. */
    public AvroDataset() {
    }

    /**
     * Get the innerTypeProperties property: Avro dataset properties.
     *
     * @return the innerTypeProperties value.
     */
    private AvroDatasetTypeProperties innerTypeProperties() {
        return this.innerTypeProperties;
    }

    /** {@inheritDoc} */
    @Override
    public AvroDataset withDescription(String description) {
        super.withDescription(description);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AvroDataset withStructure(Object structure) {
        super.withStructure(structure);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AvroDataset withSchema(Object schema) {
        super.withSchema(schema);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AvroDataset withLinkedServiceName(LinkedServiceReference linkedServiceName) {
        super.withLinkedServiceName(linkedServiceName);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AvroDataset withParameters(Map<String, ParameterSpecification> parameters) {
        super.withParameters(parameters);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AvroDataset withAnnotations(List<Object> annotations) {
        super.withAnnotations(annotations);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AvroDataset withFolder(DatasetFolder folder) {
        super.withFolder(folder);
        return this;
    }

    /**
     * Get the location property: The location of the avro storage.
     *
     * @return the location value.
     */
    public DatasetLocation location() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().location();
    }

    /**
     * Set the location property: The location of the avro storage.
     *
     * @param location the location value to set.
     * @return the AvroDataset object itself.
     */
    public AvroDataset withLocation(DatasetLocation location) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new AvroDatasetTypeProperties();
        }
        this.innerTypeProperties().withLocation(location);
        return this;
    }

    /**
     * Get the avroCompressionCodec property: The data avroCompressionCodec. Type: string (or Expression with resultType
     * string).
     *
     * @return the avroCompressionCodec value.
     */
    public Object avroCompressionCodec() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().avroCompressionCodec();
    }

    /**
     * Set the avroCompressionCodec property: The data avroCompressionCodec. Type: string (or Expression with resultType
     * string).
     *
     * @param avroCompressionCodec the avroCompressionCodec value to set.
     * @return the AvroDataset object itself.
     */
    public AvroDataset withAvroCompressionCodec(Object avroCompressionCodec) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new AvroDatasetTypeProperties();
        }
        this.innerTypeProperties().withAvroCompressionCodec(avroCompressionCodec);
        return this;
    }

    /**
     * Get the avroCompressionLevel property: The avroCompressionLevel property.
     *
     * @return the avroCompressionLevel value.
     */
    public Integer avroCompressionLevel() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().avroCompressionLevel();
    }

    /**
     * Set the avroCompressionLevel property: The avroCompressionLevel property.
     *
     * @param avroCompressionLevel the avroCompressionLevel value to set.
     * @return the AvroDataset object itself.
     */
    public AvroDataset withAvroCompressionLevel(Integer avroCompressionLevel) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new AvroDatasetTypeProperties();
        }
        this.innerTypeProperties().withAvroCompressionLevel(avroCompressionLevel);
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
        if (innerTypeProperties() != null) {
            innerTypeProperties().validate();
        }
    }
}
