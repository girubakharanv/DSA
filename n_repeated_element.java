/*
->You are given an integer array nums with the following properties:

->nums.length == 2 * n.
->nums contains n + 1 unique values, n of which occur exactly once in the array.
->Exactly one element of nums is repeated n times.
->Return the element that is repeated n times.
*/

import java.util.Arrays;
class n_repeated_element {
public int repeatedNTimes(int[] nums) {
        int repeatative=0;
        Arrays.sort(nums);
        for(int i=1;i<nums.length;i++){
            if(nums[i-1]==nums[i]){
                repeatative=nums[i];
            }
        }
        return repeatative;
    }
    public static void main(String[] args) {
        n_repeated_element obj = new n_repeated_element();
        int[] nums = {5,1,5,2,5,3,5,4};
        int ans = obj.repeatedNTimes(nums);
        System.out.println(ans);
    }
}

 
/*
->Example 1:

Input: nums = [1,2,3,3]
Output: 3

->Example 2:

Input: nums = [2,1,2,5,3,2]
Output: 2

->Example 3:

Input: nums = [5,1,5,2,5,3,5,4]
Output: 5
*/