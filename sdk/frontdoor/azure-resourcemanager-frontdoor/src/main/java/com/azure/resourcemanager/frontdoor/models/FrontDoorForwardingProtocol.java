// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.frontdoor.models;

import com.azure.core.util.ExpandableStringEnum;
import java.util.Collection;

/**
 * Protocol this rule will use when forwarding traffic to backends.
 */
public final class FrontDoorForwardingProtocol extends ExpandableStringEnum<FrontDoorForwardingProtocol> {
    /**
     * Static value HttpOnly for FrontDoorForwardingProtocol.
     */
    public static final FrontDoorForwardingProtocol HTTP_ONLY = fromString("HttpOnly");

    /**
     * Static value HttpsOnly for FrontDoorForwardingProtocol.
     */
    public static final FrontDoorForwardingProtocol HTTPS_ONLY = fromString("HttpsOnly");

    /**
     * Static value MatchRequest for FrontDoorForwardingProtocol.
     */
    public static final FrontDoorForwardingProtocol MATCH_REQUEST = fromString("MatchRequest");

    /**
     * Creates a new instance of FrontDoorForwardingProtocol value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public FrontDoorForwardingProtocol() {
    }

    /**
     * Creates or finds a FrontDoorForwardingProtocol from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding FrontDoorForwardingProtocol.
     */
    public static FrontDoorForwardingProtocol fromString(String name) {
        return fromString(name, FrontDoorForwardingProtocol.class);
    }

    /**
     * Gets known FrontDoorForwardingProtocol values.
     * 
     * @return known FrontDoorForwardingProtocol values.
     */
    public static Collection<FrontDoorForwardingProtocol> values() {
        return values(FrontDoorForwardingProtocol.class);
    }
}
