import java.util.Scanner;
class Main{
	public static void main (String[] args){
    	// Type your code here
      Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      int o=1;
      int a=n-1;
      for(int i=1;i<=n;i++)
      {
        for(int j=1;j<=i;j++)
        {
          if(j==1)
          {
            for(int k=1;k<=a;k++) 
            System.out.print(" ");
          }
          System.out.print(o);
          System.out.print(" ");
          o++;
        }
        a--;
        System.out.print("\n");
      }
    }    
}