class Employee extends Person {
	String designation;
	int salary;
	Employee(Person p,String designation, int salary) {
		super(p.firstName, p.lastName, p.gender, p.age);
		this.designation = designation;
		this.salary = salary;
	}
	public String toString() {
		String s = super.toString() + this.designation;
		s = s + this.salary;
		return s;
	}
}