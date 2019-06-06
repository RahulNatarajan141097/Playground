import java.util.Scanner;
class Main
{
  public static int s(int n)
  {
    int a=n*n;
    return a;
  }
	public static void main (String[] args)
    {
	 // Type your code here
      Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      int w=s(n);
      System.out.print(w);
	} 
}