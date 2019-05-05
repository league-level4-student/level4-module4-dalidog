package _03_polymorphs;

import java.awt.Graphics;

public abstract class Polymorph {
    private int x;
    private int y;
    private int width;
    private int height;
    public void setX(int x) {
		this.x=x;
	}
	public int getX(){
		return this.x;
		
	}
	public void setY(int y) {
		this.y=y;
	}
	public int getY(){
		return this.y;
		
	}
	public void setWidth(int width) {
		this.width=width;
	}
	public int getWidth(){
		return this.width;
		
	}
	public void setHeight(int height) {
		this.height=height;
	}
	public int getHeight(){
		return this.height;
		
	}
	
    Polymorph(int x, int y){
   	 this.x = x;
   	 this.y = y;
    }
    
    public void update(){
   	 
    }
    
    public abstract void draw(Graphics g);
    
}
