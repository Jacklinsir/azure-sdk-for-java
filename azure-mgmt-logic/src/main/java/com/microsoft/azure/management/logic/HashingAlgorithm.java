/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.logic;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Defines values for HashingAlgorithm.
 */
public enum HashingAlgorithm {
    /** Enum value NotSpecified. */
    NOT_SPECIFIED("NotSpecified"),

    /** Enum value None. */
    NONE("None"),

    /** Enum value MD5. */
    MD5("MD5"),

    /** Enum value SHA1. */
    SHA1("SHA1"),

    /** Enum value SHA2256. */
    SHA2256("SHA2256"),

    /** Enum value SHA2384. */
    SHA2384("SHA2384"),

    /** Enum value SHA2512. */
    SHA2512("SHA2512");

    /** The actual serialized value for a HashingAlgorithm instance. */
    private String value;

    HashingAlgorithm(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a HashingAlgorithm instance.
     *
     * @param value the serialized value to parse.
     * @return the parsed HashingAlgorithm object, or null if unable to parse.
     */
    @JsonCreator
    public static HashingAlgorithm fromString(String value) {
        HashingAlgorithm[] items = HashingAlgorithm.values();
        for (HashingAlgorithm item : items) {
            if (item.toString().equalsIgnoreCase(value)) {
                return item;
            }
        }
        return null;
    }

    @JsonValue
    @Override
    public String toString() {
        return this.value;
    }
}
