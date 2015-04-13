package EPAM2015_lab2.task7;

import java.util.Scanner;
import java.util.regex.Pattern;

public class CombinationsTest {

    private Scanner scanner;
    private Pattern pattern;

    public CombinationsTest() {
        scanner = new Scanner(System.in);
        pattern = Pattern.compile("[1-9]");
    }

    private void clrScr() {
        for (int i = 0; i < 20; i++) {
            System.out.println("\n");
        }
    }

    public void testShow() {
        String nValue;
        do {
            clrScr();
            System.out.print("Enter N value: ");
            while (!pattern.matcher(nValue = scanner.nextLine()).matches()) {
                System.out.print("Enter valid N value: ");
            }
            clrScr();
            Combinations.show(Integer.parseInt(nValue), Integer.parseInt(nValue));
            System.out.print("\nPress \"Enter\" to continue or enter \"0\" to exit: ");
        } while (!scanner.nextLine().equals("0"));
    }

    public static void main(String[] args) {
        CombinationsTest driver = new CombinationsTest();
        driver.testShow();
    }
}
