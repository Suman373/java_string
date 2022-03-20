import java.util.*;
class Piglatin	
{
    String fn_piglatin(String s)
    {
        int ln=s.length(),j,posi=-1;
        for(j=0;j<ln;j++)
        {
            char ch2=s.charAt(j);
            if(ch2=='A'||ch2=='E'||ch2=='I'||ch2=='O'||ch2=='U')//checking vowels
            {
                posi=j;
                break;
            }
        }
        return s.substring(posi)+s.substring(0,posi)+"AY";
    }
    public void main()
    {
        Scanner sc=new Scanner(System.in);
        int i,len;
        String s="",p="";        
        System.out.println("Enter a sentence");//input
        String st=sc.nextLine();        
        st=st.toUpperCase();
        st=st.trim();
        st=st+" ";
        len=st.length();        
        for(i=0;i<len;i++)
        {
            char ch=st.charAt(i);
            if(ch!=' ')
                s=s+ch;
            else
            {
                p=fn_piglatin(s);
                System.out.print(p+" ");//printing new string
                s="";
            }
        }
    }
}


