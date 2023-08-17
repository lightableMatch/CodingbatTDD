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

    //We'll say that a lowercase 'g' in a string is "happy" if there is another 'g' immediately to its left or right.
    //Return true if all the g's in the given string are happy.
    public static boolean gHappy(String str){

        if(str.length() == 0){
            return true;
        }

        boolean happy = false;
        str = " " + str + " ";
        for(int i = 1; i < str.length()-1; i++){
           if(str.charAt(i) == 'g'){
                if(str.charAt(i-1) == 'g' || str.charAt(i+1) == 'g'){
                    happy = true;
                }
                else{
                    return false;
                }
           }
        }

        return happy;
    }

    /*
    Given a string, return the sum of the digits 0-9 that appear in the string,
    ignoring all other characters. Return 0 if there are no digits in the string.
    (Note: Character.isDigit(char) tests if a char is one of the chars '0', '1', .. '9'.
    Integer.parseInt(string) converts a string to an int.)
     */
    public static int sumDigits(String str) {
       int sum = 0;

       //Loop form
       for (int i = 0; i < str.length(); i++){
           if(Character.isDigit(str.charAt(i))){
               sum += Integer.parseInt(str.substring(i,i+1));
           }
       }

       //Stream form


       return sum;
    }

    /*
    *
    * Given a string, count the number of words ending in 'y' or 'z' --
    * so the 'y' in "heavy" and the 'z' in "fez" count, but not the 'y' in "yellow" (not case sensitive).
    * We'll say that a y or z is at the end of a word if there is not an alphabetic letter immediately following it.
    *  (Note: Character.isLetter(char) tests if a char is an alphabetic letter.)
    * */
    public static int countYZ(String str){
        int count = 0;

        String[] words = str.split("\\P{Alpha}+");

        for(int i = 0; i < words.length; i++){
            if(words[i].equals("")){
                continue;
            }
            String word = words[i].toLowerCase();
            int wordLength = word.length() - 1;
            if(word.charAt(wordLength) == 'y' || (word.charAt(wordLength) == 'z')){
                count++;
            }

        }

        return count;
    }
}
