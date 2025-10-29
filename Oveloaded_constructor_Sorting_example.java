class Sort
{
 int arr[];
 char ch[];

 
 Sort(int arr[])
  {
    this.arr = arr;
  }

 Sort(char ch[])
  { 
    this.ch = ch;
  }

 
  void sortintarray()
  {  
    //1 . sort

    for(int i=0;i<arr.length;i++)
     { 
       for(int j = i+1;j<arr.length;j++)
        {  
          if(arr[i] > arr[j])
           {  
              int temp = arr[i];
              arr[i] = arr[j];
              arr[j] = temp;
           }
        }
     }

 c
    //2 . print sorted array

    for(int val : arr)
     { 
       System.out.print(val+" ");
     } 

    System.out.println(); 

  } 

 
 
  void sortchararray()
   {  
      //1 . sort

      for(int i=0;i<ch.length;i++)
       { 
        for(int j=i+1;j<ch.length;j++)
         {  
            if(ch[i] > ch[j])
             { 
               char temp = ch[i];   
               ch[i] = ch[j];
               ch[j] = temp;
             }
         }
       }


 
     //2. print sorted array

     for(char c: ch)
       { 
         System.out.print(c+" ");
       }  
 
   }
   




}





public class Oveloaded_constructor_Sorting_example
{
 public static void main(String ss[])
 { 
   Sort obj1 = new Sort(new int[]{50,30,20,80});

   Sort obj2 = new Sort(new char[]{'d','a','s','m','l','c'});

   obj1.sortintarray();

   obj2.sortchararray();
 }
}