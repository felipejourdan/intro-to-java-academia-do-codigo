import java.util.Arrays;

public class anagramChecker {
	public static void main (String[] args) {
		
		if (args.length < 2) {
            System.out.println("Por favor, forneça duas strings para verificar se são anagramas.");
            return;
        }

		String str1 = args[0];
        String str2 = args[1];

		String cleanedStr1 = str1.replaceAll("[^a-zA-Z]", "").toLowerCase();
		String cleanedStr2 = str2.replaceAll("[^a-zA-Z]", "").toLowerCase();

		System.out.println(areAnagram(cleanedStr1, cleanedStr2));
	}

	public static boolean areAnagram(String str1, String str2) {
		
		if(str1.length() != str2.length()){
			return false;
		}

		char[] charArray1 = str1.toCharArray();
        char[] charArray2 = str2.toCharArray();

		Arrays.sort(charArray1);
        Arrays.sort(charArray2);

		return Arrays.equals(charArray1, charArray2);
	}
}	