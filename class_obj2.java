
class Computer{
	
	public void playMusic()
	{
		System.out.println("Music is Playing..!!");
	}
	
	public String getMeAPen(int cost)
	{
		if(cost>=5) 
		{
			return "Pen is bought";
		}
		return "Cost is not sufficient";
	}
	
}


public class class_obj2 {

	public static void main(String[] args) {
		
		Computer com = new Computer();
		com.playMusic();
		String buy = com.getMeAPen(14);
		System.out.println("Pen : "+buy);

	}

}
