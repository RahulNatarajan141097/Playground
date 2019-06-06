import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      int m=n,o=n;
      for(int i=1;i<=o;i++)
      {
        for(int j=1;j<=n;j++)
        {
          System.out.print(m);
          m--;
        }
        n--;
        m=n;
        System.out.print("\n");
      }
	}
}