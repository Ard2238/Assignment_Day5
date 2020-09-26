public class CheckEqualityUC2{

	public double calLength(){

		int x1 = (int)Math.ceil(Math.random()*10);
		int y1 = (int)Math.ceil(Math.random()*10);
		int x2 = (int)Math.ceil(Math.random()*10);
		int y2 = (int)Math.ceil(Math.random()*10);

		System.out.println("The co-ordinates are (" + x1 + "," + y1 + ") and (" + x2 + "," + y2 + ")"); 

		double length  = Math.sqrt( Math.pow(x2-x1,2) +  Math.pow(y2-y1,2) ); 
		return length;
	}

	public static void checkEqualOrNot(double l1, double l2){

		String a = Double .toString(l1);
		String b = Double.toString(l2);

		if(a.equals(b)){
			System.out.println("The lines are equal.");
		}else{
			System.out.println("The lines are not equal.");
		}
	}
	public static void main(String[] args){

		CalcLengthUC1 obj1 = new CalcLengthUC1();		
		double length1 =  obj1.calLength();
		
		CalcLengthUC1 obj2 = new CalcLengthUC1();		
		double length2 =  obj2.calLength();

		System.out.println("The lengths are: " + length1 + "  " + length2);

		checkEqualOrNot(length1, length2);
	}
}