import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class HashMapFileReadWrite {
	public static<k,v> void method(Map<k,v> input) {
	    //write to file 
		BufferedWriter bf = null;
	    try {
	    	 bf = new BufferedWriter(new FileWriter("data.txt",true));
	         for(Entry<k, v> entry : input.entrySet()) {
	            bf.write(entry.getKey() + ":" + entry.getValue());
	            bf.newLine();
	        }
	        bf.flush();
	    } catch(Exception e) {}
	    finally {
	    	try {
	    		bf.close();
	    	}catch(Exception e) {	
	      }
	    }
	}
	    public static void read(File myfile) {
	    //read from file 
	    BufferedReader br=null;
	    try {
	          br=new BufferedReader(new FileReader("data.txt"));           
             String data;
            while((data = br.readLine())!= null)
            {
                System.out.println(data);
            }          
            }
            catch(Exception e)
            {

            }finally {
            	if(br!=null) {
            		try {
            			br.close();
            		}catch(Exception e) {
            			
            		}
            	}
            }
}

	public static void main(String args[]) {
	       // new HashFileReadWrite();
		  Map<String,String> hm=new HashMap<String,String>();
	        hm.put("1","Hello");
	        hm.put("2","Smile");
	        hm.put("3","Bye");
	       Map<Integer,List<String>> details = new HashMap<>();
	        details.put(207,Arrays.asList("mounica","btech","jntuk"));
	        details.put(604,Arrays.asList("ganani","mtech","nitc"));
	       Map<String,List<String>> list= new HashMap<>();
	        list.put("places",Arrays.asList("kakinada","vizag"));
	        list.put("hobbies",Arrays.asList("gardening","dancing"));
	        File myfile =new File("data.txt");
	        method(hm);
	        method(list);
	        method(details);
	        read(myfile);
	}

}






/*public HashFileReadWrite() {
Map<String,String> hm; hm=new HashMap<String,String>();
    hm.put("1","Hello");
    hm.put("2","Smile");
    hm.put("3","Bye");
    Map<String,List<String>> list= new HashMap<>();
    list.put("places",Arrays.asList("kakinada","vizag"));
    list.put("hobbies",Arrays.asList("gardening","dancing"));
    method1(hm,list);
}*/

