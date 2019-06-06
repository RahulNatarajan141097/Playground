import java.util.Scanner;
class Main{
  public static int s(int n)
  {
    int q=0;
    for(int i=1;i<=n;i++)
    {
     q=q+i;
    }
    return q;
  }
	public static void main (String[] args){
	    // Type your code here
      Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      int w=s(n);
      System.out.print(w);
    }
}