package basicSyntax;

public class Variables {
    public static void main(String[] args) {
        int num1 = 1;
        double num2 = 1.0;

        System.out.println(num1);
        System.out.println(num2);

        String myFavorite = "私の好きな";
        String is = "です。";

        System.out.println(myFavorite + "整数は" + num1 + is);
        System.out.println(myFavorite + "少数は" + num2 + is);
    }
}
