package com.kodilla.patterns.singleton;

public final class SettingsFileEngine {
    private static SettingsFileEngine settingsFileEngine = null;
    private String fileName = "";

    private SettingsFileEngine() {

    }
    public static SettingsFileEngine getInstance() {
        if (settingsFileEngine == null){
            synchronized (SettingsFileEngine.class) {
                if (settingsFileEngine == null) {
                    settingsFileEngine = new SettingsFileEngine();
                }
            }
        }
        return settingsFileEngine;
    }
    public String getFileName() {
        return fileName;

    }
    public void open(final String filename) {
        this.fileName = filename;
        System.out.println("Opening the setting file");
    }

    public void close () {
        this.fileName = "";
        System.out.println("Closing the setting file");
    }
    public boolean loadSettings() {
        System.out.println("Loading setting from file");
        return true;
    }
    public boolean saveSetting() {
        System.out.println("Saving settings to file");
        return true;
    }
}
