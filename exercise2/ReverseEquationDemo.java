//Yakup Bartu Başkaya
//240444051
//26.10.2026

package exercise2;

public class ReverseEquationDemo {

    public static void main(String[] args) {

        String[] equations = {
            "20-3+5*2",
            "123+45*6",
            "100/25-7"
        };

        for (String equation : equations) {
            System.out.println("Input:  " + equation);
            System.out.println("Output: " + EquationReverser.reverseEquation(equation));
            System.out.println();
        }
    }
}