package lesson2;

public interface TargetQueue<T> {
	public T dequeue() throws Exception;
	public void enqueue(T t);
	public boolean isQueueEmpty();
}
