import java.util.*;
class Withoutvowels
{
   public static void main(String[] args)
   {
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the string ");
       String st=sc.nextLine();
       char ch=' ',ch1=' ';String str="";
       
       for(int i=0;i<st.length();i++)
       {
           ch=st.charAt(i);
           ch1=Character.toUpperCase(ch);
           if(ch1=='A'||ch1=='E'||ch=='I'||ch1=='O'||ch1=='U')
           {
               continue;
            }
            else
            str=str+ch;
        }
        System.out.println("String without vowels : "+str);
    }
}
               