// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.agrifood.models;

import com.azure.core.management.Region;
import com.azure.core.management.SystemData;
import com.azure.core.util.Context;
import com.azure.resourcemanager.agrifood.fluent.models.FarmBeatsInner;
import java.util.Map;

/**
 * An immutable client-side representation of FarmBeats.
 */
public interface FarmBeats {
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
     * Gets the identity property: Identity for the resource.
     * 
     * @return the identity value.
     */
    Identity identity();

    /**
     * Gets the systemData property: Azure Resource Manager metadata containing createdBy and modifiedBy information.
     * 
     * @return the systemData value.
     */
    SystemData systemData();

    /**
     * Gets the instanceUri property: Uri of the FarmBeats instance.
     * 
     * @return the instanceUri value.
     */
    String instanceUri();

    /**
     * Gets the provisioningState property: FarmBeats instance provisioning state.
     * 
     * @return the provisioningState value.
     */
    ProvisioningState provisioningState();

    /**
     * Gets the sensorIntegration property: Sensor integration request model.
     * 
     * @return the sensorIntegration value.
     */
    SensorIntegration sensorIntegration();

    /**
     * Gets the publicNetworkAccess property: Property to allow or block public traffic for an Azure FarmBeats resource.
     * 
     * @return the publicNetworkAccess value.
     */
    PublicNetworkAccess publicNetworkAccess();

    /**
     * Gets the privateEndpointConnections property: The private endpoint connection resource.
     * 
     * @return the privateEndpointConnections value.
     */
    PrivateEndpointConnection privateEndpointConnections();

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
     * Gets the inner com.azure.resourcemanager.agrifood.fluent.models.FarmBeatsInner object.
     * 
     * @return the inner object.
     */
    FarmBeatsInner innerModel();

    /**
     * The entirety of the FarmBeats definition.
     */
    interface Definition extends DefinitionStages.Blank, DefinitionStages.WithLocation,
        DefinitionStages.WithResourceGroup, DefinitionStages.WithCreate {
    }

    /**
     * The FarmBeats definition stages.
     */
    interface DefinitionStages {
        /**
         * The first stage of the FarmBeats definition.
         */
        interface Blank extends WithLocation {
        }

        /**
         * The stage of the FarmBeats definition allowing to specify location.
         */
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

        /**
         * The stage of the FarmBeats definition allowing to specify parent resource.
         */
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
         * The stage of the FarmBeats definition which contains all the minimum required properties for the resource to
         * be created, but also allows for any other optional properties to be specified.
         */
        interface WithCreate extends DefinitionStages.WithTags, DefinitionStages.WithIdentity,
            DefinitionStages.WithSensorIntegration, DefinitionStages.WithPublicNetworkAccess {
            /**
             * Executes the create request.
             * 
             * @return the created resource.
             */
            FarmBeats create();

            /**
             * Executes the create request.
             * 
             * @param context The context to associate with this operation.
             * @return the created resource.
             */
            FarmBeats create(Context context);
        }

        /**
         * The stage of the FarmBeats definition allowing to specify tags.
         */
        interface WithTags {
            /**
             * Specifies the tags property: Resource tags..
             * 
             * @param tags Resource tags.
             * @return the next definition stage.
             */
            WithCreate withTags(Map<String, String> tags);
        }

        /**
         * The stage of the FarmBeats definition allowing to specify identity.
         */
        interface WithIdentity {
            /**
             * Specifies the identity property: Identity for the resource..
             * 
             * @param identity Identity for the resource.
             * @return the next definition stage.
             */
            WithCreate withIdentity(Identity identity);
        }

        /**
         * The stage of the FarmBeats definition allowing to specify sensorIntegration.
         */
        interface WithSensorIntegration {
            /**
             * Specifies the sensorIntegration property: Sensor integration request model..
             * 
             * @param sensorIntegration Sensor integration request model.
             * @return the next definition stage.
             */
            WithCreate withSensorIntegration(SensorIntegration sensorIntegration);
        }

        /**
         * The stage of the FarmBeats definition allowing to specify publicNetworkAccess.
         */
        interface WithPublicNetworkAccess {
            /**
             * Specifies the publicNetworkAccess property: Property to allow or block public traffic for an Azure
             * FarmBeats resource..
             * 
             * @param publicNetworkAccess Property to allow or block public traffic for an Azure FarmBeats resource.
             * @return the next definition stage.
             */
            WithCreate withPublicNetworkAccess(PublicNetworkAccess publicNetworkAccess);
        }
    }

    /**
     * Begins update for the FarmBeats resource.
     * 
     * @return the stage of resource update.
     */
    FarmBeats.Update update();

    /**
     * The template for FarmBeats update.
     */
    interface Update extends UpdateStages.WithTags, UpdateStages.WithIdentity, UpdateStages.WithProperties {
        /**
         * Executes the update request.
         * 
         * @return the updated resource.
         */
        FarmBeats apply();

        /**
         * Executes the update request.
         * 
         * @param context The context to associate with this operation.
         * @return the updated resource.
         */
        FarmBeats apply(Context context);
    }

    /**
     * The FarmBeats update stages.
     */
    interface UpdateStages {
        /**
         * The stage of the FarmBeats update allowing to specify tags.
         */
        interface WithTags {
            /**
             * Specifies the tags property: Resource tags..
             * 
             * @param tags Resource tags.
             * @return the next definition stage.
             */
            Update withTags(Map<String, String> tags);
        }

        /**
         * The stage of the FarmBeats update allowing to specify identity.
         */
        interface WithIdentity {
            /**
             * Specifies the identity property: Identity for the resource..
             * 
             * @param identity Identity for the resource.
             * @return the next definition stage.
             */
            Update withIdentity(Identity identity);
        }

        /**
         * The stage of the FarmBeats update allowing to specify properties.
         */
        interface WithProperties {
            /**
             * Specifies the properties property: FarmBeats ARM Resource properties..
             * 
             * @param properties FarmBeats ARM Resource properties.
             * @return the next definition stage.
             */
            Update withProperties(FarmBeatsUpdateProperties properties);
        }
    }

    /**
     * Refreshes the resource to sync with Azure.
     * 
     * @return the refreshed resource.
     */
    FarmBeats refresh();

    /**
     * Refreshes the resource to sync with Azure.
     * 
     * @param context The context to associate with this operation.
     * @return the refreshed resource.
     */
    FarmBeats refresh(Context context);
}
