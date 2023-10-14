package org.example;

import java.util.*;

class User extends Human {
    String name;
    String adress;

    public User(String name, String adress) {
        this.name = name;
        this.adress = adress;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", adress='" + adress + '\'' +
                '}';
    }
}

class ExamplePecsTest {

    public static void main(String[] args) {

        List<User> users = new ArrayList<>();
        List<Operator> operators = new ArrayList<>();
        List<Customer> customers = new ArrayList<>();

        users.add(new User("ser", "s@m"));
        users.add(new User("serrtr", "s@mjhk"));
        sendEmails(users);

        List<Operator> alloperators = new ArrayList<>();

        List<User> allUsers = new ArrayList<>();
        allUsers.add(new Operator("ivan", "s@v"));
        allUsers.add(new Customer("van", "srytr"));
        allUsers.add(new User("van", "srytr"));








        operators.add(new Operator("ivan", "s@v"));
//        sendEmails(operators); // err
        /*
        В результате теперь мы можем легко вызывать метод для списков любого универсального типа, при условии,

         что они наследуются от класса User:
         */
        sendEmailsFixed(operators); // extends
        sendEmailsFixed(customers);
        sendEmailsFixed(users);
 //      sendEmailsFixed(humanList); // err за пределами границы users

        addUsersFromMarketingDepartment(alloperators); //
//        addUsersFromMarketingDepartment(customers); // err



        addUsersFromMarketingDepartmentFixed(allUsers);

        addUsersAndSendEmails(users);
/*

        addUsersAndSendEmails(customers);
        addUsersAndSendEmails(alloperators);

 */

    }



    private static void sendEmails(List<User> users) {
        for (User user : users) {
            System.out.println("sending email to " + user);
        }
    }
    private static void sendEmailsFixed(List<? extends User> users) {

        for (User user : users) {

            System.out.println("sending email to " + user);
        }
    }

    private static void addUsersFromMarketingDepartment(List<Operator> users) {
        users.add(new Operator("john doe", "q@mm"));
        users.add(new Operator("jane doe", "sas@m,nnm"));

    }

    private static void addUsersFromMarketingDepartmentFixed(List<? super User> users) {
        users.add(new Operator("john doe", "sas"));
        users.add(new User("jane doe", "asdasd"));
        users.add(new Customer("jane doe", "asdasd"));
        System.out.println("===================");
        System.out.println("Это он " + users.get(0));

    }
    private static void addUsersAndSendEmails(List<User> users) {
        users.add(new Operator("john doe", "asdasd"));
        users.add(new Customer("john doe", "asdasd"));

        for (User user : users) {
            System.out.println("sending email to: " + user);
        }
    }

}
class Operator extends User {

    public Operator(String name, String adress) {
        super(name, adress);
    }
}
class Customer extends User {
    public Customer(String name, String adress) {
        super(name, adress);
    }
}
class Human {

    public Human() {
    }
}
