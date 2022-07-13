public class chapter4 {
    //Using private access modifier means only 
    //those in the same class can use it!
    private String noise = "java";
    private void quack(){
        System.out.println(noise);
    }

    private void makeNoise(){
        this.quack();
    }

    //Default access
    void makeDanger(){
        System.out.println("I am danger!");
    }

    protected void quietDanger(){
        System.out.println("No more danger!");
    }
    public static void main(String []args){
        chapter4 newObject = new chapter4();
        newObject.makeNoise();
    }
}
