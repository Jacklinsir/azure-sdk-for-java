/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.resourcemover.v2021_01_01.implementation;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Required for resources collection.
 */
public class RequiredForResourcesCollectionInner {
    /**
     * Gets or sets the list of source Ids for which the input resource is
     * required.
     */
    @JsonProperty(value = "sourceIds")
    private List<String> sourceIds;

    /**
     * Get gets or sets the list of source Ids for which the input resource is required.
     *
     * @return the sourceIds value
     */
    public List<String> sourceIds() {
        return this.sourceIds;
    }

    /**
     * Set gets or sets the list of source Ids for which the input resource is required.
     *
     * @param sourceIds the sourceIds value to set
     * @return the RequiredForResourcesCollectionInner object itself.
     */
    public RequiredForResourcesCollectionInner withSourceIds(List<String> sourceIds) {
        this.sourceIds = sourceIds;
        return this;
    }

}
