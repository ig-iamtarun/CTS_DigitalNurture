import java.util.Arrays;

public class Search {
   public static void main(String[] args) {
    String  name = "tarunvijaay";
    char target = 'z';
//       System.out.println(search(name,target)
       System.out.println(Arrays.toString(name.toCharArray()));
    }
    static  boolean search2(String str,char target){
           if(str.length()==0){
               return false;
           }
           for (char ch: str.toCharArray()){
               if(ch==target){
                   return true;
               }
           }
           for(int i =0;i<str.length();i++) {
               if(target == str.charAt(i)){
                   return true;
               }
        }
        return false;
    }
}
