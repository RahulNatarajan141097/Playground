import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner in = new Scanner(System.in);
    String s1 = in.nextLine();
    String s2 = in.nextLine();
    StringBuilder sb1 = new StringBuilder(s1);
    StringBuilder sb2 = new StringBuilder(s2);
    int sl1 = sb1.length();
    int sl2 = sb2.length();
    int i,j,k;
    for(i=0;i<sl2;i++)
    {
      for(j=0;j<sl1;j++)
      {
        if(sb2.charAt(i)==sb1.charAt(j))
        {
          for(k=j;k<sl1-1;k++)
          {
            sb1.setCharAt(k,sb1.charAt(k+1));
          }
          sl1--;
        }
      }
    }
    String a=sb1.substring(0,sl1);
    System.out.print(a);
  }
}