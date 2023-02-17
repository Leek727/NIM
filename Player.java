import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;

public class Player {
    static Scanner sc = new Scanner(System.in);
    String name;
    private int points = 0;

    public Player(AtomicInteger playerID) {
        this.name = promptUsername(playerID);
    }

    String promptUsername(AtomicInteger playerID) {
        System.out.printf("Enter your username (player %d):", playerID.getAndIncrement());
        return sc.nextLine();
    }

    public void AddPoints(int a){
        this.points += a;
    }

    // Base methods (toString and equals)

    public String toString() {
        return String.format("Player %s (points %d)", name, points);
    }

    public boolean equals(Player p) {
        if (this.name != p.name) return false;
        if (this.points != p.points) return false;
        return true;
    }
}
