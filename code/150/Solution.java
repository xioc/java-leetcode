public int evalRPN(String[] tokens) {
	//保存数字的栈
	Stack<Integer> numStack = new Stack<>();
	//保存操作符的栈
	Stack<String> signStack = new Stack<>();
	for (int i = 0; i < tokens.length; i++) {
		if (tokens[i].equals("+") || tokens[i].equals("-") || tokens[i].equals("*") || tokens[i].equals("/")) {
			//符号
			int num2 = numStack.pop();
			int num1 = numStack.pop();
			switch (tokens[i]) {
				case "+":
					numStack.push(num1 + num2);
					break;
				case "-":
					numStack.push(num1 - num2);
					break;
				case "*":
					numStack.push(num1 * num2);
					break;
				case "/":
					numStack.push(num1 / num2);
					break;
			}

		} else {
			//数字
			numStack.push(Integer.parseInt(tokens[i]));
		}
	}
	return numStack.pop();
}