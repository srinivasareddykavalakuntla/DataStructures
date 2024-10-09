package com.arrays;

public class NQueens {

	public static void main(String[] args) {
		char[][] ch = new char[4][4];
		 
		for(int i=0;i<ch.length;i++) {
			for(int j=0;j<ch.length;j++) {
				
			}
		}
		nQueens(ch,0);
	}

	private static void nQueens(char[][] ch, int row) {
		for(int k=0;k<ch.length;k++) {
			
			if(canInsert(ch,row,k)) {
				ch[row][k]='Q';
				nQueens(ch,row+1);
				ch[row][k]='0';
			}
		}
		
	}

	private static boolean canInsert(char[][] ch, int row, int k) {
		// TODO Auto-generated method stub
		return false;
	}

}
