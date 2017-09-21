package shape;

import java.awt.*;
import java.util.ArrayList;

import listener.WidthPanel;
import listener.ColorChooser;
public class Freehand implements Shape {
	


	private ArrayList<Point> points;
	private Color c;
	private int width;


	public Freehand(ArrayList<Point> points, Color c,int w) {
		this.points=points;
		this.c=c;
		this.width=w;

	}

	@Override
	public void drawShape(Graphics2D g2) {
	
		int x1,x2,y1,y2;
		g2.setColor(c);
	    g2.setStroke(new BasicStroke(width));

		for(int j = 0; j < points.size()-1; j++)
		{
			x1 = (int)points.get(j).getX();
			y1 = (int)points.get(j).getY();
			x2 = (int)points.get(j+1).getX();
			y2 = (int)points.get(j+1).getY();
			g2.drawLine(x1, y1, x2, y2);
		}

		g2.setColor(ColorChooser.color);
      	g2.setStroke(new BasicStroke(WidthPanel.width));

	}

}