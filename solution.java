//https://leetcode.com/problems/find-smallest-letter-greater-than-target/description/

public class solution {
    public static void main(String[] args) {
         char arr[] = {'c', 'f', 'j'};
         System.out.println(Letter(arr, 'c'));
         System.out.println(Letter(arr, 'a'));
    }

    static char Letter(char[] letters, char target) {
        int start = 0;
        int end = letters.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (letters[mid] <= target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }


        return letters[start % letters.length];
    }
}