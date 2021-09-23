package com.learnings.java;

public class ArrayBiggestColumnSmallestRow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] numbers = new int[3][3];
		numbers[0][0] = 12;
		numbers[0][1] = 13;
		numbers[0][2] = 5;
		numbers[1][0] = 6;
		numbers[1][1] = 2;
		numbers[1][2] = 7;
		numbers[2][0] = 9;
		numbers[2][1] = 4;
		numbers[2][2] = 8;
		
/*		12 3 5
		6 2 7
		9 4 8*/

		int smallnum = numbers[0][0];
		int smallcol = 0;
		

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (numbers[i][j] < smallnum) {
					smallnum = numbers[i][j];
					smallcol = j;
					System.out.println(smallcol);
				}
			}
		}
		
		System.out.println("The smallest number in the array is : " + smallnum);
		
		int biggestnum =numbers[1][smallcol];
		
		for(int k =0; k<3; k++)
		{
			if(numbers[k][smallcol]>biggestnum)
			{
				biggestnum=numbers[k][smallcol];
			}
		}
		
		System.out.println("The biggest number in the the same column of the array is : " + biggestnum);
		
	}
}
