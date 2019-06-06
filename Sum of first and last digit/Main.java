import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    // Type your code here
      Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      int last_digit=n%10;
      int first_digit=n;
      int div=1;
      int first_digit1;
      int ans;
      while (first_digit!=0)
      {
        first_digit=first_digit/10;
        div=div*10;
      } 
      div=div/10;
      first_digit1=n/div;
      ans=first_digit1+last_digit;
      System.out.println(ans);
	}
}