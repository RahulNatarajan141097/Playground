import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner in = new Scanner(System.in);
      int as=in.nextInt();
    int[] a=new int[as];
    int i,j;
    for(i=0;i<as;i++)
    {
      a[i]=in.nextInt();
    }
    int c=0;
    int[] a1=new int[as];
    int[] a2=new int[as];
    for(i=0;i<as;i++)
    {
      c=1;
      for(j=i+1;j<as;j++)
      {
        if(a[i]==a[j])
        {
          c++;
        }
      }
      a1[i]=c;
      a2[i]=a[i];
    }
    int max=a1[0];
    int num=a2[0];
   for(i=0;i<as;i++)
      {
        if(max<a1[i])
        {
         max=a1[i];
         num=a2[i]; 
        }
      }
    System.out.print(num);
  }
}