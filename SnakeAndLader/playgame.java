import java.util.*;

public class playgame {
    static void loadsnksldrs(int start, int end) {
        if (start >= end) {
            return;
        }
    }
    /**
     * @param args
     */
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            System.out.print("Enter the board size: ");
            int boardSize = scan.nextInt();

            System.out.print("how many dices you want: ");
            int cntdice = scan.nextInt();
            Dice dyc = new Dice(cntdice);

            System.out.print("How many players are being played: ");
            int cntplayes = scan.nextInt();
            Queue<Player> q = new LinkedList<>();
            for (int i = 1; i <= cntplayes; i++) {
                System.out.print("Enter player" + i + " name: ");
                String name = scan.next();
                scan.nextLine();
                Player p = new  Player(name, 0);
                q.offer(p);
            }
            HashMap<Integer, Integer> map = new HashMap<>();
            map.put(20, 30);
            map.put(25, 50);
            map.put(45, 78);
            map.put(56, 67);

            map.put(18, 3);
            map.put(24, 17);
            map.put(67, 34);
            map.put(96, 88);

            final board b1 = new board(cntplayes, q, dyc, map);
            System.out.println("START THE GAME");
            while (q.size() != 1) {
                Player p = b1.getplayers();
                System.out.println(p.name + " ROLL the dice");
                scan.nextLine();
                int dice_val = b1.dyc.rollDice();
                System.out.println("DICE :" + dice_val);
                int currLoc = p.getLocation();
                int nextLoc = currLoc + dice_val;
                if (nextLoc == boardSize) {
                    System.out.println(p.name + " is at position " + p.getLocation());
                    System.out.println(p.name + " WON THE GAME!!!");
                    p.setlocation(100);
                } else if (nextLoc < boardSize) {
                    if (map.containsKey(nextLoc)) {
                        System.out.println(p.name + " got a jumper...");
                        nextLoc = map.get(nextLoc);
                    }
                    p.setlocation(nextLoc);
                    System.out.println(p.name + " is at position " + p.getLocation());
                    q.offer(p);
                } else {
                    System.out.println(p.name + " is at position " + p.getLocation());
                    q.offer(p);
                }

            }
        }
    }
}
