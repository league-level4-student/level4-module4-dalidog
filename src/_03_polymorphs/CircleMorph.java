package _03_polymorphs;

import java.awt.Color;
import java.awt.Graphics;

public class CircleMorph extends Polymorph{
	CircleMorph(int x, int y) {
		super(x, y);
		setWidth(50);
		setHeight(50);
	}

	@Override
	public void draw(Graphics g) {
		g.setColor(Color.green);
		g.fillRect(getX(), getY(), getWidth(), getHeight());
	}
	int deg = 1;
	public void update() {
		setX((int)(100*Math.cos(deg)+300));
		setY((int)(100*Math.sin(deg)+100));
				deg = deg+1;
	}
}
