package lesson2;

public class Client {
	public  static void main(String []args){
		TargetStack<Integer> stack=new Adapter<>();
		TargetQueue<Integer> queue= new Adapter<>();
		stack.push(3);
		stack.push(2);
		stack.push(8);
		try {
			System.out.println(stack.pop());
		} catch (Exception e1) {
			
			System.out.println(e1.getMessage());
		}
		
		try{
		System.out.println(queue.dequeue());
		}catch(Exception e){
			System.out.println(e.getMessage());;
		}
		System.out.println("isStack is empty"+stack.isStackEmpty());
		System.out.println("isQueue is empty"+queue.isQueueEmpty());
	}

}
