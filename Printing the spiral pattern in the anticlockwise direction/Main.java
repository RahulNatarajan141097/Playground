import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      int[][] arr = new int[n][n];
      int i,j;
      int rmi=0;
      int cmi=0;
      int rmx=n-1;
      int cmx=n-1;
      int val=1;
      while(rmi<=rmx&&cmi<=cmx)
      {
        for(i=cmx;i>=cmi;i--)
        {
          arr[rmi][i]=val++;
          //System.out.print(arr[rmi][i]);
        }
        for(i=rmi+1;i<=rmx;i++)
        {
          arr[i][cmi]=val++;
        }
        for(i=rmi+1;i<=rmx;i++)
        {
          arr[rmx][i]=val++;
        }
        for(i=rmx-1;i>=rmi+1;i--)
        {
          arr[i][cmx]=val++;
        }
        rmi++;
        rmx--;
        cmi++;
        cmx--;
      }
      for(i=0;i<n;i++)
      {
        for(j=0;j<n;j++)
        {
          System.out.print(arr[i][j]+" ");
        }
        System.out.println();
      }
    }
}