public class ipl2 {

	public static void main(String[] args) {
		int day = 1;
		int month = 5;
		while(month == 5)
		{
			System.out.println("play day :"+ day);
			day += 1;
			if (day>31) {
				month += 1;
			}
		}

	}

}
