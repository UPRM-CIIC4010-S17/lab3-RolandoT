import java.awt.Color;
import java.awt.Graphics;
import java.awt.Insets;
import java.awt.Polygon;

import javax.swing.JPanel;
 
public class MyPanelClass extends JPanel {
            /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

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
//                        //Draw a border
//                        g.setColor(Color.RED);
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
                        Polygon p4 = new Polygon();
                        p4.addPoint(x1 , y1 + 50);
                        p4.addPoint(x2 , y1 + 50);
                        p4.addPoint(x2 , y1 + 100);
                        p4.addPoint(x1 , y1 + 100);                        
                        g.setColor(Color.WHITE);
                        g.fillPolygon(p4);
                        Polygon p5 = new Polygon();
                        p5.addPoint(x1 , y1 + 150);
                        p5.addPoint(x2 , y1 + 150);
                        p5.addPoint(x2 , y1 + 200);
                        p5.addPoint(x1 , y1 + 200);                        
                        g.setColor(Color.WHITE);
                        g.fillPolygon(p5);

                        Polygon p3 = new Polygon();
                        p3.addPoint(x1, y1);
                        p3.addPoint(x1 + 200,y1 + 250/2);
                        p3.addPoint(x1 , y2);
                        g.setColor(Color.BLUE);
                        g.fillPolygon(p3);
                        Polygon p2 = new Polygon();
                        p2.addPoint(x1 + 45, y1 + 113);
                        p2.addPoint(x1 + 66, y1 + 113);
                        p2.addPoint(x1 + 77, y1 + 93);
                        p2.addPoint(x1 + 88, y1 + 113);
                        p2.addPoint(x1 + 109, y1 + 113);
                        p2.addPoint(x1 + 92, y1 + 125);
                        p2.addPoint(x1 + 99, y1 + 153);
                        p2.addPoint(x1 + 77, y1 + 138);
                        p2.addPoint(x1 + 54, y1 + 153);
                        p2.addPoint(x1 + 63, y1 + 128);
                        g.setColor(Color.WHITE);
                        g.fillPolygon(p2);
                        


            }
}