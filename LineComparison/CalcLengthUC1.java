public class CalcLengthUC1{

	public double calLength(){

		int x1 = (int)Math.ceil(Math.random()*10);
		int y1 = (int)Math.ceil(Math.random()*10);
		int x2 = (int)Math.ceil(Math.random()*10);
		int y2 = (int)Math.ceil(Math.random()*10);

		System.out.println("The co-ordinates are (" + x1 + "," + y1 + ") and (" + x2 + "," + y2 + ")"); 

		double length  = Math.sqrt( Math.pow(x2-x1,2) +  Math.pow(y2-y1,2) ); 
		return length;
	}
	public static void main(String[] args){

		CalcLengthUC1 obj1 = new CalcLengthUC1();		
		double length =  obj1.calLength();

		System.out.println("The length computed is: " + length);
	}
}