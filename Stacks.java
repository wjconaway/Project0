package CaseTwo;


import java.util.Stack;

public class Stacks {

	public static void main(String[] args) throws Exception {
	
	Stack<String> val = new Stack<>();
	
	val.push("v");
	print(val);
	val.push("a");
	print(val);
	val.push("l");
	print(val);
	
	val.pop();
	print(val);
	val.pop();
	print(val);
	

	if (val.size()==0) {
		throw new Exception("Stack ran out");
	}
	System.out.println(val.size());
	

	}
	
	public static void print(Stack<String>v) throws Exception {
		
		if (v.isEmpty()) {
			throw new Exception("Stack is now empty");
		}else {
			System.out.println(v);
		}
	}

}
