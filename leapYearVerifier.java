public class leapYearVerifier{
	public static void main(String[] args) {
		int[] years = {2000, 2004, 2008, 2012, 2016, 2020, 2024, 2028, 2032, 2036, 2040, 2044, 2048, 1900, 2100, 2200, 2300, 2400, 2500, 2600, 2700, 2800, 2900, 3000};

		for (int i = 0; i < years.length; i++){
			if ( (years[i] % 4 == 0 && years[i] % 100 != 0) || years[i] % 400 == 0) {
				System.out.println(years[i] + " is a leap year");
			} else {
				System.out.println(years[i] + " is not a leap year");
			}
		}
	}
}