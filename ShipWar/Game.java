package ShipWar;
import java.util.ArrayList;

public class Game
{
		Field field;
		ArrayList<Ship> ships;
		public Game()
		{
				field = new Field();
				ships = new ArrayList<>();
				ships.add(new Ship(1));
				ships.add(new Ship(2));
		}
		private void draw()
		{
				field.draw(new FieldDrawer(3,10));
				for(Ship iShip: ships)
						iShip.draw(new ShipDrawer());
		}
		public void run()
		{
				draw();
		}
}
