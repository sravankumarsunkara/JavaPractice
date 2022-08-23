package LettcodeArrays;

public class ReplaceElements {

	
	public int[] replaceElements(int[] arr) {
        // approach is to traverse backward.
        // max is set to -1 first
        int max = -1;
        for(int i=arr.length-1;i>=0;i--) {
            // store the val in temp to compare after replacing with max
            int temp = arr[i];
            arr[i] = max;
            // calculate max for next replacement
            max = Math.max(temp,max);
        }
        return arr;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {2,7,9,2,4};
		ReplaceElements re = new ReplaceElements();
		arr=re.replaceElements(arr);
		for(int ele : arr) {
			System.out.println(ele);	
		}
	}

}
