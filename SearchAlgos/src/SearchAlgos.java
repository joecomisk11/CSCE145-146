
public class SearchAlgos {

	public static void main(String[] args) 
	{
		int[]array = {5,6,7,8,9,10,11,12};
		System.out.println(binarySearch(array,11,0,array.length-1));

	}
	public static boolean linearSearch(int[] a, int target)
	{
		for(int i = 0; i<a.length;i++)
		{
			if(a[i] == target)
				return true;
		}
		return false;
			
	}
	public static boolean binarySearch(int[] a,int target, int start, int end)
	{
		if(start > end)
			return false;
		int mid = (start+end)/2;
		if(a[mid] == target)
			return true;
		else if(a[mid] > target)
			return binarySearch(a,target,start,mid-1);
		else return binarySearch(a,target,mid+1,end);
	}

}
