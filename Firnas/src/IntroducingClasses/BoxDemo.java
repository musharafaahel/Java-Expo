package IntroducingClasses;

class Box {
	double width,height,depth;
}

public class BoxDemo {
	public static void main(String[] args) {
		Box mybox = new Box();
		mybox.width = 10;
		mybox.height = 20;
		mybox.depth = 15;
		double volume = mybox.width * mybox.height * mybox.depth;
		System.out.println("Volume of Box : "+volume);
	}
}
