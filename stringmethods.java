//length,charAt, toUpperCase, toLowerCase, substring(beginindex), substring(beginindex, endindex)
//equals(), equalsIgnoreCase(), contains, replace, indexOf(), isEmpty(), trim(), startswith, endswith
public class stringmethods {
    public static void main(String[] args) {
        String str=new String("Avenger Assemble");
        System.out.println("character length: "+str.length());
        System.out.println("character at index 3: "+str.charAt(3));
        System.out.println("character in upper case: "+str.toUpperCase());
        System.out.println("character in lowercase: "+str.toLowerCase());
        System.out.println("substring of character : "+str.substring(2));
        System.out.println("substring of character : "+str.substring(0,5));
        System.out.println("character equals 'avenger assemble': "+str.equals("avenger assemble"));
        System.out.println("character equals w ignorecase 'avenger assemble': "+str.equalsIgnoreCase("avenger assemble"));
        System.out.println("character contains 'ger'"+str.contains("ger"));
        System.out.println("character replace: "+str.replace('e','x'));
        System.out.println("character index of'v': "+str.indexOf('v'));
        System.out.println("character is empty? : "+str.isEmpty());
        System.out.println("character length: "+str.trim());
        System.out.println("character length: "+str.startsWith("Av"));
        System.out.println("character length: "+str.endsWith("ble"));

    }
}
