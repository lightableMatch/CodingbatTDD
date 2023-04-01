public class String_3 {

    //Given a string, return a string where every appearance of the lowercase word "is" has been replaced with "is not".
    //The word "is" should not be immediately preceded or followed by a letter -- so for example the "is" in "this" does not count.
    //(Note: Character.isLetter(char) tests if a char is a letter.)
    public static String notReplace(String str){

        if(str.equals("is")) {
            return str + " not";
        }
        String isTest;
        for(int i = 0; i < str.length() - 1; i++){
            isTest = str.substring(i, i + 2);
            if(isTest.equals("is")) {


                if (i == 0) {
                    if(!Character.isLetter(str.charAt(i+2))) {
                        str = isTest + " not" + str.substring(i + 2);
                    }
                }
                else if (i == str.length() - 2){
                    if(!Character.isLetter(str.charAt(i-1))) {
                        str = str.substring(0, i + 2) + " not";
                    }
                }
                else if (!Character.isLetter(str.charAt(i-1)) && !Character.isLetter(str.charAt(i+2))){
                    str = str.substring(0, i+2) + " not" + str.substring(i + 2);
                }
            }
        }

        return str;
    }
}
