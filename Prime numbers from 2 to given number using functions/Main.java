import java.util.Scanner;
class Main{
  public static int f(int n)
  {
    int c;
    for(int i=2;i<=n;i++)
    {
      c=0;
      for(int j=2;j<i;j++)
      {
        if(i%j==0&&i!=j)
        {
          c++;
        }
      }
      if(c==0)
      System.out.println(i);
    }
    return 0;
  }
	public static void main (String[] args){
    Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      int q=f(n);
	}
}