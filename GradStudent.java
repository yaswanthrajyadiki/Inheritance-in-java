class GradStudent extends Student {
	String department;
	String thesisTopic;
	GradStudent(Person p, Student s, String department, String thesisTopic) {
		super(p, s.collogeName, s.gpa, s.year);
		this.department = department;
		this.thesisTopic = thesisTopic;
		System.out.println("GradStudent");
	}
	public String toString() {
		String s = super.toString() + "Department: " + this.department + "\n";
		s = s + this.thesisTopic + "\n";
		return s;
	}
}