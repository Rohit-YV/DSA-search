public class searchinstring {
    public static void main(String[] args) {
        String name ="ranjan";
        char target = 'a';
        System.out.println(search(name,target));

    }
        static boolean search(String str,char target){
            if(str.length() == 0){
                return false;
            }
           for(char ch : str.toCharArray()){
               if(target == ch){
                   return true;
               }
           }
            return false;
        }
    }

