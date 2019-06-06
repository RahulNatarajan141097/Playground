import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      int n1,i,n2,ans=0,m=n;
      while(n>0)
      {
        n1=n%10;
        n2=1;
        for(i=1;i<=n1;i++)
        {
          n2=n2*i;
        }
        //System.out.println(n2);
        ans=ans+n2;
        n=n/10;
      }
     if(ans==m)
      {
        System.out.println("Yes");
      }
      else
      {
        System.out.println("No");
      }
	}
}