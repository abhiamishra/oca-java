package ch5;

public interface School {
    public String getMajor();
    public int location(); //implementing this in Child class will not work since the abstract method has a different return type -> COMPILER ERROR
}
