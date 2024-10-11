/**
 * Write a description of class Rectangle here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import greenfoot.*;

public class Rectangle extends Actor {
  
  private int width;
  private int height;
  
  private Rectangle partner;
  
  public Rectangle(int w, int h) {
      width = w;
      height = h;
      getImage().scale(width*10, height*10);
    }
    
  public Rectangle(int s) {
      width = s;
      height = s;
      getImage().scale(width*10, height*10);

    }
    
  public Rectangle() {
      System.out.println("Width: " + width + " Height: " + height + " partner: " + partner);
    }
    
  public static void main(String[] args) {
    Rectangle rect1;
    rect1 = new Rectangle(12,10);
    System.out.println(rect1);
  }
  
  public String toString() {
    return "Rectangle " + System.identityHashCode(this) + " width "  + width + " height " + height;
    }
}