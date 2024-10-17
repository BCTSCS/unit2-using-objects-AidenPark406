/**
 * Write a description of class Rectangle here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

// breaks in vsc, commented some of these out
// import greenfoot.*;

// public class Rectangle extends Actor { 

public class Rectangle {
  
  private int width;
  private int height;
  
  private Rectangle partner;
  
  public Rectangle(int w, int h) {
      width = w;
      height = h;
      // getImage().scale(width*10, height*10);
    }
    
  public Rectangle(int s) {
      width = s;
      height = s;
      // getImage().scale(width*10, height*10);

    }
    
  public Rectangle() {
      System.out.println("Width: " + width + " Height: " + height + " partner: " + partner);
    }
    
  public String toString() {
    return "Rectangle " + System.identityHashCode(this) + " width "  + width + " height " + height;
    }

  public int getArea() {
    int area = width * height;
    return area;
  }

  public void printArea() {
    int area = width * height;
    System.out.println("The area is " + area);
  }


    public static void main(String[] args) {
      Rectangle rect1;
      rect1 = new Rectangle(12,10);
      System.out.println(rect1);
      System.out.println(rect1.getArea());
      rect1.printArea();
    }
}