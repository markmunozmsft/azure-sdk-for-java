// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.ExpressionV2;
import com.azure.resourcemanager.datafactory.models.ExpressionV2Type;
import com.azure.resourcemanager.datafactory.models.ServiceNowV2Source;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class ServiceNowV2SourceTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ServiceNowV2Source model = BinaryData.fromString(
            "{\"type\":\"ServiceNowV2Source\",\"expression\":{\"type\":\"NAry\",\"value\":\"aejbmt\",\"operators\":[\"eudfhcl\",\"sedxiigwxzwqjpu\",\"upishcvsjaaedsqf\"],\"operands\":[{\"type\":\"Field\",\"value\":\"w\",\"operators\":[\"ptfvoljnromhsias\"],\"operands\":[{\"type\":\"Binary\",\"value\":\"qckwccpmsyhrv\",\"operators\":[\"rgnxhoqfvuqim\",\"gkvfghcuiipnsz\",\"rmqtkxya\"],\"operands\":[{},{},{}]},{\"type\":\"Constant\",\"value\":\"xhxkm\",\"operators\":[\"ryoffglwmkmbxusn\"],\"operands\":[{},{},{},{}]},{\"type\":\"Field\",\"value\":\"sdbfbkqiceh\",\"operators\":[\"tffngrduco\",\"dzbh\"],\"operands\":[{},{},{}]}]},{\"type\":\"Constant\",\"value\":\"oxzhpbjhhuimgd\",\"operators\":[\"a\"],\"operands\":[{\"type\":\"Constant\",\"value\":\"avmd\",\"operators\":[\"l\",\"cvwewognpu\",\"paqj\"],\"operands\":[{},{},{}]},{\"type\":\"NAry\",\"value\":\"lritsxuxregfb\",\"operators\":[\"zpf\",\"mjgtjckf\",\"ljrlrkvhgnm\",\"xmmpuksvoimdg\"],\"operands\":[{}]},{\"type\":\"Constant\",\"value\":\"ieomiovbmwitnih\",\"operators\":[\"zd\",\"ggghwxpgftshcss\",\"ie\"],\"operands\":[{},{}]}]}]},\"pageSize\":\"datahfezzgnwxro\",\"queryTimeout\":\"dataoppzgvt\",\"additionalColumns\":\"dataobowh\",\"sourceRetryCount\":\"datassmlwadstl\",\"sourceRetryWait\":\"datagqmuthxoldmhyppt\",\"maxConcurrentConnections\":\"datap\",\"disableMetricsCollection\":\"datalwvezthgwqqt\",\"\":{\"bouwuajsitgpz\":\"datakyipzehitdq\"}}")
            .toObject(ServiceNowV2Source.class);
        Assertions.assertEquals(ExpressionV2Type.NARY, model.expression().type());
        Assertions.assertEquals("aejbmt", model.expression().value());
        Assertions.assertEquals("eudfhcl", model.expression().operators().get(0));
        Assertions.assertEquals(ExpressionV2Type.FIELD, model.expression().operands().get(0).type());
        Assertions.assertEquals("w", model.expression().operands().get(0).value());
        Assertions.assertEquals("ptfvoljnromhsias", model.expression().operands().get(0).operators().get(0));
        Assertions.assertEquals(ExpressionV2Type.BINARY, model.expression().operands().get(0).operands().get(0).type());
        Assertions.assertEquals("qckwccpmsyhrv", model.expression().operands().get(0).operands().get(0).value());
        Assertions.assertEquals("rgnxhoqfvuqim",
            model.expression().operands().get(0).operands().get(0).operators().get(0));
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ServiceNowV2Source model
            = new ServiceNowV2Source().withSourceRetryCount("datassmlwadstl")
                .withSourceRetryWait("datagqmuthxoldmhyppt")
                .withMaxConcurrentConnections("datap")
                .withDisableMetricsCollection("datalwvezthgwqqt")
                .withQueryTimeout("dataoppzgvt")
                .withAdditionalColumns("dataobowh")
                .withExpression(
                    new ExpressionV2().withType(ExpressionV2Type.NARY)
                        .withValue("aejbmt")
                        .withOperators(Arrays.asList("eudfhcl", "sedxiigwxzwqjpu", "upishcvsjaaedsqf"))
                        .withOperands(
                            Arrays.asList(
                                new ExpressionV2().withType(ExpressionV2Type.FIELD)
                                    .withValue("w")
                                    .withOperators(Arrays.asList("ptfvoljnromhsias"))
                                    .withOperands(Arrays.asList(
                                        new ExpressionV2().withType(ExpressionV2Type.BINARY)
                                            .withValue("qckwccpmsyhrv")
                                            .withOperators(Arrays.asList("rgnxhoqfvuqim", "gkvfghcuiipnsz", "rmqtkxya"))
                                            .withOperands(Arrays.asList(new ExpressionV2(), new ExpressionV2(),
                                                new ExpressionV2())),
                                        new ExpressionV2().withType(ExpressionV2Type.CONSTANT)
                                            .withValue("xhxkm")
                                            .withOperators(Arrays.asList("ryoffglwmkmbxusn"))
                                            .withOperands(Arrays.asList(new ExpressionV2(), new ExpressionV2(),
                                                new ExpressionV2(), new ExpressionV2())),
                                        new ExpressionV2().withType(ExpressionV2Type.FIELD)
                                            .withValue("sdbfbkqiceh")
                                            .withOperators(Arrays.asList("tffngrduco", "dzbh"))
                                            .withOperands(Arrays.asList(new ExpressionV2(), new ExpressionV2(),
                                                new ExpressionV2())))),
                                new ExpressionV2().withType(ExpressionV2Type.CONSTANT)
                                    .withValue("oxzhpbjhhuimgd")
                                    .withOperators(Arrays.asList("a"))
                                    .withOperands(Arrays.asList(
                                        new ExpressionV2().withType(ExpressionV2Type.CONSTANT)
                                            .withValue("avmd")
                                            .withOperators(Arrays.asList("l", "cvwewognpu", "paqj"))
                                            .withOperands(Arrays.asList(new ExpressionV2(), new ExpressionV2(),
                                                new ExpressionV2())),
                                        new ExpressionV2().withType(ExpressionV2Type.NARY)
                                            .withValue("lritsxuxregfb")
                                            .withOperators(
                                                Arrays.asList("zpf", "mjgtjckf", "ljrlrkvhgnm", "xmmpuksvoimdg"))
                                            .withOperands(Arrays.asList(new ExpressionV2())),
                                        new ExpressionV2().withType(ExpressionV2Type.CONSTANT)
                                            .withValue("ieomiovbmwitnih")
                                            .withOperators(Arrays.asList("zd", "ggghwxpgftshcss", "ie"))
                                            .withOperands(Arrays.asList(new ExpressionV2(), new ExpressionV2())))))))
                .withPageSize("datahfezzgnwxro");
        model = BinaryData.fromObject(model).toObject(ServiceNowV2Source.class);
        Assertions.assertEquals(ExpressionV2Type.NARY, model.expression().type());
        Assertions.assertEquals("aejbmt", model.expression().value());
        Assertions.assertEquals("eudfhcl", model.expression().operators().get(0));
        Assertions.assertEquals(ExpressionV2Type.FIELD, model.expression().operands().get(0).type());
        Assertions.assertEquals("w", model.expression().operands().get(0).value());
        Assertions.assertEquals("ptfvoljnromhsias", model.expression().operands().get(0).operators().get(0));
        Assertions.assertEquals(ExpressionV2Type.BINARY, model.expression().operands().get(0).operands().get(0).type());
        Assertions.assertEquals("qckwccpmsyhrv", model.expression().operands().get(0).operands().get(0).value());
        Assertions.assertEquals("rgnxhoqfvuqim",
            model.expression().operands().get(0).operands().get(0).operators().get(0));
    }
}
