import java.util.Random;

public class Game {
    Player p1;
    Player p2;
    int pile;

    public Game(Player a, Player b){
        this.p1 = a;
        this.p2 = b;
        Random r = new Random();
        pile = (int) (r.nextDouble() * 30 + 20);
    }
    
    public void play(){
    
    }

    public boolean equals(){
        return true;
    }

    public String toString(){
        return "";
    }
}