import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //Type your code here
    Scanner in=new Scanner(System.in);
    int n=in.nextInt();
    int d1=n/100;
    int d3=n%10;
    int d=n%100;
    int d2=d/10;
    int answer=(d3*100)+(d2*10)+d1;
    System.out.println(answer);
  }
}