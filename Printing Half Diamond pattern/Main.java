import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    // Type your code here
      Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      int a=n-1;
      int b=1;
      for(int i=1;i<=n;i++)
      {
        for(int j=1;j<=1;j++)
        {
          if(j==1)
          {
          for(int k=1;k<=a;k++)
          {
            System.out.print(" ");
          }
            a--;
          }
          for(int l=1;l<=b;l++)
          {
          System.out.print("*");
          }
        }
         b=b+2;
        System.out.print("\n");
      }
	}
}