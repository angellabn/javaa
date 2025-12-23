package accmodifUNI.homeschool.school;

public class student {
   
    public int Roll_num=4;               //runs in same class,same package, subclass(inheritance), otherpackage
    protected String name="Angella";     //runs in same class, package, subclass
    int marks=75;                        //runs in same class and same package
    private int age=20;                  //runs in same classs only

    public void showDetails(){
        System.out.println(Roll_num);  
        System.out.println(name);      
        System.out.println(marks);     
        System.out.println(age);       

    }
      
}
