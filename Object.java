package Mounica;

public class Object {
	private String name;
	private String batch;
	private String[] subjects = new String[2];
	private String[] timings =new String[2];  
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBatch() {
		return batch;
	}
	public void setBatch(String batch) {
		this.batch = batch;
	}
	public String[] getSubjects() {
		return subjects;
	}
	public void setSubjects(String[] subjects) {
		this.subjects = subjects;
	}
	public String[] getTimings() {
		return timings;
	}
	public void setTimings(String[] timings) {
		this.timings = timings;
	}
	public Object(String n,String b,String s[],String t[]) {
		this.name=n;
		this.batch=b;
		this.subjects=s;
		this.timings=t;
				
	}
	public static void main(String[] args) {
		String subjects1[]= {"react", "angular"};
		String subjects2[]= {"java", "react"};
		String subjects3[]= {"java", "react"};
		String subjects4[]= {"java", "react"};
		String subjects5[]= {"java", "react"};
		String timings1[]= {"9:10", "10:11"};
		String timings2[]= {"9:10", "12:13"};
		String timings3[]= {"9:10", "12:13"};
		String timings4[]= {"9:10", "12:13"};
		String timings5[]= {"9:10", "12:13"};
		Object o[]=new Object[5];
		Object o1= new Object ("rishi", "c5",subjects1,timings1);
		Object o2= new Object ("rishi2", "c6",subjects2,timings2);
		Object o3= new Object ("rishi3", "c6",subjects3,timings3);
		Object o4= new Object ("rishi4", "c6",subjects4,timings4);
		Object o5= new Object ("rishi5", "c6",subjects5,timings5);
	
o[0]=o1;
o[1]=o2;
o[2]=o3;
o[3]=o4;
o[4]=o5;
 {
	for(int i=0;i<5;i++)
	{
		for(int j=1;j<5;j++)
		{
			if(o[i].getSubjects()==o[j].getSubjects())
				System.out.println(o[i].getName());
		}
	}
 }
	}
}
