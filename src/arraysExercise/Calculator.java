package arraysExercise;

public class Calculator {
	double operand1;
	double operand2;
	char operation;

	public Calculator(double operand1, double operand2, char operation) {
		this.operand1 = operand1;
		this.operand2 = operand2;
		this.operation = operation;
	}
	
	public void calculate () {
		double result=0;
		switch(this.operation){
			case '+':
				result = this.operand1 + this.operand2;
				System.out.println("Result is:"+result);
				break;
			case '-':
				result = this.operand1 - this.operand2;
				System.out.println("Result is:"+result);
				break;
			default:
				System.out.println("There is no such operation");
		}
		
	}

	public static void main (String[]args) {
		Calculator c1 = new Calculator(1,2,'-');
		c1.calculate();
	}
}
