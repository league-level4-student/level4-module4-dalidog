package _03_polymorphs;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.MouseInfo;

public class MouseMorph extends Polymorph{
	MouseMorph(int x, int y) {
		super(x, y);
		setWidth(50);
		setHeight(50);
	}

	@Override
	public void draw(Graphics g) {
		g.setColor(Color.orange);
		g.fillRect(getX(), getY(), getWidth(), getHeight());
	}
	public void update() {
		setX(MouseInfo.getPointerInfo().getLocation().x);
		setY(MouseInfo.getPointerInfo().getLocation().y );
	}
}
