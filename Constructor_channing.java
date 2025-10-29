class temp
{

  temp()
   { 
     this(10);
     System.out.println("I am default constructor ");
   }

  temp(int val)
   { 
     this(11.5f);
     System.out.println("I am in param integer constructor ");
   }

 
  temp(float val)
   { 
     System.out.println("I am in param float constructor");
   } 


}



public class Constructor_channing
{
 public static void main(String ss[])
 {
   temp obj = new temp();
 }
}