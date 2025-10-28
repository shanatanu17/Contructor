// WAP to create class name as Power with two values base and index with functions 


class power
{
 int base , p , index;

 power()
  { 
    p = 1;
  }

 void setval(int base , int index)
  { 
   this.base = base;
   this.index = index;
  }

 int getval()
  { 
    for(int i=0;i<index;i++)
     { 
       p = p * base;
     }
  
   return p;
  }



}


public class Calculate_power
{
 public static void main(String ss[])
  { 
    power obj = new power();

    obj.setval(2, 8);
 
    int ans = obj.getval();

    System.out.println(ans);
   
 
 

  }
}