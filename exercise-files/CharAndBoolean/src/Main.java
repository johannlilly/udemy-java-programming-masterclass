public class Main {
    
    public static void main(String[] args) {

        char myChar = 'D'; // single quotes; <char> only stores a single character
        // 16 bits; allows storage of unicode characters
        // use case: store last keystroke
        char myUnicodeChar = '\u0044'; // unicode
        System.out.println(myChar);
        System.out.println(myUnicodeChar);

        char myCopyrightChar = '\u00A9';
        System.out.println(myCopyrightChar);

    }

}