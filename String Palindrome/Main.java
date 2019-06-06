import java.util.Scanner;
class Main{
  public static void main(String args[]) 
  {
    Scanner in=new Scanner(System.in);
    String s=in.nextLine();
    int sl=s.length();
    String r="";
    for(int i=sl-1;i>=0;i--)
    {
      r=r+s.charAt(i);
    }
    if(r.equals(s))
       System.out.print("Yes");
    else
      System.out.print("No");
  } 
}