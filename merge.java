import java.util.*;
import java.io.*;
class Mergeso
{
  static void merge(int arr[])
  {
    if (arr==null)
    {
        return;
    }
    if(arr.length>1)
    {
     int mid=(arr.length)/2;
     int []L=new int[mid];
     for(int i=0;i<mid;i++)
     {
         L[i]=arr[i];
     }
     int []R=new int[arr.length-mid];
     for(int i=mid;i<arr.length;i++)
     {
         R[i-mid]=arr[i];
     } 
     merge(L);
     merge(R);
     int i=0;
     int j=0;
     int k=0;
     while(i<L.length && j<R.length)
     {
         if(L[i]>R[j])
         {
         arr[k]=R[j];
         j++;
         }
         else
         {
         arr[k]=L[i];
         i++;
         }
         k++;
     }
     while(i<L.length)
     {
         arr[k]=L[i];
         i++;
         k++;
     }
     while(j<R.length)
     {
         arr[k]=R[j];
         j++;
         k++;
     }
    }
  }
  public static void main(String[] args) 
  { 
      int arr[] = {12, 11, 13, 5, 6, 7}; 
      int i=0; 
      System.out.println("Given array is"); 

      for(i=0; i<arr.length; i++) 
      {
          System.out.print(arr[i]+" "); 
      }
      merge(arr); 

      System.out.println("\n"); 
      System.out.println("The Sorted array is"); 

      for(i=0; i<arr.length; i++) 
          System.out.print(arr[i]+" "); 
  } 
} 
