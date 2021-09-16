public class MyMain {

    // Changes a capital letter to a lowercase letter
    // If the char is not an uppercase letter, 
    // it is returned unchanged. 
    public static char toLower(char ch) {
        if (ch>=41 && ch<=90){
            char x=(char)(ch+32);
            return x;
        }
        return ch;
    }

    // Changes a lowercase letter to an uppercase letter
    // If the char is not a lowercase letter,
    // it is returned unchanged.
    public static char toUpper(char ch) {
        if (ch>=97 && ch<=122) {
            char x = (char) (ch - 32);
            return x;
        }
        return ch;
    }

    // The method is given a String as input and returns a
    // new String where all of the numbers have been removed
    // from the original String.
    public static String removeNumbers(String str) {
        String result="";
        for (int i=0;i<str.length();i++){
            char x=(str.charAt(i));

            if (x < '0' || x> '9'){
                result+=str.substring(i, i+1);
            }
        }
        return result;
    }

    // Write some code to test your methods!
    public static void main(String[] args) {
        System.out.println(toUpper('a'));
        System.out.println(toLower('e'));
        System.out.println(toUpper('Q'));
        System.out.println(toLower('W'));
        System.out.println(removeNumbers("e1o2u3er4dfr5"));
        System.out.println(removeNumbers("u7y6t5r4"));
    }
}
