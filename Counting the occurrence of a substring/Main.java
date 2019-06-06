import java.util.Scanner;
class Main{
  public static void main(String args[]) {
    Scanner scan = new Scanner(System.in);
    String str1 = scan.nextLine();
    String str2 = scan.nextLine();
    int sl1= str1.length();
    int sl2 = str2.length();
    int occur_cnt = 0;
    for (int i = 0; i < (sl1 - sl2 + 1); i++)
    {
      boolean is_matching = true;
      for(int j = 0; j < sl2; j++)
      {
        if(str1.charAt(i + j) != str2.charAt(j))
        {
          is_matching = false;
        }
      }
      if(is_matching == true)
      {
        occur_cnt++;
      }
    }
    System.out.println(occur_cnt);
  } 
}