
public class BinarySearch {
    public static void main(String[] args) {
        int arr[]=new int[]{10,12,15,16,17,18,19,23,25};//9
        int low=0;
        int high=arr.length-1;
        int key=25;
        boolean b=Bsearch(key,arr,low,high);
        System.out.println(b);
    }
    private static boolean Bsearch(int key, int[] arr,int low, int high) {

        while (low <= high) {
            int mid = (low + high) / 2;//0+8/2=4--
            if (key == arr[mid]) {
                return true;
            } else if (key > arr[mid]) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
          return false;

    }
}
