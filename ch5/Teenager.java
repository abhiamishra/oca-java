package ch5;

public class Teenager extends Child{

    public Teenager(int age, int money) {
        super(age, money);
        //TODO Auto-generated constructor stub
    }

    //here Teenager extends Child which extends an abstract class but since we defined the abstract methods in Child, they do not need to be explicitly defined in Teenager class
    //however, the constructor does need to be defined since we explicitly defined a constructor in Child.
    
}
