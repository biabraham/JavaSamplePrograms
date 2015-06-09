package com.mytest.first;

public class SortIntArray {
	
	public static void bubbleSort(int [] nums){
		
		int temp = 0;
		boolean flag = true;
		for(int p=0;p<nums.length-1;p++){
		//while(flag){
			for (int i=0;i<nums.length-1;i++){
				if (nums[i]<nums[i+1]){
					temp = nums[i];
					nums[i]=nums[i+1];
					nums[i+1]=temp;
					flag = true;
				}
			}
		}
		System.out.println("Sorted Array - ");
		for(int a:nums)
			System.out.print(a+", ");
	}
	
	public static void exchangeSort(int[] nums){
		for(int i=0;i<nums.length-1;i++){
			for(int j=i+1;j<nums.length-1;j++){
				if(nums[i]<nums[j]){
					nums[i] = nums[i]+nums[j];
					nums[j] = nums[i]-nums[j];
					nums[i] = nums[i]-nums[j];
				}
			}
		}
		System.out.println("Sorted Array - ");
		for(int a:nums)
			System.out.print(a+", ");
	}

	public static void main(String[] args) {
		int[] arr = {34,43, 25, 12,78, 89,11};
		bubbleSort(arr);
		exchangeSort(arr);
		// TODO Auto-generated method stub

	}

}
