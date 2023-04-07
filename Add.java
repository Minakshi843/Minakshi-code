

//     public static void main(String[] args)
//     {Scanner s= new Scanner(System.in);
//         int a[] = new int[5];
//         a[0]=12;
//         a[1]=20;
//         a[2]=37;
//         for(int i=0 ; i<a.length; i++)
//         {
//             System.out.println(a[i]+" ");
//         }
//             }
// }
import java .util.*;
public class Array{
int count = 0;

public static void main(String[] args)
{   
    Scanner s= new Scanner(System.in);
    Array o = new Array();
    int a[]= new int [5];
    a[0]= 10;
    a[1]=21;
    a[2]=32;
    a[3]=4;
    a[4]=29;
   
    for(int j= 0;j<a.length ;j++)
    {
        o.print(a);
        System.out.println("\n");
        o.insertAtStart(a,56);
       
       
    }
}
    public void insert(int a[],int val)
    { 
        a[count+1]=val;
    }
    public void print(int a[])
    {
        for(int i=0 ;i<a.length;i++)
        {
            System.out.println(a[i]+" ");
        }
    }
    
    public void insertAtStart(int a[],int val)
    {
        for(int i=a.length-1;i>0;i--)
        {
            a[i]=a[i-1];
            count--;

        }
            a[0]=val;
    }
    }