import java.util.Scanner;

/**
 * Created by User on 11/28/2019.
 */
public class Calculator {
    static RomanNumeral Numeral = new RomanNumeral();

    public static void main(String[] arg) {
        Calc myCalc = new Calc();
        Integer result = 0;
        String res = "";

        do {
            Scanner calcScan = new Scanner(System.in);
            System.out.println("Введите число. Например 2+2 или I+I");

            try {
                if (calcScan.findInLine("(-?\\d+\\.?\\d*)?\\s*(\\S)\\s*(-?\\d+\\.?\\d*)") != null) {

                    Integer nOne = Integer.parseInt(calcScan.match().group(1));
                    Integer nTwo = Integer.parseInt(calcScan.match().group(3));
                    result = myCalc.action(nOne, nTwo, calcScan.match().group(2));

                    System.out.println(result);

                } else if (calcScan.findInLine("(-?IX|IV|V?I{0,3})?\\s*(\\S)\\s*(-?IX|IV|V?I{0,3})") != null) {
                    Integer nOne = RomanNumeral.convertRomanToInt(calcScan.match().group(1));
                    Integer nTwo = RomanNumeral.convertRomanToInt(calcScan.match().group(3));
                    result = myCalc.action(nOne, nTwo, calcScan.match().group(2));

                    res = RomanNumeral.convertIntegerToRoman(result);

                    System.out.println(res);
                } else {
                    System.out.println("Line error");
                }

            } catch (NumberFormatException e) {
                System.out.println("Problem: Invalid format");
            }
        } while (true);

    }
}
