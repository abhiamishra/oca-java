package ch5;

public class Child extends Human implements Work, Corporation{
    private int age = 0;
    private int money = 0;

    public Child(int age, int money){
        this.age = age;
        this.money = money;
    }

    @Override
    public int getAge() {
        // TODO Auto-generated method stub
        return this.age;
    }

    @Override
    public int getMoney() {
        // TODO Auto-generated method stub
        return this.money;
    }

    @Override
    public int moneyFromWork() {
        // TODO Auto-generated method stub
        return this.money * this.age;
    }

    @Override
    public String location() {
        // TODO Auto-generated method stub
        return "Irving";
    }

    @Override
    public int hours() {
        // TODO Auto-generated method stub
        return 8;
    }
    
    @Override
    public String getManager(){
        return "none"; //a method that was made abstract after it was default in first interface. The second interface applies more!
    }
}
