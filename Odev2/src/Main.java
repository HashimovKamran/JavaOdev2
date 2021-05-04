
public class Main {

	public static void main(String[] args) {
		Student student = new Student();
		student.setId(0);
		student.setFirstName("Kamran");
		student.setLastName("Hashimov");
		student.setEmail("email@email.com");
		student.setPassword("12345");
		
		StudentManager studentManager = new StudentManager();
		studentManager.add(student);
		
		Instructor instructor = new Instructor();
		instructor.setId(0);
		instructor.setFirstName("Engin");
		instructor.setLastName("Demiroğ");
		instructor.setEmail("email@email.com");
		instructor.setPassword("123456789");
		
		InstructorManager instructorManager = new InstructorManager();
		instructorManager.add(instructor);
		
	}

}
