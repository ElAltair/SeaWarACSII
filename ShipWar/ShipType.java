package ShipWar;

public enum ShipType{
		SingleDeck(1),
		DoubleDeck(2),
		TripleDeck(3),
		QuadroDeck(4);

		private final int size;

		ShipType(int _size){
				this.size = _size;
		}

		public int getSize() { return size;}
}
