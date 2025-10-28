/*

Q2. Constructor Overloading

Question:
Create a class Rectangle with attributes: length and breadth.

Write two constructors:

Initialize both length and breadth.

Initialize only length and assign the same value to breadth (square case).

Write a method to calculate and print the area of the rectangle.

Test your class by creating objects using both constructors.

*/


class Rectangle
{

  int length;
  int breadth;
 
  Rectangle(int length)
   { 
     this.length = length;
     breadth = length;
   }


  void CalculateArea()
   { 
      int area = length * breadth;
      System.out.println("Area of the rectangle is "+ area);
   } 

}


public class RectangleArea
{
  public static void main(String ss[])
  { 
    Rectangle obj = new Rectangle(10);

    obj.CalculateArea();
  } 
} 