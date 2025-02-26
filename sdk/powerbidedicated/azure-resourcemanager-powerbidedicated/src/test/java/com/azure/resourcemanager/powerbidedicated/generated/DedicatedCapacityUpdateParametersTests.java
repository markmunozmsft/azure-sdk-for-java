// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.powerbidedicated.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.powerbidedicated.models.CapacitySku;
import com.azure.resourcemanager.powerbidedicated.models.CapacitySkuTier;
import com.azure.resourcemanager.powerbidedicated.models.DedicatedCapacityAdministrators;
import com.azure.resourcemanager.powerbidedicated.models.DedicatedCapacityUpdateParameters;
import com.azure.resourcemanager.powerbidedicated.models.Mode;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class DedicatedCapacityUpdateParametersTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        DedicatedCapacityUpdateParameters model = BinaryData.fromString(
            "{\"sku\":{\"name\":\"k\",\"tier\":\"Premium\",\"capacity\":832798449},\"tags\":{\"ukxgaud\":\"rtfw\",\"h\":\"cs\"},\"properties\":{\"administration\":{\"members\":[\"ejhkry\",\"tnapczwlokjyemkk\"]},\"mode\":\"Gen2\",\"tenantId\":\"joxzjnchgejspodm\",\"friendlyName\":\"lzydehojwyahux\"}}")
            .toObject(DedicatedCapacityUpdateParameters.class);
        Assertions.assertEquals("k", model.sku().name());
        Assertions.assertEquals(CapacitySkuTier.PREMIUM, model.sku().tier());
        Assertions.assertEquals(832798449, model.sku().capacity());
        Assertions.assertEquals("rtfw", model.tags().get("ukxgaud"));
        Assertions.assertEquals("ejhkry", model.administration().members().get(0));
        Assertions.assertEquals(Mode.GEN2, model.mode());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        DedicatedCapacityUpdateParameters model = new DedicatedCapacityUpdateParameters()
            .withSku(new CapacitySku().withName("k").withTier(CapacitySkuTier.PREMIUM).withCapacity(832798449))
            .withTags(mapOf("ukxgaud", "rtfw", "h", "cs"))
            .withAdministration(
                new DedicatedCapacityAdministrators().withMembers(Arrays.asList("ejhkry", "tnapczwlokjyemkk")))
            .withMode(Mode.GEN2);
        model = BinaryData.fromObject(model).toObject(DedicatedCapacityUpdateParameters.class);
        Assertions.assertEquals("k", model.sku().name());
        Assertions.assertEquals(CapacitySkuTier.PREMIUM, model.sku().tier());
        Assertions.assertEquals(832798449, model.sku().capacity());
        Assertions.assertEquals("rtfw", model.tags().get("ukxgaud"));
        Assertions.assertEquals("ejhkry", model.administration().members().get(0));
        Assertions.assertEquals(Mode.GEN2, model.mode());
    }

    // Use "Map.of" if available
    @SuppressWarnings("unchecked")
    private static <T> Map<String, T> mapOf(Object... inputs) {
        Map<String, T> map = new HashMap<>();
        for (int i = 0; i < inputs.length; i += 2) {
            String key = (String) inputs[i];
            T value = (T) inputs[i + 1];
            map.put(key, value);
        }
        return map;
    }
}
