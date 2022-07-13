public class ch4_child extends chapter4 {
    public static void main(String []args){
        ch4_child child = new ch4_child();
        child.makeDanger(); //using default access member - being able to access parent's method
        child.quietDanger(); //using protected members
        //child.quack() // cannot use since it is private!
    }
}
