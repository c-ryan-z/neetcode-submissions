class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> complements = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int x = nums[i];
            int comp = target - nums[i];

            if(complements.containsKey(comp)) {
                int index = complements.get(comp);
                return new int[] {index, i};
            }
            
            complements.put(x, i);
        }

        return new int[] {-1, -1};

    }
}
