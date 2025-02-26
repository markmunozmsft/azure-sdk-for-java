// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.orbital.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.orbital.models.AvailableGroundStationPropertiesAutoGenerated;
import com.azure.resourcemanager.orbital.models.ReleaseMode;
import java.io.IOException;

/**
 * The properties bag for this resource.
 */
@Fluent
public final class AvailableGroundStationProperties extends AvailableGroundStationPropertiesAutoGenerated {
    /**
     * Creates an instance of AvailableGroundStationProperties class.
     */
    public AvailableGroundStationProperties() {
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AvailableGroundStationProperties withCity(String city) {
        super.withCity(city);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AvailableGroundStationProperties withProviderName(String providerName) {
        super.withProviderName(providerName);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AvailableGroundStationProperties withLongitudeDegrees(Float longitudeDegrees) {
        super.withLongitudeDegrees(longitudeDegrees);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AvailableGroundStationProperties withLatitudeDegrees(Float latitudeDegrees) {
        super.withLatitudeDegrees(latitudeDegrees);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AvailableGroundStationProperties withAltitudeMeters(Float altitudeMeters) {
        super.withAltitudeMeters(altitudeMeters);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AvailableGroundStationProperties withReleaseMode(ReleaseMode releaseMode) {
        super.withReleaseMode(releaseMode);
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("city", city());
        jsonWriter.writeStringField("providerName", providerName());
        jsonWriter.writeNumberField("longitudeDegrees", longitudeDegrees());
        jsonWriter.writeNumberField("latitudeDegrees", latitudeDegrees());
        jsonWriter.writeNumberField("altitudeMeters", altitudeMeters());
        jsonWriter.writeStringField("releaseMode", releaseMode() == null ? null : releaseMode().toString());
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of AvailableGroundStationProperties from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of AvailableGroundStationProperties if the JsonReader was pointing to an instance of it, or
     * null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the AvailableGroundStationProperties.
     */
    public static AvailableGroundStationProperties fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            AvailableGroundStationProperties deserializedAvailableGroundStationProperties
                = new AvailableGroundStationProperties();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("city".equals(fieldName)) {
                    deserializedAvailableGroundStationProperties.withCity(reader.getString());
                } else if ("providerName".equals(fieldName)) {
                    deserializedAvailableGroundStationProperties.withProviderName(reader.getString());
                } else if ("longitudeDegrees".equals(fieldName)) {
                    deserializedAvailableGroundStationProperties
                        .withLongitudeDegrees(reader.getNullable(JsonReader::getFloat));
                } else if ("latitudeDegrees".equals(fieldName)) {
                    deserializedAvailableGroundStationProperties
                        .withLatitudeDegrees(reader.getNullable(JsonReader::getFloat));
                } else if ("altitudeMeters".equals(fieldName)) {
                    deserializedAvailableGroundStationProperties
                        .withAltitudeMeters(reader.getNullable(JsonReader::getFloat));
                } else if ("releaseMode".equals(fieldName)) {
                    deserializedAvailableGroundStationProperties
                        .withReleaseMode(ReleaseMode.fromString(reader.getString()));
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedAvailableGroundStationProperties;
        });
    }
}
