package com.mypackage.service;

import java.util.ArrayList;
import java.util.Scanner;

class Blocks{
	int value;
	public Blocks(int value) {
		this.value=value;
	}
	public String toString() {
        return  " " +this.value;
        }
}
 class Level
 {
	 public int levelvalue(ArrayList<Blocks> b,int cap)
		{
			int filled=0;int level=1;
			while(filled<=cap)
			{
				for(Blocks k:b) {
				if(k.value-level<0) {
					filled++;
				}
			 }
				level++;
			}
			level--;
			return level;
	     }
 }
	


public class WaterLevel {

	public static void main(String[] args) {
		ArrayList<Blocks> b =new ArrayList<>();
		Scanner sc =new Scanner(System.in);
	        System.out.println("enter blocks");
			while(sc.hasNextInt()) {
				b.add(new Blocks(sc.nextInt()));
			}
				System.out.println(b);
				int cap=25;
				Level o =new Level();
				System.out.println("level");
				System.out.println(o.levelvalue(b,cap));
			
			}

	}

