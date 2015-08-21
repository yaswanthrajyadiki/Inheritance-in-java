class Person {
	protected String firstName;
	protected String lastName;
	static enum Gender {M, F};
	protected Gender gender;
	protected int age;
	Person(String firstName, String lastName, Gender gender, int age) {
		System.out.println("Person");
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
		this.age = age;
	}
	public String toString() {
		String s = "Name: " + this.firstName + " " + this.lastName + "\n";
		s = s + "Gender: " + this.gender + "\n";
		s = s + "Age: " + this.age + "\n";
		return s;
	}
	public String getName() {
		return this.firstName + " " + this.lastName;
	}
	public Gender getGender() {
		return this.gender;
	}
	public int getAge() {
		return this.age;
	}
	public boolean reducedFare(int personAge) {
		if (personAge < 12 || personAge > 64)
			return true;
	return false;
	}
}