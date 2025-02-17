// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.managednetworkfabric.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.ProxyResource;
import com.azure.core.management.SystemData;
import com.azure.resourcemanager.managednetworkfabric.models.BooleanEnumProperty;
import com.azure.resourcemanager.managednetworkfabric.models.EnabledDisabledState;
import com.azure.resourcemanager.managednetworkfabric.models.Layer2Configuration;
import com.azure.resourcemanager.managednetworkfabric.models.Layer3Configuration;
import com.azure.resourcemanager.managednetworkfabric.models.NniType;
import com.azure.resourcemanager.managednetworkfabric.models.ProvisioningState;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The NetworkToNetworkInterconnect resource definition. */
@Fluent
public final class NetworkToNetworkInterconnectInner extends ProxyResource {
    /*
     * Resource properties.
     */
    @JsonProperty(value = "properties")
    private NetworkToNetworkInterconnectProperties innerProperties;

    /*
     * Azure Resource Manager metadata containing createdBy and modifiedBy information.
     */
    @JsonProperty(value = "systemData", access = JsonProperty.Access.WRITE_ONLY)
    private SystemData systemData;

    /** Creates an instance of NetworkToNetworkInterconnectInner class. */
    public NetworkToNetworkInterconnectInner() {
    }

    /**
     * Get the innerProperties property: Resource properties.
     *
     * @return the innerProperties value.
     */
    private NetworkToNetworkInterconnectProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the systemData property: Azure Resource Manager metadata containing createdBy and modifiedBy information.
     *
     * @return the systemData value.
     */
    public SystemData systemData() {
        return this.systemData;
    }

    /**
     * Get the nniType property: Type of NNI used. Example: CE | NPB.
     *
     * @return the nniType value.
     */
    public NniType nniType() {
        return this.innerProperties() == null ? null : this.innerProperties().nniType();
    }

    /**
     * Set the nniType property: Type of NNI used. Example: CE | NPB.
     *
     * @param nniType the nniType value to set.
     * @return the NetworkToNetworkInterconnectInner object itself.
     */
    public NetworkToNetworkInterconnectInner withNniType(NniType nniType) {
        if (this.innerProperties() == null) {
            this.innerProperties = new NetworkToNetworkInterconnectProperties();
        }
        this.innerProperties().withNniType(nniType);
        return this;
    }

    /**
     * Get the administrativeState property: Gets the administrativeState of the resource. Example -Enabled/Disabled.
     *
     * @return the administrativeState value.
     */
    public EnabledDisabledState administrativeState() {
        return this.innerProperties() == null ? null : this.innerProperties().administrativeState();
    }

    /**
     * Get the isManagementType property: Configuration to use NNI for Infrastructure Management. Example: True/False.
     *
     * @return the isManagementType value.
     */
    public BooleanEnumProperty isManagementType() {
        return this.innerProperties() == null ? null : this.innerProperties().isManagementType();
    }

    /**
     * Set the isManagementType property: Configuration to use NNI for Infrastructure Management. Example: True/False.
     *
     * @param isManagementType the isManagementType value to set.
     * @return the NetworkToNetworkInterconnectInner object itself.
     */
    public NetworkToNetworkInterconnectInner withIsManagementType(BooleanEnumProperty isManagementType) {
        if (this.innerProperties() == null) {
            this.innerProperties = new NetworkToNetworkInterconnectProperties();
        }
        this.innerProperties().withIsManagementType(isManagementType);
        return this;
    }

    /**
     * Get the useOptionB property: Based on this parameter the layer2/layer3 is made as mandatory. Example: True/False.
     *
     * @return the useOptionB value.
     */
    public BooleanEnumProperty useOptionB() {
        return this.innerProperties() == null ? null : this.innerProperties().useOptionB();
    }

    /**
     * Set the useOptionB property: Based on this parameter the layer2/layer3 is made as mandatory. Example: True/False.
     *
     * @param useOptionB the useOptionB value to set.
     * @return the NetworkToNetworkInterconnectInner object itself.
     */
    public NetworkToNetworkInterconnectInner withUseOptionB(BooleanEnumProperty useOptionB) {
        if (this.innerProperties() == null) {
            this.innerProperties = new NetworkToNetworkInterconnectProperties();
        }
        this.innerProperties().withUseOptionB(useOptionB);
        return this;
    }

    /**
     * Get the layer2Configuration property: Common properties for Layer2Configuration.
     *
     * @return the layer2Configuration value.
     */
    public Layer2Configuration layer2Configuration() {
        return this.innerProperties() == null ? null : this.innerProperties().layer2Configuration();
    }

    /**
     * Set the layer2Configuration property: Common properties for Layer2Configuration.
     *
     * @param layer2Configuration the layer2Configuration value to set.
     * @return the NetworkToNetworkInterconnectInner object itself.
     */
    public NetworkToNetworkInterconnectInner withLayer2Configuration(Layer2Configuration layer2Configuration) {
        if (this.innerProperties() == null) {
            this.innerProperties = new NetworkToNetworkInterconnectProperties();
        }
        this.innerProperties().withLayer2Configuration(layer2Configuration);
        return this;
    }

    /**
     * Get the layer3Configuration property: Common properties for Layer3Configuration.
     *
     * @return the layer3Configuration value.
     */
    public Layer3Configuration layer3Configuration() {
        return this.innerProperties() == null ? null : this.innerProperties().layer3Configuration();
    }

    /**
     * Set the layer3Configuration property: Common properties for Layer3Configuration.
     *
     * @param layer3Configuration the layer3Configuration value to set.
     * @return the NetworkToNetworkInterconnectInner object itself.
     */
    public NetworkToNetworkInterconnectInner withLayer3Configuration(Layer3Configuration layer3Configuration) {
        if (this.innerProperties() == null) {
            this.innerProperties = new NetworkToNetworkInterconnectProperties();
        }
        this.innerProperties().withLayer3Configuration(layer3Configuration);
        return this;
    }

    /**
     * Get the provisioningState property: Gets the provisioning state of the resource.
     *
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.innerProperties() == null ? null : this.innerProperties().provisioningState();
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (innerProperties() != null) {
            innerProperties().validate();
        }
    }
}
