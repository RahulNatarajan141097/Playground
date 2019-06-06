import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner in = new Scanner(System.in);
    String str = in.nextLine();
    String words[] = str.split(" ");
    int sl = str.length();
    int i,j,c;
    for(i=0;i<words.length;i++)
    {
      c=0;
      for(j=i+1;j<words.length;j++)
      {
        if(words[i].equals(words[j]))
        {
          c=1;
        }
      }
      if(c==0)
      {
        System.out.print(words[i]+" ");
      }
    }
  }
}