// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.managednetworkfabric.models;

import com.azure.core.management.Region;
import com.azure.core.management.SystemData;
import com.azure.core.util.Context;
import com.azure.resourcemanager.managednetworkfabric.fluent.models.NetworkDeviceInner;
import java.util.List;
import java.util.Map;

/** An immutable client-side representation of NetworkDevice. */
public interface NetworkDevice {
    /**
     * Gets the id property: Fully qualified resource Id for the resource.
     *
     * @return the id value.
     */
    String id();

    /**
     * Gets the name property: The name of the resource.
     *
     * @return the name value.
     */
    String name();

    /**
     * Gets the type property: The type of the resource.
     *
     * @return the type value.
     */
    String type();

    /**
     * Gets the location property: The geo-location where the resource lives.
     *
     * @return the location value.
     */
    String location();

    /**
     * Gets the tags property: Resource tags.
     *
     * @return the tags value.
     */
    Map<String, String> tags();

    /**
     * Gets the systemData property: Azure Resource Manager metadata containing createdBy and modifiedBy information.
     *
     * @return the systemData value.
     */
    SystemData systemData();

    /**
     * Gets the version property: Current version of the device as defined in SKU.
     *
     * @return the version value.
     */
    String version();

    /**
     * Gets the networkDeviceSku property: Network Device SKU name.
     *
     * @return the networkDeviceSku value.
     */
    String networkDeviceSku();

    /**
     * Gets the networkDeviceRole property: networkDeviceRole is the device role: Example: CE | ToR.
     *
     * @return the networkDeviceRole value.
     */
    NetworkDeviceRoleTypes networkDeviceRole();

    /**
     * Gets the provisioningState property: Gets the provisioning state of the resource.
     *
     * @return the provisioningState value.
     */
    ProvisioningState provisioningState();

    /**
     * Gets the networkRackId property: Reference to network rack resource id.
     *
     * @return the networkRackId value.
     */
    String networkRackId();

    /**
     * Gets the hostname property: The host Name of the device.
     *
     * @return the hostname value.
     */
    String hostname();

    /**
     * Gets the serialNumber property: serialNumber of the format Make;Model;HardwareRevisionId;SerialNumber. Example:
     * Arista;DCS-7280DR3-24;12.05;JPE21116969.
     *
     * @return the serialNumber value.
     */
    String serialNumber();

    /**
     * Gets the annotation property: Switch configuration description.
     *
     * @return the annotation value.
     */
    String annotation();

    /**
     * Gets the region of the resource.
     *
     * @return the region of the resource.
     */
    Region region();

    /**
     * Gets the name of the resource region.
     *
     * @return the name of the resource region.
     */
    String regionName();

    /**
     * Gets the name of the resource group.
     *
     * @return the name of the resource group.
     */
    String resourceGroupName();

    /**
     * Gets the inner com.azure.resourcemanager.managednetworkfabric.fluent.models.NetworkDeviceInner object.
     *
     * @return the inner object.
     */
    NetworkDeviceInner innerModel();

    /** The entirety of the NetworkDevice definition. */
    interface Definition
        extends DefinitionStages.Blank,
            DefinitionStages.WithLocation,
            DefinitionStages.WithResourceGroup,
            DefinitionStages.WithCreate {
    }
    /** The NetworkDevice definition stages. */
    interface DefinitionStages {
        /** The first stage of the NetworkDevice definition. */
        interface Blank extends WithLocation {
        }
        /** The stage of the NetworkDevice definition allowing to specify location. */
        interface WithLocation {
            /**
             * Specifies the region for the resource.
             *
             * @param location The geo-location where the resource lives.
             * @return the next definition stage.
             */
            WithResourceGroup withRegion(Region location);

