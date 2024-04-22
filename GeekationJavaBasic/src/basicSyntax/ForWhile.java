package basicSyntax;

public class ForWhile {
    public static void main(String[] args) {
        // 1
        for (int i = 1; i <= 100; i++) {
            if (i % 5 == 0 && i % 3 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }

        // 2
        String[] languages = {"Ruby", "Golang", "Java", "Python", "Typescript", "HTML", "Javascript"};
        for (String language : languages) {
            if (language == "Java") {
                System.out.println("現在学習中の言語は" + language + "です。");
            } else if (language == "HTML") {
                System.out.println(language + "はプログラミング言語ではありません。");
            } else {
                System.out.println(language);
            }
        }
    }
}
