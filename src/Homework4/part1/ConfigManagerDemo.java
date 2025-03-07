package Homework4.part1;

public class ConfigManagerDemo {
    public static void main(String[] args) {
        ConfigurationManager configManager = ConfigurationManager.getInstance();

        String maxPlayers = configManager.getConfig("maxPlayers");
        String defaultLanguage = configManager.getConfig("defaultLanguage");
        String gameDifficulty = configManager.getConfig("gameDifficulty");

        System.out.println("maxPlayers = " + maxPlayers);
        System.out.println("defaultLanguage = " + defaultLanguage);
        System.out.println("gameDifficulty = " + gameDifficulty);

        configManager.printAllConfigs();
    }
}
