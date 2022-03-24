package Bucky; 


public class Str1
{
    public static void main(String args[])
    {
        String words[]={"funk","chunk","furry","baconator"};

        //startswith
        for(String w:words)
        {
            if(w.startsWith("fu"))
                System.out.println(w+" starts with fu");
        }
        
        //endswith
        for(String w:words)
        {
          if(w.endsWith("unk" ))
          
           System.out.println(w+" ends with unk");
        }
    }
}
        
        