import java.util.Scanner;
class Main{
    public static void main(String args[]){
        // Type your code here
      Scanner in=new Scanner(System.in);
      int as=in.nextInt();
      int arr[]=new int[as];
      for(int i=0;i<as;i++)
      {
        arr[i]=in.nextInt();
      }
      int se1=in.nextInt();
      int se2=in.nextInt();
      int ie1=0,ie2=0;
      for(int i=0;i<as;i++)
      {
        if(se1==arr[i])
          ie1=i;
        if(se2==arr[i])
           ie2=i;
      }
      if(ie1==0)
        System.out.println("-1");
      else
        System.out.println(ie1);
      if(ie2==0)
        System.out.println("-1");
      else
        System.out.println(ie2);           
    }
}