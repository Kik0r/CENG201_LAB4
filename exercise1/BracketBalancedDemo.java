//Yakup Bartu Başkaya
//240444051
//26.10.2026
package exercise1;

public class BracketBalancedDemo {

    public static void main(String[] args) {

        String[] expressions = {
                "[{()}]",
                "[()()]{}",
                "([]",
                "([{]})",
                "abc{defg(ijk)l[mn]op}qr",
                "a(bc)def]"
        };

        for (String expression : expressions) {

            boolean result = BalancedBrackets.isBalanced(expression);

            System.out.println(expression + " -> " + result);
        }
    }
}