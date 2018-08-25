
public class PopcornMaker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Popcorn corn = new Popcorn("Butter");
		 Microwave wave = new Microwave();
		 wave.putInMicrowave(corn);
		 wave.setTime(17);
		 wave.startMicrowave();
		 
	}

}
