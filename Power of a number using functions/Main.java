import java.util.Scanner;
class Main{
  public static int f(int b,int e)
  {
    int s=1;
    for(int i=1;i<=e;i++)
    {
      s=s*b;
    }
        return s;
   }
	public static void main (String[] args){
	  Scanner in=new Scanner(System.in);
      int b=in.nextInt();
      int e=in.nextInt();
      int q=f(b,e);
      System.out.print(q);
	}
}