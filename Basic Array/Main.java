import java.util.Arrays;

public class Main {
    public static void main(String args[]) {
        int arr[] = { 10, 25, 7, 40, 18 };

        // DATE - 15 August 2026
        // Calling Methods:

        // Finding Average Method
        float avg = avgofallElement(arr);
        System.out.println("Average Element: " + avg);

        // Finding Max Method
        int max = findMax(arr);
        System.out.println("Maximum Element: " + max);

        // Finding Min Method
        int min = findMax(arr);
        System.out.println("Minimum Element: " + min);

        // Sum of all element method
        int sum = sumofallElement(arr);
        System.out.println("Sum of All Element: " + sum);

        // Calculate Even Element Count
        int even = countEvenNumber(arr);
        System.out.println("Total Even number in array: " + even);

        // Calculate Odd Element Count
        int odd = countOddNumber(arr);
        System.out.println("Total Odd number in array: " + odd);

        // Find Largest Element Index
        int largestIndex = findLargestElementIndex(arr);
        System.out.println("Largest Element Index: " + largestIndex);

        // Find Smallest Element Index
        int smallestIndex = findSmallestElementIndex(arr);
        System.out.println("Smallest Element Index: " + smallestIndex);

        // Count Positive Number
        int pos = countPositiveNumber(arr);
        System.out.println("Positive Number: " + pos);

        // Count Negative Number
        int neg = countNegativeNumber(arr);
        System.out.println("Negative Number: " + neg);

        // Find Difference between max and min
        int diff = diffMaxMin(arr);
        System.out.println("Difference between max and min: " + diff);

        // Reverse an Array
        // All test cases passes

        // Find the second largest element
        int secondLargest = findSecondLargest(arr);
        System.out.println("Second Largest Element is: " + secondLargest);

        // Check if Array is sorted
        boolean result = checkArraySorted(arr);
        System.out.println("Check array is sorted: " + result);

        // Reverse an Array in Place
        // All test cases passed

        // Find Last Occurance of an element
        int lastOccur = findLastOccuranceElement(arr, 25);
        System.out.println("Last Occurance Element : " + lastOccur);

        // Find the number of positive and negative number
        // All test cases passed

        // Find Second Smallest Number
        int secondSmallestElement = findSecondSmallestNumber(arr);
        System.out.println("Second Smallest Element: " + secondSmallestElement);

        // -----------------------------------------------------------------------------------
        // -----------------------------------------------------------------------------------

        // DATE - 16 August 2026
        // Calling Methods:

        // Move all zeroes to the end
        // All test cases passed

        // Remove duplicate from a sorted array
        // All test cases passed

        // -----------------------------------------------------------------------------------
        // -----------------------------------------------------------------------------------

        // DATE - 17 August 2026
        // Calling Methods:

        // Find the missing number
        int missnum = findMissingNumber(arr);
        System.out.println("Missing Number: " + missnum);

        // Check if array contains duplicate element
        boolean dupres = containsDuplicate(arr);
        System.out.println("Contain Duplicate: " + dupres);

        // Find the first non-repeating element
        int firstnonrepeat = findFirstNonRepeating(arr);
        System.out.println("First NON-REPEATING Element: " + firstnonrepeat);

        // Find the frequency of each element
        findFreqElement(arr);

        // Find element with maximum frequency
        int maxfreqElement = findMaxFreqElement(arr);
        System.out.println("Maximum Freq Element: " + maxfreqElement);

        // Find element with minimum frequency
        int minfreqElement = findMiniFreqElement(arr);
        System.out.println("Minimum Freq Element: " + minfreqElement);

        // Find the first occurance of an element
        int arr2[] = { 10, 20, 30, 20, 40 };
        int target2 = 20;

        int firstOccuranceIndex = firstOccuranceElement(arr2, target2);
        System.out.println("First Occurance of Element: " + firstOccuranceIndex);

        // Count occurance of given element
        int countOccuranceElement = countOccurrences(arr2, target2);
        System.out.println("Count Occurance Element from Target:  " + countOccuranceElement);

        // Difference between sum of even and odd element
        int diffevenoddSum = differenceEvenOddSum(arr2);
        System.out.println("Difference between even and odd sum: " + diffevenoddSum);

        // Longest Difference Between Two Elements
        int longdiffElement = maxDifference(arr2);
        System.out.println("Longest Difference between two element:  " + longdiffElement);

        // Smallest Difference Between Two Elements
        int smalldiffElement = minDifference(arr2);
        System.out.println("Smallest Difference between two element: " + smalldiffElement);

        // Find largest element index
        int largestElementIndex = findLargestElementIndex2(arr2);
        System.out.println("Find Largest Element Index: " + largestElementIndex);

        // Find Smallest element index
        int smallestElementIndex = findSmallestElementIndex2(arr2);
        System.out.println("Find Smallest Element Index: " + smallestElementIndex);

        // Count elements greater than a given value
        int countGreater = countGreaterThan(arr2, target2);
        System.out.println("Count Greater Than: " + countGreater);

        // Find count of elements greater than average
        int countElementGreatAverage = countGreaterThanAverage(arr2);
        System.out.println("Count Greater Than Average: " + countElementGreatAverage);

        // Find count of elements equal to the average
        int countElementEqualAverage = countEqualAverage(arr2);
        System.out.println("Count Equal To The Average: " + countElementEqualAverage);

        // Find the count of element equal to the first element
        int countEqualToFirst = countEqualToFirst(arr2);
        System.out.println("Count Equal to the first element: " + countEqualToFirst);
    }

