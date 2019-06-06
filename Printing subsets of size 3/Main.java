import java.util.Scanner;
class Main{
    public static void main(String args[]) {
      Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      int[] a=new int[n];
      for(int i=0;i<n;i++)
      {
        a[i]=in.nextInt();
      }
      int i,j,k;
      for(i=0;i<n-1;i++)
      {
        for(j=i+1;j<n;j++)
        {
          for(k=j+1;k<n;k++)
          {
            System.out.print("("+a[i]+","+" "+a[j]+","+" "+a[k]+")");
            System.out.print(" ");
          }
        }
        System.out.print("\n");
      }
    }
}