import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class UniqueResult {
	public static void main(String[] args) {
		   List<Integer> list =Arrays.asList(1,1,1,1,2,2,2,3,3,3,3);
	        List<Integer> next= new ArrayList<>();
	        List<Integer> next2= new ArrayList<>();
	        List<Integer> next3= new ArrayList<>();
	        Set<Integer> set = new HashSet<Integer>();
	        Set<Integer> set2 = new HashSet<Integer>();
	        Set<Integer> set3 = new HashSet<Integer>();
	        Set<Integer> set4 = new HashSet<Integer>();
	        System.out.println(list);
	        set.addAll(list);
	        int a;
	        for(Integer l:set)
	        {
	            if(Collections.frequency(list, l)==1) {
	             a=l;}
	            else {
	             a=l + Collections.frequency(list, l);}
	             next.add(a);
	        }
	        System.out.println(next);
	        set2.addAll(next);
	        int b;
	        for(Integer k:set2)
	        {
	            if(Collections.frequency(next, k)==1) {
	             b=k;}
	            else {
	             b=k + Collections.frequency(next, k);}
	             next2.add(b);
	        }
	        System.out.println(next2);
	        set3.addAll(next2);
	        int c;
	        for(Integer i:set3)
	        {
	            if(Collections.frequency(next2, i)==1) {
	             c=i;}
	            else {
	             c=i + Collections.frequency(next2, i);}
	             next3.add(c);
	        }
	        set4.addAll(next3);
	        System.out.println(set4);
	}
}
