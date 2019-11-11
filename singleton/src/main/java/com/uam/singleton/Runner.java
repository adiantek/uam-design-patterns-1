package com.uam.singleton;

import com.uam.singleton.properties.PropertyPlaceholder;

public class Runner {

    public static void main(String[] args) {
        PropertyPlaceholder propertyPlaceholder = new PropertyPlaceholder();
        System.out.println(propertyPlaceholder.getProperty("key1"));
        System.out.println(propertyPlaceholder.getProperty("key2"));
    }
}
