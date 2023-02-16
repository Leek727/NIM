import java.util.Random;
import java.util.Scanner;

public class Game {
    private Player players[] = {null, null};
    private int pile;

    public Game(Player a, Player b){
        this.players[0] = a;
        this.players[1] = b;
        Random r = new Random();
        pile = (int) (r.nextDouble() * 30 + 20);
    }
    
    public int play(){
        Scanner inp = new Scanner(System.in);

        while (true){
            System.out.println("Pile size: " + this.pile);
            for (int i = 0; i < 2; i++){
                System.out.print(this.players[i] + ", how many pieces do you want to remove (1 - " + (int)pile/2 + ") ? : ");
                if (pile <= 0){
                    if (i == 0){
                        player
                    }
                    return 1;
                }
            }
        }
    }


    private void victory(Player p){
        System.out.println("Congratulations! " + p + " wins!");
    }
    public boolean equals(){
        return true;
    }

    public String toString(){
        return "Pile size: " + this.pile + "\nPlayer 1: " + this.players[0] + "\nPlayer 2: " + this.players[1];
    }
}