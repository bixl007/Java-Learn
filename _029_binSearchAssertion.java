public class _029_binSearchAssertion {

    // Binary search method
    public int binarySearch(int[] sortedArray, int key) {
        // Assert that the array is sorted
        for (int i = 0; i < sortedArray.length - 1; i++) {
            assert sortedArray[i] <= sortedArray[i + 1] : "Array must be sorted";
        }

        // Binary search implementation
        int left = 0;
        int right = sortedArray.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (sortedArray[mid] == key) {
                return mid; // Key found
            } else if (sortedArray[mid] < key) {
                left = mid + 1; // Search in the right half
            } else {
                right = mid - 1; // Search in the left half
            }
        }

        return -1; // Key not found
    }

    // Method to update internal state
    private void updateInternalState() {
        // Update state (dummy implementation for now)
        System.out.println("Updating internal state...");

        // Assert that class invariant is maintained
        assert checkInvariant() : "Class invariant violated";
    }

    // Dummy method to check class invariant
    private boolean checkInvariant() {
        // Example invariant check (always returns true for now)
        return true;
    }

    public static void main(String[] args) {
        _029_binSearchAssertion obj = new _029_binSearchAssertion();

        int[] sortedArray = {1, 3, 5, 7, 9, 11};
        int key = 5;

        // Perform binary search
        int result = obj.binarySearch(sortedArray, key);
        System.out.println("Key found at index: " + result);

        // Update internal state
        obj.updateInternalState();
    }
}