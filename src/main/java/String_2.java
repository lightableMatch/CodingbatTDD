public class String_2 {
    //Return the number of times that the string "hi"
    // appears anywhere in the given string.
    public static int countHi(String str) {
        int count = 0;
        for(int i = 0; i < str.length()-1; i++){
            if(str.substring(i, i+2).contentEquals("hi")){
                count++;
            }
        }
        return count;
    }

    //A sandwich is two pieces of bread with something in between.
    //Return a string that is between the first and last appearance of "bread" in the given string,
    //or return the empty string "" if there are not two pieces of bread.
    public static String getSandwich(String str){
        String between = "";
        String bread = "bread";
        int first = -1;
        int last = -1;

        for(int i = 0; i < str.length()-4; i++){
            if(str.substring(i, i+5).contentEquals(bread)){
                if(first == -1)
                    first = i+5;
                else {
                    last = i;
                    between = str.substring(first, last);
                }
                i+=4;
            }

        }
        return between;
    }

}
