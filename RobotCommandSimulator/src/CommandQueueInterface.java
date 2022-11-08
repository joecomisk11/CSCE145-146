//Written by Joe Comiskey
//simple interface. Peek type string to be able to use toString method
public interface CommandQueueInterface<T> {
	public T dequeue();
	public T enqueue();
	public String peek();
}
