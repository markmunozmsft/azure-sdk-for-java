// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datamigration.models;

import com.azure.core.util.ExpandableStringEnum;
import java.util.Collection;

/**
 * Enum of the different state of table level online migration.
 */
public final class SyncTableMigrationState extends ExpandableStringEnum<SyncTableMigrationState> {
    /**
     * Static value BEFORE_LOAD for SyncTableMigrationState.
     */
    public static final SyncTableMigrationState BEFORE_LOAD = fromString("BEFORE_LOAD");

    /**
     * Static value FULL_LOAD for SyncTableMigrationState.
     */
    public static final SyncTableMigrationState FULL_LOAD = fromString("FULL_LOAD");

    /**
     * Static value COMPLETED for SyncTableMigrationState.
     */
    public static final SyncTableMigrationState COMPLETED = fromString("COMPLETED");

    /**
     * Static value CANCELED for SyncTableMigrationState.
     */
    public static final SyncTableMigrationState CANCELED = fromString("CANCELED");

    /**
     * Static value ERROR for SyncTableMigrationState.
     */
    public static final SyncTableMigrationState ERROR = fromString("ERROR");

    /**
     * Static value FAILED for SyncTableMigrationState.
     */
    public static final SyncTableMigrationState FAILED = fromString("FAILED");

    /**
     * Creates a new instance of SyncTableMigrationState value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public SyncTableMigrationState() {
    }

    /**
     * Creates or finds a SyncTableMigrationState from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding SyncTableMigrationState.
     */
    public static SyncTableMigrationState fromString(String name) {
        return fromString(name, SyncTableMigrationState.class);
    }

    /**
     * Gets known SyncTableMigrationState values.
     * 
     * @return known SyncTableMigrationState values.
     */
    public static Collection<SyncTableMigrationState> values() {
        return values(SyncTableMigrationState.class);
    }
}
