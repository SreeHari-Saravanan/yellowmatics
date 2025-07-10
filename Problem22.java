package day3;

public class Problem22 {
    public static void main(String[] args) {
        int i = 1;
        do {
            if (i == 5) {
                i++;
                break; // Exits the loop if i is 5
            }
            System.out.println(i);
            i++;
        } while (i <= 5); // Added the missing semicolon here
    }
}
