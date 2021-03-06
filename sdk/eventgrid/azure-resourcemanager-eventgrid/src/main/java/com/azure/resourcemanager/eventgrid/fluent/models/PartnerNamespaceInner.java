// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventgrid.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.management.Resource;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.eventgrid.models.PartnerNamespaceProvisioningState;
import com.azure.resourcemanager.eventgrid.models.SystemData;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;

/** EventGrid Partner Namespace. */
@JsonFlatten
@Fluent
public class PartnerNamespaceInner extends Resource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(PartnerNamespaceInner.class);

    /*
     * The system metadata relating to Partner Namespace resource.
     */
    @JsonProperty(value = "systemData", access = JsonProperty.Access.WRITE_ONLY)
    private SystemData systemData;

    /*
     * Provisioning state of the partner namespace.
     */
    @JsonProperty(value = "properties.provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private PartnerNamespaceProvisioningState provisioningState;

    /*
     * The fully qualified ARM Id of the partner registration that should be
     * associated with this partner namespace. This takes the following format:
     * /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.EventGrid/partnerRegistrations/{partnerRegistrationName}.
     */
    @JsonProperty(value = "properties.partnerRegistrationFullyQualifiedId")
    private String partnerRegistrationFullyQualifiedId;

    /*
     * Endpoint for the partner namespace.
     */
    @JsonProperty(value = "properties.endpoint", access = JsonProperty.Access.WRITE_ONLY)
    private String endpoint;

    /**
     * Get the systemData property: The system metadata relating to Partner Namespace resource.
     *
     * @return the systemData value.
     */
    public SystemData systemData() {
        return this.systemData;
    }

    /**
     * Get the provisioningState property: Provisioning state of the partner namespace.
     *
     * @return the provisioningState value.
     */
    public PartnerNamespaceProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the partnerRegistrationFullyQualifiedId property: The fully qualified ARM Id of the partner registration that
     * should be associated with this partner namespace. This takes the following format:
     * /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.EventGrid/partnerRegistrations/{partnerRegistrationName}.
     *
     * @return the partnerRegistrationFullyQualifiedId value.
     */
    public String partnerRegistrationFullyQualifiedId() {
        return this.partnerRegistrationFullyQualifiedId;
    }

    /**
     * Set the partnerRegistrationFullyQualifiedId property: The fully qualified ARM Id of the partner registration that
     * should be associated with this partner namespace. This takes the following format:
     * /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.EventGrid/partnerRegistrations/{partnerRegistrationName}.
     *
     * @param partnerRegistrationFullyQualifiedId the partnerRegistrationFullyQualifiedId value to set.
     * @return the PartnerNamespaceInner object itself.
     */
    public PartnerNamespaceInner withPartnerRegistrationFullyQualifiedId(String partnerRegistrationFullyQualifiedId) {
        this.partnerRegistrationFullyQualifiedId = partnerRegistrationFullyQualifiedId;
        return this;
    }

    /**
     * Get the endpoint property: Endpoint for the partner namespace.
     *
     * @return the endpoint value.
     */
    public String endpoint() {
        return this.endpoint;
    }

    /** {@inheritDoc} */
    @Override
    public PartnerNamespaceInner withLocation(String location) {
        super.withLocation(location);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public PartnerNamespaceInner withTags(Map<String, String> tags) {
        super.withTags(tags);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (systemData() != null) {
            systemData().validate();
        }
    }
}
