import java.util.Scanner;
class Main{
	public static void main (String[] args){
	   // Type your code here
      Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      int count=0;
      int n1=n,ans=0,n2,i,n3,m=n;
      while(n>0)
      {
        n=n/10;
        count++;
      }
      while(n1>0)
      {
        n2=n1%10;
        n3=1;
        for(i=0;i<count;i++)
        {
          n3=n3*n2;
        }
        ans=ans+n3;
        n1=n1/10;
      }
      if(ans==m)
      {
        System.out.println("Armstrong Number");
      }
      else
      {
        System.out.println("Not a Armstrong Number");
      }
	}
}