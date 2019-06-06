import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner in = new Scanner(System.in);
    String str = in.nextLine();
    StringBuilder sb = new StringBuilder(str);
    StringBuilder temp = new StringBuilder("");
    int sl = sb.length();
    int i;
    char ch='l';
    for(i=0;i<sl;i++)
    {
      ch=sb.charAt(i);
      if((ch!='a')&&ch!='e'&&ch!='i'&&ch!='o'&&ch!='u'&&ch!='A'&&ch!='E'&&ch!='I'&&ch!='O'&&ch!='U')
      {
        temp.append(ch);
      }
    }
    System.out.print(temp);
  }
}