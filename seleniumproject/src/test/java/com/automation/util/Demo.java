package com.automation.util;

public class Demo {
    
    public static void main(String[] args) {

        System.setProperty("browser", "firefox");
        Config.initialize();

        System.out.println(
            Config.get("selenium.grid.hubHost")
        );
    }
}
