/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.resourcemover.v2021_01_01;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for DependencyLevel.
 */
public final class DependencyLevel extends ExpandableStringEnum<DependencyLevel> {
    /** Static value Direct for DependencyLevel. */
    public static final DependencyLevel DIRECT = fromString("Direct");

    /** Static value Descendant for DependencyLevel. */
    public static final DependencyLevel DESCENDANT = fromString("Descendant");

    /**
     * Creates or finds a DependencyLevel from its string representation.
     * @param name a name to look for
     * @return the corresponding DependencyLevel
     */
    @JsonCreator
    public static DependencyLevel fromString(String name) {
        return fromString(name, DependencyLevel.class);
    }

    /**
     * @return known DependencyLevel values
     */
    public static Collection<DependencyLevel> values() {
        return values(DependencyLevel.class);
    }
}
