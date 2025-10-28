class param
{

 int val;

 param(int val)  
  { 
    this.val = val;
  }
 
 
 int square()
  { 
   int ans = val * val;
   return ans;
  }


}


public class Paramcons
{
 public static void main(String ss[])
 {

  param obj = new param(10);
  int ans = obj.square();

  System.out.println(ans);
 
 }

}