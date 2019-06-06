import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
      Scanner in = new Scanner(System.in);
      String str1 = in.nextLine();
      String str2 = in.nextLine();
      int l = in.nextInt();
      String[] d = str2.split(" ",l);
      for(String a : d)
      System.out.println(a);
    }
}