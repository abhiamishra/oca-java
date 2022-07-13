// public class ch4_tester {
//     private String name = "Static class";
//     public static void first() { }
//     public static void second() { }
//     public void third() { System.out.println(name); }
//     public static void main(String []args){
//         ch4_test.main(new String[0]);
//         System.out.println(ch4_test.count);

//         System.out.println("=========================");
//         ch4_test test = new ch4_test();
//         System.out.println(test.count);

//         //Objects can point to null and still access static fields and methods!
//         test = null;
//         System.out.println(test.count);

//         first();
//         second();
//         third(); //static members cannot use instance members!
//     }
// }
