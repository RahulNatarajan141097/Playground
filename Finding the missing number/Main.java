import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
      Scanner in = new Scanner(System.in);
      int arr_size = in.nextInt();
      int[] arr = new int[arr_size];
      int i,j,count;
      for(i=0;i<arr_size;i++){
      arr[i] = in.nextInt();}
      for(i=1;i<=arr_size;i++)
      {count=0;
        for(j=0;j<arr_size;j++)
        {
          if(i==arr[j])
          {
            count=1;
          }
        }
        if(count==0)
        {
          System.out.print(i);
        }
      }
    }
}