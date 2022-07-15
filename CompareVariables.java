public class CompareVariables {
	public static <H extends Comparable<H>> H highest(H var1,H var2,H var3) {
		H max =var1;
		if(var2.compareTo(max)>0)
			max=var2;
		if(var3.compareTo(max)>0)
			max=var3;
		return max;
	}
	public static void main(String[] args) {
		System.out.println(highest(3,7,3));
        System.out.println(highest("mouni","lalli","ganani"));
        System.out.println(highest(1.1,3.3,0.5));
	}
}
