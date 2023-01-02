import java.util.ArrayList;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {

        //COMPLETE THIS CLASS AFTER ALL THE OTHER CLASSES

        /*
        Write a code that asks user to if they would like join your classes
        If the answer is "Yes" from user,then ask user information; firstName, lastName, age, gender, class to join
        ***If user is age is not more than 20, do not allow them to join
        ***If user wants to join any other class except Math and Science, do not allow them to join

        REMEMBER - checkAge and checkClassName methods may throw exceptions. You have to handle them

        Keep asking users the question they would to like join until you have got 3 students overall
        Create MathStudent or ScienceStudent objects based on user's answer for the class they want to join
        Print a "Congratulations! You are registered for {className} class."

        Store all these 3 objects in a collection and print them

        EXPECTED OUTPUT OF THE PROGRAM:
        Print information of all 3 students
        Print how many students are MathStudent with message -> "Math students = {numberOfMathStudents}"
        Print how many students are ScienceStudent with message -> "Science students = {numberOfScienceStudents}"
         */


        Scanner scanner = new Scanner(System.in);
        ArrayList<Student> students = new ArrayList<>();

        while (students.size() < 3) {
            UserQuestions.askToJoin();
            String answer = scanner.nextLine();

            if(answer.equalsIgnoreCase("n")) continue;

            if (answer.equalsIgnoreCase("y")) {
                UserQuestions.askFirstName();
                String firstName = scanner.nextLine();

                UserQuestions.askLastName();
                String lastName = scanner.nextLine();

                UserQuestions.askAge();
                int age = scanner.nextInt();
                try {
                    Permission.checkAge(age);
                } catch (RuntimeException e) {
                    System.out.println(e.getMessage());
                    continue;
                } finally {
                    scanner.nextLine();
                }

                UserQuestions.askGender();
                String gender = scanner.nextLine().toUpperCase();

                UserQuestions.askClassName();
                String className = scanner.next();
                try {
                    Permission.checkClassName(className);
                } catch (RuntimeException e) {
                    System.out.println(e.getMessage());
                    continue;
                } finally {
                    scanner.nextLine();
                }

                Student student = new Student(firstName, lastName, age, gender, className);
                students.add(student);
                System.out.println("Congratulations! You are registered for " + student.getClassName() + ".\n");
            } else {
                System.out.println("Invalid input! Please answer with \"Y\" or \"N\"");
            }
        }

        System.out.println("\nRegistered students:");
        for (Student student : students) {
            System.out.println(student.toString());
        }

        int numMathStudents = (int) students.stream().filter(s -> s.getClassName().equalsIgnoreCase("math")).count();
        int numScienceStudents = (int) students.stream().filter(s -> s.getClassName().equalsIgnoreCase("science")).count();
        System.out.println("\nMath students: " + numMathStudents);
        System.out.println("Science students: " + numScienceStudents);
    }
    }

