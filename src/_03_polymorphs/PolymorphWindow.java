package _03_polymorphs;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

public class PolymorphWindow extends JPanel implements ActionListener{
    public static final int WIDTH = 900;
    public static final int HEIGHT = 600;
    ArrayList<Polymorph> poly = new ArrayList<Polymorph>();
    private JFrame window;
    private Timer timer;
    
   // Polymorph bluePoly;
  //  Polymorph redPoly;
  //  Polymorph movingPoly;
    public static void main(String[] args) {
   	 new PolymorphWindow().buildWindow();
    }
    
    public void buildWindow(){
   	 window = new JFrame("IT'S MORPHIN' TIME!");
   	 window.add(this);
   	 window.getContentPane().setPreferredSize(new Dimension(500, 500));
   	 window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   	 window.pack();
   	 window.setVisible(true);
   	 poly.add(new BluePolymorph(50, 50));
   	 poly.add(new RedMorph(100,100));
   	 poly.add(new MovingMorph(200,200));
   	poly.add(new CircleMorph(300,100));
   	poly.add(new MouseMorph(0,0));
   	poly.add(new ImageMorph(400,400));
   	poly.add(new ClickedMorph(50,300));
   //	 bluePoly = new BluePolymorph(50, 50);
   //	 redPoly = new RedMorph(100,100);
   //	 movingPoly = new MovingMorph(200,200);
   	 timer = new Timer(1000 / 30, this);
   	 timer.start();
    }
    
    public void paintComponent(Graphics g){
    //draw background
   	 g.setColor(Color.LIGHT_GRAY);
   	 g.fillRect(0, 0, 500, 500);
   	for (Polymorph polymorph : poly) {
		polymorph.update();
		polymorph.draw(g);
	}
   	 //draw polymorph
   //	 bluePoly.draw(g);
   //	 redPoly.draw(g);
   //	 movingPoly.draw(g);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
   	 repaint();
 //      bluePoly.update();
  // 	 redPoly.update();
  // 	 movingPoly.update();
   	 
    }
}
