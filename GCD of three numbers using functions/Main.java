import java.util.Scanner;
public class Main{
 public static int f(int n1,int n2,int n3)
  {
   int l1,l2,gcd1=1,gcd2=1;
    if(n1<n2)
      l1=n1;
    else
      l1=n2;
    while(l1>0)
    {
      if(n1%l1==0&&n2%l1==0)
      {
      gcd1=l1;
        //System.out.print("j");
      break;
      }
      l1--;
    }
   
    if(gcd1<n3)
      l2=gcd1;
    else
      l2=n3;
    while(l2>0)
    {
      if(gcd1%l2==0&&n3%l2==0)
      {
      gcd2=l2;
      break;
      }
      l2--;
    }
    return l2;
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
