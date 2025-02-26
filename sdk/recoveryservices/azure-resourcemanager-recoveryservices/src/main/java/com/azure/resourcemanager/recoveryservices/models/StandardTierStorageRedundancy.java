// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservices.models;

import com.azure.core.util.ExpandableStringEnum;
import java.util.Collection;

/**
 * The storage redundancy setting of a vault.
 */
public final class StandardTierStorageRedundancy extends ExpandableStringEnum<StandardTierStorageRedundancy> {
    /**
     * Static value Invalid for StandardTierStorageRedundancy.
     */
    public static final StandardTierStorageRedundancy INVALID = fromString("Invalid");

    /**
     * Static value LocallyRedundant for StandardTierStorageRedundancy.
     */
    public static final StandardTierStorageRedundancy LOCALLY_REDUNDANT = fromString("LocallyRedundant");

    /**
     * Static value GeoRedundant for StandardTierStorageRedundancy.
     */
    public static final StandardTierStorageRedundancy GEO_REDUNDANT = fromString("GeoRedundant");

    /**
     * Static value ZoneRedundant for StandardTierStorageRedundancy.
     */
    public static final StandardTierStorageRedundancy ZONE_REDUNDANT = fromString("ZoneRedundant");

    /**
     * Creates a new instance of StandardTierStorageRedundancy value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public StandardTierStorageRedundancy() {
    }

    /**
     * Creates or finds a StandardTierStorageRedundancy from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding StandardTierStorageRedundancy.
     */
    public static StandardTierStorageRedundancy fromString(String name) {
        return fromString(name, StandardTierStorageRedundancy.class);
    }

    /**
     * Gets known StandardTierStorageRedundancy values.
     * 
     * @return known StandardTierStorageRedundancy values.
     */
    public static Collection<StandardTierStorageRedundancy> values() {
        return values(StandardTierStorageRedundancy.class);
    }
}
