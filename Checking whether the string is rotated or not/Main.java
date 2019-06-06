import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
     	Scanner in = new Scanner(System.in);
      String str1 = in.next();
      String str2 = in.next();
      StringBuilder sb1 = new StringBuilder(str1); 
      StringBuilder sb2 = new StringBuilder(str1);
      int str1_len = sb1.length();
      char ch;
      int i,j;
        for(i=0;i<str1_len;i++)
        {
          sb1.append(str1.charAt(i));
        }
      int c=0;
        for(i=0;i<str1_len;i++)
        {
          for(j=0;j<str1_len;j++)
          {
            if(sb1.charAt(i+j)!=str2.charAt(j))
            {
              break;
            }
            else
              c++;
          }
        }
      if(c==str1_len)
        System.out.print("Yes");
      else
        System.out.print("No");       
    }
}
