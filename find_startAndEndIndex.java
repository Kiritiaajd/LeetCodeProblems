public class find_startAndEndIndex {
    public static void main(String[] args) {

    }

    static int[] searchRange(int arr[], int target) {
        int[] ans = { -1, -1 };
        // check for first Occurance
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                // potential and is found
         //            search(arr, target, false);
     //   }
       // return ans;

    }

    // this fun just return the index value of target
    int search(int arr[], int target, boolean findStartIndex) {
        int ans = -1;
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                // potential and is found
                ans = mid;
                if (findStartIndex) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return ans;
    }
}
