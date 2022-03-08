/*
	A program that uses the box class.
	Call this file BoxDemo.java
*/

class Box {
	double width;
	double height;
	double depth;
}

//This class declares an object of type Box

class BoxDemo {
	public static void main(String args[]){
		Box mybox = new Box();
		double vol;

		//assign's values to box instance variables
		mybox.width = 10;
		mybox.height = 20;
		mybox.depth = 15;

		//compute volume of box
		vol = mybox.width * mybox.height * mybox.depth;
		System.out.println("Volume is "+vol);
	}
}