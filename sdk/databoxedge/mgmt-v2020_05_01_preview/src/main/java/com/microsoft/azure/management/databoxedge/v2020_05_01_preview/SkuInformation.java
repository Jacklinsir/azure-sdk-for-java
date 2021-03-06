/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.databoxedge.v2020_05_01_preview;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Sku information.
 */
public class SkuInformation {
    /**
     * The resource type.
     */
    @JsonProperty(value = "resourceType", access = JsonProperty.Access.WRITE_ONLY)
    private String resourceType;

    /**
     * The sku name.
     */
    @JsonProperty(value = "name", access = JsonProperty.Access.WRITE_ONLY)
    private String name;

    /**
     * The sku tier.
     */
    @JsonProperty(value = "tier", access = JsonProperty.Access.WRITE_ONLY)
    private String tier;

    /**
     * The sku kind.
     */
    @JsonProperty(value = "kind", access = JsonProperty.Access.WRITE_ONLY)
    private String kind;

    /**
     * The sku size.
     */
    @JsonProperty(value = "size", access = JsonProperty.Access.WRITE_ONLY)
    private String size;

    /**
     * The sku family.
     */
    @JsonProperty(value = "family", access = JsonProperty.Access.WRITE_ONLY)
    private String family;

    /**
     * The locations where Sku is available.
     */
    @JsonProperty(value = "locations", access = JsonProperty.Access.WRITE_ONLY)
    private List<String> locations;

    /**
     * The locations where Sku is available with zones and sites info.
     */
    @JsonProperty(value = "locationInfo", access = JsonProperty.Access.WRITE_ONLY)
    private List<SkuLocationInfo> locationInfo;

    /**
     * The required quotaIds for the sku to be available.
     */
    @JsonProperty(value = "requiredQuotaIds", access = JsonProperty.Access.WRITE_ONLY)
    private List<String> requiredQuotaIds;

    /**
     * The required features for the sku to be available.
     */
    @JsonProperty(value = "requiredFeatures", access = JsonProperty.Access.WRITE_ONLY)
    private List<String> requiredFeatures;

    /**
     * The cost of the SKU.
     */
    @JsonProperty(value = "costs", access = JsonProperty.Access.WRITE_ONLY)
    private List<SkuCost> costs;

    /**
     * The capabilities of the SKU.
     */
    @JsonProperty(value = "capabilities", access = JsonProperty.Access.WRITE_ONLY)
    private List<SKUCapability> capabilities;

    /**
     * Get the resource type.
     *
     * @return the resourceType value
     */
    public String resourceType() {
        return this.resourceType;
    }

    /**
     * Get the sku name.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Get the sku tier.
     *
     * @return the tier value
     */
    public String tier() {
        return this.tier;
    }

    /**
     * Get the sku kind.
     *
     * @return the kind value
     */
    public String kind() {
        return this.kind;
    }

    /**
     * Get the sku size.
     *
     * @return the size value
     */
    public String size() {
        return this.size;
    }

    /**
     * Get the sku family.
     *
     * @return the family value
     */
    public String family() {
        return this.family;
    }

    /**
     * Get the locations where Sku is available.
     *
     * @return the locations value
     */
    public List<String> locations() {
        return this.locations;
    }

    /**
     * Get the locations where Sku is available with zones and sites info.
     *
     * @return the locationInfo value
     */
    public List<SkuLocationInfo> locationInfo() {
        return this.locationInfo;
    }

    /**
     * Get the required quotaIds for the sku to be available.
     *
     * @return the requiredQuotaIds value
     */
    public List<String> requiredQuotaIds() {
        return this.requiredQuotaIds;
    }

    /**
     * Get the required features for the sku to be available.
     *
     * @return the requiredFeatures value
     */
    public List<String> requiredFeatures() {
        return this.requiredFeatures;
    }

    /**
     * Get the cost of the SKU.
     *
     * @return the costs value
     */
    public List<SkuCost> costs() {
        return this.costs;
    }

    /**
     * Get the capabilities of the SKU.
     *
     * @return the capabilities value
     */
    public List<SKUCapability> capabilities() {
        return this.capabilities;
    }

}
