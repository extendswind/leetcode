package basic;

public class Sort {

    /**
     * 递归形式的快排
     *
     * @param nums
     */
    public void quickSort(int[] nums) {
        quickSort(nums, 0, nums.length - 1);
    }

    // 快排的递归辅助函数
    // end为最后一个数的下标
    private void quickSort(int[] nums, int start, int end) {
        if(start >= end)
            return;
        int pivot = nums[end];
        int i = start;  //
        for (int j = start; j < end; j++) {
            if(nums[j] < pivot){
                swap(nums, i, j);
                i++;
            }
        }
        swap(nums, end, i);
        quickSort(nums, start, i-1);
        quickSort(nums, i+1, end);
    }

    private void swap(int[] nums, int s1, int s2){
        int tmp = nums[s1];
        nums[s1] = nums[s2];
        nums[s2] = tmp;
    }

    public void printNums(int[] nums){
        for(int num : nums){
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void main(String[] argvs){
        int[] nums = {2,3,9,4,3, 2, 1,4,5,6,11,22,13};
        Sort s = new Sort();
        s.quickSort(nums);
        s.printNums(nums);
    }

}