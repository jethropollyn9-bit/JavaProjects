public class Main {
    public static void main(String[] args) {
        // Create two players to compare
        ProPlayer player1 = new ProPlayer("Jethro", 92, 88, 75, 82);
        ProPlayer player2 = new ProPlayer("Rivals Scout", 80, 85, 70, 75);

        // print their stats
        System.out.println(player1);
        System.out.println(player2);

        // Run the omparison
        player1.compareTo(player2);
    }   
}
