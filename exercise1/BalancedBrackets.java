//Yakup Bartu Başkaya
//240444051
//26.10.2026
package exercise1;

public class BalancedBrackets {

    public static boolean isBalanced(String s) {
        BracketStack stack = new BracketStack();

        for (int i = 0; i < s.length(); i++) {
            char current = s.charAt(i);

            if (current == '(' || current == '[' || current == '{') {
                stack.push(current);
                continue;
            }

            if (current == ')' || current == ']' || current == '}') {
                if (stack.isEmpty()) {
                    return false;
                }

                char opening = stack.pop();
                if (!isMatchingPair(opening, current)) {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }

    private static boolean isMatchingPair(char opening, char closing) {
        return (opening == '(' && closing == ')')
            || (opening == '[' && closing == ']')
            || (opening == '{' && closing == '}');
    }
}
