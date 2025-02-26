// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement.models;

import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.rest.ResponseBase;
import com.azure.resourcemanager.apimanagement.fluent.models.GatewayKeysContractInner;

/**
 * Contains all response data for the listKeys operation.
 */
public final class GatewaysListKeysResponse extends ResponseBase<GatewaysListKeysHeaders, GatewayKeysContractInner> {
    /**
     * Creates an instance of GatewaysListKeysResponse.
     * 
     * @param request the request which resulted in this GatewaysListKeysResponse.
     * @param statusCode the status code of the HTTP response.
     * @param rawHeaders the raw headers of the HTTP response.
     * @param value the deserialized value of the HTTP response.
     * @param headers the deserialized headers of the HTTP response.
     */
    public GatewaysListKeysResponse(HttpRequest request, int statusCode, HttpHeaders rawHeaders,
        GatewayKeysContractInner value, GatewaysListKeysHeaders headers) {
        super(request, statusCode, rawHeaders, value, headers);
    }

    /**
     * Gets the deserialized response body.
     * 
     * @return the deserialized response body.
     */
    @Override
    public GatewayKeysContractInner getValue() {
        return super.getValue();
    }
}
