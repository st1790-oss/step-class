public class UC3 {

    public static void main(String[] args) {

        // Row 1
        System.out.println(String.join("   ",
                " ***** ",   // O
                " ***** ",   // O
                " ***** ",   // P
                " ***** ")); // S

        // Row 2
        System.out.println(String.join("   ",
                "*     *",   // O
                "*     *",   // O
                "*     *",   // P
                "*      ")); // S

        // Row 3
        System.out.println(String.join("   ",
                "*     *",   // O
                "*     *",   // O
                " ***** ",   // P
                " ***** ")); // S

        // Row 4
        System.out.println(String.join("   ",
                "*     *",   // O
                "*     *",   // O
                "*      ",   // P
                "      *")); // S

        // Row 5
        System.out.println(String.join("   ",
                " ***** ",   // O
                " ***** ",   // O
                "*      ",   // P
                " ***** ")); // S
    }
    }