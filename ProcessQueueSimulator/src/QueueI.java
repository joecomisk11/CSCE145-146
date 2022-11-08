/*
 * Written by Joe Comiskey
 */
public interface QueueI<T> {
	public T enqueue();
	public T dequeue();
	public String peek();
}
