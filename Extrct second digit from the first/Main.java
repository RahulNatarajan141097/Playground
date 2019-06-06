import java.util.Scanner;
class Main {
	public static void main (String[] args){
      Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      int c=n;
      int ans;
      int count=1;
      while(c!=0)
      {
        c=c/10;
        count=count*10;
      }
      count=count/10;
      count=count/10;
      ans=n/count;
      ans=ans%10;
      System.out.println(ans);
    }
}
      