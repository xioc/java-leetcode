public int[] sortArray(int[] nums) {
	//插入排序实现
	for (int i = 1; i < nums.length; i++) {
		//第一个数字不需要处理，下标从1开始，取出需要排序的数字
		int tmp = nums[i];
		int j = i;
		while (j > 0 && tmp < nums[j - 1]) {
			nums[j] = nums[j - 1];
			j--;
		}
		if (j != i) {
			nums[j] = tmp;
		}
	}
	return nums;
}

public int[] sortArray3(int[] nums) {
	//选择排序实现
	for (int i = 0; i < nums.length; i++) {
		int index=i;
		int min=nums[i];
		for(int j=i;j<nums.length;j++){
			if(nums[j]<min){
				min=nums[j];
				index=j;
			}
		}
		int tmp=nums[index];
		nums[index]=nums[i];
		nums[i]=tmp;
	}



	return nums;
}