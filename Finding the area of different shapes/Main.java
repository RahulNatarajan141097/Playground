import java.util.Scanner;
public class Main
{
    public static void main(String args[])
    {
       Scanner in = new Scanner(System.in);
      int c = in.nextInt();
      switch(c)
      {
        case 1:
          int a = in.nextInt();
          System.out.print(a*a);
          break;
        case 2:
          int l = in.nextInt();
          int b = in.nextInt();
          System.out.print(l*b);
          break;
        case 3:
          int j = in.nextInt();
          int h = in.nextInt();
          System.out.print(0.5*j*h);
          break;
        case 4:
          int r = in.nextInt();
          System.out.print(3.14*r*r);
          break;
      }
    }
}