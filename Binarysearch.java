class Temp
{

 int Binarysearch(int arr[] , int target);
  { 
   int n = arr.length;

   int low = 0;
   int high = arr.length-1;

   while(low <= high)
    {
      int mid = low+high/2;

      if(arr[mid] == target)
       { 
         return mid;
       }
  
      else if(arr[mid] < target)
       { 
          low = mid+1;
       }

      else
      { 
         right = mid - 1;
      }

    }
 
    
   return -1;
   
  }





}


public class Binarysearch
{
 public static void main(String ss[])
 { 
   Temp obj = new Temp();

 
   int arr[] = new int[]{30,40,60,70,80,120};
   int target = 90
 
   obj.Binarysearch(arr,)
 
 
 
 
 
 }
}
