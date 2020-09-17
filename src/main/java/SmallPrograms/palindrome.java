package SmallPrograms;

public class palindrome {
    String name ="madam";

 public boolean pal(String[] args)
 {
 int i=name.length()-1;
 int j=0;
 while(i>j)
 {
     if(name.charAt(i)!=name.charAt(j))
     {
         return false;
     }
     i--;
     j++;
 }

     return true;
 }
}
