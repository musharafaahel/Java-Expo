//Compute distance light travels using long variables.

class Light {
	public static void main(String args[]){
		int lightspeed;
		long days,seconds,distance;
		//approximate speed of light in miles per second
		lightspeed = 186000;
		days = 1000; //Specify the number of days here
		seconds = days * 24 * 60 * 60; //Convert into seconds
		distance  = lightspeed * seconds; // Compute distance
		
		System.out.print("In "+days);
		System.out.print(" days light will travel about ");
		System.out.println(distance + " miles.");
	}
}