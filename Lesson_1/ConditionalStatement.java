public class ConditionalStatement {
	public static void main(String[] args) {
	    int age = 22;
	    String sex = "man";
	    double height = 1.82;
	    char firstLetter = 'M';
	    if (age > 20) {
	    	System.out.println("age over 20");
	    }
	    if (sex == "man") {
	    	System.out.println("sex - man");
	    }
	    if (sex != "man") {
	    	System.out.println("sex - woman");
	    }
	    if (height < 1.8) {
	    	System.out.println("growth less than 1.8");
	    }
	    else {
	    	System.out.println("growth great than or equal to 1.8");
	    }
	    if (firstLetter == 'M') {
	    	System.out.println("first letter M");
	    }
	    else if (firstLetter == 'I') {
	    	System.out.println("first letter I");
	    }
	    else {
	    	System.out.println("the first letter is not M and I");
	    }

	}
}
