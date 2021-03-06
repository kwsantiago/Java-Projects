/**
* Kyle Santiago 10/08/2019
* Design a class named Shape and its two subclasses named TwoDimensionalShape and
ThreeDimensionalShape. Make Circle and Square subclasses of
TwoDimensionalShape. Make Sphere and Cube subclasses of
ThreeDimensionalShape. 
**/
import java.util.Date;
public class Shape {
   private String color;
   private boolean filled;
   private Date dateCreated;
   
   Shape(String color, boolean filled) {
      this.color = color;
      this.filled = filled;
      this.dateCreated = new Date();
   }// end of constructor for my values
   
   public String getColor(){
      return color;
   }// end getColor
   
   public void setColor(String color){
      this.color = color;
   }// end setColor
   
   public boolean getFilled(){
      return filled;
   }// end getFilled
   
   public void setFilled(boolean filled){
      this.filled = filled;
   }// end setFilled
   
   public Date getDateCreated(){
      return dateCreated;
   }// end getDateCreated
      
   public String toString() {
      return "created on: " + dateCreated + "\n" + 
      "color: " + color + "\n" + "filled: " + filled + "\n";
   }// end of method

}// end of class