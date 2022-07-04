package Mounica;
public class Details {
		private String name;
		private int age;
		private double salary;
	  public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age = age;
		}
		public double getSalary() {
			return salary;
		}
		public void setSalary(double salary) {
			this.salary = salary;
		}
	 public Details(String n,int a,double s) {
		 this.name=n;
		 this.age=a;
		 this.salary=s;	 
	 }
	public static void main(String[] args) {
		Details d[]=new Details[4];
		  Details d0= new Details("mouni",21,7777.8);
		  Details d1= new Details("gana",26,7797.5);
		  Details d2= new Details("ram",24,7797);
		  Details d3= new Details("lalli",18,7797);
		  d[0]=d0;
		  d[1]=d1;
		  d[2]=d2;
		  d[3]=d3;
		  for(int i=0;i<d.length-1;i++)
		  {
			  for(int j=i+1;j<d.length;j++)
			  {
				  if(d[i].getAge()>d[j].getAge())
				  {
					  Details temp = d[i];
					  d[i]=d[j];
					  d[j]=temp;
				  }
			  }
		  }
		
		  for(Details emp:d)
		  {
			  System.out.println(emp.getName() + " "+ emp.getAge()+" "+emp.getSalary());
		  }
		
	  }
	}

