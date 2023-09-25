import java.util.HashMap;
import java.util.Map;

/**
 * This singleton example is a game settings manager that uses a Map and has methods to get and set these settings.
 * @author Edvard Nivala
 */

public class SettingsManager {
    private static SettingsManager instance;
    private final Map<String, String> settings;

    private SettingsManager() {
        settings = new HashMap<>();
        // default settings
        settings.put("volume", "75");
        settings.put("difficulty", "hard");
        settings.put("resolution", "1920x1080");
    }

    // get the singleton instance
    public static SettingsManager getInstance() {
        if (instance == null) {
            instance = new SettingsManager();
        }
        return instance;
    }

    public String getSetting(String key) {
        return settings.get(key);
    }

    public void setSetting(String key, String value) {
        settings.put(key, value);
    }
}
