import java.awt.Color;
import java.awt.Graphics;
import java.awt.Insets;
import java.awt.Polygon;
import javax.swing.JPanel;

public class MyPanelClass extends JPanel {
	public void paintComponent(Graphics g) {
		super.paintComponent(g); 

		//Compute interior coordinates
		Insets myInsets = this.getInsets();
		int x1 = myInsets.left;
		int y1 = myInsets.top;
		int x2 = getWidth() - myInsets.right - 1;
		int y2 = getHeight() - myInsets.bottom - 1;
		int width = x2 - x1;
		int height = y2 - y1;

		//Paint the background
		g.setColor(Color.RED);
		g.fillRect(x1, y1, width + 1, height + 1);
		//Draw a border
		//                        g.setColor(Color.BLACK);
		//                        g.drawRect(x1, y1, width, height);
		//                        //Draw a border
		//                        g.setColor(Color.BLUE);
		//                        g.drawRect(x1 + 10, y1 + 10, width - 20, height - 20);
		//                        g.setColor(Color.ORANGE);
		//                        g.drawLine(x1, y1, x2, y2);
		//                        g.setColor(Color.ORANGE);
		//                        g.drawLine(x2, y1, x1, y2);
		//                        g.setColor(Color.LIGHT_GRAY);
		//                        g.fillOval((width-55)/2,(height-55)/2, 55, 55);
		//                        Polygon p = new Polygon();
		//                        p.addPoint(x1 + 5, y1 + 25);
		//                        p.addPoint(x1 + 20, y1 + 10);
		//                        p.addPoint(x1 + 35, y1 + 25);
		//                        p.addPoint(x1 + 25, y1 + 25);
		//                        p.addPoint(x1 + 25, y1 + 45);
		//                        p.addPoint(x1 + 15, y1 + 45);
		//                        p.addPoint(x1 + 15, y1 + 25);
		//                        g.setColor(Color.BLUE);
		//                        g.fillPolygon(p);

		Polygon Blanco1 = new Polygon();
		Blanco1.addPoint(x1 , height / 5 * 1);
		Blanco1.addPoint(x2 , height / 5 * 1);
		Blanco1.addPoint(x2 , height / 5 * 2);
		Blanco1.addPoint(x1 , height / 5 * 2);                        
		g.setColor(Color.WHITE);
		g.fillPolygon(Blanco1);

		Polygon blanco2 = new Polygon();
		blanco2.addPoint(x1 , height / 5 * 3);
		blanco2.addPoint(x2 , height / 5 * 3);
		blanco2.addPoint(x2 , height / 5 * 4);
		blanco2.addPoint(x1 , height / 5 * 4);                        
		g.setColor(Color.WHITE);
		g.fillPolygon(blanco2);

		Polygon triangulo = new Polygon();
		triangulo.addPoint(x1, y1);
		triangulo.addPoint(width / 5 * 2, height / 2);
		triangulo.addPoint(x1 , y2);
		g.setColor(Color.BLUE);
		g.fillPolygon(triangulo);                    

		Polygon estrella = new Polygon();
		estrella.addPoint(x1 + 45, y1 + 113);
		estrella.addPoint(x1 + 66, y1 + 113);
		estrella.addPoint(x1 + 77, y1 + 93);
		estrella.addPoint(x1 + 88, y1 + 113);
		estrella.addPoint(x1 + 109, y1 + 113);
		estrella.addPoint(x1 + 92, y1 + 125);
		estrella.addPoint(x1 + 99, y1 + 153);
		estrella.addPoint(x1 + 77, y1 + 138);
		estrella.addPoint(x1 + 54, y1 + 153);
		estrella.addPoint(x1 + 63, y1 + 128);
		g.setColor(Color.WHITE);
		g.fillPolygon(estrella);







	}

}