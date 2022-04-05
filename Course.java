public class Course{
	private String courseName; 
	private String[] students;
	private int numberOfStudents;

	public Course(String courseName){
		this.courseName = courseName;
	} 
	
	public String getCourseName() {return this.courseName;} 
	public void addStudent(String student) {
		this.students[numberOfStudents] = student;
		numberOfStudents++;
	}

	public void dropStudent(String student){
		int index;

		// find where the student is located within the array and set the index
		for (int i = 0; i < numberOfStudents; i++){
			if (this.students[i].equals(student)){
				index = i;
				break;
			}
		}

		// once you have where the student is located, simply shift all the entries in front of it backwards by 1
		// this will just cut out the student from the array
		for (int i = index + 1; i < numberOfStudents; i++){
			this.students[i - 1] = this.students[i];
		}

		this.numberOfStudents--;
	}

	public String[] getStudents(){return this.students;}
	public int getNumberOfStudents(){return this.numberOfStudents;}
}
