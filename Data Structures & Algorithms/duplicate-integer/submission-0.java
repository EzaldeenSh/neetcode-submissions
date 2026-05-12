class Solution {
    public boolean hasDuplicate(int[] nums) {
        Map<Integer, Integer> frequencies = new HashMap();

        for (int i : nums) {
            frequencies.put(i, frequencies.getOrDefault(i, 0) +1 );
        }
        
        for(Map.Entry<Integer, Integer> entry : frequencies.entrySet()) {
            if (entry.getValue() > 1) {
                return true;
            }
        }
        return false;
        
    }
}