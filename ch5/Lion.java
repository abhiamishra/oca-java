package ch5;

public class Lion extends Animal {
    public String roar = "I am a lion!"; //hiding a variable

    public int getAge(){
        return super.getAge()+45;
    }
}
