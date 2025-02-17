// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.managednetworkfabric.models;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonProperty;

/** BFD configuration properties. */
@Immutable
public final class BfdConfiguration {
    /*
     * Administrative state of the BfdConfiguration. Example: Enabled | Disabled.
     */
    @JsonProperty(value = "administrativeState", access = JsonProperty.Access.WRITE_ONLY)
    private EnabledDisabledState administrativeState;

    /*
     * interval in milliseconds. Example: 300.
     */
    @JsonProperty(value = "interval", access = JsonProperty.Access.WRITE_ONLY)
    private Integer interval;

    /*
     * Multiplier for the Bfd Configuration. Example: 3.
     */
    @JsonProperty(value = "multiplier", access = JsonProperty.Access.WRITE_ONLY)
    private Integer multiplier;

    /** Creates an instance of BfdConfiguration class. */
    public BfdConfiguration() {
    }

    /**
     * Get the administrativeState property: Administrative state of the BfdConfiguration. Example: Enabled | Disabled.
     *
     * @return the administrativeState value.
     */
    public EnabledDisabledState administrativeState() {
        return this.administrativeState;
    }

    /**
     * Get the interval property: interval in milliseconds. Example: 300.
     *
     * @return the interval value.
     */
    public Integer interval() {
        return this.interval;
    }

    /**
     * Get the multiplier property: Multiplier for the Bfd Configuration. Example: 3.
     *
     * @return the multiplier value.
     */
    public Integer multiplier() {
        return this.multiplier;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
