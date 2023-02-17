import java.util.Random;
import java.util.Scanner;

public class Game {
    private Player players[] = {null, null};
    private int pile;

    public Game(Player a, Player b){
        this.players[0] = a;
        this.players[1] = b;
    }
    
    public int play(){
        Scanner inp = new Scanner(System.in);
        this.reset();
        while (true){
            for (int i = 0; i < 2; i++){
                System.out.println("Pile size: " + this.pile);
                if (this.pile == 1){
                    System.out.print(this.players[i] + ", how many pieces do you want to remove (1) ? : ");
                }else{
                    System.out.print(this.players[i] + ", how many pieces do you want to remove (1 - " +(int)(pile + .6)/2 + ") ? : ");
                }
                int remove = inp.nextInt();
                if (1 <= remove && remove <= (int)pile/2){
                    pile -= remove;
                    this.players[i].AddPoints(remove);
                }
                else{
                    System.out.println("Bad input, removed 1");
                    pile -= 1;
                    this.players[i].AddPoints(1);
                }

                if (pile <= 0){
                    if (i == 0){
                        victory(players[1]);
                    }else{
                        victory(players[0]);
                    }

                    System.out.print("Do you want to play again? (y/n): ");
                    String ans = inp.nextLine();
                    ans = inp.nextLine();
                    if (ans.equals("y")){

                        return this.play();
                    }
                    return 1;
                }
            }
        }
    }

    private void reset(){
        Random r = new Random();
        pile = (int) (r.nextDouble() * 40 + 10);
    }


    private void victory(Player p){
        System.out.println("Congratulations! " + p + " wins!");
    }
    public boolean equals(Game g){
        if (!this.players[0].equals(g.players[0])) return false;
        if (!this.players[1].equals(g.players[1])) return false;
        if (this.pile!=g.pile) return false;
        return true;
    }

    public String toString(){
        return "Pile size: " + this.pile + "\nPlayer 1: " + this.players[0] + "\nPlayer 2: " + this.players[1];
    }
}