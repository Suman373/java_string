import java.util.*;
class Search
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String a[]=new String[5];
        System.out.println("Enter 5 words in the array : ");
        for(int i=0;i<5;i++)
        {
            a[i]=sc.nextLine();
        }
        int L=0,U=4,M=0,flag=0;
        System.out.println("Enter the search word ");
        String w=sc.nextLine();
        while(L<=U)
        {
            M=(U+L)/2;
            if(w.compareTo(a[M])>0)
            L=M+1;
            else if(w.compareTo(a[M])<0)
            U=M-1;
            else
            {
                flag=1;
                break;
            }
            if(flag==1)
            
                System.out.println("Word found"+(M+1));
                else
                System.out.println("Not found ");
            }
        }
    }
