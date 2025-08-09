import java.util.*; // ✅ Needed for ArrayList

class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        
        int n = arr2.length;
        int b = arr1.length;
        int[] result = new int[b];
        int k = 0;

        // Step 1: Add elements from arr2 order
        for (int i = 0; i < n; i++) { 
            for (int j = 0; j < b; j++) { 
                if (arr2[i] == arr1[j]) {
                    result[k] = arr1[j];
                    k++;
                }
            }
        }

        // ✅ Store only filled part of result
        ArrayList<Integer> list = new ArrayList<>();
        for (int idx = 0; idx < k; idx++) {
            list.add(result[idx]);
        }

        // ✅ Collect remaining elements
        ArrayList<Integer> remaining = new ArrayList<>();
        for (int j : arr1) {
            if (!list.contains(j)) {
                remaining.add(j);
            }
        }

        // ✅ Sort leftover before adding
        Collections.sort(remaining);

        // ✅ Append leftovers
        list.addAll(remaining);

        // ✅ Convert list to int array
        int[] results = list.stream()
                .mapToInt(Integer::intValue)
                .toArray();

        return results;
    }
}
