package _03_polymorphs;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class ImageMorph extends Polymorph{
	ImageMorph(int x, int y) {
		super(x, y);
		setWidth(50);
		setHeight(50);
	}

	@Override
	public void draw(Graphics g) {
		BufferedImage image = null;
		try {
			image = ImageIO.read(new File("aggressive_dog_l1.jpg"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		g.drawImage(image, getX(), getY(), getWidth(), getHeight(), null);
		
	}
}
