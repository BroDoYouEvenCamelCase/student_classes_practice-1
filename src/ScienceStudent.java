public class ScienceStudent extends Student{

    //COMPLETE THIS CLASS AFTER STUDENT CLASS
    //ScienceStudent must extend to Student class - do whatever it requires
    private String className = "Science";


    //HERE! Create a 5 args constructor that chains super class constructor

    public ScienceStudent(String firstName, String lastName, int age, String gender, String className) {
        super(firstName, lastName, age, gender, className);
        this.className = className;
    }
}
