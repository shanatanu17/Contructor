class S
{
 
 //2 . Declare a static reference of same class with null value
  
   private static S obj = null; 


 //1 . create a private constructor
  
  private S()
  {  
    System.out.println("I am in singletone class ");
  }

 
 //3 . create one static function and write following logic and return reference of class.

  public static S getInstance()
   { 
     if(obj == null)
      { 
        obj = new S();
      } 
 
      return obj;
   } 


}



public class Singlonton_class
{
 public static void main(String ss[])
 { 
 
   S s1 = S.getInstance();
   S s2 = S.getInstance();
   S s3 = S.getInstance();

   
 

 
 }
}