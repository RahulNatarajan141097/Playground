import java.util.Scanner;
class Main {
    public static void main(String[] args) 
    {
	  Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      int c=0;
      int b=1;
      print(n,c,b);
    }
  public static void print(int n,int c,int b)
  {
    if(n==0)
      System.out.print(c);
    else
    {
      c=b+c;
      print(n-1,c,b+1);
    }
  }      
}