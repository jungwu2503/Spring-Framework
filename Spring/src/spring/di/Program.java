package spring.di;

import spring.di.ui.*;

public class Program {

	public static void main(String[] args) {

		/* 스프링에게 지시하는 방법으로 코드를 변경
		Exam exam = new NewlecExam();
		//ExamConsole console = new InlineExamConsole(exam); // DI
		ExamConsole console = new GridExamConsole();
		
		console.setExam(exam); //setter를 통해 injection
		*/
		ApplicationContext context =
				new ClassPathXmlApplicationContext("spring/di/setting.xml");
		
		//ExamConsole console = (ExamConsole) context.getBean("console");
		ExamConsole console = context.getBean(ExamConsole.class);
		console.print();
		
	}

}
