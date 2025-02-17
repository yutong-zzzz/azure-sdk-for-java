// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.managednetworkfabric.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.ProxyResource;
import com.azure.core.management.SystemData;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.managednetworkfabric.models.BgpConfiguration;
import com.azure.resourcemanager.managednetworkfabric.models.ConnectedSubnet;
import com.azure.resourcemanager.managednetworkfabric.models.EnabledDisabledState;
import com.azure.resourcemanager.managednetworkfabric.models.ProvisioningState;
import com.azure.resourcemanager.managednetworkfabric.models.StaticRouteConfiguration;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Defines the InternalNetwork item. */
@Fluent
public final class InternalNetworkInner extends ProxyResource {
    /*
     * Resource properties.
     */
    @JsonProperty(value = "properties", required = true)
    private InternalNetworkProperties innerProperties = new InternalNetworkProperties();

    /*
     * Azure Resource Manager metadata containing createdBy and modifiedBy information.
     */
    @JsonProperty(value = "systemData", access = JsonProperty.Access.WRITE_ONLY)
    private SystemData systemData;

    /** Creates an instance of InternalNetworkInner class. */
    public InternalNetworkInner() {
    }

    /**
     * Get the innerProperties property: Resource properties.
     *
     * @return the innerProperties value.
     */
    private InternalNetworkProperties innerProperties() {
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
     * Get the disabledOnResources property: List of resources the InternalNetwork is disabled on. Can be either entire
     * NetworkFabric or NetworkRack.
     *
     * @return the disabledOnResources value.
     */
    public List<String> disabledOnResources() {
        return this.innerProperties() == null ? null : this.innerProperties().disabledOnResources();
    }

    /**
     * Get the administrativeState property: Administrative state of the InternalNetwork. Example: Enabled | Disabled.
     *
     * @return the administrativeState value.
     */
    public EnabledDisabledState administrativeState() {
        return this.innerProperties() == null ? null : this.innerProperties().administrativeState();
    }

    /**
     * Get the bgpDisabledOnResources property: List of resources the BGP is disabled on. Can be either entire
     * NetworkFabric or NetworkRack.
     *
     * @return the bgpDisabledOnResources value.
     */
    public List<String> bgpDisabledOnResources() {
        return this.innerProperties() == null ? null : this.innerProperties().bgpDisabledOnResources();
    }

    /**
     * Get the bfdDisabledOnResources property: List of resources the BFD for BGP is disabled on. Can be either entire
     * NetworkFabric or NetworkRack.
     *
     * @return the bfdDisabledOnResources value.
     */
    public List<String> bfdDisabledOnResources() {
        return this.innerProperties() == null ? null : this.innerProperties().bfdDisabledOnResources();
    }

    /**
     * Get the bfdForStaticRoutesDisabledOnResources property: List of resources the BFD of StaticRoutes is disabled on.
     * Can be either entire NetworkFabric or NetworkRack.
     *
     * @return the bfdForStaticRoutesDisabledOnResources value.
     */
    public List<String> bfdForStaticRoutesDisabledOnResources() {
        return this.innerProperties() == null ? null : this.innerProperties().bfdForStaticRoutesDisabledOnResources();
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
     * Get the vlanId property: Vlan identifier. Example: 1001.
     *
     * @return the vlanId value.
     */
    public int vlanId() {
        return this.innerProperties() == null ? 0 : this.innerProperties().vlanId();
    }

    /**
     * Set the vlanId property: Vlan identifier. Example: 1001.
     *
     * @param vlanId the vlanId value to set.
     * @return the InternalNetworkInner object itself.
     */
    public InternalNetworkInner withVlanId(int vlanId) {
        if (this.innerProperties() == null) {
            this.innerProperties = new InternalNetworkProperties();
        }
        this.innerProperties().withVlanId(vlanId);
        return this;
    }

    /**
     * Get the mtu property: Maximum transmission unit. Default value is 1500.
     *
     * @return the mtu value.
     */
    public Integer mtu() {
        return this.innerProperties() == null ? null : this.innerProperties().mtu();
    }

    /**
     * Set the mtu property: Maximum transmission unit. Default value is 1500.
     *
     * @param mtu the mtu value to set.
     * @return the InternalNetworkInner object itself.
     */
    public InternalNetworkInner withMtu(Integer mtu) {
        if (this.innerProperties() == null) {
            this.innerProperties = new InternalNetworkProperties();
        }
        this.innerProperties().withMtu(mtu);
        return this;
    }

    /**
     * Get the connectedIPv4Subnets property: List with object connected IPv4 Subnets.
     *
     * @return the connectedIPv4Subnets value.
     */
    public List<ConnectedSubnet> connectedIPv4Subnets() {
        return this.innerProperties() == null ? null : this.innerProperties().connectedIPv4Subnets();
    }

    /**
     * Set the connectedIPv4Subnets property: List with object connected IPv4 Subnets.
     *
     * @param connectedIPv4Subnets the connectedIPv4Subnets value to set.
     * @return the InternalNetworkInner object itself.
     */
    public InternalNetworkInner withConnectedIPv4Subnets(List<ConnectedSubnet> connectedIPv4Subnets) {
        if (this.innerProperties() == null) {
            this.innerProperties = new InternalNetworkProperties();
        }
        this.innerProperties().withConnectedIPv4Subnets(connectedIPv4Subnets);
        return this;
    }

    /**
     * Get the connectedIPv6Subnets property: List with object connected IPv6 Subnets.
     *
     * @return the connectedIPv6Subnets value.
     */
    public List<ConnectedSubnet> connectedIPv6Subnets() {
        return this.innerProperties() == null ? null : this.innerProperties().connectedIPv6Subnets();
    }

    /**
     * Set the connectedIPv6Subnets property: List with object connected IPv6 Subnets.
     *
     * @param connectedIPv6Subnets the connectedIPv6Subnets value to set.
     * @return the InternalNetworkInner object itself.
     */
    public InternalNetworkInner withConnectedIPv6Subnets(List<ConnectedSubnet> connectedIPv6Subnets) {
        if (this.innerProperties() == null) {
            this.innerProperties = new InternalNetworkProperties();
        }
        this.innerProperties().withConnectedIPv6Subnets(connectedIPv6Subnets);
        return this;
    }

    /**
     * Get the staticRouteConfiguration property: Static Route Configuration properties.
     *
     * @return the staticRouteConfiguration value.
     */
    public StaticRouteConfiguration staticRouteConfiguration() {
        return this.innerProperties() == null ? null : this.innerProperties().staticRouteConfiguration();
    }

    /**
     * Set the staticRouteConfiguration property: Static Route Configuration properties.
     *
     * @param staticRouteConfiguration the staticRouteConfiguration value to set.
     * @return the InternalNetworkInner object itself.
     */
    public InternalNetworkInner withStaticRouteConfiguration(StaticRouteConfiguration staticRouteConfiguration) {
        if (this.innerProperties() == null) {
            this.innerProperties = new InternalNetworkProperties();
        }
        this.innerProperties().withStaticRouteConfiguration(staticRouteConfiguration);
        return this;
    }

    /**
     * Get the bgpConfiguration property: BGP configuration properties.
     *
     * @return the bgpConfiguration value.
     */
    public BgpConfiguration bgpConfiguration() {
        return this.innerProperties() == null ? null : this.innerProperties().bgpConfiguration();
    }

    /**
     * Set the bgpConfiguration property: BGP configuration properties.
     *
     * @param bgpConfiguration the bgpConfiguration value to set.
     * @return the InternalNetworkInner object itself.
     */
    public InternalNetworkInner withBgpConfiguration(BgpConfiguration bgpConfiguration) {
        if (this.innerProperties() == null) {
            this.innerProperties = new InternalNetworkProperties();
        }
        this.innerProperties().withBgpConfiguration(bgpConfiguration);
        return this;
    }

    /**
     * Get the importRoutePolicyId property: ARM resource ID of importRoutePolicy.
     *
     * @return the importRoutePolicyId value.
     */
    public String importRoutePolicyId() {
        return this.innerProperties() == null ? null : this.innerProperties().importRoutePolicyId();
    }

    /**
     * Set the importRoutePolicyId property: ARM resource ID of importRoutePolicy.
     *
     * @param importRoutePolicyId the importRoutePolicyId value to set.
     * @return the InternalNetworkInner object itself.
     */
    public InternalNetworkInner withImportRoutePolicyId(String importRoutePolicyId) {
        if (this.innerProperties() == null) {
            this.innerProperties = new InternalNetworkProperties();
        }
        this.innerProperties().withImportRoutePolicyId(importRoutePolicyId);
        return this;
    }

    /**
     * Get the exportRoutePolicyId property: ARM resource ID of importRoutePolicy.
     *
     * @return the exportRoutePolicyId value.
     */
    public String exportRoutePolicyId() {
        return this.innerProperties() == null ? null : this.innerProperties().exportRoutePolicyId();
    }

    /**
     * Set the exportRoutePolicyId property: ARM resource ID of importRoutePolicy.
     *
     * @param exportRoutePolicyId the exportRoutePolicyId value to set.
     * @return the InternalNetworkInner object itself.
     */
    public InternalNetworkInner withExportRoutePolicyId(String exportRoutePolicyId) {
        if (this.innerProperties() == null) {
            this.innerProperties = new InternalNetworkProperties();
        }
        this.innerProperties().withExportRoutePolicyId(exportRoutePolicyId);
        return this;
    }

    /**
     * Get the annotation property: Switch configuration description.
     *
     * @return the annotation value.
     */
    public String annotation() {
        return this.innerProperties() == null ? null : this.innerProperties().annotation();
    }

    /**
     * Set the annotation property: Switch configuration description.
     *
     * @param annotation the annotation value to set.
     * @return the InternalNetworkInner object itself.
     */
    public InternalNetworkInner withAnnotation(String annotation) {
        if (this.innerProperties() == null) {
            this.innerProperties = new InternalNetworkProperties();
        }
        this.innerProperties().withAnnotation(annotation);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (innerProperties() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property innerProperties in model InternalNetworkInner"));
        } else {
            innerProperties().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(InternalNetworkInner.class);
}
