package com.zoodmall.comman;

public class test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int array[] = new int [] {0,5,8,0,9};
		int temp = 0;
		
		for(int i=0; i<array.length;i++){
		System.out.print(array[i] + " ");
		}
		
		for(int i=0; i<array.length;i++){
			for(int j=i+1; j<array.length;j++)
			{
				if(array[i] >=array[j])
				{
					temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
				
			}
		}

	}

}
