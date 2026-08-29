import java.util.*;

class MainI {

    /*** DATE - 18 August 2026 */
    /*** First 1 - 10 Question */

    // Find Second Max
    public static int findSecondLargest(int arr[]) {
        int n = arr.length;

        int max = arr[0];
        int secondmax = -1;

        for (int i = 1; i < n; i++) {
            if (arr[i] > max) {
                secondmax = max;
                max = arr[i];
            } else if (arr[i] > secondmax && arr[i] != max) {
                secondmax = arr[i];
            }
        }

        return secondmax;
    }

    // Find Second Min
    public static int findSecondSmallest(int arr[]) {
        int n = arr.length;

        int min = Integer.MAX_VALUE;
        int secondmin = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            if (arr[i] < min) {
                secondmin = min;
                min = arr[i];
            } else if (arr[i] < secondmin && arr[i] != min) {
                secondmin = arr[i];
            }
        }

        return secondmin == Integer.MAX_VALUE ? -1 : secondmin;
    }

    // Remove Duplicate Sorted
    public static int[] removeDuplicateSorted(int arr[]) {
        int n = arr.length;

        if (n < 1)
            return new int[] {};

        int res[] = new int[n];
        int index = 0;

        for (int i = 1; i < n; i++) {
            if (arr[i] != arr[i - 1]) {
                res[index++] = arr[i - 1];
            }
        }

        res[index++] = arr[n - 1];

        return Arrays.copyOf(res, index);
    }

    // Check array sorted
    public static boolean isSorted(int arr[]) {
        int n = arr.length;

        for (int i = 1; i < n; i++) {
            if (arr[i] < arr[i - 1]) {
                return false;
            }
        }

        return true;
    }

    // Left Rotate By One
    public static int[] leftRotateByOne(int arr[]) {
        int n = arr.length;

        if (n < 1)
            return new int[] {};

        int temp[] = new int[n];
        int index = 0;

        for (int i = 1; i < n; i++) {
            temp[index++] = arr[i];
        }

        temp[index++] = arr[0];

        return temp;
    }

    // Right Rotate By One
    public static int[] rightRotateByOne(int arr[]) {
        int n = arr.length;

        if (n < 1)
            return new int[] {};

        int temp[] = new int[n];
        int index = 0;

        temp[index++] = arr[n - 1];

        for (int i = 0; i < n - 1; i++) {
            temp[index++] = arr[i];
        }

        return temp;
    }

    // Move All Zeros End
    public static int[] moveZerosToEnd(int arr[]) {
        int n = arr.length;

        if (n < 1)
            return new int[] {};

        int temp[] = new int[n];
        int index = 0;

        for (int i = 0; i < n; i++) {
            if (arr[i] != 0) {
                temp[index++] = arr[i];
            }
        }

        for (int i = index; i < n; i++) {
            temp[index++] = 0;
        }

        return temp;
    }

    // Find Missing
    public static int findMissingNumber(int arr[]) {
        int n = arr.length;

        int i = 1;
        int j = 0;

        while (j < n) {
            if (arr[j] == i) {
                i++;
            }
            j++;
        }

        return i;
    }

    // Duplicate Element
    public static int findDuplicate(int arr[]) {
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    return arr[i];
                }
            }
        }

        return -1;
    }

    // Merge Sorted Array
    public static int[] mergeSortedArrays(int arr1[], int arr2[]) {
        int n = arr1.length;
        int m = arr2.length;

        int res[] = new int[n + m];
        int index = 0;

        for (int i = 0; i < n; i++) {
            res[index++] = arr1[i];
        }

        for (int i = 0; i < m; i++) {
            res[index++] = arr2[i];
        }

        for (int i = 0; i < index; i++) {
            for (int j = i + 1; j < n; j++) {
                if (res[i] > res[j]) {
                    int temp = res[i];
                    res[i] = res[j];
                    res[j] = temp;
                }
            }
        }

        return Arrays.copyOf(res, index);
    }

    /*** DATE - 18 August 2026 */
    /*** Next 11 - 20 Question */

    // Two Sum
    public static int[] twoSum(int arr[], int target) {
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int sum = arr[i] + arr[j];
                if (sum == target) {
                    return new int[] { i, j };
                }
            }
        }

        return new int[] { -1, -1 };
    }

    // Two Sum Using HashMap
    public static int[] twoSumHashMap(int arr[], int target) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            int needed = target - arr[i];

            if (map.containsKey(needed)) {
                return new int[] { map.get(needed), i };
            }

            map.put(arr[i], i);
        }
        return new int[] { -1, -1 };
    }

    // Maximum subarray sum
    public static int maxSubarraySum(int arr[]) {
        int n = arr.length;
        int sum = arr[0];
        int max = arr[0];

        for (int i = 0; i < n; i++) {
            sum = arr[i];
            if (sum > max) {
                max = sum;
            }
            for (int j = i + 1; j < n; j++) {
                sum += arr[j];
                if (sum > max) {
                    max = sum;
                }
            }
        }

        return max;
    }

    // Maximu product subarray
    public static int maxProductSubarray(int arr[]) {
        int n = arr.length;

        int prod = arr[0];
        int max = arr[0];

        for (int i = 0; i < n; i++) {
            prod = arr[i];
            if (prod > max) {
                max = prod;
            }

            for (int j = i + 1; j < n; j++) {
                prod *= arr[j];

                if (prod > max) {
                    max = prod;
                }
            }
        }

        return max;
    }

    // Intersection of Two array
    public static int[] intersection(int arr1[], int arr2[]) {
        int n = arr1.length;
        int m = arr2.length;

        int res[] = new int[n];
        int index = 0;

        for (int i = 0; i < n; i++) {
            boolean isVisible = false;

            for (int k = 0; k < i; k++) {
                if (arr1[i] == arr1[k]) {
                    isVisible = true;
                    break;
                }
            }

            if (isVisible)
                continue;

            for (int j = 0; j < m; j++) {
                if (arr1[i] == arr2[j]) {
                    res[index++] = arr1[i];
                    break;
                }
            }
        }

        return Arrays.copyOf(res, index);
    }

    // Union of Two Array
    public static int[] union(int arr1[], int arr2[]) {
        int n = arr1.length;
        int m = arr2.length;

        int temp[] = new int[n + m];
        int index = 0;

        for (int i = 0; i < n; i++)
            temp[index++] = arr1[i];
        for (int j = 0; j < m; j++)
            temp[index++] = arr2[j];

        int res[] = new int[index];
        int resindex = 0;

        for (int i = 0; i < index; i++) {
            boolean isVisible = false;
            for (int j = 0; j < i; j++) {
                if (temp[i] == temp[j]) {
                    isVisible = true;
                    break;
                }
            }

            if (isVisible)
                continue;

            res[resindex++] = temp[i];
        }

        return Arrays.copyOf(res, resindex);
    }

    // Find Leader in an array
    public static int[] findLeaders(int arr[]) {
        int n = arr.length;

        int res[] = new int[n];
        int index = 0;

        for (int i = 0; i < n; i++) {
            boolean isLeader = true;

            for (int j = i + 1; j < n; j++) {
                if (arr[i] <= arr[j]) {
                    isLeader = false;
                    break;
                }
            }

            if (isLeader) {
                res[index++] = arr[i];
            }
        }

        return Arrays.copyOf(res, index);
    }

    // Find the majority element
    public static int findMajorityElement(int arr[]) {
        int n = arr.length;

        if (n < 1)
            return -1;
        int val = -1;

        for (int i = 0; i < n; i++) {
            boolean isVisible = false;
            int count = 1;
            for (int j = 0; j < i; j++) {
                if (arr[i] == arr[j]) {
                    isVisible = true;
                    break;
                }
            }

            if (isVisible)
                continue;

            for (int k = i + 1; k < n; k++) {
                if (arr[i] == arr[k]) {
                    count++;
                }
            }

            if (count > n / 2) {
                val = arr[i];
            }
        }

        return val;
    }

    // Find First Non-Repeating Element
    public static int findFirstNonRepeating(int arr[]) {
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            boolean isDup = false;
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    isDup = true;
                }
            }

            if (!isDup) {
                return arr[i];
            }
        }

        return -1;
    }

    // Find First Repeating Element
    public static int findFirstRepeat(int arr[]) {
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    return arr[i];
                }
            }
        }

        return -1;
    }

    /*** DATE - 19 August 2026 */
    /*** Next 21 - 30 Question */

    // Find missing and repeat element
    public static int[] findMissingAndRepeating(int arr[]) {
        int n = arr.length;

        int res[] = new int[2];

        int missing = 1;
        int j = 0;

        while (j < n) {
            if (arr[j] == missing)
                missing++;
            j++;
        }

        int repeat = 0;
        for (int i = 1; i < n; i++) {
            if (arr[i] == arr[i - 1]) {
                repeat = arr[i];
                break;
            }
        }

        res[0] = missing;
        res[1] = repeat;

        return res;

    }

    // Rearrange array element by sign
    public static int[] rearrangeElementBySign(int arr[]) {
        int n = arr.length;

        int pos[] = new int[n];
        int posindex = 0;

        int neg[] = new int[n];
        int negindex = 0;

        for (int num : arr) {
            if (num < 0) {
                neg[negindex++] = num;
            } else if (num > 0) {
                pos[posindex++] = num;
            } else {
                pos[posindex++] = num;
            }
        }

        if (negindex == 0) {
            return arr;
        }

        int res[] = new int[n];
        int j = 0;

        for (int i = 0; i < n; i += 2) {
            res[i] = pos[j];
            j++;
        }

        int k = 0;
        for (int i = 1; i < n; i += 2) {
            res[i] = neg[k];
            k++;
        }

        return res;
    }

    // Longest Consequence Sequence
    public static int longestConsequenceSequence(int arr[]) {
        int n = arr.length;
        Arrays.sort(arr);

        if (n == 0)
            return 0;

        int count = 1;
        int max = 0;

        for (int i = 1; i < n; i++) {
            if (arr[i] == (arr[i - 1] + 1)) {
                count++;
            } else {
                if (count > max) {
                    max = count;
                }
                count = 1;
            }
        }
        return max;
    }

    // Rotate array by k position
    public static int[] rotateArrayByKPos(int arr[], int k) {
        int n = arr.length;

        if (n < 1)
            return new int[] {};
        k %= n;

        int res[] = new int[n];
        int index = 0;

        for (int i = n - k; i < n; i++) {
            res[index++] = arr[i];
        }

        for (int i = 0; i < n - k; i++) {
            res[index++] = arr[i];
        }

        return res;
    }

    // Stock Buy and Sell (IMP)
    public static int stockBuySell(int arr[]) {
        int n = arr.length;

        if (n < 2)
            return 0;

        int buy = arr[0];
        int profit = 0;

        for (int i = 1; i < n; i++) {
            if (buy > arr[i])
                buy = arr[i];

            profit = Math.max(profit, arr[i] - buy);
        }

        return profit;
    }

    // Find the equilibrium index (IMP)
    public static int equilibriumIndex(int arr[]) {
        int n = arr.length;

        int total = 0;
        for (int num : arr)
            total += num;

        int left = 0;

        for (int i = 0; i < n; i++) {
            int right = total - left - arr[i];

            if (left == right) {
                return i;
            }

            left += arr[i];
        }

        return -1;
    }

    // Find the Maximum Difference
    public static int maxDiff(int arr[]) {
        int n = arr.length;

        int max = 0;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[j] > arr[i]) {
                    int diff = arr[j] - arr[i];
                    max = Math.max(max, diff);
                }
            }
        }

        return max;
    }

    // Find maximum consecutive ones
    public static int maxConsecutiveOnes(int arr[]) {
        int n = arr.length;

        int count = 0;
        int max = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] == 1) {
                count++;

                if (count > max) {
                    max = count;
                }
            } else {

                count = 0;
            }
        }
        return max;
    }

    // Find Longest Subarray with given sum
    public static int longestSubarraySum(int arr[], int k) {
        int n = arr.length;

        int count = 0;
        int max = 0;

        for (int i = 0; i < n; i++) {
            count = 1;
            int sum = arr[i];

            if (sum == k) {
                return count;
            }

            for (int j = i + 1; j < n; j++) {
                sum += arr[j];
                count++;
                if (sum == k) {
                    max = Math.max(max, count);
                }
            }
        }

        return max;
    }

    // Count subarray with given sum
    public static int countSubarraysWithSum(int arr[], int k) {
        int n = arr.length;

        int count = 0;

        for (int i = 0; i < n; i++) {
            int sum = arr[i];
            if (sum == k) {
                count++;
            }
            for (int j = i + 1; j < n; j++) {
                sum += arr[j];
                if (sum == k) {
                    count++;
                }
            }
        }
        return count;
    }

    /*** DATE - 19 August 2026 */
    /*** Next 31 - 40 Question (MAX QUESTION SKIP BECAUSE SAME) */

    // Check if array is palindrome
    public static boolean isPalindrome(int arr[]) {
        int n = arr.length;
        int left = 0;
        int right = n - 1;

        while (left < right) {
            if (arr[left] != arr[right]) {
                return false;
            }

            left++;
            right--;
        }

        return true;
    }

    // Find Peak Element
    public static int findPeakElement(int arr[]) {
        int n = arr.length;

        if (n < 1)
            return -1;
        if (n == 1)
            return 0;

        // check first
        if (arr[0] > arr[1]) {
            return 0;
        }

        for (int i = 1; i < n - 1; i++) {
            if (arr[i] > arr[i - 1] && arr[i] > arr[i + 1]) {
                return i;
            }
        }

        // check last
        if (arr[n - 1] > arr[n - 2]) {
            return n - 1;
        }

        return -1;
    }

    /*** DATE - 19 & 21 August 2026 */
    /*** Next 41 - 60 Question */

    // Find the Majority Element
    public static int majorityElement(int arr[]) {
        int n = arr.length;

        if (n == 0)
            return -1;
        int candidate = arr[0];
        int count = 1;

        // Find Candidate
        for (int i = 1; i < n; i++) {
            if (arr[i] == candidate) {
                count++;
            } else {
                count--;

                if (count == 0) {
                    candidate = arr[i];
                    count = 1;
                }
            }
        }

        // Verify Candidate
        count = 0;

        for (int num : arr) {
            if (num == candidate)
                count++;
        }

        if (count > n / 2)
            return candidate;

        return -1;
    }

    // Find Maximum Subarray Sum
    public static int maxSubarraySum1(int arr[]) {
        int n = arr.length;

        int sum = 0;
        int maxsum = arr[0];

        for (int i = 0; i < n; i++) {
            sum += arr[i];

            maxsum = Math.max(maxsum, sum);

            if (sum < 0) {
                sum = 0;
            }
        }

        return maxsum;
    }

    // Find the Longest Consecutive Sequence
    public static int longestConsecutive(int arr[]) {
        int n = arr.length;
        if (n == 0)
            return 0;

        Arrays.sort(arr);
        int count = 1;
        int maxcount = 1;

        for (int i = 1; i < n; i++) {
            if (arr[i] == arr[i - 1]) {
                continue;
            }

            if (arr[i] == arr[i - 1] + 1) {
                count++;
            } else {
                count = 1;
            }

            maxcount = Math.max(maxcount, count);
        }
        return maxcount;
    }

    // Find the missing number
    public static int findMissingNum(int arr[]) {
        int n = arr.length;
        Arrays.sort(arr);

        int i = 0;
        int j = 0;
        while (j < n) {
            if (arr[j] == i) {
                i++;
            }
            j++;
        }
        return i;
    }

    // Find the duplicate number
    public static int findDup(int arr[]) {
        int n = arr.length;

        Arrays.sort(arr);
        for (int i = 1; i < n; i++) {
            if (arr[i] == arr[i - 1]) {
                return arr[i];
            }
        }

        return -1;
    }

    // Best Time to buy and sell
    public static int maxProf(int arr[]) {
        int n = arr.length;

        int buy = arr[0];
        int maxProfit = 0;

        for (int i = 0; i < n; i++) {
            if (arr[i] < buy) {
                buy = arr[i];
            }

            maxProfit = Math.max(maxProfit, arr[i] - buy);
        }
        return maxProfit;
    }

    // Intersection of Two array
    public static int[] intersectionTwoArray(int arr1[], int arr2[]) {
        HashSet<Integer> set = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();

        for (int num : arr1)
            set.add(num);

        for (int num : arr2) {
            if (set.contains(num)) {
                set2.add(num);
            }
        }

        int res[] = new int[set2.size()];
        int index = 0;

        for (int num : set2)
            res[index++] = num;

        return res;
    }

    // Union of Two Array
    public static int[] unionTwoArray(int arr1[], int arr2[]) {
        HashSet<Integer> set = new HashSet<>();

        for (int num : arr1)
            set.add(num);

        for (int num : arr2) {
            if (!set.contains(num)) {
                set.add(num);
            }
        }

        int res[] = new int[set.size()];
        int index = 0;

        for (int num : set)
            res[index++] = num;

        return res;
    }

    // first nont repeating
    // find majority element

    // Find Pair with Given Difference
    public static boolean pairWithDifference(int arr[], int k) {
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i != j) {
                    int diff = Math.abs(arr[i] - arr[j]);
                    if (diff == k)
                        return true;
                }
            }
        }

        return false;
    }

    // Find the missing and repeating number
    public static int[] findMissingAndRepeat(int arr[]) {

        HashSet<Integer> set = new HashSet<>();
        Arrays.sort(arr);

        int missing = 1;
        int j = 0;
        while (j < arr.length) {
            if (arr[j] == missing) {
                missing++;
            }
            j++;
        }

        int repeat = 0;
        for (int num : arr) {
            if (set.contains(num)) {
                repeat = num;
            }
            set.add(num);
        }

        return new int[] { missing, repeat };
    }

    // Rearranging array alternately
    public static int[] rearrangeAlternate(int arr[]) {
        int n = arr.length;

        int left = 0;
        int right = n - 1;
        int result[] = new int[n];

        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                result[i] = arr[right];
                right--;
            }

            if (i % 2 != 0) {
                result[i] = arr[left];
                left++;
            }
        }

        return result;
    }

    // Rotate array to the right by k position
    public static void rotateRight(int arr[], int k) {
        int n = arr.length;

        if (n == 0) {
            System.out.println("{}");
            return;
        }

        k %= n;
        int temp[] = new int[n];
        int index = 0;

        for (int i = n - k; i < n; i++) {
            temp[index++] = arr[i];
        }

        for (int i = 0; i < n - k; i++) {
            temp[index++] = arr[i];
        }

        System.out.println(Arrays.toString(temp));
    }

    // Rotate array to the left by k position
    public static void rotateLeft(int arr[], int k) {
        int n = arr.length;

        if (n == 0) {
            System.out.println("{}");
            return;
        }

        k %= n;
        int temp[] = new int[n];
        int index = 0;

        for (int i = k; i < n; i++) {
            temp[index++] = arr[i];
        }

        for (int i = 0; i < k; i++) {
            temp[index++] = arr[i];
        }

        System.out.println(Arrays.toString(temp));
    }

    // Find Equilibrium Index
    public static int equalibriumIndex(int arr[]) {
        int n = arr.length;

        int total = 0;
        for (int num : arr)
            total += num;

        int leftsum = 0;

        for (int i = 0; i < n; i++) {
            int rightsum = total - leftsum - arr[i];

            if (leftsum == rightsum) {
                return i;
            }

            leftsum += arr[i];
        }

        return -1;

    }

    // Subarray with given sum
    public static boolean subarrayWithGivenSum(int arr[], int k) {
        int n = arr.length;

        int sum = 0;

        for (int i = 0; i < n; i++) {
            sum = arr[i];
            if (sum == k) {
                return true;
            }
            for (int j = i + 1; j < n; j++) {
                sum += arr[j];
                if (sum == k) {
                    return true;
                }
            }
        }
        return false;
    }

    /*** DATE - 22 August 2026 */
    /*** Next 61 - 70 Question */

    // Find the Longest Subarray with sum k
    public static int longestSubarraySumk(int arr[], int k) {
        int n = arr.length;
        int maxcount = 0;
        int sum = 0;
        int count = 0;

        // for (int i = 0; i < n; i++) {
        // sum = arr[i];
        // if (sum == k) {
        // maxcount = Math.max(maxcount, count);
        // count = 1;
        // }
        // if (sum > k) {
        // count = 1;
        // }
        // for (int j = i + 1; j < n; j++) {
        // sum += arr[j];
        // count++;
        // if (sum == k) {
        // maxcount = Math.max(maxcount, count);
        // System.out.println(maxcount);
        // count = 1;
        // }
        // if (sum > k) {
        // count = 1;
        // sum = arr[i];
        // }
        // }
        // }

        for (int i = 0; i < n; i++) {
            sum += arr[i];
            count++;

            if (sum == k) {
                maxcount = Math.max(maxcount, count);
                count = 1;
                sum = arr[i];
            }

            if (sum > k) {
                count = 1;
                sum = arr[i];
            }
        }
        return maxcount;
    }

    // Find the first and last position of an element
    public static int[] findFirstLastPosition(int arr[], int target){
        int left = 0;
        int right = arr.length-1;

        int l = -1;
        int r = -1;

        int lv = -1;
        int lr = -1;
        while(left<=right){

            if(arr[left]==target && arr[left]!=lv){
                l = left;
                lv = target;
                System.out.println(l);
            }

            if(arr[right]==target && arr[right]!=lr){
                r = right;
                lr = target;
            }

            left++;
            right--;
        }
        return new int[]{l,r};
    }

    // Binary Search
    public static int binarySearch(int arr[], int target){
        int left = 0;
        int right = arr.length-1;

        while(left<=right){
            int mid = left+(right-left)/2;

            if(arr[mid] == target){
                return mid;
            }

            if(arr[mid]<target) left = mid+1;
            else right = mid-1;
        }
        return -1;
    }

    // Search in a Rotated Sorted Array
    public static int searchRotatedArray(int arr[], int target){
        int left = 0;
        int right = arr.length-1;

        while(left<=right){
            int mid = left + (right-left)/2;

            if(arr[mid] == target){
                return mid;
            }

           // Left half is sorted
        if (arr[left] <= arr[mid]) {

            if (target >= arr[left] && target < arr[mid]) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }

        }
        // Right half is sorted
        else {

            if (target > arr[mid] && target <= arr[right]) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        }

        return -1;
    }

    // Search Insert Position
    public static int searchInsert(int arr[], int target){
        int n = arr.length;

        for(int i=0;i<n;i++){
            if(arr[i]>=target) return i;
        }

        return n;
    }

    // Find Square Root of a Number
    public static int mySqrt(int x){
        if(x==0) return 0;

        int val = 0;

        for(int i=1;i<=x;i++){
            val = i*i;

            if(val == x){
                return i;
            }

            if(val > x){
                return i-1;
            }
        }
        return -1;
    }

    // Find ceiling of a number in a sorted array
    public static int findCeiling(int arr[], int target){
        int n = arr.length;

        for(int i=0;i<n;i++){
            if(arr[i]>=target){
                return i;
            }
        }
        return -1;
    }

    /*** DATE - 23 August 2026 */
    /*** Next 71 - 80 Question */
    
    // Find the minimum in a rotated sorted array
    public static int findMin(int arr[]){
        int n = arr.length;

        if(n==0){
            return -1;
        }
        int min = Integer.MAX_VALUE;
        for(int num:arr){
            min = Math.min(num,min);
        }

        return min;
    }

    // Find the maximum in a rotated sorted array
    public static int findMax(int arr[]){ 
        int n = arr.length; 
 
        if(n==0){ 
            return -1; 
        } 
        int max = Integer.MIN_VALUE; 
        for(int num:arr){ 
            max = Math.max(num,max); 
        } 
 
        return max; 
    }

    // Find the rotation count of a rotated sorted array
    public static int rotationCount(int arr[]){
        int n = arr.length;

        if(n==0) return -1;

        int min = Integer.MAX_VALUE;
        int index = 0;

        for(int i=0;i<n;i++){
           if(arr[i]<min){
            min = arr[i];
            index = i;
           } 
        }
        return index;
    }

    // Find a single element in an array
    public static int singleNumber(int arr[]){
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int num:arr){
            map.put(num,map.getOrDefault(num, 0)+1);
        }

        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            if(entry.getValue()==1){
                return entry.getKey();
            }
        }

        return -1;
    }
    
    // Find the element appearing more than once
    public static int firstDuplicate(int arr[]){
        int n = arr.length;

        //Edge case
        if(n == 0){
            return  -1;
        }

        Arrays.sort(arr);

        for(int i=1;i<n;i++){
            if(arr[i]==arr[i-1]){
                return arr[i];
            }
        }

        return -1;
    }
    
    // Find the first missing positive
    public static int firstMissingPositive(int arr[]){
        Arrays.sort(arr);
        int missing = 1;

        for(int num:arr){
            if(num == missing){
                missing++;
            }
        }

        return missing;
    }
    
    // Find the maximum consecutive ones
    public static int maxConsecutiveOne(int arr[]){
        int n = arr.length;

        int count = 0;
        int max = 0;

        for(int i=0;i<n;i++){
            if(arr[i] == 1){
                count++;
                if(count>max){
                    max = count;
                }
            }
            else count = 0;
        }
        return max;
    }
    
    // 

    public static void main(String args[]) {

        int arr[] = { -5, -2, -10, -1 };
        int target = 10;

        // Find the second largest element in array
        int secondmax = findSecondLargest(arr);
        System.out.println("Second Max: " + secondmax);

        // Find the second smallest element in array
        int secondmin = findSecondSmallest(arr);
        System.out.println("Second Min: " + secondmin);

        // Remove duplicate from sorted array
        // ✅ ALL 6 TEST CASES PASSED

        // Check if array is sorted
        boolean isSort = isSorted(arr);
        System.out.println("Array Sorted: " + isSort);

        // Left Rotate Array By One Position
        // ✅ ALL 5 TEST CASES PASSED

        // Right Rotate Array By One Position
        // ✅ ALL 5 TEST CASES PASSED

        // Move all zeroes to end
        // ✅ ALL 7 TEST CASES PASSED

        // Find the missing number
        int missnum = findMissingNumber(arr);
        System.out.println("Missing Number: " + missnum);

        // Find duplicate element
        int dupele = findDuplicate(arr);
        System.out.println("Duplicate Element: " + dupele);

        // Merge two sorted array
        // ✅ ALL 7 TEST CASES PASSED

        // Two Sum
        // ✅ ALL 6 TEST CASES PASSED

        // Two Sum using HashMap
        // ✅ ALL 6 TEST CASES PASSED

        // Maximum Subarray Sum
        int maxsubsum = maxSubarraySum(arr);
        System.out.println("Maximum SubArray is: " + maxsubsum);

        // Maximum Product Subarray
        int prodsubarray = maxProductSubarray(arr);
        System.out.println("Maximum Product Subarray is: " + prodsubarray);

        // Intersection of Two array
        // ✅ ALL 6 TEST CASES PASSED

        // Union of Two array
        // ✅ ALL 7 TEST CASES PASSED

        // Find leaders in an array
        // ✅ ALL 7 TEST CASES PASSED

        // Find Majority Element
        int majorityelement = findMajorityElement(arr);
        System.out.println("Majority Element: " + majorityelement);

        // Find First Non-Repeating Element
        int firstNonRepeat = findFirstNonRepeating(arr);
        System.out.println("First Non Repeating Element: " + firstNonRepeat);

        // First Repeating Element
        int firstRepeat = findFirstRepeat(arr);
        System.out.println("First Repeating Element: " + firstRepeat);

        /*** FIRST DAY OVER 1 - 20 */
        /*** --------------------- */

        // Missing and Repeating Element
        // ✅ ALL 5 TEST CASES PASSED

        // Rearrange array element by sign
        // ✅ ALL 7 TEST CASES PASSED

        // Longest Consecutive Sequence
        int longestConsecutive = longestConsequenceSequence(arr);
        System.out.println("Longest Consecutive Sequence: " + longestConsecutive);

        // Rotate array by k position
        // ✅ ALL 7 TEST CASES PASSED

        // Stock Buy and Sell
        int stockBuySell = stockBuySell(arr);
        System.out.println("Stock Buy and Sell: " + stockBuySell);

        // Find Equilibrium index
        int equilibriumIndex = equilibriumIndex(arr);
        System.out.println("Equilibrium Index: " + equilibriumIndex);

        // Find Maximum Difference
        int maxDiff = maxDiff(arr);
        System.out.println("Maximum Difference: " + maxDiff);

        // Maximum Consecutive 1s
        int maxConsecutiveOnes = maxConsecutiveOnes(arr);
        System.out.println("Maximum Consecutive Ones: " + maxConsecutiveOnes);

        // Longest Subarray with given sum
        int longestSubarraySum = longestSubarraySum(arr, target);
        System.out.println("Longest Subarray Sum: " + longestSubarraySum);

        // Count subarrays with given sum
        int countSubarraySum = countSubarraysWithSum(arr, target);
        System.out.println("Count Subarary with given sum: " + countSubarraySum);

        // Check if array is palindrome
        boolean isPalindrome = isPalindrome(arr);
        System.out.println("Array Palindrome: " + isPalindrome);

        // Peak Element
        int peakelement = findPeakElement(arr);
        System.out.println("Peak Element: " + peakelement);

        /*** SECOND DAY OVER 21 - 40 */
        /*** --------------------- */

        /*** THIRD DAY OVER 41 - 60 */
        /*** --------------------- */

        // find longest subarray sum of k
        int arra[] = {1,2,2,2,3,4};
        int karra = 2;

        int longestSubarray = longestSubarraySumk(arra, karra);
        System.out.println("Longest Subarray k sum: " + longestSubarray);

        int targetMissMatch = searchInsert(arra, target);
        System.out.println("Search Insert: "+targetMissMatch);

        int firstandFirst[] = findFirstLastPosition(arra, karra);
        System.out.println("First and Last Position: "+firstandFirst[0] + " , " + firstandFirst[1]);

        /*** FOURTH DAY OVER 61 - 70 */
        /*** --------------------- */
    }
}