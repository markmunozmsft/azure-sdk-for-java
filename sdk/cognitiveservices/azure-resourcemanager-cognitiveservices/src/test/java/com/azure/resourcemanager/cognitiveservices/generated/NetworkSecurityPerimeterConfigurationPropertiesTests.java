// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cognitiveservices.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.cognitiveservices.models.NetworkSecurityPerimeter;
import com.azure.resourcemanager.cognitiveservices.models.NetworkSecurityPerimeterAccessRule;
import com.azure.resourcemanager.cognitiveservices.models.NetworkSecurityPerimeterAccessRuleProperties;
import com.azure.resourcemanager.cognitiveservices.models.NetworkSecurityPerimeterAccessRulePropertiesSubscriptionsItem;
import com.azure.resourcemanager.cognitiveservices.models.NetworkSecurityPerimeterConfigurationAssociationInfo;
import com.azure.resourcemanager.cognitiveservices.models.NetworkSecurityPerimeterConfigurationProperties;
import com.azure.resourcemanager.cognitiveservices.models.NetworkSecurityPerimeterProfileInfo;
import com.azure.resourcemanager.cognitiveservices.models.NspAccessRuleDirection;
import com.azure.resourcemanager.cognitiveservices.models.ProvisioningIssue;
import com.azure.resourcemanager.cognitiveservices.models.ProvisioningIssueProperties;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class NetworkSecurityPerimeterConfigurationPropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        NetworkSecurityPerimeterConfigurationProperties model = BinaryData.fromString(
            "{\"provisioningState\":\"oyqhlwig\",\"provisioningIssues\":[{\"name\":\"kbxgom\",\"properties\":{\"issueType\":\"uwasqvd\",\"severity\":\"y\",\"description\":\"uxakjsqzhzbezk\",\"suggestedResourceIds\":[\"sidxasicdd\",\"vvjskgfmocwahp\",\"gat\",\"eaahhvjhhn\"],\"suggestedAccessRules\":[{\"name\":\"bbjjidjksyxk\",\"properties\":{}},{\"name\":\"xevbl\",\"properties\":{}}]}},{\"name\":\"dnlj\",\"properties\":{\"issueType\":\"euaulxu\",\"severity\":\"mjbnk\",\"description\":\"xynenl\",\"suggestedResourceIds\":[\"eizzgwk\",\"nsrmffeycx\"],\"suggestedAccessRules\":[{\"name\":\"iymerteeammxqi\",\"properties\":{}},{\"name\":\"kzddrtkgdojbmxva\",\"properties\":{}},{\"name\":\"fdeesvecuijpxtx\",\"properties\":{}}]}},{\"name\":\"prtujwsawdd\",\"properties\":{\"issueType\":\"abxvi\",\"severity\":\"tvtzeexavoxtfg\",\"description\":\"cd\",\"suggestedResourceIds\":[\"bwpypqtgsfjacb\"],\"suggestedAccessRules\":[{\"name\":\"xudb\",\"properties\":{}},{\"name\":\"d\",\"properties\":{}}]}}],\"networkSecurityPerimeter\":{\"id\":\"irudh\",\"perimeterGuid\":\"mes\",\"location\":\"dlpagzrcxfail\"},\"resourceAssociation\":{\"name\":\"wmdboxdfgsftuf\",\"accessMode\":\"brjlnacgcckknhxk\"},\"profile\":{\"name\":\"ytnrzvuljraae\",\"accessRulesVersion\":2313343690952034235,\"accessRules\":[{\"name\":\"ukkjqnvbroyla\",\"properties\":{\"direction\":\"Inbound\",\"addressPrefixes\":[\"isdos\",\"jbjsvgjrwh\",\"yvycytdclxgcckn\",\"nwm\"],\"subscriptions\":[{},{},{},{}],\"networkSecurityPerimeters\":[{},{},{},{}],\"fullyQualifiedDomainNames\":[\"jdhttzaefedxi\",\"ch\",\"phkmcrjdqnsdfz\",\"bg\"]}},{\"name\":\"kylkdghrj\",\"properties\":{\"direction\":\"Inbound\",\"addressPrefixes\":[\"xezw\",\"hokvbwnh\",\"tqlgehgppi\"],\"subscriptions\":[{},{},{},{}],\"networkSecurityPerimeters\":[{},{},{},{}],\"fullyQualifiedDomainNames\":[\"oajvgcxtxjcs\"]}},{\"name\":\"afidltugsres\",\"properties\":{\"direction\":\"Outbound\",\"addressPrefixes\":[\"oiftxfkfwegprh\"],\"subscriptions\":[{}],\"networkSecurityPerimeters\":[{},{},{},{}],\"fullyQualifiedDomainNames\":[\"biqtgdq\",\"hm\",\"wsldrizetpwbr\"]}}],\"diagnosticSettingsVersion\":6856794884105870110,\"enabledLogCategories\":[\"phbqz\",\"izakak\",\"nkjpdnjzha\",\"oylhjlmuoyxprimr\"]}}")
            .toObject(NetworkSecurityPerimeterConfigurationProperties.class);
        Assertions.assertEquals("kbxgom", model.provisioningIssues().get(0).name());
        Assertions.assertEquals("uwasqvd", model.provisioningIssues().get(0).properties().issueType());
        Assertions.assertEquals("y", model.provisioningIssues().get(0).properties().severity());
        Assertions.assertEquals("uxakjsqzhzbezk", model.provisioningIssues().get(0).properties().description());
        Assertions.assertEquals("sidxasicdd",
            model.provisioningIssues().get(0).properties().suggestedResourceIds().get(0));
        Assertions.assertEquals("bbjjidjksyxk",
            model.provisioningIssues().get(0).properties().suggestedAccessRules().get(0).name());
        Assertions.assertEquals("irudh", model.networkSecurityPerimeter().id());
        Assertions.assertEquals("mes", model.networkSecurityPerimeter().perimeterGuid());
        Assertions.assertEquals("dlpagzrcxfail", model.networkSecurityPerimeter().location());
        Assertions.assertEquals("wmdboxdfgsftuf", model.resourceAssociation().name());
        Assertions.assertEquals("brjlnacgcckknhxk", model.resourceAssociation().accessMode());
        Assertions.assertEquals("ytnrzvuljraae", model.profile().name());
        Assertions.assertEquals(2313343690952034235L, model.profile().accessRulesVersion());
        Assertions.assertEquals("ukkjqnvbroyla", model.profile().accessRules().get(0).name());
        Assertions.assertEquals(NspAccessRuleDirection.INBOUND,
            model.profile().accessRules().get(0).properties().direction());
        Assertions.assertEquals("isdos", model.profile().accessRules().get(0).properties().addressPrefixes().get(0));
        Assertions.assertEquals("jdhttzaefedxi",
            model.profile().accessRules().get(0).properties().fullyQualifiedDomainNames().get(0));
        Assertions.assertEquals(6856794884105870110L, model.profile().diagnosticSettingsVersion());
        Assertions.assertEquals("phbqz", model.profile().enabledLogCategories().get(0));
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        NetworkSecurityPerimeterConfigurationProperties model = new NetworkSecurityPerimeterConfigurationProperties()
            .withProvisioningIssues(Arrays.asList(
                new ProvisioningIssue().withName("kbxgom")
                    .withProperties(new ProvisioningIssueProperties().withIssueType("uwasqvd")
                        .withSeverity("y")
                        .withDescription("uxakjsqzhzbezk")
                        .withSuggestedResourceIds(Arrays.asList("sidxasicdd", "vvjskgfmocwahp", "gat", "eaahhvjhhn"))
                        .withSuggestedAccessRules(Arrays.asList(
                            new NetworkSecurityPerimeterAccessRule().withName("bbjjidjksyxk")
                                .withProperties(new NetworkSecurityPerimeterAccessRuleProperties()),
                            new NetworkSecurityPerimeterAccessRule().withName("xevbl")
                                .withProperties(new NetworkSecurityPerimeterAccessRuleProperties())))),
                new ProvisioningIssue().withName("dnlj")
                    .withProperties(new ProvisioningIssueProperties().withIssueType("euaulxu")
                        .withSeverity("mjbnk")
                        .withDescription("xynenl")
                        .withSuggestedResourceIds(Arrays.asList("eizzgwk", "nsrmffeycx"))
                        .withSuggestedAccessRules(Arrays.asList(
                            new NetworkSecurityPerimeterAccessRule().withName("iymerteeammxqi")
                                .withProperties(new NetworkSecurityPerimeterAccessRuleProperties()),
                            new NetworkSecurityPerimeterAccessRule().withName("kzddrtkgdojbmxva")
                                .withProperties(new NetworkSecurityPerimeterAccessRuleProperties()),
                            new NetworkSecurityPerimeterAccessRule().withName("fdeesvecuijpxtx")
                                .withProperties(new NetworkSecurityPerimeterAccessRuleProperties())))),
                new ProvisioningIssue().withName("prtujwsawdd")
                    .withProperties(new ProvisioningIssueProperties().withIssueType("abxvi")
                        .withSeverity("tvtzeexavoxtfg")
                        .withDescription("cd")
                        .withSuggestedResourceIds(Arrays.asList("bwpypqtgsfjacb"))
                        .withSuggestedAccessRules(Arrays.asList(
                            new NetworkSecurityPerimeterAccessRule().withName("xudb")
                                .withProperties(new NetworkSecurityPerimeterAccessRuleProperties()),
                            new NetworkSecurityPerimeterAccessRule().withName("d")
                                .withProperties(new NetworkSecurityPerimeterAccessRuleProperties()))))))
            .withNetworkSecurityPerimeter(new NetworkSecurityPerimeter().withId("irudh")
                .withPerimeterGuid("mes")
                .withLocation("dlpagzrcxfail"))
            .withResourceAssociation(
                new NetworkSecurityPerimeterConfigurationAssociationInfo()
                    .withName("wmdboxdfgsftuf")
                    .withAccessMode("brjlnacgcckknhxk"))
            .withProfile(
                new NetworkSecurityPerimeterProfileInfo().withName("ytnrzvuljraae")
                    .withAccessRulesVersion(2313343690952034235L)
                    .withAccessRules(
                        Arrays.asList(
                            new NetworkSecurityPerimeterAccessRule().withName("ukkjqnvbroyla")
                                .withProperties(new NetworkSecurityPerimeterAccessRuleProperties()
                                    .withDirection(NspAccessRuleDirection.INBOUND)
                                    .withAddressPrefixes(Arrays.asList("isdos", "jbjsvgjrwh", "yvycytdclxgcckn", "nwm"))
                                    .withSubscriptions(Arrays.asList(
                                        new NetworkSecurityPerimeterAccessRulePropertiesSubscriptionsItem(),
                                        new NetworkSecurityPerimeterAccessRulePropertiesSubscriptionsItem(),
                                        new NetworkSecurityPerimeterAccessRulePropertiesSubscriptionsItem(),
                                        new NetworkSecurityPerimeterAccessRulePropertiesSubscriptionsItem()))
                                    .withNetworkSecurityPerimeters(
                                        Arrays.asList(new NetworkSecurityPerimeter(), new NetworkSecurityPerimeter(),
                                            new NetworkSecurityPerimeter(), new NetworkSecurityPerimeter()))
                                    .withFullyQualifiedDomainNames(
                                        Arrays.asList("jdhttzaefedxi", "ch", "phkmcrjdqnsdfz", "bg"))),
                            new NetworkSecurityPerimeterAccessRule().withName("kylkdghrj")
                                .withProperties(new NetworkSecurityPerimeterAccessRuleProperties()
                                    .withDirection(NspAccessRuleDirection.INBOUND)
                                    .withAddressPrefixes(Arrays.asList("xezw", "hokvbwnh", "tqlgehgppi"))
                                    .withSubscriptions(Arrays.asList(
                                        new NetworkSecurityPerimeterAccessRulePropertiesSubscriptionsItem(),
                                        new NetworkSecurityPerimeterAccessRulePropertiesSubscriptionsItem(),
                                        new NetworkSecurityPerimeterAccessRulePropertiesSubscriptionsItem(),
                                        new NetworkSecurityPerimeterAccessRulePropertiesSubscriptionsItem()))
                                    .withNetworkSecurityPerimeters(
                                        Arrays.asList(new NetworkSecurityPerimeter(), new NetworkSecurityPerimeter(),
                                            new NetworkSecurityPerimeter(), new NetworkSecurityPerimeter()))
                                    .withFullyQualifiedDomainNames(Arrays.asList("oajvgcxtxjcs"))),
                            new NetworkSecurityPerimeterAccessRule().withName("afidltugsres")
                                .withProperties(new NetworkSecurityPerimeterAccessRuleProperties()
                                    .withDirection(NspAccessRuleDirection.OUTBOUND)
                                    .withAddressPrefixes(Arrays.asList("oiftxfkfwegprh"))
                                    .withSubscriptions(Arrays
                                        .asList(new NetworkSecurityPerimeterAccessRulePropertiesSubscriptionsItem()))
                                    .withNetworkSecurityPerimeters(
                                        Arrays.asList(new NetworkSecurityPerimeter(), new NetworkSecurityPerimeter(),
                                            new NetworkSecurityPerimeter(), new NetworkSecurityPerimeter()))
                                    .withFullyQualifiedDomainNames(Arrays.asList("biqtgdq", "hm", "wsldrizetpwbr")))))
                    .withDiagnosticSettingsVersion(6856794884105870110L)
                    .withEnabledLogCategories(Arrays.asList("phbqz", "izakak", "nkjpdnjzha", "oylhjlmuoyxprimr")));
        model = BinaryData.fromObject(model).toObject(NetworkSecurityPerimeterConfigurationProperties.class);
        Assertions.assertEquals("kbxgom", model.provisioningIssues().get(0).name());
        Assertions.assertEquals("uwasqvd", model.provisioningIssues().get(0).properties().issueType());
        Assertions.assertEquals("y", model.provisioningIssues().get(0).properties().severity());
        Assertions.assertEquals("uxakjsqzhzbezk", model.provisioningIssues().get(0).properties().description());
        Assertions.assertEquals("sidxasicdd",
            model.provisioningIssues().get(0).properties().suggestedResourceIds().get(0));
        Assertions.assertEquals("bbjjidjksyxk",
            model.provisioningIssues().get(0).properties().suggestedAccessRules().get(0).name());
        Assertions.assertEquals("irudh", model.networkSecurityPerimeter().id());
        Assertions.assertEquals("mes", model.networkSecurityPerimeter().perimeterGuid());
        Assertions.assertEquals("dlpagzrcxfail", model.networkSecurityPerimeter().location());
        Assertions.assertEquals("wmdboxdfgsftuf", model.resourceAssociation().name());
        Assertions.assertEquals("brjlnacgcckknhxk", model.resourceAssociation().accessMode());
        Assertions.assertEquals("ytnrzvuljraae", model.profile().name());
        Assertions.assertEquals(2313343690952034235L, model.profile().accessRulesVersion());
        Assertions.assertEquals("ukkjqnvbroyla", model.profile().accessRules().get(0).name());
        Assertions.assertEquals(NspAccessRuleDirection.INBOUND,
            model.profile().accessRules().get(0).properties().direction());
        Assertions.assertEquals("isdos", model.profile().accessRules().get(0).properties().addressPrefixes().get(0));
        Assertions.assertEquals("jdhttzaefedxi",
            model.profile().accessRules().get(0).properties().fullyQualifiedDomainNames().get(0));
        Assertions.assertEquals(6856794884105870110L, model.profile().diagnosticSettingsVersion());
        Assertions.assertEquals("phbqz", model.profile().enabledLogCategories().get(0));
    }
}
