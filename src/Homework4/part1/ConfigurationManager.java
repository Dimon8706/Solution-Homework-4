package Homework4.part1;

import java.util.HashMap;
import java.util.Map;

public class ConfigurationManager {
    private static ConfigurationManager instance = null;

    private Map<String, String> configs;

    private ConfigurationManager() {
        configs = new HashMap<>();
        configs.put("maxPlayers", "100");
        configs.put("defaultLanguage", "en");
        configs.put("gameDifficulty", "medium");
    }

    public static ConfigurationManager getInstance() {
        if (instance == null) {
            instance = new ConfigurationManager();
        }
        return instance;
    }

    public String getConfig(String key) {
        return configs.get(key);
    }

    public void printAllConfigs() {
        System.out.println("Current Configuration Settings:");
        for (Map.Entry<String, String> entry : configs.entrySet()) {
            System.out.println("  " + entry.getKey() + " = " + entry.getValue());
        }
    }
}
