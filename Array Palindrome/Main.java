import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
       Scanner in = new Scanner(System.in);
      int arr_size = in.nextInt();
      int[] arr = new int[arr_size];
      int i;
      for(i=0;i<arr_size;i++)
      {
        arr[i] = in.nextInt();
      }
      int count = 0,h=arr_size-1,check;
      if(arr_size%2!=0){
        check = (arr_size/2)+1;}
      else{
        check = (arr_size/2);}
      for(i=0;i<h;i++)
      {
           if(arr[i]==arr[h])
           {
             count++;
           }
        h--;
      }
      //System.out.print(count);
      if(count==check)
         System.out.print("Yes");
      else
         System.out.print("No");
    }
}