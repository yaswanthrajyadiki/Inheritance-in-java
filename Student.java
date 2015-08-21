class Student extends Person {
	String collogeName;
	double gpa;
	int year;
	Student(Person p,String collogeName, double gpa, int year) {
		super(p.firstName, p.lastName, p.gender, p.age);
		this.collogeName = collogeName;
		this.gpa = gpa;
		this.year = year;
		System.out.println("Student");
	}

	public String toString() {
		String s = super.toString() + "Colloge Name: " + this.collogeName + "\n";
		s = s + "Gpa: " + this.gpa + "\n";
		s = s + "Year: " + this.year + "\n";
		return s;
	}

	public Student[] sortStudentNames(Student[] student) {
		for (int i = 0; i < student.length; i++) {
			for (int j = 0; j < student.length; j++) {
				if (student[i].getName().compareTo(student[j].getName()) < 0) {
					Student temp = student[i];
					student[i] = student[j];
					student[j] = temp;
				}
			}
		}
		return student;
	}

	public static void main(String[] args) {
		int size = 4;
		Person[] person = new Person[size];
		person[0] = new Person("Yadiki", "Raj", Person.Gender.M, 21);
		person[1] = new Person("Thatavarthi", "Madhav", Person.Gender.M, 22);
		person[2] = new Person("Vijaygiri", "Venki", Person.Gender.M, 22);
		person[3] = new Person("Thatavarthi", "Arjun", Person.Gender.M, 26);
		Student[] student1 = new Student[size]; 
		student1[0] = new Student(person[0], "SCSVMV", 7.72, 4);
		student1[1] = new Student(person[1], "SCSVMV", 8.24, 4);
		student1[2] = new Student(person[2], "SVSC", 8.82, 4);
		student1[3] = new Student(person[3], "SVU", 8.86, 4);
		Student[] sortStudents = new Student[3];
		sortStudents = student1[0].sortStudentNames(student1);
		for (int i = 0; i < sortStudents.length; i++) {
			System.out.println(sortStudents[i]);
		}
		// Employee employee = new Employee(person[0],"SoftwareDeveloper", 20000);
		// GradStudent gradstudent = new GradStudent(person[1],student1[1], "CSE", "Java");
		// System.out.println(gradstudent);
		// System.out.println( person[0].reducedFare(person[0].age));
	}

}