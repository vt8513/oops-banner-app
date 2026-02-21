public class UC4_OOPS {public class uc4 {

    public static void main(String[] args) {

        // Store banner lines in array using String.join()
        String[] banner = {

                String.join("   ", " ***** ", " ***** ", " ***** ", " ***** "),
                String.join("   ", "*     *", "*     *", "*     *", "*      "),
                String.join("   ", "*     *", "*     *", "*     *", "*      "),
                String.join("   ", "*     *", "*     *", " ***** ", " ***** "),
                String.join("   ", "*     *", "*     *", "*      ", "      *"),
                String.join("   ", "*     *", "*     *", "*      ", "      *"),
                String.join("   ", " ***** ", " ***** ", "*      ", " ***** ")

        };

        // Enhanced for-loop to print banner
        for (String line : banner) {
            System.out.println(line);
        }
    }
}
    
}
