package com.dsa.stack;

public class StackByArray {
	int[] arr;
	int topOfStack;

	/**
	 * StackByArray method to create stack by using array
	 * 
	 * @param size
	 */
	public StackByArray(int size) {
		this.arr = new int[size];
		this.topOfStack = -1;
		System.out.println("Successfully created an empty Stack of Size: " + size);
	}

	/**
	 * push method to push value to stack
	 * 
	 * @param value
	 */
	public void push(int value) {
		if (isFullStack() == true) {
			System.out.println("Stack overflow error!!");
		} else {
			arr[topOfStack + 1] = value;
			topOfStack++;
			System.out.println("Successfully inserted " + value + " in to the stack");
		}
	}
	
	/**
	 * pop method to delete a top value from stack
	 * 
	 */
	public void pop() {
		if(isEmptyStack()) {
			System.out.println("Stack underflow error!!");
		} else {
			System.out.println("Poping value from Stack: " + arr[topOfStack] + "...");
			topOfStack--;
		}	
	}
	
	/**
	 * isEmptyStack method to check stack is empty 
	 * 
	 * @return boolean
	 */
	public boolean isEmptyStack() {
		if(topOfStack == -1) {
			return true;
		} else {
			return false;
		}
	}

	/**
	 * isFullStack method to check stack is full
	 * 
	 * @return boolean
	 */
	public boolean isFullStack() {
		if (topOfStack == arr.length - 1) {
			System.out.println("Stack is full!");
			return true;
		} else {
			System.out.println("Stack is empty!");
			return false;
		}
	}
	
	/**
	 * peekOperation to get the peek value from stack
	 * 
	 */
	public void peekOperation() {
		if (!isEmptyStack())
			System.out.println("Top of Stack: " + arr[topOfStack]);
		else {
			System.out.println("The stack is empty!!");
		}
		System.out.println();System.out.println();
	}
	
	/**
	 * deleteStack method to delete the stack
	 */
	public void deleteStack() {
		arr = null;
		System.out.println("Stack is successfully deleted");
	}

	/**
	 * main 
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Creating a Stack....");
		StackByArray stack = new StackByArray(5);

		System.out.println("Pushing 6 values in the Stack...");
		for(int i=0; i<=5; i++) {
			stack.push(i*10);
		}
		
		System.out.println("Peeking value from stack");
		stack.peekOperation();
		
		System.out.println("Poping 6 values from the Stack...");
		for(int i=0; i<=5; i++) {
			stack.pop();
		}
		
		System.out.println("Deleting the Stack...");
		stack.deleteStack();
	}
}
