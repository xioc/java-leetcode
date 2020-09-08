public class Question20 {
    public boolean isValid(String s) {
        int length = s.length();
        Stack stack = new Stack(length);
        for (int i = 0; i < length; i++) {
            String temp = s.charAt(i) + "";
            if (i == 0) {
                stack.push(temp);
            } else {
                if (temp.equals(")") || temp.equals("]") || temp.equals("}")) {

                    //出栈
                    String stackOut = stack.pop();
                    if (stackOut == null) {

                        stack.push(temp);
                    }
                    if ((stackOut + temp).equals("()") || (stackOut + temp).equals("[]") || (stackOut + temp).equals("{}")) {
                        continue;
                    } else {
                        stack.push(stackOut);
                        stack.push(temp);
                    }

                } else if (temp.equals("(") || temp.equals("[") || temp.equals("{")) {
                    //入栈
                    stack.push(temp);
                } else {
                    continue;
                }
            }
        }
        if (stack.pop() == null) {
            return true;
        }
        return false;
    }
}


/***************官方题解*************************/
public class Solution {

    // Hash table that takes care of the mappings.
    private HashMap<Character, Character> mappings;

    // Initialize hash map with mappings. This simply makes the code easier to read.
    public Solution() {
        this.mappings = new HashMap<Character, Character>();
        this.mappings.put(')', '(');
        this.mappings.put('}', '{');
        this.mappings.put(']', '[');
    }

    public boolean isValid(String s) {

        // Initialize a stack to be used in the algorithm.
        Stack<Character> stack = new Stack<Character>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            // If the current character is a closing bracket.
            if (this.mappings.containsKey(c)) {

                // Get the top element of the stack. If the stack is empty, set a dummy value of '#'
                char topElement = stack.empty() ? '#' : stack.pop();

                // If the mapping for this bracket doesn't match the stack's top element, return false.
                if (topElement != this.mappings.get(c)) {
                    return false;
                }
            } else {
                // If it was an opening bracket, push to the stack.
                stack.push(c);
            }
        }

        // If the stack still contains elements, then it is an invalid expression.
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        String s="()()[][{}]";
        System.out.println(new Solution().isValid(s));
    }
}