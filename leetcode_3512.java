/*
You are given an integer array nums and an integer k. You can perform the following operation any number of times:

Select an index i and replace nums[i] with nums[i] - 1.
Return the minimum number of operations required to make the sum of the array divisible by k.

->Example 1:

Input: [3, 9, 7], k = 5
Sum = 19
19 ÷ 5 = 3 remainder 4
Answer: 4
*/

 class leetcode_3512 {
    public int minOperations(int[] nums, int k) {
        int count=0;
        for(int i=0;i<nums.length;i++){
            count+=nums[i];
        }
        return count%k;
    }
    public static void main(String[] args) {
        leetcode_3512 obj = new leetcode_3512();
        int[] nums = {3,9,7};
        int k = 5;
        int ans = obj.minOperations(nums,k);
        System.out.println(ans);
    }
}

/*
->Example 1:

Input: nums = [3,9,7], k = 5
Output: 4
Explanation:
Perform 4 operations on nums[1] = 9. Now, nums = [3, 5, 7].
The sum is 15, which is divisible by 5.

->Example 2:

Input: nums = [4,1,3], k = 4
Output: 0
Explanation:
The sum is 8, which is already divisible by 4. Hence, no operations are needed.

->Example 3:

Input: nums = [3,2], k = 6
Output: 5
Explanation:
Perform 3 operations on nums[0] = 3 and 2 operations on nums[1] = 2. Now, nums = [0, 0].
The sum is 0, which is divisible by 6.
 */