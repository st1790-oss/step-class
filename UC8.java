import java.util.*;

public class UC8{

    private static HashMap<Character, String[]> patternMap = new HashMap<>();

    public static void main(String[] args) {

        initializePatterns();

        String word = "OOPS";
        renderBanner(word);
    }

    private static void initializePatterns() {

        patternMap.put('O', new String[]{
                " ***** ",
                "*     *",
                "*     *",
                "*     *",
                " ***** "
        });

        patternMap.put('P', new String[]{
                " ******",
                "*     *",
                " ******",
                "*      ",
                "*      "
        });

        patternMap.put('S', new String[]{
                " ******",
                "*      ",
                " ***** ",
                "      *",
                " ******"
        });
    }

    private static void renderBanner(String word) {

        int height = 5;

        for (int i = 0; i < height; i++) {

            for (int j = 0; j < word.length(); j++) {

                char currentChar = word.charAt(j);

                String[] pattern = patternMap.get(currentChar);

                if (pattern != null) {
                    System.out.print(pattern[i] + "  ");
                }
            }

            System.out.println();
        }
    }
}
