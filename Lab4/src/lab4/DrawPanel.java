
package lab4;

import java.awt.*;
import javax.swing.*;
import java.util.*;
import java.awt.event.*;

public class DrawPanel extends JPanel implements MouseListener{
	protected LinkedList< Entity > drawables;

	public DrawPanel() {
		drawables = new LinkedList< Entity >();
	}

	public void addDrawable( Entity entity ) {
		drawables.add( entity );
	}

	protected void paintComponent( Graphics g ) {
		super.paintComponent(g);
		for ( int i = 0; i < drawables.size(); ++i )
			drawables.get( i ).draw( g );
	}

        public void move(int dx, int dy) {
            for (int i = 0; i < drawables.size(); ++i) {
                drawables.get(i).translate(new Vector(dx, dy));
            }
        }

        @Override
        public void mouseClicked(MouseEvent e) {
        }

        @Override
        public void mousePressed(MouseEvent e) {//ES Este
        }

        @Override
        public void mouseReleased(MouseEvent e) {}

        @Override
        public void mouseEntered(MouseEvent e) {}

        @Override
        public void mouseExited(MouseEvent e) {}
}
