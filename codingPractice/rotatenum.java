package codingPractice;


/*Given an Array of size N and a values K,
around which we need to right rotate the array. How to quickly print the right rotated array?
Input: Array[] = {1, 3, 5, 7, 9}, K = 2.
Output: 7 9 1 3 5

/* k=3;
size=5;
roarr[1]=nums[3]
roarr[2]=nums[4]
roarr[3]=nums[5]

roarr[4]=nums[0]
roarr[5]nums[1]
    */

 **/
class Solution {
    public void rotate(int[] nums, int k) {
        
         
    int size = nums.length;
        k = k % size; // Handle cases where k > size

        int[] roarr = new int[size]; // New array for rotated values

        // Copy last k elements to the beginning of new array
        for (int i = 0; i < k; i++) {
            roarr[i] = nums[size - k + i];
        }

        // Copy the first (size-k) elements after the last k elements
        for (int i = 0; i < size - k; i++) {
            roarr[k + i] = nums[i];
        }

        // Copy back to original array
        System.arraycopy(roarr, 0, nums, 0, size);


        
    }
}
