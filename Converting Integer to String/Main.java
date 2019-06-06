import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner in = new Scanner(System.in);
    int n=in.nextInt();
    int i,c=0;
    char[] str=new char[100];
    if(n>0)
    {
      int h=n;
    for(i=0;n>0;i++)
    {
      n=n/10;
      c++;
    }
    c=c-1;
    int v=0;
    for(i=c;i>=0;i--)
    {
      str[i]=(char)((h%10)+'0');
      h=h/10;
      v++;
    }
    for(i=0;i<v;i++)
    System.out.print(str[i]);
  }
  else
  {
    int h=Math.abs(n);
   while(n<0)
    {
      n=n/10;
      c++;
    }
    c=c-1;
    int v=0;
    for(i=c;i>=0;i--)
    {
      str[i]=(char)((h%10)+'0');
      h=h/10;
      v++;
    }
    System.out.print("-");
    for(i=0;i<v;i++)
    System.out.print(str[i]);
  }
  } 
}