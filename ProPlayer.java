public class ProPlayer {

    // Instance variables (attributes)
    private final String name;
    private final int pace;
    private final int shooting;
    private final int passing;
    private final int physical;

    // Constructor: Note the capital 'P' to match the class name
    public ProPlayer(String name, int pace, int shooting, int passing, int physical) {
        if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException("name must not be empty");
        }
        this.name = name;
        this.pace = clampStat(pace);
        this.shooting = clampStat(shooting);
        this.passing = clampStat(passing);
        this.physical = clampStat(physical);
    }

    private static int clampStat(int v) {
        if (v < 0) return 0;
        if (v > 100) return 100;
        return v;
    }

    // method to determine the player's specialized tag (checks stats)
    public String getPlayStyleTag() {
        if (shooting > 85 && pace > 80) {
            return "Finishing Expert";
        } else if (passing > 85 && physical > 80) {
            return "Playmaker";
        } else if (pace > 90) {
            return "Speedster";
        } else {
            return "Specialist";
        }
    }

    // Method to calculate the weighted overall rating
    // overall = 0.6*shooting + 0.3*pace + 0.1*passing
    public int calculateOverallRating() {
        double overall = (this.shooting * 0.6) + (this.pace * 0.3) + (this.passing * 0.1);
        return (int) Math.round(overall);
    }

    public String getName() { return name; }
    public int getPace() { return pace; }
    public int getShooting() { return shooting; }
    public int getPassing() { return passing; }
    public int getPhysical() { return physical; }

    @Override
    public String toString() {
        return String.format("%s [%s] Overall: %d (S:%d P:%d Pa:%d Ph:%d)",
            name, getPlayStyleTag(), calculateOverallRating(), shooting, pace, passing, physical);
    }

    // To make it easier to print the player's information
    public void displayStats() {
        System.out.println("Player: " + name);
        System.out.println("Style: " + getPlayStyleTag());
        System.out.println("Overall Rating: " + calculateOverallRating());
    }
}