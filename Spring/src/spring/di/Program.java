package spring.di;

import spring.di.ui.*;

public class Program {

	public static void main(String[] args) {

		/* ���������� �����ϴ� ������� �ڵ带 ����
		Exam exam = new NewlecExam();
		//ExamConsole console = new InlineExamConsole(exam); // DI
		ExamConsole console = new GridExamConsole();
		
		console.setExam(exam); //setter�� ���� injection
		*/
		ApplicationContext context =
				new ClassPathXmlApplicationContext("spring/di/setting.xml");
		
		//ExamConsole console = (ExamConsole) context.getBean("console");
		ExamConsole console = context.getBean(ExamConsole.class);
		console.print();
		
	}

}
