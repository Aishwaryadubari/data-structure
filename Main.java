package stacks;

public class Main {
public static void main (String[] args)
{
	Stack mystack = new Stack(2);
	mystack.push(1);
	mystack.push(8);
	mystack.push(9);
	mystack.pop();
	mystack.printStack();
	
	Queue myqueue = new Queue(1);
	myqueue.enqueue(4);
	myqueue.enqueue(8);
	myqueue.enqueue(5);
	myqueue.dequeue();
	
}
}
