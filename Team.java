import java.util.ArrayList;
import java.util.List;

public class Team {
    private String teamName;
    private List<ProPlayer> roster;

    public Team(String teamName) {
        this.teamName = teamName;
        this.roster = new ArrayList<>();
    }

    public void signPlayer(ProPlayer player) {
        this.roster.add(player);
        System.out.println(player.getName() + " [Signed to " + teamName + "]");
    }

    public void showSquadQuality() {
        int total = 0;
        System.out.println("\n--- " + teamName + " SQUAD REPORT ---");
        for (ProPlayer player : roster) {
            System.out.println("- " + player.getName() + " (" + player.getPlayStyleTag() + ")");
            total += player.calculateOverallRating();
        }
        System.out.println("Average squad rating: " + (total / roster.size()));
    }
}