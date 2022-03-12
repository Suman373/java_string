import java.util.*;
class word_search_freq
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the sentence");
        String st=sc.nextLine();
        st=st+' ';
        char ch=' ';
        String st1=" ";int l=st.length();
        System.out.println("Enter the word");
        st1=sc.next();
        int p=0,f=0;String st2=" ";

        for(int i=0;i<l;i++)
        {
            ch=st.charAt(i);
            if(ch==' ')
            {
                st2=st.substring(p,i);
                if(st2.compareTo(st1)==0)
                    f=f+1;
                st2=" ";
                p++;
            }
            else
                st2=" ";
        }

        System.out.println(" Word "+st1+" freq = "+f);
    }
}

                  