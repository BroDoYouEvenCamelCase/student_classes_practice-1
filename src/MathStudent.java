public class MathStudent extends Student{

    //COMPLETE THIS CLASS AFTER STUDENT CLASS
    //MathStudent must extend to Student class - do whatever it requires
    private String className = "Math";


    //HERE! Create a 5 args constructor that chains super class constructor
    public MathStudent(String firstName, String lastName, int age, String gender, String className) {
        super(firstName, lastName, age, gender, className);
        this.className = className;
    }
}
