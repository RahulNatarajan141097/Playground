import java.util.Scanner;
class Main{
  public static int f(int n1,int n2,int n3)
  {
    int l,ans;
    if(n1>n2)
      l=n1;
    else
      l=n2;
    if(l>n3)
      ans=l;
    else
      ans=n3;
    return ans;
  }
	public static void main (String[] args)
    {
      Scanner in=new Scanner(System.in);
      int n1=in.nextInt();
      int n2=in.nextInt();
      int n3=in.nextInt();
      int q=f(n1,n2,n3);
      System.out.print(q);
	}
}