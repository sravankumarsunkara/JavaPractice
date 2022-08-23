package LettcodeArrays;

public class ValidMountainArray {

	public boolean validMountainArray(int[] arr) {
        if(arr.length<=2) return false;
		
        int i=0, j=arr.length-1;
        
        while(i+1<arr.length && arr[i]<arr[i+1]){
            i++;
        }
        
        while(j-1>=0 && arr[j-1]>arr[j]){
            j--;
        }
        
//        if(i==0 || i==arr.length-1 || j==0 || j==arr.length-1 || i!=j)
//            return false;
        
        return true;   // only when i==j  
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {0,3,2,1};
		ValidMountainArray mount = new ValidMountainArray();
		boolean bol = mount.validMountainArray(arr);
		System.out.println(bol);
	}

}
