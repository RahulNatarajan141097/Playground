import java.util.Scanner;
class Main {
	public static void main (String[] args){
     Scanner in=new Scanner(System.in);
     int n=in.nextInt();
     int count=0;
     int b=n;
     int c=n; 
      while(b!=0)
     {
        c=b%10;
        b=b/10; 
        count=count+c;
     }
     System.out.println(count);
	    // Type your code here
	}
}