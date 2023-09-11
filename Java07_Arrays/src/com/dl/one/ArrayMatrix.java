package com.dl.one;

public class ArrayMatrix {
public static void main(String[] args) {
	//int a[][]= {{1,2,3},{4,5,6},{7,8,9}};
	//for(int i=0;i<a.length;i++) {
		//System.out.println(a[i][0]+" "+a[i][1]+" "+a[i][2]);
	//}
	/* int [][] a= {{1,2,3},{4,5,6},{7,8,9}};
	for(int row=0;row<a.length;row++) {
		for(int col=0;col<a[row].length;col++) {
			System.out.println(a[row]+ "\t");
		}
		System.out.println();
	}*/
	int a[][]= {{1,2,3},{4,5,6},{7,8,9}};
	for(int i=0;i<3;i++){
		for(int j=0;j<3;j++) {
			System.out.println(  a[i][j] +"\t"  );
		}
		System.out.println();
	}
}
}
