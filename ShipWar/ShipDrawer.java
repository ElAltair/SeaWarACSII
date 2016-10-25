package ShipWar;

public class ShipDrawer implements Drawable
{
		@Override
		public void draw()
		{
				char esc = 0x1B;
				int xpos = 10;
				int ypos = 10;
				System.out.print(String.format("%c[%d;%df",esc,xpos,ypos));
				System.out.print("Shiiip");
				System.out.print(String.format("%c[%d;%df",esc,100,100));
		}

		@Override
		public void refresh()
		{
				System.out.print("");
		}
}
