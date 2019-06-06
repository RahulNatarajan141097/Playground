import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int b=1;
    print(n,b);
  }
  public static void print(int n,int b)
  {
    if(n==0)
      System.out.print(b);
    else
    {
      b=n*b;
      print(n-1,b);
    }
}
}