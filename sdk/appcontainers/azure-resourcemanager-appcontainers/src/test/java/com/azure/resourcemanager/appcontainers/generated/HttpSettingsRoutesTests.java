// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appcontainers.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.appcontainers.models.HttpSettingsRoutes;
import org.junit.jupiter.api.Assertions;

public final class HttpSettingsRoutesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        HttpSettingsRoutes model
            = BinaryData.fromString("{\"apiPrefix\":\"enjbdlwtgrhp\"}").toObject(HttpSettingsRoutes.class);
        Assertions.assertEquals("enjbdlwtgrhp", model.apiPrefix());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        HttpSettingsRoutes model = new HttpSettingsRoutes().withApiPrefix("enjbdlwtgrhp");
        model = BinaryData.fromObject(model).toObject(HttpSettingsRoutes.class);
        Assertions.assertEquals("enjbdlwtgrhp", model.apiPrefix());
    }
}
