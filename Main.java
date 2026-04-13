public class Main {
    public static void main(String[] args) {
        // Create the Team
        Team mySquad = new Team("Mshy Minions");

        // Create two players to compare
        ProPlayer player1 = new ProPlayer("Jethro", 92, 88, 75, 82);
        ProPlayer player2 = new ProPlayer("Spi", 80, 85, 70, 75);
        ProPlayer player3 = new ProPlayer("Obd", 75, 70, 88, 85);

        // Sign the players 
        mySquad.signPlayer(player1);
        mySquad.signPlayer(player2);
        mySquad.signPlayer(player3);

        // Run the report
        mySquad.showSquadQuality();
    }   

}
