public class charac{
    public static void main(String[]args){
        char ch1='A';
        char ch2='a';
        char ch3='5';
        char ch4=' ';
        char ch5='@';

        System.out.println("isLetter(A)"+ Character.isLetter(ch1));
        System.out.println("isDigit(5)"+ Character.isDigit(ch3));
        System.out.println("isLetterorDigit(@)"+ Character.isLetterOrDigit(ch5));
        System.out.println("isUpperCase(A)"+ Character.isUpperCase(ch1));
        System.out.println("isLowerCase(a)"+ Character.isLowerCase(ch2));
        System.out.println("toUpperCase(a)"+ Character.toUpperCase(ch2));
        System.out.println("toLowerCase(A)"+ Character.toLowerCase(ch1));
        System.out.println("isWhitespace(' ')"+ Character.isWhitespace(ch4));
        System.out.println("isSpaceChar(' ')"+ Character.isSpaceChar(ch4));
        System.out.println("getNumericValue(5)"+ Character.getNumericValue(ch3));
        System.out.println("compare(A,a)"+ Character.compare(ch1,ch2));
        Character obj=Character.valueOf(ch1);
        System.out.println("character object": +obj);
        

    }
}
