/*
->You are given a 0-indexed integer array nums of size n.
->Define two arrays leftSum and rightSum where:
->leftSum[i] is the sum of elements to the left of the index i in the array nums. If there is no such element, leftSum[i] = 0.
->rightSum[i] is the sum of elements to the right of the index i in the array nums. If there is no such element, rightSum[i] = 0.
->Return an integer array answer of size n where answer[i] = |leftSum[i] - rightSum[i]|.
*/
 
class left_and_right_sum {
    public int[] leftRightDifference(int[] nums) {
        int n=nums.length;
        int[] left=new int[n];
        int[] right=new int[n];
        int[] org=new int[n];
        left[0]=0;
        right[n-1]=0;
        for(int i=1;i<n;i++){
           left[i]=left[i-1]+nums[i-1];
        }
        for(int i=nums.length-2;i>=0;i--){
            right[i]=right[i+1]+nums[i+1];
        }
        for(int i=0;i<n;i++){
            org[i]=Math.abs(left[i]-right[i]);
        }
        return org;

    }
    public static void main(String[] args) {
        left_and_right_sum obj = new left_and_right_sum();
        int[] nums = {10,4,8,3};
        int[] ans = obj.leftRightDifference(nums);
        for(int i=0;i<ans.length;i++){
            System.out.print(ans[i]+" ");
        }
    }
}

/*
->Example 1:    

Input: nums = [10,4,8,3]
Output: [15,1,11,22]
Explanation: The array leftSum is [0,10,14,22] and the array rightSum is [15,11,3,0].
The array answer is [|0 - 15|,|10 - 11|,|14 - 3|,|22 - 0|] = [15,1,11,22].

->Example 2:

Input: nums = [1]
Output: [0]
Explanation: The array leftSum is [0] and the array rightSum is [0].
The array answer is [|0 - 0|] = [0].
 */