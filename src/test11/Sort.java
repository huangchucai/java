// package test11;
//
// public void insertionSort(int[] nums) {
// 	for (int j = 1; j < length; j++) {
// 		int key = nums[j];
// 		int i = j - 1;
// 		while (i >= 0 && nums[i] > key) {
// 			nums[i + 1] = nums[i];
// 			i--;
// 		}
//
//         nums[i + 1] = key;
// 	}
// }
//
// public void bubbleSort(int[] nums) {
//     int len = nums.length;
//
//     for (int i = 0; i < len; i++) {
//         for (int j = 1; j < (len - i); j++) {
//             if (nums[j - 1] > nums[j]) {
//                 int temp = nums[j - 1];
//                 nums[j - 1] = nums[j];
//                 nums[j] = temp;
//             }
//         }
//     }
// }
//
// public void mergeSort(int[] nums){
//     mergeSort(nums, 0, nums.length-1);
// }
//
// private void mergeSort(int[] nums, int begin, int end) {
//     if (begin < end) {
//         int mid = (begin + end) / 2;
//         mergeSort(nums, begin, mid);
//         mergeSort(nums, mid + 1, end);
//         merge(nums, begin, mid, end);
//     }
// }
//
// private void merge(int[] nums, int start, int mid, int end) {
//     int leftLen = mid - start + 1;
//     int rightLen = end - mid;
//
//     int[] left = new int[leftLen];
//     int[] right = new int[rightLen];
//
//     for (int i = 0; i < leftLen; i++) {
//         left[i] = nums[start + i];
//     }
//
//     for (int j = 0; j < rightLen; j++) {
//         right[i] = nums[mid + 1 + j];
//     }
//
//     int index = start;
//     int i, j = 0;
//     while (i < leftLen && j < rightLen) {
//         if (left[i] <= right[j]) {
//             nums[index++] = left[i++];
//         } else {
//             nums[index++] = rightLen[j++];
//         }
//     }
//
//     while (i < leftLen) {
//         nums[index++] = left[i++];
//     }
//
//     while (j < rightLen) {
//         nums[index++] = right[j++];
//     }
// }
//
// public void mergeSort(int[] nums) {
//     int[] temp = new int[nums.length];
//     mergeSort(nums, 0, nums.length - 1, temp);
// }
//
// private void mergeSort(int[] nums, int start, int end, int[] temp) {
//     if (start >= end) {
//         return;
//     }
//
//     int left = start, right = end;
//     int mid = (start + end) / 2;
//
//     mergeSort(nums, start, mid, temp);
//     mergeSort(nums, mid + 1, end, temp);
//     merge(nums, start, mid, end, temp);
// }
//
// private void merge(int[] nums, int start, int mid, int end, int[] temp) {
//     int left = start;
//     int right = mid + 1;
//     int index = start;
//
//     while (left <= mid && right <= end) {
//         if (nums[left] < nums[right]) {
//             temp[index++] = nums[left++];
//         } else {
//             temp[index++] = nums[right++];
//         }
//     }
//
//     while (left <= mid) {
//         temp[index++] = nums[left++];
//     }
//     while (right <= end) {
//         temp[index++] = nums[right++];
//     }
//
//     for (index = start; index <= end; index++) {
//         nums[index] = temp[index];
//     }
// }
//
// public void quicksort(int[] nums, int begin, int end) {
//     if (begin >= end) {
//         return;
//     }
//     int pivotPostion = partition(nums, begin, end);
//     quicksort(nums, begin, pivotPostion - 1);
//     quicksort(nums, pivotPostion + 1, end);
// }
//
// public int partition(int[] nums, int begin, int end) {
//     int pivot = nums[begin];
//     while (begin < end) {
//         while (begin < end && nums[end] >= pivot) {
//             end--;
//         }
//         nums[begin] = nums[end];
//         while (begin < end && nums[begin] <= pivot) {
//             begin++;
//         }
//         nums[end] = nums[begin];
//     }
//     nums[begin] = pivot;
//     return begin;
// }
//
// public int partition(int[] nums, int begin, int end) {
//     int key = nums[end];
//     int j = begin - 1;
//
//     for (int i = begin; i < end; i++) {
//         if (nums[i] <= key) {
//             j = j + 1;
//             if (i != j) {
//                 swap(nums, i, j);
//             }
//         }
//     }
//     swap(nums, j + 1, end);
//     return j + 1;
// }
//
// public int randomizedPartition(nums, begin, end) {
//     int i = random(begin, end);
//     swap(nums, i, end);
//     return partition(nums, begin, end)
// }
//
//
// public int quickSelect(int start, int end, int k, int[] nums) {
//     if (start == end) {
//         return nums[start];
//     }
//     int index = partition(nums, start, end);
//     int num = index - start + 1;
//     if (k == num) {
//         return nums[index];
//     }
//     else if (num > k) {
//         return quickSelect(start, index - 1, k, nums);
//     }
//     else {
//         return quickSelect(index + 1, end, k - num, nums);
//     }
// }
//
//
//
//
