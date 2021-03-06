/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.frontdoor.v2020_05_01.implementation;

import com.microsoft.azure.arm.resources.models.implementation.GroupableResourceCoreImpl;
import com.microsoft.azure.management.frontdoor.v2020_05_01.FrontDoor;
import rx.Observable;
import java.util.List;
import com.microsoft.azure.management.frontdoor.v2020_05_01.RoutingRule;
import com.microsoft.azure.management.frontdoor.v2020_05_01.LoadBalancingSettingsModel;
import com.microsoft.azure.management.frontdoor.v2020_05_01.HealthProbeSettingsModel;
import com.microsoft.azure.management.frontdoor.v2020_05_01.BackendPool;
import com.microsoft.azure.management.frontdoor.v2020_05_01.BackendPoolsSettings;
import com.microsoft.azure.management.frontdoor.v2020_05_01.FrontDoorEnabledState;
import com.microsoft.azure.management.frontdoor.v2020_05_01.FrontDoorResourceState;
import java.util.ArrayList;
import com.microsoft.azure.management.frontdoor.v2020_05_01.FrontendEndpoint;
import com.microsoft.azure.management.frontdoor.v2020_05_01.RulesEngine;

class FrontDoorImpl extends GroupableResourceCoreImpl<FrontDoor, FrontDoorInner, FrontDoorImpl, NetworkManager> implements FrontDoor, FrontDoor.Definition, FrontDoor.Update {
    FrontDoorImpl(String name, FrontDoorInner inner, NetworkManager manager) {
        super(name, inner, manager);
    }

    @Override
    public Observable<FrontDoor> createResourceAsync() {
        FrontDoorsInner client = this.manager().inner().frontDoors();
        return client.createOrUpdateAsync(this.resourceGroupName(), this.name(), this.inner())
            .map(innerToFluentMap(this));
    }

    @Override
    public Observable<FrontDoor> updateResourceAsync() {
        FrontDoorsInner client = this.manager().inner().frontDoors();
        return client.createOrUpdateAsync(this.resourceGroupName(), this.name(), this.inner())
            .map(innerToFluentMap(this));
    }

    @Override
    protected Observable<FrontDoorInner> getInnerAsync() {
        FrontDoorsInner client = this.manager().inner().frontDoors();
        return client.getByResourceGroupAsync(this.resourceGroupName(), this.name());
    }

    @Override
    public boolean isInCreateMode() {
        return this.inner().id() == null;
    }


    @Override
    public List<BackendPool> backendPools() {
        return this.inner().backendPools();
    }

    @Override
    public BackendPoolsSettings backendPoolsSettings() {
        return this.inner().backendPoolsSettings();
    }

    @Override
    public String cname() {
        return this.inner().cname();
    }

    @Override
    public FrontDoorEnabledState enabledState() {
        return this.inner().enabledState();
    }

    @Override
    public String friendlyName() {
        return this.inner().friendlyName();
    }

    @Override
    public String frontdoorId() {
        return this.inner().frontdoorId();
    }

    @Override
    public List<FrontendEndpoint> frontendEndpoints() {
        List<FrontendEndpoint> lst = new ArrayList<FrontendEndpoint>();
        if (this.inner().frontendEndpoints() != null) {
            for (FrontendEndpointInner inner : this.inner().frontendEndpoints()) {
                lst.add( new FrontendEndpointImpl(inner, manager()));
            }
        }
        return lst;
    }

    @Override
    public List<HealthProbeSettingsModel> healthProbeSettings() {
        return this.inner().healthProbeSettings();
    }

    @Override
    public List<LoadBalancingSettingsModel> loadBalancingSettings() {
        return this.inner().loadBalancingSettings();
    }

    @Override
    public String provisioningState() {
        return this.inner().provisioningState();
    }

    @Override
    public FrontDoorResourceState resourceState() {
        return this.inner().resourceState();
    }

    @Override
    public List<RoutingRule> routingRules() {
        return this.inner().routingRules();
    }

    @Override
    public List<RulesEngine> rulesEngines() {
        List<RulesEngine> lst = new ArrayList<RulesEngine>();
        if (this.inner().rulesEngines() != null) {
            for (RulesEngineInner inner : this.inner().rulesEngines()) {
                lst.add( new RulesEngineImpl(inner, manager()));
            }
        }
        return lst;
    }

    @Override
    public FrontDoorImpl withBackendPools(List<BackendPool> backendPools) {
        this.inner().withBackendPools(backendPools);
        return this;
    }

    @Override
    public FrontDoorImpl withBackendPoolsSettings(BackendPoolsSettings backendPoolsSettings) {
        this.inner().withBackendPoolsSettings(backendPoolsSettings);
        return this;
    }

    @Override
    public FrontDoorImpl withEnabledState(FrontDoorEnabledState enabledState) {
        this.inner().withEnabledState(enabledState);
        return this;
    }

    @Override
    public FrontDoorImpl withFriendlyName(String friendlyName) {
        this.inner().withFriendlyName(friendlyName);
        return this;
    }

    @Override
    public FrontDoorImpl withFrontendEndpoints(List<FrontendEndpointInner> frontendEndpoints) {
        this.inner().withFrontendEndpoints(frontendEndpoints);
        return this;
    }

    @Override
    public FrontDoorImpl withHealthProbeSettings(List<HealthProbeSettingsModel> healthProbeSettings) {
        this.inner().withHealthProbeSettings(healthProbeSettings);
        return this;
    }

    @Override
    public FrontDoorImpl withLoadBalancingSettings(List<LoadBalancingSettingsModel> loadBalancingSettings) {
        this.inner().withLoadBalancingSettings(loadBalancingSettings);
        return this;
    }

    @Override
    public FrontDoorImpl withResourceState(FrontDoorResourceState resourceState) {
        this.inner().withResourceState(resourceState);
        return this;
    }

    @Override
    public FrontDoorImpl withRoutingRules(List<RoutingRule> routingRules) {
        this.inner().withRoutingRules(routingRules);
        return this;
    }

}
