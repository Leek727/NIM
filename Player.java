public class Player {
    String name;
    int points = 0;

    public Player(String name) {
        this.name = name;
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
