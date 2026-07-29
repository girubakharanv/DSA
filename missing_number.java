/*
->Given an array nums containing n distinct numbers in the range [0, n], return the only number in the range that is missing from the array.
*/
class missing_number {
    static public int missingNumber(int[] nums) {
        int add=0;
        int n=nums.length;
        int actualvalue=n*(n+1)/2;
        for(int i=0;i<nums.length;i++){
            add+=nums[i];
        }
        int ans=actualvalue-add;
        return ans;
    }
    public static void main(String[] args) {
        int[] nums = {3, 0, 1};
        int missingNum = missingNumber(nums);
        System.out.println("Missing number: " + missingNum);
    }
}

/*
Input: nums = [3,0,1]
Output: 2
Explanation:
n = 3 since there are 3 numbers, so all numbers are in the range [0,3]. 2 is the missing number in the range since it does not appear in nums.
*/