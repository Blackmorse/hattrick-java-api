package com.blackmorse.hattrick.common;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;

import java.io.IOException;

public class DoubleDeserializer extends JsonDeserializer<Double> {

    @Override
    public Double deserialize(JsonParser parser, DeserializationContext context)
            throws IOException {
        String doubleString = parser.getText();
        if (doubleString.contains(",")) {
            doubleString = doubleString.replace(",", ".");
        }
        return Double.valueOf(doubleString);
    }

}
