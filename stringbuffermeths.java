//length, charAt, append, insert, replace, delete(start,end), reversde, setCharAt(index,char)

public class stringbuffermeths {
    public static void main(String[] args) {
        StringBuffer sb= new StringBuffer("Avenger Assemble");
        System.out.println("length of string: "+sb.length());
        System.out.println("char at 0th position of string: "+sb.charAt(0));
        System.out.println("append 'hii' string: "+sb.append("hii"));
        System.out.println(" insert 'omg insert': "+sb.insert(0,"omg insert"));
        System.out.println("replace string: "+sb.replace(3,5,"omg replace"));
        System.out.println("delete string: "+sb.delete(1,3));
        System.out.println("reverse of string: "+sb.reverse());
        System.out.println("setcharat string: "+sb.setCharAt(0,"!"));
        System.out.println("capacity of string: "+sb.capacity());
        

    }
    
}
