package ch5;

public interface Work {
    public int moneyFromWork();
    public abstract String location();
    public int hours();
    public default String getManager(){
        return "Kyle";
    }
}
