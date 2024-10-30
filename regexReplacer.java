public class regexReplacer {
	public static void main(String[] args) {
		char [] letters = args[0].toCharArray();
		char[] vowels = {'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'};

		for (int i = 0; i < letters.length; i++){
			for (int j = 0; j < vowels.length; j++) {
				if (letters[i] == vowels[j]){
					letters[i] = '#';
					continue;
				}
			}
		}

		System.out.println(letters);
	}
}

