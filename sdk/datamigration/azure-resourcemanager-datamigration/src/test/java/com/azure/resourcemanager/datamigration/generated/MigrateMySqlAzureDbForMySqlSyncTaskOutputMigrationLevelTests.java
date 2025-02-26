// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datamigration.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datamigration.models.MigrateMySqlAzureDbForMySqlSyncTaskOutputMigrationLevel;

public final class MigrateMySqlAzureDbForMySqlSyncTaskOutputMigrationLevelTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        MigrateMySqlAzureDbForMySqlSyncTaskOutputMigrationLevel model = BinaryData.fromString(
            "{\"resultType\":\"MigrationLevelOutput\",\"startedOn\":\"2021-06-26T23:53:23Z\",\"endedOn\":\"2021-05-03T07:32:41Z\",\"sourceServerVersion\":\"wwrlkdmtncv\",\"sourceServer\":\"otllxdyhgsyo\",\"targetServerVersion\":\"gjltdtbnnhado\",\"targetServer\":\"rkvcikhnvpa\",\"id\":\"gxqquezik\"}")
            .toObject(MigrateMySqlAzureDbForMySqlSyncTaskOutputMigrationLevel.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        MigrateMySqlAzureDbForMySqlSyncTaskOutputMigrationLevel model
            = new MigrateMySqlAzureDbForMySqlSyncTaskOutputMigrationLevel();
        model = BinaryData.fromObject(model).toObject(MigrateMySqlAzureDbForMySqlSyncTaskOutputMigrationLevel.class);
    }
}
