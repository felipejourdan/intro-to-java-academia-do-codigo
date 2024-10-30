public class stringManipulation {
    public static void main (String[] args) {
        String str = new String ("check in on us at: https://codeforall.com");

		//encontrando o início do URL na string
		int domainStart = str.indexOf("//") + "//".length();
        
		//extraindo o URL da string
		String domain = str.substring(domainStart);
		
		//extraindo o nome da string
        String extractedName = domain.substring(0, domain.indexOf("."));
		
		//formatando o nome
		StringBuilder formattedName = new StringBuilder();
		formattedName.append(Character.toUpperCase(extractedName.charAt(0))); //pega o C e coloca em caixa alta
		formattedName.append(extractedName.substring(1,4)); //pega o ode
		formattedName.append(" "); //adiciona o primeiro espaço
		formattedName.append(extractedName.substring(4, 7)); //pega o for
		formattedName.append((" ")); //adiciona o segundo espaço
		formattedName.append(Character.toUpperCase(extractedName.charAt(7))); //pega o A e coloca em caixa alta
		formattedName.append(extractedName.substring(8)); //pega o ll

		//define o nome conforme a nome string criada e formatada
		String Name = formattedName.toString();

		//imprime uma mensagem no terminal
		System.out.println("I am a Learner at " + "<" + Name + "_>" + ", " + domain);

    }
}