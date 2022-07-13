package ch5;

public class ch5tester {
    public static void main(String[] args){
        Lion lion1 =  new Lion();
        System.out.println(lion1.roar);
        Animal animal1 = new Animal();
        System.out.println(animal1.getRoar());

        System.out.println(animal1.getAge() + " vs. " + lion1.getAge());
    
        System.out.println("   testing abstract classes here:   ");
        /////////// TESTING ABSTRACT CLASSES /////////////////
        //Can't make instantiation of abstract class
        // Human hum = new Human();
        Child abhi = new Child(20, 0);
        System.out.println(abhi.getAge() + " vs. $ " + abhi.getMoney());

        //Child abhi2 = new Child(); when you define a constructor in a subclass, it removes no-argument default constructor
    }

}
