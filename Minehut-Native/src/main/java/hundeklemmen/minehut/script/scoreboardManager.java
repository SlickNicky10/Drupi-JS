package hundeklemmen.minehut.script;

import hundeklemmen.minehut.MainPlugin;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.scoreboard.DisplaySlot;
import org.bukkit.scoreboard.Objective;
import org.bukkit.scoreboard.Score;
import org.bukkit.scoreboard.Scoreboard;

public class scoreboardManager {

    private MainPlugin plugin;

    public scoreboardManager(MainPlugin plugin) {
        this.plugin = plugin;
    }

    public Scoreboard create(){
        return MainPlugin.instance.getServer().getScoreboardManager().getNewScoreboard();
    }
    public Objective newDisplay(Scoreboard sc, String title){
        Objective obj = sc.registerNewObjective("dummy", "dummy");
        obj.setDisplaySlot(DisplaySlot.SIDEBAR);
        obj.setDisplayName(title);
        return obj;
    }
    public void setLine(Objective dis, String text, int numb){
        Score sc = dis.getScore(text);
        sc.setScore(numb);
    }
    public void set(Player player, Scoreboard scoreboard){
        player.setScoreboard(scoreboard);
    }
    public void remove(Player player){
        player.setScoreboard(Bukkit.getScoreboardManager().getNewScoreboard());
    }
}
