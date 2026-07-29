class remove_duplicates {
    static public int removeDuplicates(int[] nums) {
        int k=1;
        for(int i=1;i<nums.length;i++){
                if(nums[i]!=nums[i-1]){
                    nums[k]=nums[i];
                    k++;
                }
            }
            return k;
        }
        public static void main(String[] args) {
            int[] nums = {1, 1, 2};
            int newLength = removeDuplicates(nums);
            System.out.println("New length: " + newLength);
            System.out.print("Modified array: ");
            for (int i = 0; i < newLength; i++) {
                System.out.print(nums[i] + " ");
            }
        }        
    }
