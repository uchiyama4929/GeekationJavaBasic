package basicSyntax;

public class IfSwitch {
    public static void main(String[] args) {
        // 1
        int num = 12;
        boolean flag = true;
        if (num % 2 == 0) {
            System.out.println("2の倍数です。");
            flag = false;
        }
        if (num % 3 == 0) {
            System.out.println("3の倍数です。");
            flag = false;
        }
        if (flag) {
            System.out.println("どちらでもありません。");
        }

        // 2
        String pref = "東京都";
        switch (pref) {
            case "北海道":
                System.out.println("北海道");
                break;
            case "東京都":
                System.out.println("東京都");
                break;
            case "京都府":
                System.out.println("京都府");
                break;
            default:
                System.out.println("当てはまりません。");
        }
    }
}
