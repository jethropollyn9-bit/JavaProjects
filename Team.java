public class Team {
    public static void main(String[] args) {
        // 1. Create an Array to hold 3 ProPlayer objects
        ProPlayer[] mySquad = new ProPlayer[3];

        // 2. "Spawn" friends into the array
        mySquad[0] = new ProPlayer("Jethro", 88, 82, 80, 75);
        mySquad[1] = new ProPlayer("StrikerFriend", 92, 90, 70, 80);
        mySquad[2] = new ProPlayer("MidfieldGamer", 75, 70, 88, 85);

        // 3. Loop through the squad and print their PlayStyles
        System.out.println("--- PRO CLUBS SQUAD ANALYSIS ---");
        for (int i = 0; i < mySquad.length; i++) {
            System.out.println(mySquad[i].getPlayStyleTag() + " in the squad.");
        }
    }
}
