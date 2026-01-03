package Workshop;

/**
 * the student class represents a student entity.
 * currently not used in hospital management system 
 * 
 */
public class Student {
	private String name;
	private int age;
	/**
	 * constructor to create a student object.
	 * 
	 * @param name Name of the student
	 * @param age Age of the student
	 */
	public Student(String name, int age) {
		this.name = name;
		this.age = age;
	}

	/**
	 * gets the name of the student
	 * 
	 * @return Student's name
	 */
	public String getName() {
		return name;
	}

	/**
	 * gets the age of the student.
	 * 
	 * @return Student's age
	 */
	public int getAge() {
		return age;
	}
	
	
}
