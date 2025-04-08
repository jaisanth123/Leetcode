class Solution {
    public int evalRPN(String[] tokens) {
        Stack<String> stack = new Stack<>();
        int total = 0;
        for (String i : tokens) {
            if (!i.equals("+") && !i.equals("*") && !i.equals("-") && !i.equals("/")) {
                stack.push(i);
            } else {
                if (stack.size()<2) {
                    return 0;
                } else {
                    int num2 = Integer.parseInt(stack.pop());
                    int num1 = Integer.parseInt(stack.pop());
                    int ans = 0;
                    switch (i) {
                        case "+":
                            ans = num1 + num2;
                            break;

                        case "-":
                            ans = num1 - num2;
                            break;

                        case "*":
                            ans = num1 * num2;
                            break;

                        case "/":
                            ans = num1 / num2;
                            break;

                    }
                    stack.push(Integer.toString(ans));
                }
            }
        }
        String s = stack.pop();
        return Integer.parseInt(s);
    }
}
