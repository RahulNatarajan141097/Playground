import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
      int b = in.nextInt();
      int e = in.nextInt();
      int e1 = 0;
      int b1 = 1; 
      while(e1!=e)
      {
        e1++;
        b1=b1*b;  
      }
      System.out.print(b1);
}
}