public class ProPlayer {
    private String name;
    private int pace;
    private int shooting;
    private int passing;
    private int physical;

    public ProPlayer(String name, int pace, int shooting, int passing, int physical) {
        this.name = name;
        this.pace = pace;
        this.shooting = shooting;
        this.passing = passing;
        this.physical = physical;
    }

    public String getPlayStyleTag() {
        if (shooting > 85 && pace > 80) {
            return "Clinical Finisher";
        } else if (passing > 85 && physical > 80) {
            return "Midfield Engine";
        } else if (pace > 90) {
            return "Speedster";
        } else {
            return "Solid All-Rounder";
        }
    }
}
