package basicSyntax;

public class MethodPractice {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;
        putConsole(sum(a,b));
        putConsole(subtract(a,b));
        putConsole(multiply(a,b));
        putConsole(divide(a,b));
    }

    public static int sum(int a, int b) {
        return a + b;
    }

    public static int subtract(int a, int b) {
        return a - b;
    }

    public static int multiply(int a, int b) {
        return a * b;
    }

    public static int divide(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("第二引数は0にできません。");
        }
        return a / b;
    }

    public static void putConsole(int number){
        System.out.println("計算結果は" + number + "です。");
    }
}
