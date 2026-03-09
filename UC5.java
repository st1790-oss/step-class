    import java.util.Collections;
public class UC5{ 
public static void main(String[] args) {

        String[] banner = {
                String.join("", Collections.nCopies(50, "*")),
                "*" + String.join("", Collections.nCopies(48, " ")) + "*",
                "*" + centerText("WELCOME TO OOPS BANNER APP", 48) + "*",
                "*" + centerText("UC5 - ARRAY INITIALISATION", 48) + "*",
                "*" + String.join("", Collections.nCopies(48, " ")) + "*",
                String.join("", Collections.nCopies(50, "*")),
                ""
        };

        for (String line : banner) {
            System.out.println(line);
        }
    }

    private static String centerText(String text, int width) {

        int padding = (width - text.length()) / 2;
        int extraSpace = (width - text.length()) % 2;

        return String.join("", Collections.nCopies(padding, " "))
                + text
                + String.join("", Collections.nCopies(padding + extraSpace, " "));
    }
}
