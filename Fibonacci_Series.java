// WAP to input create class name as Fib and print the fibonacci series 


class Series
{
 int f0;
 int f1;
 int f2; 
 
  Series()
   { 
     f0 = 0;
     f1 = 1;
   }

   
  void showseries()
   {   
    for(int i=0;i<=5;i++)
     { 
         f2 = f0+f1;

         System.out.println(f2);
        
         
         f0 = f1;
         f1 = f2;
       }
 
    }



}





public class Fibonacci_Series{
 public static void main(String ss[])
 { 
  Series obj = new Series();

  obj.showseries();
 
 

 
 }
}
