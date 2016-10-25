import java.util.ArrayList;
public class Ship
{
		private ShipType shipType;
		private boolean isDestroed = false;
		private ArrayList<Integer> parts;

		Ship(int size)
		{
				if(size <=0 || size > 4)
						throw new IllegalArgumentException("Wrong Ship size: " + size + ". Ship size must be 0 < size < 5");
				
				switch(size)
				{
						case 1: shipType = ShipType.SingleDeck;
								break;
						case 2: shipType = ShipType.DoubleDeck;
							    break;
						case 3: shipType = ShipType.TripleDeck;
							    break;
						case 4: shipType = ShipType.QuadroDeck;
								break;
				}
				for(int i = 0; i < shipType.size(); ++i)
						parts.add(new Integer(0));
		}

		public boolean IsDestroyed() { return isDestroed; };

		public ArrayList<Integer> getShipParts() { return parts; };

		public int getDestroedPartsCount()
		{
				int destroedCount = 0;
				for(Integer part: parts)
				{
						if(part != 0)
								destroedCount++;
				}
				return destroedCount;
		}

		public void draw(Drawable drawer)
		{
				drawer.draw();
		}

}
