public class CellingOfNumber {

    public static void main(String[] args) {
        int arr[] = { 2, 3, 5, 9, 14, 16, 18 };
        int target = 15;
        System.out.println("Celling of " + target + " is " + CellingNumber(arr, target));
        System.out.println("Floor of " + target + " is " + FloorNumber(arr, target));
    }

    static int FloorNumber(int arr[], int target) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                return arr[mid];
            }
        }
        return arr[end];
    }

    static int CellingNumber(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                return arr[mid];
            }
        }
        return arr[start];
    }
}
