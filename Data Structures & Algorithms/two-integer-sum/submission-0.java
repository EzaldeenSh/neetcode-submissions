class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> frequenciesMap = new HashMap();

        for (int index = 0; index < nums.length ; index++) {
            int difference = target - nums[index];
            if (frequenciesMap.containsKey(difference)) {
                return new int[] {frequenciesMap.get(difference), index};
            }

            frequenciesMap.put(nums[index], index);

        }

        return new int[] {};
    }
}
