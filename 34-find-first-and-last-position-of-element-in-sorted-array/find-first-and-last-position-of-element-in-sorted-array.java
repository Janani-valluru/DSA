class Solution {
    public int[] searchRange(int[] nums, int target) {
        int n = nums.length;
        int low = 0, high = n - 1;
        int first = -1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (nums[mid] < target) {
                low = mid + 1;
            } else if (nums[mid] > target) {
                high = mid - 1;
            } else {
                // Found the target, update 'first' and continue searching on the left side
                first = mid;
                high = mid - 1;
            }
        }

        int[] result = new int[2];
        result[0] = first;

        // If 'first' is still -1, the target is not present, no need to continue searching
        if (first == -1) {
            result[1] = -1;
            return result;
        }

        // Reset 'low' and 'high' for finding the last occurrence
        low = first + 1;
        high = n - 1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (nums[mid] == target) {
                // Found the target, continue searching on the right side
                first = mid;
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        result[1] = first;
        return result;
    }
}
