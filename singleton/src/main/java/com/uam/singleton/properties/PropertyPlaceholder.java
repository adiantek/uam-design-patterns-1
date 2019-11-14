package com.uam.singleton.properties;

import com.google.common.collect.ImmutableList;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class PropertyPlaceholder {

    private static PropertyPlaceholder INSTANCE = null;

    public static PropertyPlaceholder getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new PropertyPlaceholder();
        }
        return INSTANCE;
    }

    private final List<String> FILES = ImmutableList.of("properties_1.properties", "properties_2.properties");

    private final Properties properties = new Properties();

    private PropertyPlaceholder() {
        FILES.forEach(this::loadProperties);
    }

    public String getProperty(String propertyName) {
        return properties.getProperty(propertyName);
    }

    private void loadProperties(String path) {
        try (InputStream inputStream = PropertyPlaceholder.class.getClassLoader().getResourceAsStream(path)) {
            properties.load(inputStream);
            TimeUnit.SECONDS.sleep(2);
        } catch (IOException | InterruptedException exception) {
            throw new RuntimeException("The file could not be loaded. Message: " + exception.getMessage());
        }
    }
}
