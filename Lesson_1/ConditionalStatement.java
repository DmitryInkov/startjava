public class ConditionalStatement {
	public static void main(String[] args) {
		int age = 22;
		if (age > 20) {
			System.out.println("age over 20");
		}

		String sex = "man";
		if (sex == "man") {
			System.out.println("sex - man");
		}
		if (sex != "man") {
			System.out.println("sex - woman");
		}

		double height = 1.8;
		if (height < 1.8) {
			System.out.println("growth less than 1.8");
		} else {
			System.out.println("growth great than or equal to 1.8");
		}

		char firstNameLetter = 'M';
		if (firstNameLetter == 'M') {
			System.out.println("first name letter M");
		} else if (firstNameLetter == 'I') {
			System.out.println("first name letter I");
		} else {
			System.out.println("the first name letter is not M and I");
		}
	}
}
