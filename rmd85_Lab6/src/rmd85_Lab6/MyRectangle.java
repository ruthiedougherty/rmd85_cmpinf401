package rmd85_Lab6;

public class MyRectangle {
	private int width; 
	private int height; 
	private int startX;
	private int startY; 
	

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}
	
	public MyRectangle() {
		width = 0; 
		height = 0;
		startX = 0; 
		startY = 0; 
	}
	
	public MyRectangle(int startX, int startY, int width, int height) {
		this.startX = startX; 
		this.startY = startY; 
		this.width = width; 
		this.height = height; 
	}
	
	public int area() {
		int area = width * height;
		return area; 
	}
	
	public String toString() { 
		StringBuilder S = new StringBuilder(); 
		S.append("Width: " + width); 
		S.append(" Height: " + height);
		S.append(" X: " + startX); 
		S.append(" Y: " + startY); 
		return S.toString(); 
	}
	
	public boolean isInside(int x, int y) {
		if(x >=startX && x<= startX + width && y>=startY && y<=startY + height) {
			return true;
		}else {
			return false;
		}
	}
	public void setSize(int newWidth, int newHeight) {
		newWidth = width;
		newHeight = height;
	}
	
	public void setPosition(int newX, int newY) { 
		newX = startX; 
		newY = startY; 
		
	}
	
}