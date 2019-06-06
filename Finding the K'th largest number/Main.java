import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
      Scanner in = new Scanner(System.in);
      int arr_size = in.nextInt();
      int[] arr = new int[arr_size];
      int i,j;
      for(i=0;i<arr_size;i++)
      {
        arr[i] = in.nextInt();
      }
      int k = in.nextInt();
      int temp;
      for(i=0;i<arr_size;i++)
      {
        for(j=i+1;j<arr_size;j++)
        {
          if(arr[i]<arr[j])
          {
            temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
          }
        }
      }
      System.out.print(arr[k-1]);
    }   
}