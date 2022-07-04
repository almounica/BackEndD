package Mounica;

import java.util.Arrays;

public class ColSort {

	public static void main(String[] args) {
		  int[][] a={ {7,5,24,1,6},{2,17,9,50,10},{53,21,50,12,2},{17,0,18,6,1}};
		  int[][] temp= new int[5][4];
		  System.out.println("Before Sorting");
		        for (int i = 0; i <a.length ; i++) {
		            for (int j = 0; j < a[i].length; j++) {
		                System.out.print(a[i][j] + " ");
		            }
		            System.out.println();
		        }
		        System.out.println();
		      
		        for(int i=0;i<5;i++)
		        {
		        	for(int j=0;j<4;j++) {
		        		temp[i][j]=a[j][i];
		        		
		        	}
		        }
		        
		        for(int i=0;i<temp.length;i++) {
		        	{
		        		Arrays.sort(temp[i]);
		        	}
		        }
		        System.out.println("After Sorting");
		        for (int i = 0; i < a.length; i++) {
		            for (int j = 0; j < a[i].length; j++) {
		                System.out.print(temp[j][i] + " ");
		            }
		            System.out.println();
		        }
		        System.out.println();
		       }
	}


