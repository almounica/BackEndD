import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
public class AUniqueResult {
	public static void main(String[] args) {
		   List<Integer> list = new ArrayList<>();
		   Scanner sc = new Scanner(System.in);
		   System.out.println("enter numbers");
		   while(sc.hasNextInt()) {
			   list.add(sc.nextInt());
		   }
	        List<Integer> next= new ArrayList<>();
	        Set<Integer> set = new LinkedHashSet<Integer>();
	        System.out.println("Input");
	        System.out.println(list);
	        int flag=1;
	        int a;
	        set.addAll(list);
	        while(flag>0) {
	        
	        flag=0;
	        for(Integer l:set)
	        {
	            if(Collections.frequency(list, l)==1) {
	             a=l;
	              }
	            else {
	             a=l + Collections.frequency(list, l);
	             flag++;}
	             next.add(a);       
	        }
	        list.clear();
	        list.addAll(next);
	        next.clear();
	        set.clear();
	        set.addAll(list);
	      }
	     System.out.println("Unique Output");
	     System.out.println(list);
	}
}
	  