    // Calculate Average of All Element
    public static float avgofallElement(int arr[]) {

        // Length of the Array
        int n = arr.length;

        // Step 1: Create two variable sum for calulate and avg for find avg
        int sum = 0;
        float avg = 0;

        // Step 2: Iterating Loop till the length of array
        for (int i = 0; i < n; i++) {

            // Step 3: Add One by One all current element inside sum
            sum += arr[i];
        }

        // Step 4: Calculate Average
        avg = (float) sum / n;

        // Return the value of maximum
        return avg;
    }

    // Calculate Maximum
    public static int findMax(int arr[]) {

        // Length of the Array
        int n = arr.length;

        // Step 1: Hold first index element into one variable
        int max = arr[0];

        // Step 2: Iterating Loop till the length of array
        for (int i = 1; i < n; i++) {

            // Step 3: Checking the condition if max is less than current element of array
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        // Return the value of maximum
        return max;
    }

    // Calculate Minimum
    public static int findMin(int arr[]) {

        // Length of the Array
        int n = arr.length;

        // Step 1: Hold Integer.MAX_VALUE into one variable
        int min = Integer.MAX_VALUE;

        // Step 2: Iterating Loop till the length of array
        for (int i = 0; i < n; i++) {

            // Step 3: Checking the condition if max is less than current element of array
            if (arr[i] < min) {
                min = arr[i];
            }
        }

        // Return the value of maximum
        return min;
    }

    // Calculate Sum of All Element
    public static int sumofallElement(int arr[]) {

        // Length of the Array
        int n = arr.length;

        // Step 1: Hold sum into one variable
        int sum = 0;

        // Step 2: Iterating Loop till the length of array
        for (int i = 0; i < n; i++) {

            // Step 3: Add One by One all current element inside sum
            sum += arr[i];
        }

        // Return the value of maximum
        return sum;
    }

    // Count Even Number in an Array
    public static int countEvenNumber(int arr[]) {
        int evencount = 0;
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 == 0)
                evencount++;
        }

