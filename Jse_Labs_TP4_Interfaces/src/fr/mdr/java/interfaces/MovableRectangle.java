package fr.mdr.java.interfaces;

public class MovableRectangle implements Movable {
	private MovablePoint topLeft;
	private MovablePoint topRight;
	
	public MovableRectangle(int x, int y,int x2, int y2, int xSpeed, int ySpeed) {
		this.topLeft = new MovablePoint(x,y,xSpeed,ySpeed);
		this.topRight = new MovablePoint(x2,y2,xSpeed,ySpeed);
	}
	
	@Override
	public void moveUp() {
		topLeft.y -= topLeft.ySpeed;
		topRight.y -= topRight.ySpeed;
	}
	@Override
	public void moveDown() {
		topLeft.y += topLeft.ySpeed;
		topRight.y += topRight.ySpeed;
	}
	@Override
	public void moveLeft() {
		topLeft.x -= topLeft.xSpeed;
		topRight.x -= topRight.xSpeed;
	}
	@Override
	public void moveRight() {
		topLeft.x += topLeft.xSpeed;
		topRight.x += topRight.xSpeed;
	}

	@Override
	public String toString() {
		return "MovableRectangle [topLeft=" + topLeft + ", topRight=" + topRight + "]";
	}
	
	

}
