import java.util.Scanner;
class Main{
    public static void main(String args[]) {
      Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      int[] a=new int[n];
      for(int i=0;i<n;i++)
      {
        a[i]=in.nextInt();
      }
      int v=in.nextInt(); 
      for(int i=0;i<n;i++)
      {int v1=a[i],v2;
        for(int j=i+1;j<n;j++)
        {
          v2=v1+a[j];
          if(v2==v)
          {
            System.out.print(v1+","+" "+a[j]);
            System.out.print("\n");
          }
        }
      }
    }
}