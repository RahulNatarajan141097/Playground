import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
     	Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      int k = in.nextInt();
      int[] arr = new int[n];
      int i,j;
      for(i=0;i<n;i++)
      {
        arr[i]=in.nextInt();
      }
      int[] arr1 = new int[n];
      int c;
      for(i=0;i<k;i++)
      {
        c=0;
        for(j=0;j<n;j++)
        {
          if(arr[j]==i+1)
          {
            c++;
            //System.out.println(c);
          }
        }
        System.out.println(i+1+" "+c);
        arr1[i]=c;
      }
      for(i=0;i<k;i++)
      {
        //System.out.println(i+1+" "+arr[i]);
      }
    }
}