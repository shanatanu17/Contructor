class Maxi
{ 
  int arr[];

  Maxi(int arr[])
   {
     this.arr = arr;
   }

 
  int findmax()
   { 
     int maxi = Integer.MIN_VALUE;

     for(int i=0;i<arr.length;i++)
     {   
       if(arr[i] > maxi)
        { 
           maxi = arr[i];

        }
     } 
 
    return maxi;
 
 
   }

}




public class Maximumapp
{
 public static void main(String ss[])
 { 
  int arr[] = new int[]{40,30,60,90};

  Maxi obj = new Maxi(arr);

  
  int ans = obj.findmax();
 
  System.out.println(ans);

  

  
  
 
 
 
 }
}