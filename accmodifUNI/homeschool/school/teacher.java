package accmodifUNI.homeschool.school;

public class teacher{
    public static void main(String[] args) {
        student t=new student();
        
        System.out.println(t.Roll_num);
        System.out.println(t.name);
        System.out.println(t.marks);
        // System.out.println(age);  cannot be accessed outside og class

        System.out.println("====show details method is called===");
        t.showDetails();
    }
}