//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {

        batter();
        sum(25,67);
        sum(23,76,21);
        sum("San", "Gin");
        sum("Rin", 32);

    }

    public static void batter () {
        //        1	Make the cookie batter.
        System.out.println("Mix the dry ingredients.");
        System.out.println("Cream the butter and sugar.");
        System.out.println("Beat in the eggs.");
        System.out.println("Stir in the dry ingredients.");
    }
    public static void bake () {
        //        2	Bake the cookies.
        System.out.println("Set the oven temperature.");
        System.out.println("Set the timer.");
        System.out.println("Place a batch of cookies into the oven.");
        System.out.println("Allow the cookies to bake.");
        System.out.println("Set the oven temperature.");
        System.out.println("Set the timer.");
        System.out.println("Place a batch of cookies into the oven.");
        System.out.println("Allow the cookies to bake.");
    }
    public static void add () {
        //        3	Add frosting and sprinkles.
        System.out.println("Mix ingredients for frosting.");
        System.out.println("Spread frosting and sprinkles.");
    }

    public static void sum (int a, int b) {
        int result = a+b;
        System.out.println("Skaitļu summa ir "+result);
    }

    public static void sum (int a, int b, int c) {
        int result = a+b+c;
        System.out.println("Skaitļu summa ir "+result);
    }

    public static void sum (String a, String b) {
        String result = a+b;
        System.out.println("Virkņu summa ir "+result);
    }

    public static void sum (String a, int b) {
        System.out.println("Skaitļu un virkņu summa ir "+a+" "+b);
    }
}
