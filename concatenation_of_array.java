/*
->Given an integer array nums of length n, you want to create an array ans of length 2n where ans[i] == nums[i] and ans[i + n] == nums[i] for 0 <= i < n (0-indexed).
->Specifically, ans is the concatenation of two nums arrays.
->Return the array ans.
*/
 class concatenation_of_array {
    public int[] getConcatenation(int[] nums) {
        int[] org=new int[2*nums.length];
        for(int i=0;i<org.length;i++){
            org[i]=nums[i%nums.length];
        }
        return org;
    }
    public static void main(String[] args) {
        concatenation_of_array obj = new concatenation_of_array();
        int[] nums = {1,3,2,1};
        int[] ans = obj.getConcatenation(nums);
        for(int i=0;i<ans.length;i++){
            System.out.print(ans[i]+" ");
        }
    }
}


/*
->Example 1:

Input: nums = [1,2,1]
Output: [1,2,1,1,2,1]
Explanation: The array ans is formed as follows:
- ans = [nums[0],nums[1],nums[2],nums[0],nums[1],nums[2]]
- ans = [1,2,1,1,2,1]

->Example 2:

Input: nums = [1,3,2,1]
Output: [1,3,2,1,1,3,2,1]
Explanation: The array ans is formed as follows:
- ans = [nums[0],nums[1],nums[2],nums[3],nums[0],nums[1],nums[2],nums[3]]
- ans = [1,3,2,1,1,3,2,1]
*/