package com.automation.util;

import java.io.InputStream;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.automation.Tests.FlightReservation.model.FlightReservationTestData;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonUtil {
    
    private static final Logger log = LoggerFactory.getLogger(JsonUtil.class);
    private static final ObjectMapper mapper = new ObjectMapper();

    public static FlightReservationTestData getTestData(String path) {
        try(InputStream stream = ResourceLoader.getResource(path)){
            return mapper.readValue(stream, FlightReservationTestData.class);
        } catch (Exception e) {
            log.error("unable to read test data file {}", path, e);
        }
        return null;
    }
}
