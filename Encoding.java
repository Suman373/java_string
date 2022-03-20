import java.util.*;
class Encoding
{
   char fn_encode(char ch)
   {
       char c=' ';
       if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
       c=(char)(ch+1);
       else
       c=(char)(ch-1);
       return c;
    }
    void main()
    {
        String s="";
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a sentence ");
        String st=sc.nextLine();
        String str="";
        st=st+" ";
        for(int i=0;i<st.length();i++)
        {
            char ch=st.charAt(i);
            if(ch!=' ')
            {
                char a=fn_encode(ch);
                s=s+a;
            }
            else
            {
                str=str+" "+s;
                s="";
            }
        }
        System.out.println("Encoded string is : "+str);
    }
}
                