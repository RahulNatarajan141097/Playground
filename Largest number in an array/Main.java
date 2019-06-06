import java.util.Scanner;
class Main{
    public static void main(String args[]){
      Scanner in=new Scanner(System.in);
      int as=in.nextInt();
      int arr[]=new int[as];
      for(int i=0;i<as;i++)
      {
        arr[i]=in.nextInt();
      }
      int ln=0;
      for(int i=0;i<as;i++)
      {
        if(ln<arr[i])
          ln=arr[i];
      }
      System.out.print(ln);
    }
}