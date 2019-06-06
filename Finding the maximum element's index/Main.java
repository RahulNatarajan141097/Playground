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
  public static void fun(int a[], int n)
  {
    int h=a[0];
    int i;
    for(i=1;i<n;i++)
    {
      if(a[h]<a[i])
      {
        h=i;
      }
    }
    System.out.print(h);
}
}