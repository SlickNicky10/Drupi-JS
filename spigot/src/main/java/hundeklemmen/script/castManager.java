package hundeklemmen.script;

import hundeklemmen.main;
import org.bukkit.entity.Player;

public class castManager {
    private main plugin;

    public castManager(main plugin){
        this.plugin = plugin;
    }
    public Player asPlayer(Object sender){
        return (Player) sender;
    }
    public String asString(Object text){
        return String.valueOf(text);
    }
    public int asInt(Object text){
        return Integer.parseInt(String.valueOf(text));
    }
    public double asDouble(Object text){
        return Double.parseDouble(String.valueOf(text));
    }
    public float asFloat(Object text){
        return Float.parseFloat(String.valueOf(text));
    }
    public byte asByte(Object text){
        return (byte) text;
    }
}