        return evencount;
    }

    // Count Odd Number in an Array
    public static int countOddNumber(int arr[]) {
        int oddCount = 0;
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 != 0)
                oddCount++;
        }

        return oddCount;
    }

    // Find Largest Element Index
    public static int findLargestElementIndex(int arr[]) {
        int n = arr.length;
        int index = 0;
        int max = arr[0];

        for (int i = 1; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
                index = i;
            }
        }

        return index;
    }

    // Find Largest Element Index
    public static int findSmallestElementIndex(int arr[]) {
        int n = arr.length;
        int index = 0;
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            if (arr[i] < min) {
                min = arr[i];
                index = i;
            }
        }

        return index;
    }

    // Count Positive Number
    public static int countPositiveNumber(int arr[]) {
        int n = arr.length;
        int pos = 0;

        for (int i = 0; i < n; i++) {
            if (arr[i] > 0)
                pos++;
        }

        return pos;
    }

    // Count Negative Number
    public static int countNegativeNumber(int arr[]) {
        int n = arr.length;
        int neg = 0;

        for (int i = 0; i < n; i++) {
            if (arr[i] < 0)
                neg++;
        }

        return neg;
    }

    // Find Difference between max and min
    public static int diffMaxMin(int arr[]) {
        int n = arr.length;

        int ans = 0;
        int max = arr[0];
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }

            if (arr[i] < min) {
                min = arr[i];
            }
        }

        ans = Math.abs(max - min);
        return ans;
    }

    // Reverse an array
    public static int[] reverseArray(int arr[]) {
        int n = arr.length;
        int res[] = new int[n];
        int index = 0;

        for (int i = n - 1; i >= 0; i--) {
            res[index++] = arr[i];
        }

        return res;
    }

    // Find Second Largest Element
    public static int findSecondLargest(int arr[]) {
        int n = arr.length;

        int max = Integer.MIN_VALUE;
        int secondmax = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            if (arr[i] > max) {
                secondmax = max;
                max = arr[i];
            } else if (arr[i] > secondmax && arr[i] != max) {
                secondmax = arr[i];
            }
        }

        return secondmax;
    }

    // Check if array is sorted
    public static boolean checkArraySorted(int arr[]) {
        int n = arr.length;

        for (int i = 1; i < n; i++) {
            if (arr[i] < arr[i - 1]) {
                return false;
            }
        }

        return true;
    }

    // Reverse an array without creating second array
    public static int[] reverseArrayInPlace(int arr[]) {
        int n = arr.length;

        int l = 0;
        int r = n - 1;

        while (l < r) {
            int temp = arr[l];
            arr[l] = arr[r];
            arr[r] = temp;

            l++;
            r--;
        }

        return arr;
    }

    // Find Last Occurance of element
    public static int findLastOccuranceElement(int arr[], int target) {
        int n = arr.length;

        for (int i = n - 1; i >= 0; i--) {
            if (arr[i] == target) {
                return i;
            }
        }

        return -1;
    }

    // Find the number of positive and negative number
    public static int[] findPosNeg(int arr[]) {
        int n = arr.length;
        int pos = 0;
        int neg = 0;

        for (int i = 0; i < n; i++) {
            if (arr[i] > 0) {
                pos++;
            } else if (arr[i] < 0) {
                neg++;
            }
        }

        return new int[] { pos, neg };
    }

    // Find Second Smallest Number
    public static int findSecondSmallestNumber(int arr[]) {
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

        return secondmin;
    }

    // Move all zeroes to the end
    public static int[] moveZeroesEnd(int arr[]) {
        int n = arr.length;
        int res[] = new int[n];
        int index = 0;

        for (int i = 0; i < n; i++) {
            if (arr[i] != 0)
                res[index++] = arr[i];
        }

        for (int i = index; i < n; i++) {
            res[index++] = 0;
        }

        return res;
    }

    // Remove duplicate from a sorted array
    public static int[] removeDuplicate(int arr[]) {
        int n = arr.length;

        if (n == 0) {
            return new int[] {};
        }

        int res[] = new int[n];
        int index = 0;

        res[index++] = arr[0];

        for (int i = 1; i < n; i++) {
            if (arr[i] != arr[i - 1]) {
                res[index++] = arr[i];
            }
        }

        return Arrays.copyOf(res, index);
    }

    // Find Missing Number
    public static int findMissingNumber(int arr[]) {
        int n = arr.length;

        if (n == 0) {
            return 1;
        }

        int i = 1;
        int j = 0;

        while (j < n) {
            if (arr[j] != i) {
                return i;
            }
            i++;
            j++;
        }

        return i;
    }

    // Check if array contains duplicate element
    public static boolean containsDuplicate(int arr[]) {
        int n = arr.length;

        boolean isDup = false;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    isDup = true;
                }
            }
        }

        if (isDup) {
            return true;
        }

        return false;
    }

    // Find first non-repeating element
    public static int findFirstNonRepeating(int arr[]) {
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            boolean isDup = true;

            for (int j = 0; j < n; j++) {
                if (i != j && arr[i] == arr[j]) {
                    isDup = false;
                }
            }

            if (isDup) {
                return arr[i];
            }
        }

        return -1;
    }

    // Find the frequency of each element
    public static void findFreqElement(int arr[]) {
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            boolean isVisible = false;
            int count = 1;

            for (int k = 0; k < i; k++) {
                if (arr[i] == arr[k])
                    isVisible = true;
            }

            if (isVisible)
                continue;

            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }
            System.out.print(arr[i] + " -> " + count + " ");
        }
    }

    // Find element with maximum frequency
    public static int findMaxFreqElement(int arr[]) {
        int n = arr.length;

        int maxcount = 0;
        int element = -1;

        for (int i = 0; i < n; i++) {
            int count = 1;
            boolean isVisible = false;

            for (int j = 0; j < i; j++) {
                if (arr[i] == arr[j])
                    isVisible = true;
            }

            if (isVisible)
                continue;

            for (int k = i + 1; k < n; k++) {
                if (arr[i] == arr[k]) {
                    count++;
                }
            }

            if (count > maxcount) {
                maxcount = count;
                element = arr[i];
            }

        }

        return element;
    }

    // Find element with minimum frequency
    public static int findMiniFreqElement(int arr[]) {
        int n = arr.length;

        int minCount = Integer.MAX_VALUE;
        int element = -1;

        for (int i = 0; i < n; i++) {
            int count = 1;
            boolean isVisible = false;

            for (int j = 0; j < i; j++) {
                if (arr[i] == arr[j])
                    isVisible = true;
            }

            if (isVisible)
                continue;

            for (int k = i + 1; k < n; k++) {
                if (arr[i] == arr[k]) {
                    count++;
                }
            }

            if (count < minCount) {
                minCount = count;
                element = arr[i];
            }

        }
        return element;
    }

    // Find first occurance of an element
    public static int firstOccuranceElement(int arr[], int target) {
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            if (arr[i] == target) {
                return i;
            }
        }

        return -1;
    }

    // Count occurance of given element
    public static int countOccurrences(int arr[], int target) {
        int n = arr.length;

        int count = 0;

        for (int i = 0; i < n; i++) {
            if (arr[i] == target)
                count++;
        }

        return count;
    }

    // Difference between sum of even and odd element
    public static int differenceEvenOddSum(int arr[]) {
        int n = arr.length;

        int sumeven = 0;
        int sumodd = 0;

        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 == 0)
                sumeven += arr[i];
            else if (arr[i] % 2 != 0)
                sumodd += arr[i];
        }

        return sumeven - sumodd;
    }

    // Longest Difference between two element
    public static int maxDifference(int arr[]) {
        int n = arr.length;

        int maxdiff = -1;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] < arr[j]) {
                    int diff = arr[j] - arr[i];
                    if (diff > maxdiff) {
                        maxdiff = diff;
                    }
                }
            }
        }

        return maxdiff;
    }

    // Smallest Difference between two element
    public static int minDifference(int arr[]) {
        int n = arr.length;

        if (n < 2)
            return -1;

        int mindiff = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int diff = Math.abs(arr[j] - arr[i]);
                if (diff < mindiff) {
                    mindiff = diff;
                }
            }
        }
        return mindiff;
    }

    // Find Largest Element Index
    public static int findLargestElementIndex2(int arr[]) {
        int n = arr.length;

        if (n < 1)
            return -1;

        int index = 0;

        for (int i = 1; i < n; i++) {
            if (arr[i] > arr[index]) {
                index = i;
            }
        }

        return index;
    }

    // Find Smallest Element Index
    public static int findSmallestElementIndex2(int arr[]) {
        int n = arr.length;

        if (n < 1)
            return -1;

        int index = 0;

        for (int i = 1; i < n; i++) {
            if (arr[i] < arr[index]) {
                index = i;
            }
        }

        return index;
    }

    // Count Elements Greater Than a Given Value
    public static int countGreaterThan(int arr[], int target) {
        int n = arr.length;

        int count = 0;

        for (int i = 0; i < n; i++) {
            if (arr[i] > target) {
                count++;
            }
        }

        return count;
    }

    // Count Elements Smaller Than a Given Value
    public static int countSmallerThan(int arr[], int target) {
        int n = arr.length;

        int count = 0;

        for (int i = 0; i < n; i++) {
            if (arr[i] < target) {
                count++;
            }
        }

        return count;
    }

    // Find count of element greater than average
    public static int countGreaterThanAverage(int arr[]) {
        int n = arr.length;

        if (n < 1)
            return 0;

        int total = 0;

        for (int num : arr)
            total += num;

        double avg = (double) total / n;

        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] > avg) {
                count++;
            }
        }

        return count;
    }

    // Find count of element equal to the average
    public static int countEqualAverage(int arr[]) {
        int n = arr.length;

        if (n < 1)
            return 0;

        int total = 0;

        for (int num : arr)
            total += num;

        double avg = (double) total / n;

        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] == avg) {
                count++;
            }
        }

        return count;

    }

    // Find the count of element equals to the first element
    public static int countEqualToFirst(int arr[]) {
        int n = arr.length;

        if (n < 1)
            return 0;

        int count = 0;

        int target = arr[0];

        for (int i = 0; i < n; i++) {
            if (arr[i] == target)
                count++;
        }

        return count;
    }
}
