package basicSyntax;

public class ComparisonLogicalOperators {
    public static void main(String[] args) {

        // 1
        int a = 10;
        int b = 5;
        System.out.println(a > b);

        // 2
        boolean isSunny = true;
        boolean isWarm  = true;
        System.out.println(isSunny && isWarm);

        // 3
        int x = 1;
        int y = 2;
        System.out.println(x > 0 && y % 2 == 0);

        // 4
        boolean hasPermission = false;
        System.out.println(!hasPermission);
    }
}
