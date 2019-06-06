import java.util.Scanner;
public class Main
{
    public static void main(String args[])
    {
    	Scanner in = new Scanner(System.in);
      int as=in.nextInt();
      int[] a=new int[as];
      for(int i=0;i<as;i++)
      {
        a[i]=in.nextInt();
      }
      int c=0;
      for(int i=0;i<as;i++)
      {
        if(a[i]==1)
          c++;
        else
          break;
      }
      System.out.print(c);
    }
}