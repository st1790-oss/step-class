public class UC4 { 
    public static void main(String[] args) {
        // Store banner lines inside String Array
        String[] banner = {

                String.join("", "***************"),
                String.join("", "*             *"),
                String.join("", "*     OOPS    *"),
                String.join("", "*             *"),
                String.join("", "***************")
        };

        // Print banner using Enhanced For Loop
        for (String line : banner) {
            System.out.println(line);
        }
    }
}