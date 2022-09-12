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
	
	
	BinarySearchTree mytree= new BinarySearchTree();
	mytree.insert(47);
	mytree.insert(21);
	mytree.insert(76);
	mytree.insert(18);
	mytree.insert(52);
	mytree.insert(82);
	
	mytree.insert(27);
	System.out.println("BFS: "+mytree.BFS());
	
	System.out.println("DFS: "+mytree.DFSPreOrder());
}
}
