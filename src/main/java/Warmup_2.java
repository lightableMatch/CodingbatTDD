public class Warmup_2 {

//    Given a string, return a new string made of every other char starting with the first,
//    so "Hello" yields "Hlo".
    public static String stringBits(String str){

        String newStr = "";
        for(int i = 0; i < str.length(); i+=2){
            newStr += str.charAt(i);
        }
        return newStr;
    }

    //Given a string, return a string made of the chars at indexes 0,1,4,5,8,9 ... so "kittens" yields "kien".
    public static String altPairs(String str){


        String newStr = "";
        for(int i = 0; i < str.length(); i+=4){
            int end = i + 2;
            if(end > str.length()){
                end = str.length();
            }
            newStr += str.substring(i,end);
        }
        return newStr.stripTrailing();
    }


}
