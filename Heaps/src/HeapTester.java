
public class HeapTester {

	public static void main(String[] args) {
		MaxHeap<Integer> iHeap = new MaxHeap<Integer>();
		
		//MaxHeap<Object> oHeap = new MaxHeap<Object>();
		MaxHeap<String> sHeap = new MaxHeap<String>();
		
		sHeap.add("a");
		sHeap.add("aAa");
		sHeap.add("aa");
		sHeap.add("aaaaa");
		sHeap.add("aaaaaaaaaaa");
		sHeap.print();
	}

}
