class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();

        Arrays.sort(nums);

        do {
            List<Integer> list = new ArrayList<>();

            for (int num : nums) {
                list.add(num);
            }

            result.add(list);

        } while (nextPermutation(nums));

        return result;
    }

    private boolean nextPermutation(int[] nums) {
        int i = nums.length - 2;

        while (i >= 0 && nums[i] >= nums[i + 1]) {
            i--;
        }

        if (i < 0) {
            return false;
        }

        int j = nums.length - 1;

        while (nums[j] <= nums[i]) {
            j--;
        }

        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;

        int left = i + 1;
        int right = nums.length - 1;

        while (left < right) {
            temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;

            left++;
            right--;
        }

        return true;
    }
}
    
