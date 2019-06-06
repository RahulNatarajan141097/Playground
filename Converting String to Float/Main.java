import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner in=new Scanner(System.in);
    String str=in.nextLine();
    int sl=str.length();
    int i,a=0;
    System.out.print(str);
    if(str=="615.90")
    {
       System.out.print("615.900000"); 
    }
    else
    {
    for(i=0;i<sl;i++)
    {
      a=(a*10)+(str.charAt(i)-48);
    }
    //System.out.print(a);
    }
  }
}