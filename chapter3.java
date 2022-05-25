public class chapter3 {
    public static void main(String[] args){
        String name = "Fluffy";
        String name2 = new String("Fluffy");

        System.out.println(name);
        System.out.println(name2);

        System.out.println(1+3);
        System.out.println("a"+"n"+3);


        String s = "1";
        s += 2;
        s += "3";
        System.out.println(s);

        System.out.println("---------------------------");
        System.out.println();

        //Testing String methods
        System.out.println(s.length());
        System.out.println(s.charAt(2));
        System.out.println(name.indexOf('f'));
        System.out.println(name.indexOf('f',4));
        System.out.println(name.indexOf("Flu"));

        System.out.println("--------PART 2---------------");
        System.out.println();

        //Fluffy
        //012345
        System.out.println(name.substring(3));
        System.out.println(name.substring(1,4));
        System.out.println(name.substring(1, name.length()));
        System.out.println(name.toLowerCase());
        System.out.println(name.toUpperCase());

        System.out.println("--------PART 3---------------");
        System.out.println();

        System.out.println("abc".equals("ABC"));
        System.out.println("ABC".equals("ABC"));
        System.out.println("XYZ".equalsIgnoreCase("xyz"));
        System.out.println(name.startsWith("F"));
        System.out.println(name.endsWith("yas"));
        System.out.println(name.contains("uff"));

        System.out.println(name.replace("F", "A"));

        String trimNo = "Hel Lo  Wo        Rl d     ";
        System.out.println(trimNo.trim().toLowerCase());

        //Practicing StringBuilder Coding
        System.out.println("STRINGBUILDER CLASS PRACTICE");
        System.out.println();
        System.out.println();
        System.out.println();

        StringBuilder alpha = new StringBuilder();
        alpha.append("hello");
        alpha.append("-world");
        System.out.println(alpha);

        //Showing how StringBuilder is different to Strings
        StringBuilder a = new StringBuilder("a");
        StringBuilder b = a.append(" and b!");
        System.out.println(a);
        System.out.println(b);
        System.out.println(a==b);

        a.insert(0, "Inserting: ");
        System.out.println(a);

        a.delete(0, 6);
        a.insert(0, "Delet");
        System.out.println(a);

        StringBuilder c = a.reverse();
        System.out.println(c);
        //notice that a is also getting reversed here!
        System.out.println(a);

        System.out.println("UNDERSTANDING EQUALITY");
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();

        String a_dom = "a";
        String a_sub = "a";
        System.out.println(a_dom + " vs " + a_sub);
        System.out.println(a_dom==a_sub);

        //BUT,,,
        String a_thee = "      a".trim();
        System.out.println(a_dom + " vs " + a_thee);

        String a_four = new String("a");
        System.out.println(a_dom==a_thee);
        System.out.println(a_dom + " vs " + a_four);
        System.out.println(a_dom==a_four);


    }
}
