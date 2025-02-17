// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybridcontainerservice.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** HybridAKSStorageStatus defines the observed state of HybridAKSStorage. */
@Fluent
public final class StorageSpacesPropertiesStatus {
    /*
     * Contains Provisioning errors
     */
    @JsonProperty(value = "provisioningStatus")
    private StorageSpacesPropertiesStatusProvisioningStatus provisioningStatus;

    /** Creates an instance of StorageSpacesPropertiesStatus class. */
    public StorageSpacesPropertiesStatus() {
    }

    /**
     * Get the provisioningStatus property: Contains Provisioning errors.
     *
     * @return the provisioningStatus value.
     */
    public StorageSpacesPropertiesStatusProvisioningStatus provisioningStatus() {
        return this.provisioningStatus;
    }

    /**
     * Set the provisioningStatus property: Contains Provisioning errors.
     *
     * @param provisioningStatus the provisioningStatus value to set.
     * @return the StorageSpacesPropertiesStatus object itself.
     */
    public StorageSpacesPropertiesStatus withProvisioningStatus(
        StorageSpacesPropertiesStatusProvisioningStatus provisioningStatus) {
        this.provisioningStatus = provisioningStatus;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (provisioningStatus() != null) {
            provisioningStatus().validate();
        }
    }
}
