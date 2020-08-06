package _99_extra;

public class MathTest {

int questionNumber;

    
    
    public static void main(String[] args) {
    	for (int i = 1; i <= 10; i ++) {
		//new MathTest().getAnswer("Math", i);
		System.out.println(new MathTest().getAnswer("Math", i));
    	}
	}
    
    String getAnswer(String subject, int questionNumber) {
    	this.questionNumber = questionNumber;
    	
		
		//System.out.println("Question #" + questionNumber + ": " + answer());
		return "Question #" + questionNumber + ": " + answer();
		}
    

	double answer() {
		// TODO Auto-generated method stub
		if (questionNumber == 1) {
			return 75;
		}
		else if (questionNumber == 2) {
			return 6;
		}
		else if (questionNumber == 3) {
			return 100.75;
		}
		else if (questionNumber == 4) {
			return 13.99;
		}
		else if (questionNumber == 5) {
			return 0;
		}
		else if (questionNumber == 6) {
			return 1239;
		}
		else if (questionNumber == 7) {
			return 0.56;
		}
		else if (questionNumber == 8) {
			return 24;
		}
		else if (questionNumber == 9) {
			return .08;
		}
		else if (questionNumber == 10) {
			return 11;
		}
		return 0;
	
	}
}
