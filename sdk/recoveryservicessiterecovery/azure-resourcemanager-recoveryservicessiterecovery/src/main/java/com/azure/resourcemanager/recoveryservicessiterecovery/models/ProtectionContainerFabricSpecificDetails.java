// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery.models;

import com.azure.core.annotation.Immutable;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * Base class for fabric specific details of container.
 */
@Immutable
public final class ProtectionContainerFabricSpecificDetails
    implements JsonSerializable<ProtectionContainerFabricSpecificDetails> {
    /*
     * Gets the class type. Overridden in derived classes.
     */
    private String instanceType;

    /**
     * Creates an instance of ProtectionContainerFabricSpecificDetails class.
     */
    public ProtectionContainerFabricSpecificDetails() {
    }

    /**
     * Get the instanceType property: Gets the class type. Overridden in derived classes.
     * 
     * @return the instanceType value.
     */
    public String instanceType() {
        return this.instanceType;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ProtectionContainerFabricSpecificDetails from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ProtectionContainerFabricSpecificDetails if the JsonReader was pointing to an instance of
     * it, or null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the ProtectionContainerFabricSpecificDetails.
     */
    public static ProtectionContainerFabricSpecificDetails fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ProtectionContainerFabricSpecificDetails deserializedProtectionContainerFabricSpecificDetails
                = new ProtectionContainerFabricSpecificDetails();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("instanceType".equals(fieldName)) {
                    deserializedProtectionContainerFabricSpecificDetails.instanceType = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedProtectionContainerFabricSpecificDetails;
        });
    }
}
