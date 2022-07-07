package com.mypackage.service;

import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.Scanner;
class Num
{
	int num;
	public Num(int num) {
		this.num=num;
	}
	public String toString() {
        return  " " +this.num;
        }
}
class Value implements Comparable<Value>
{
	int value;
	public Value(int value)
	{
		this.value=value;
	}
	@Override
	public int compareTo(Value o) {
		if(value<o.value)
            return -1;
        else if(value>o.value)
            return 1;
		return 0;
	}
	
}
class RankValue
{
	int value; int rank;
	public RankValue(int value,int rank) {
		this.value=value;
		this.rank=rank;	
	}
	
}
class Rank 
{
	int rank;
	public Rank(int rank) {
		this.rank=rank;
	}
	public String toString() {
        return  " " +this.rank;
        }
}
public class ArraySortRank {

	public static void main(String[] args) {
		ArrayList<Num> n =new ArrayList<>();
		 PriorityQueue<Value> v =new PriorityQueue<>();
		 ArrayList<RankValue> i = new ArrayList<>();
		 ArrayList<Rank> rank = new ArrayList<>();
		   Scanner sc =new Scanner(System.in);
	        System.out.println("enter numbers");
			while(sc.hasNextInt()) {
				n.add(new Num(sc.nextInt()));
			}
			System.out.println(n);
			for(Num k:n) {
				v.add(new Value(k.num));
			}
	        int r=1;
	        while(!v.isEmpty()) {
	        	 Value j=v.poll();
	        	i.add(new RankValue(j.value,r));
	        	r=r+1;
	        }
	        for(Num a:n) {
	        	for(RankValue b:i) {
	        		if(a.num==b.value) {
	        			rank.add(new Rank(b.rank));
	        		}
	        	}
	        }
	      System.out.println(rank);  
	}

}



