public class Main {

    public static void main(String[] args) {
        SettingsManager settingsManager = SettingsManager.getInstance();

        System.out.println("Volume: " + settingsManager.getSetting("volume"));
        settingsManager.setSetting("volume", "60");
        System.out.println("Updated volume: " + settingsManager.getSetting("volume"));

        System.out.println("Difficulty: " + settingsManager.getSetting("difficulty"));
        settingsManager.setSetting("difficulty", "hardcore");
        System.out.println("Updated difficulty: " + settingsManager.getSetting("difficulty"));

        System.out.println("Resolution: " + settingsManager.getSetting("resolution"));
        settingsManager.setSetting("resolution", "2560x1440");
        System.out.println("Updated resolution: " + settingsManager.getSetting("resolution"));

    }
}
