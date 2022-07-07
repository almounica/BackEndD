package com.mypackage.service;

import java.util.ArrayList;

class Values
{
	 int value;

     public Values(int value)
     {
         this.value=value;
     }
     public String toString() {
    	 return " "+this.value;
     }
}
class Ranks
{
	  int rank;

	    public Ranks(int rank)
	    {
	        this.rank=rank;
	    }
	    public String toString() {
	    	 return " "+this.rank;
	     }
}
public class ArraySortRank {

	public static void main(String[] args) {
		ArrayList<Values> v=new ArrayList<>();
        ArrayList<Ranks> r=new ArrayList<>();
        v.add(new Values(10));
        v.add(new Values(15));
        v.add(new Values(16));
        v.add(new Values(8));
        v.add(new Values(9));
        v.add(new Values(2));
        v.add(new Values(3));
        v.add(new Values(6));
        v.add(new Values(1));
System.out.println(v);
       
  int len=v.size();
        while(!v.isEmpty()) 
        while(len>0) 

        {
            for(Values i: v) {
                int rank=1;

                for(Values j:v) {
                    if(i.value>j.value )
                    {
                        rank=rank+1;

                    }    
                }
                r.add(new Ranks(rank));

                len=len-1;

        } 
           System.out.println(r);

        }

    }

}



