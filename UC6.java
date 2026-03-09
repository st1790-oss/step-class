public class UC6 {

    public static void main(String[] args) {

        String[][] banner = {
                buildO(),
                buildO(),
                buildP(),
                buildS()
        };

        for (int row = 0; row < banner[0].length; row++) {
            for (int col = 0; col < banner.length; col++) {
                System.out.print(banner[col][row] + "  ");
            }
            System.out.println();
        }
    }
    public static String[] buildO() {
        return new String[]{
                " ***** ",
                "*     *",
                "*     *",
                "*     *",
                " ***** "
        };
    }

    public static String[] buildP() {
        return new String[]{
                "****** ",
                "*     *",
                "****** ",
                "*      ",
                "*      "
        };
    }

    public static String[] buildS() {
        return new String[]{
                " ***** ",
                "*      ",
                " ***** ",
                "      *",
                " ***** "
        };
    }
   } 

