import java.util.*;
public class bubble {
    static int n,arr[];
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.print("The Elements of the array are: ");
        for(int i: arr)
        {
            System.out.print(i+" ");
        }
        bubble.soot(arr);
    }
    static int soot(int arr[])
    {
        int t=0;
        for( int i=0;i<arr.length-1;i++)
        {
            for(int j=0;j<arr.length-1-i;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    t=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=t;
                }
            }
        }
        System.out.print("The sorted elements are: ");
        for(int i: arr)
        {
            System.out.print(i+" ");
        }
        return 0;   
    } 
}
