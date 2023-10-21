package Reflection;

public class User {


    private int id;


    String name;
    final int accountNumber;

    static int age;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public User(int accountNumber){

        this.accountNumber = accountNumber;
    }

    public void printName(String name){

        System.out.println("Myname"+ name);
    }

    public static void printCity(){

        System.out.println("Mycity"+ "Tnj");
    }

    private static void printCountry(){

        System.out.println("india");
    }



}
