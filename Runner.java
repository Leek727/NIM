import java.util.concurrent.atomic.AtomicInteger;

public class Runner{
	public static AtomicInteger playerCounter = new AtomicInteger(1);
	public static void main(String[] args){
		Game game = new Game(new Player(playerCounter), new Player(playerCounter));
	}
}
