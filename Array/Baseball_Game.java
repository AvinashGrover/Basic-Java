import java.util.Stack;

class Baseball_Game {
    public int calPoints(String[] ops) {
        Stack<Integer> stack = new Stack<>();

        for (String op : ops) {
            if (op.equals("+")) {
                int top = stack.pop();
                int newTop = top + stack.peek();
                stack.push(top);
                stack.push(newTop);
            } else if (op.equals("D")) {
                stack.push(2 * stack.peek());
            } else if (op.equals("C")) {
                stack.pop();
            } else {
                stack.push(Integer.parseInt(op));
            }
        }

        int totalSum = 0;
        while (!stack.isEmpty()) {
            totalSum += stack.pop();
        }

        return totalSum;
    }

    public static void main(String[] args) {
        Baseball_Game solution = new Baseball_Game();

        String[] ops1 = { "5", "2", "C", "D", "+" };
        System.out.println("Output for ops1: " + solution.calPoints(ops1)); // Output: 30

        String[] ops2 = { "5", "-2", "4", "C", "D", "9", "+", "+" };
        System.out.println("Output for ops2: " + solution.calPoints(ops2)); // Output: 27

        String[] ops3 = { "1", "C" };
        System.out.println("Output for ops3: " + solution.calPoints(ops3)); // Output: 0
    }
}
