package adapter;

public interface TargetStack<T> {
	public void push(T t);
	public T pop() throws Exception;
	public boolean isStackEmpty();
}
