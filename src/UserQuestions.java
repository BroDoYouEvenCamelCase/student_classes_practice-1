public class UserQuestions {

    //COMPLETE THIS CLASS BEFORE THE TEST CLASS

     /*
     HERE!
     Declare static final instance variables for interview questions below
     Would you like to be part of our Math or Science programs? (Y/N) -> variable name can be askToJoin
     What is your first name? -> variable name can be askFirstName
     What is your last name? -> variable name can be askLastName
     How old are you? -> variable name can be askAge
     What is your gender? (F/M) -> variable name can be askGender
     What class would you like to join? (Math/Science) -> variable name can be askClassName
     */

    static final String askToJoin = "Would you like to be part of our Math or Science programs? (Y/N)";
    static final String askFirstName = "What is your first name?";
    static final String askLastName = "What is your last name?";
    static final String askAge = "How old are you?";
    static final String askGender = "What is your gender? (F/M)";
    static final String askClassName = "What class would you like to join? (Math/Science)";

    public static void askToJoin() {
        System.out.println(askToJoin);
    }

    public static void askFirstName() {
        System.out.println(askFirstName);
    }

    public static void askLastName() {
        System.out.println(askLastName);
    }

    public static void askAge() {
        System.out.println(askAge);
    }

    public static void askGender() {
        System.out.println(askGender);
    }

    public static void askClassName() {
        System.out.println(askClassName);
    }
}
