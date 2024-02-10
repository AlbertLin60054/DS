package stack;

public class Stack {

	private int top = -1;
	private int size;
	private int[] stack;

	/*
	 * constructor use to create a stack the size which been specified
	 */
	public Stack(int size) {
		this.size = size;
		this.stack = new int[size];
	}

	/**
	 * check wheather the index of top equals to the capacity of the stack or not.
	 * @return
	 */
	public boolean isFull() {
		return top == (size - 1);
	}
	/**
	 * When top is -1, it means there is no element in the stack.
	 * @return true means stack is empty. false means stack has element. 
	 */
	public boolean isEmpty() {
		return top == -1;
	}

	/**
	 * Pushes an item onto the stack.
	 * 
	 * @param item The number to be pushed onto the stack.
	 * @return true if the number has been successfully pushed onto the stack; false if the stack is full and the push operation failed.
	 */
	public boolean push(int item) {
		if (isFull()) {
			return false;
		}
		stack[++top] = item;
		return true;
	}
	/**
	 * Removes and returns the top element of the stack.
	 * 
	 * This method decreases the stack size by one and returns the element that was at the top of the stack.
	 * If the stack is empty before the operation, it throws an Exception to indicate that the operation cannot be performed.
	 * 
	 * @return The value of the element that was removed from the top of the stack.
	 * @throws Exception if the stack is empty and no element can be popped.
	 */
	public int pop() throws Exception {
		if(isEmpty()) {
			throw new Exception("The stack is empty!");
		}
		int item = stack[top];
		--top;
		return item;
	}

}
