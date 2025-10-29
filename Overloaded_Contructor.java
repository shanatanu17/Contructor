class Square
{
  
  Square(int val)
   { 
     System.out.println("Square of val for int value is " + (val * val));
   }

  Square(float val)
   { 
     System.out.println("Square of val for flaot value is " + (val* val));
   }

  Square(double val , int no)
   { 
     System.out.println("Multiplication of val and no is " + (val * no) ); 
   }

}




public class Overloaded_Contructor
{
 public static void main(String ss[])
 { 
   Square obj1 = new Square(10);
   Square obj2 = new Square(5.8f);
   Square obj3 = new Square(2.5,30);

 }
}