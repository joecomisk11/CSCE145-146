import java.awt.*;
import javax.swing.*;
import java.util.*;
public class Carpet extends Canvas {

	public static void main(String[] args) {

		JFrame frame = new JFrame("Sierpinski's Carpet");
		frame.setSize(900,900);
		Carpet sp = new Carpet();
		frame.add(sp);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public void paint(Graphics g)
	{
		drawCarpet(0,0,this.getSize().height,g);
	}
		public void drawCarpet(int x, int y, int side, Graphics g)
		{
			int sub = side / 3;
			g.fillRect(x+sub, y+sub, sub, sub);
			if(sub >= 3)
			{
				drawCarpet(x,y,sub,g);
				//drawCarpet(x+sub,y,sub,g);
				//drawCarpet(x+sub*2,y,sub,g);
				//drawCarpet(x,y+sub,sub,g);
				//drawCarpet(x+sub*2,y+sub,sub,g);
				//drawCarpet(x,y+sub*2,sub,g);
				//drawCarpet(x+sub,y+sub*2,sub,g);
				//drawCarpet(x+sub*2,y+sub*2,sub,g);
			}
		}
}
