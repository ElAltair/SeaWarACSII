package ShipWar;

public class FieldDrawer implements Drawable
{
		private int rowCount;
		private int cellSize;

		public FieldDrawer(int _cellSize, int _rowCount)
		{
				if(_cellSize <= 0 )
						throw new IllegalArgumentException("Wrong cell size:" + _cellSize + "\n");
				if(_rowCount <= 0)
						throw new IllegalArgumentException("Wrong field size:" + _rowCount + "\n");
				rowCount = _rowCount;
				cellSize = _cellSize;
		}

//		@Override
		public void draw()
		{
				drawField();

		}

//		@Override
		public void refresh()
		{

		}
		
		private void drawField()
		{
				//                 spaces in cell              + ( boundary "|" count
				int boundLengthX = (cellSize * rowCount) + rowCount - 1;
				int boundLengthY = cellSize * rowCount ;

				drawTop();
				System.out.println();
				for(int i =0 ; i < boundLengthY; ++i)
				{
						System.out.print("|");
						for(int j = 0; j < boundLengthX; ++j)
						{
								// non bottom part of cell
								if( (i+ 1) % cellSize != 0)
								{
										// not right part of cell
										if((j + 1) % (cellSize + 1) != 0)
										{
												System.out.print("  ");
										}
										// right part of cell
										else
										{
												System.out.print("|");
										}
								}
								// bottom part of cell
								else
								{
										// not right part of cell
										if((j + 1) % (cellSize + 1) != 0)
										{
												System.out.print("__");
										}
										// right part of cell
										else
										{
												System.out.print("|");
										}
								}


						}
						System.out.println("|");
				}



		}
		private void drawTop()
		{
				System.out.print(" ");
				for(int i = 0; i <  (2 * cellSize) * rowCount + rowCount - 1; ++i)
				{
						System.out.print("_");
				}

		}
}
