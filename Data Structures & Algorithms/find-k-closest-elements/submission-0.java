class Solution {
  // Method to find the k closest integers to x in the array
  public List<Integer> findClosestElements(int[] arr, int k, int x) {
    // Initialize the left and right pointer
    int left = 0, right = arr.length - k;

    // Search the window
    while (left < right) {
      // Initialize the mid variable
      int mid = (left + right) >> 1;

      // Update the pointers
      if (x - arr[mid] > arr[mid + k] - x) {
        left = mid + 1;
      } else {
        right = mid;
      }
    }

    // Initialize the arraylist for the result
    ArrayList<Integer> result = new ArrayList<>();

    // Fill the array list
    for (int i = left; i < left + k; i++) {
      result.add(arr[i]);
    }

    // Return the result list
    return result;
  }
}