            /**
             * Specifies the region for the resource.
             *
             * @param location The geo-location where the resource lives.
             * @return the next definition stage.
             */
            WithResourceGroup withRegion(String location);
        }
        /** The stage of the NetworkDevice definition allowing to specify parent resource. */
        interface WithResourceGroup {
            /**
             * Specifies resourceGroupName.
             *
             * @param resourceGroupName The name of the resource group. The name is case insensitive.
             * @return the next definition stage.
             */
            WithCreate withExistingResourceGroup(String resourceGroupName);
        }
        /**
         * The stage of the NetworkDevice definition which contains all the minimum required properties for the resource
         * to be created, but also allows for any other optional properties to be specified.
         */
        interface WithCreate
            extends DefinitionStages.WithTags,
                DefinitionStages.WithNetworkDeviceSku,
                DefinitionStages.WithNetworkDeviceRole,
                DefinitionStages.WithHostname,
                DefinitionStages.WithSerialNumber,
                DefinitionStages.WithAnnotation {
            /**
             * Executes the create request.
             *
             * @return the created resource.
             */
            NetworkDevice create();

            /**
             * Executes the create request.
             *
             * @param context The context to associate with this operation.
             * @return the created resource.
             */
            NetworkDevice create(Context context);
        }
        /** The stage of the NetworkDevice definition allowing to specify tags. */
        interface WithTags {
            /**
             * Specifies the tags property: Resource tags..
             *
             * @param tags Resource tags.
             * @return the next definition stage.
             */
            WithCreate withTags(Map<String, String> tags);
        }
        /** The stage of the NetworkDevice definition allowing to specify networkDeviceSku. */
        interface WithNetworkDeviceSku {
            /**
             * Specifies the networkDeviceSku property: Network Device SKU name..
             *
             * @param networkDeviceSku Network Device SKU name.
             * @return the next definition stage.
             */
            WithCreate withNetworkDeviceSku(String networkDeviceSku);
        }
        /** The stage of the NetworkDevice definition allowing to specify networkDeviceRole. */
        interface WithNetworkDeviceRole {
            /**
             * Specifies the networkDeviceRole property: networkDeviceRole is the device role: Example: CE | ToR..
             *
             * @param networkDeviceRole networkDeviceRole is the device role: Example: CE | ToR.
             * @return the next definition stage.
             */
            WithCreate withNetworkDeviceRole(NetworkDeviceRoleTypes networkDeviceRole);
        }
        /** The stage of the NetworkDevice definition allowing to specify hostname. */
        interface WithHostname {
            /**
             * Specifies the hostname property: The host Name of the device..
             *
             * @param hostname The host Name of the device.
             * @return the next definition stage.
             */
            WithCreate withHostname(String hostname);
        }
        /** The stage of the NetworkDevice definition allowing to specify serialNumber. */
        interface WithSerialNumber {
            /**
             * Specifies the serialNumber property: serialNumber of the format
             * Make;Model;HardwareRevisionId;SerialNumber. Example: Arista;DCS-7280DR3-24;12.05;JPE21116969.
             *
             * @param serialNumber serialNumber of the format Make;Model;HardwareRevisionId;SerialNumber. Example:
             *     Arista;DCS-7280DR3-24;12.05;JPE21116969.
             * @return the next definition stage.
             */
            WithCreate withSerialNumber(String serialNumber);
        }
        /** The stage of the NetworkDevice definition allowing to specify annotation. */
        interface WithAnnotation {
            /**
             * Specifies the annotation property: Switch configuration description..
             *
             * @param annotation Switch configuration description.
             * @return the next definition stage.
             */
            WithCreate withAnnotation(String annotation);
        }
    }
    /**
     * Begins update for the NetworkDevice resource.
     *
     * @return the stage of resource update.
     */
    NetworkDevice.Update update();

    /** The template for NetworkDevice update. */
    interface Update
        extends UpdateStages.WithTags,
            UpdateStages.WithHostname,
            UpdateStages.WithSerialNumber,
            UpdateStages.WithAnnotation {
        /**
         * Executes the update request.
         *
         * @return the updated resource.
         */
        NetworkDevice apply();

        /**
         * Executes the update request.
         *
         * @param context The context to associate with this operation.
         * @return the updated resource.
         */
        NetworkDevice apply(Context context);
    }
    /** The NetworkDevice update stages. */
    interface UpdateStages {
        /** The stage of the NetworkDevice update allowing to specify tags. */
        interface WithTags {
            /**
             * Specifies the tags property: Azure resource tags that will replace the existing ones..
             *
             * @param tags Azure resource tags that will replace the existing ones.
             * @return the next definition stage.
             */
            Update withTags(Map<String, String> tags);
        }
        /** The stage of the NetworkDevice update allowing to specify hostname. */
        interface WithHostname {
            /**
             * Specifies the hostname property: The host Name of the device..
             *
             * @param hostname The host Name of the device.
             * @return the next definition stage.
             */
            Update withHostname(String hostname);
        }
        /** The stage of the NetworkDevice update allowing to specify serialNumber. */
        interface WithSerialNumber {
            /**
             * Specifies the serialNumber property: serialNumber of the format
             * Make;Model;HardwareRevisionId;SerialNumber. Example: Arista;DCS-7280DR3-24;12.05;JPE21116969.
             *
             * @param serialNumber serialNumber of the format Make;Model;HardwareRevisionId;SerialNumber. Example:
             *     Arista;DCS-7280DR3-24;12.05;JPE21116969.
             * @return the next definition stage.
             */
            Update withSerialNumber(String serialNumber);
        }
        /** The stage of the NetworkDevice update allowing to specify annotation. */
        interface WithAnnotation {
            /**
             * Specifies the annotation property: Switch configuration description..
             *
             * @param annotation Switch configuration description.
             * @return the next definition stage.
             */
            Update withAnnotation(String annotation);
        }
    }
    /**
     * Refreshes the resource to sync with Azure.
     *
     * @return the refreshed resource.
     */
    NetworkDevice refresh();

