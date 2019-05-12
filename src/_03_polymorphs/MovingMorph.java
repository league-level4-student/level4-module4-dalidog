package _03_polymorphs;

import java.awt.Color;
import java.awt.Graphics;

public class MovingMorph extends Polymorph{
	MovingMorph(int x, int y) {
		super(x, y);
		setWidth(50);
		setHeight(50);
	}

	@Override
	public void draw(Graphics g) {
		g.setColor(Color.pink);
		g.fillRect(getX(), getY(), getWidth(), getHeight());
	}
	int lol = 2;
	public void update() {
		
			setY(getY()+lol);
		if(getY()>300||getY()<200) {
			lol=-lol;
			
		}
		
			
		
	}
	
}
