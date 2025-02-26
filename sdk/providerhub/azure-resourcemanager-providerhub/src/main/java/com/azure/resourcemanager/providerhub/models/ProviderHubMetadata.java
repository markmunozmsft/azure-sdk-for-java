// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.providerhub.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.List;

/**
 * The ProviderHubMetadata model.
 */
@Fluent
public class ProviderHubMetadata implements JsonSerializable<ProviderHubMetadata> {
    /*
     * The providerAuthorizations property.
     */
    private List<ResourceProviderAuthorization> providerAuthorizations;

    /*
     * The providerAuthentication property.
     */
    private ProviderHubMetadataProviderAuthentication providerAuthentication;

    /*
     * The thirdPartyProviderAuthorization property.
     */
    private ProviderHubMetadataThirdPartyProviderAuthorization thirdPartyProviderAuthorization;

    /**
     * Creates an instance of ProviderHubMetadata class.
     */
    public ProviderHubMetadata() {
    }

    /**
     * Get the providerAuthorizations property: The providerAuthorizations property.
     * 
     * @return the providerAuthorizations value.
     */
    public List<ResourceProviderAuthorization> providerAuthorizations() {
        return this.providerAuthorizations;
    }

    /**
     * Set the providerAuthorizations property: The providerAuthorizations property.
     * 
     * @param providerAuthorizations the providerAuthorizations value to set.
     * @return the ProviderHubMetadata object itself.
     */
    public ProviderHubMetadata withProviderAuthorizations(List<ResourceProviderAuthorization> providerAuthorizations) {
        this.providerAuthorizations = providerAuthorizations;
        return this;
    }

    /**
     * Get the providerAuthentication property: The providerAuthentication property.
     * 
     * @return the providerAuthentication value.
     */
    public ProviderHubMetadataProviderAuthentication providerAuthentication() {
        return this.providerAuthentication;
    }

    /**
     * Set the providerAuthentication property: The providerAuthentication property.
     * 
     * @param providerAuthentication the providerAuthentication value to set.
     * @return the ProviderHubMetadata object itself.
     */
    public ProviderHubMetadata
        withProviderAuthentication(ProviderHubMetadataProviderAuthentication providerAuthentication) {
        this.providerAuthentication = providerAuthentication;
        return this;
    }

    /**
     * Get the thirdPartyProviderAuthorization property: The thirdPartyProviderAuthorization property.
     * 
     * @return the thirdPartyProviderAuthorization value.
     */
    public ProviderHubMetadataThirdPartyProviderAuthorization thirdPartyProviderAuthorization() {
        return this.thirdPartyProviderAuthorization;
    }

    /**
     * Set the thirdPartyProviderAuthorization property: The thirdPartyProviderAuthorization property.
     * 
     * @param thirdPartyProviderAuthorization the thirdPartyProviderAuthorization value to set.
     * @return the ProviderHubMetadata object itself.
     */
    public ProviderHubMetadata withThirdPartyProviderAuthorization(
        ProviderHubMetadataThirdPartyProviderAuthorization thirdPartyProviderAuthorization) {
        this.thirdPartyProviderAuthorization = thirdPartyProviderAuthorization;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (providerAuthorizations() != null) {
            providerAuthorizations().forEach(e -> e.validate());
        }
        if (providerAuthentication() != null) {
            providerAuthentication().validate();
        }
        if (thirdPartyProviderAuthorization() != null) {
            thirdPartyProviderAuthorization().validate();
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeArrayField("providerAuthorizations", this.providerAuthorizations,
            (writer, element) -> writer.writeJson(element));
        jsonWriter.writeJsonField("providerAuthentication", this.providerAuthentication);
        jsonWriter.writeJsonField("thirdPartyProviderAuthorization", this.thirdPartyProviderAuthorization);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ProviderHubMetadata from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ProviderHubMetadata if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the ProviderHubMetadata.
     */
    public static ProviderHubMetadata fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ProviderHubMetadata deserializedProviderHubMetadata = new ProviderHubMetadata();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("providerAuthorizations".equals(fieldName)) {
                    List<ResourceProviderAuthorization> providerAuthorizations
                        = reader.readArray(reader1 -> ResourceProviderAuthorization.fromJson(reader1));
                    deserializedProviderHubMetadata.providerAuthorizations = providerAuthorizations;
                } else if ("providerAuthentication".equals(fieldName)) {
                    deserializedProviderHubMetadata.providerAuthentication
                        = ProviderHubMetadataProviderAuthentication.fromJson(reader);
                } else if ("thirdPartyProviderAuthorization".equals(fieldName)) {
                    deserializedProviderHubMetadata.thirdPartyProviderAuthorization
                        = ProviderHubMetadataThirdPartyProviderAuthorization.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedProviderHubMetadata;
        });
    }
}