    /**
     * Refreshes the resource to sync with Azure.
     *
     * @param context The context to associate with this operation.
     * @return the refreshed resource.
     */
    NetworkDevice refresh(Context context);

    /**
     * Implements the operation to the underlying resources.
     *
     * <p>Reboot the Network Device.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void reboot();

    /**
     * Implements the operation to the underlying resources.
     *
     * <p>Reboot the Network Device.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void reboot(Context context);

    /**
     * Restores the configuration to last applied good configuration from Azure.
     *
     * <p>Restore the configuration of the Network Device resource to last known good configuration.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void restoreConfig();

    /**
     * Restores the configuration to last applied good configuration from Azure.
     *
     * <p>Restore the configuration of the Network Device resource to last known good configuration.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void restoreConfig(Context context);

    /**
     * Implements SKU version upgrade of network device.
     *
     * <p>Update the SKU version of the Network Device resource.
     *
     * @param body Request payload.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void updateVersion(UpdateVersionProperties body);

    /**
     * Implements SKU version upgrade of network device.
     *
     * <p>Update the SKU version of the Network Device resource.
     *
     * @param body Request payload.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void updateVersion(UpdateVersionProperties body, Context context);

    /**
     * Implements the operation to the underlying resources.
     *
     * <p>Generate Support Package for the given Network Device.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return generate support package post action properties.
     */
    SupportPackageProperties generateSupportPackage();

    /**
     * Implements the operation to the underlying resources.
     *
     * <p>Generate Support Package for the given Network Device.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return generate support package post action properties.
     */
    SupportPackageProperties generateSupportPackage(Context context);

    /**
     * Implements the operation to the underlying resources.
     *
     * <p>Update PDU power cycle of the Network Device.
     *
     * @param body Request payload.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void updatePowerCycle(UpdatePowerCycleProperties body);

    /**
     * Implements the operation to the underlying resources.
     *
     * <p>Update PDU power cycle of the Network Device.
     *
     * @param body Request payload.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void updatePowerCycle(UpdatePowerCycleProperties body, Context context);

    /**
     * Gets the running status of the network device.
     *
     * <p>Get the running status of the Network Device.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the running status of the Network Device.
     */
    GetDeviceStatusProperties getStatus();

    /**
     * Gets the running status of the network device.
     *
     * <p>Get the running status of the Network Device.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the running status of the Network Device.
     */
    GetDeviceStatusProperties getStatus(Context context);

    /**
     * Show the interface maps as per the topology.
     *
     * <p>Get the static interface maps for the given Network Device.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the static interface maps for the given Network Device.
     */
    List<GetStaticInterfaceMapsPropertiesItem> getStaticInterfaceMaps();

    /**
     * Show the interface maps as per the topology.
     *
     * <p>Get the static interface maps for the given Network Device.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the static interface maps for the given Network Device.
     */
    List<GetStaticInterfaceMapsPropertiesItem> getStaticInterfaceMaps(Context context);

    /**
     * Implements the operation to the underlying resources.
     *
     * <p>Get the dynamic interface maps for the given Network Device.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the dynamic interface maps for the given Network Device.
     */
    List<GetDynamicInterfaceMapsPropertiesItem> getDynamicInterfaceMaps();

    /**
     * Implements the operation to the underlying resources.
     *
     * <p>Get the dynamic interface maps for the given Network Device.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the dynamic interface maps for the given Network Device.
     */
    List<GetDynamicInterfaceMapsPropertiesItem> getDynamicInterfaceMaps(Context context);
}
