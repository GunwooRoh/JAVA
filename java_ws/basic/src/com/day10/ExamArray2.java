package com.day10;

public class ExamArray2 {

	public static void main(String[] args) {
		//
		String[] season = new String[4];
		season[0] = "봄";
		season[1] = "여름";
		season[2] = "가을";
		season[3] = "겨울";

		for(int i = 0; i<season.length; i++) {
			System.out.println("season[" + i + "] = " + season[i]);
		}

		System.out.println();

		//확장 for문
		int index = 0;
		for(String a : season) {
			System.out.println("season[" + index++ + "] = " + a);
		}
		System.out.println();
		
		//
		double[][] dArr = new double[3][2];
		dArr[0][0] = 10.1;
		dArr[0][1] = 10.2;
		dArr[1][0] = 10.3;
		dArr[1][1] = 10.4;
		dArr[2][0] = 10.5;
		dArr[2][1] = 10.6;

		for(int i = 0; i<dArr.length; i++) { //3
			for(int j = 0; j<dArr[i].length; j++) { //2
				System.out.println("dArr[" + i + "][" + j + "]=" + dArr[i][j] );
			}
		}
		System.out.println();
		
		//
		double[][] twoArr=new double[3][2];

		int n=0;
		for (int i=0;i<twoArr.length ;i++ )	{
			for (int j=0;j<twoArr[i].length ;j++ ){
				twoArr[i][j]=10+(++n/10.0);
			}
		}//for

		for (int i=0;i<twoArr.length ;i++ )	{
			for (int j=0;j<twoArr[i].length ;j++ ){
				System.out.println("twoArr["+i+"]["+j+"]="+twoArr[i][j]);
			}
		}//for
		
		//
		int row = twoArr.length;  //행 3
		int col = twoArr[0].length; //열 2
		double[] oneArr = new double[row * col]; //3*2=>6

		for (int i=0;i<row ;i++ ){
			for (int j=0;j<col ;j++ ){
				oneArr[col * i+j] = twoArr[i][j];
				//[column의 크기*row+column] <= [row][column]
			}
		}//for

		System.out.println();
		for (double num: oneArr){
			System.out.print(num  +"\t");
		}
		
	}

}
