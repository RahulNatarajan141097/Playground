import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner in=new Scanner(System.in);
    int n=in.nextInt();
    int[] a=new int[n];
    for(int i=0;i<n;i++)
    {
      a[i]=in.nextInt();
    }
    fun(a,n);
  }
  public static int fun(int a[],int n)
  {
    int c=a[0]+a[1]+a[2];
    int k=0;
    for(int i=3;i<=n-1;i=i+3)
    {
      if(c==(a[i]+a[i+1]+a[i+2]))
         {
            k++;
         }
     }
    if(k==(n/3)-1)
    {
      System.out.print("Perfect Batch");
    }
    else
    {
      System.out.print("Not a Perfect Batch");
    }
    return 0;
  }
}