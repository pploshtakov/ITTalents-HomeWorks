
public class StudentGroup {
	String groupSubject;
	Student[] students;
	int freePlaces;

	// конструктор по подразбиране, който създава места за 5 студента в групата
	// (инициализира полето students с нов масив от 5 елемента)
	// и задава стойност 5 на полето freePlaces
	StudentGroup() {
		this.students = new Student[5];
		this.freePlaces = 5;
	}

	// конструктор StudentGroup(String subject) който първо извиква конструктора
	// по подразбиране
	// и задава стойност на полето groupSubject
	StudentGroup(String groupSubject) {
		this();
		this.groupSubject = groupSubject;
	}

	// метод void emptyGroup() който освобождава всички места в ггрупата(задава
	// нов празен масив
	// за полето students) и задава стойност 5 за полето freePlaces.
	void emptyGroup() {
		this.students = new Student[5];
		this.freePlaces = 5;
	}

	// theBestStudent() , връща името на студента с най - висок успех в групата
	String theBestStudent() {
		String theBestStudent = "the best";
		double theBest = 0;
		for (int i = 0; i < students.length; i++) {
			if (this.students[i].grade > theBest || i == 0) {
				theBest = this.students[i].grade;
				theBestStudent = this.students[i].name;
			}
		}
		return theBestStudent;
	}

	// printStudentsInGroup(), изкарва информация(Име, успех,...) за всички
	// студенти в курса
	void printStudentsInGroup() {
		for (int i = 0; i < this.students.length; i++) {
			System.out.print("Student " + (i + 1) + " " + this.students[i].name);
			System.out.println();
			System.out.println("Age " + this.students[i].age);
			System.out.println("Is degree " + this.students[i].isDegree);
			System.out.println("Year in colleg " + this.students[i].yearInColleg);
			System.out.println("Subject " + this.students[i].subject);
			System.out.println("Grade " + this.students[i].grade);
			System.out.println("Money " + this.students[i].money);
		}
	}

	// добавя студент към групата, ако има свободни места и специалността му е
	// като на групата
	// ако групата няма специалност, специалността става като тази на 1-вия
	// добавен студент
	void addStudentInGroup(Student student) {
		if (this.groupSubject == null && this.freePlaces == this.students.length) {
			this.groupSubject = student.subject;
		}
		if (this.freePlaces <= 0) {
			System.out.println("No vacancies in this group.");
		} else if (this.groupSubject.equalsIgnoreCase(student.subject)) {
			this.students[this.students.length - this.freePlaces] = student;
			this.freePlaces -= 1;
		} else {
			System.out.println("This student is another specialty");
		}

	}
	//извиква метод upYear() за всеки студен от групата, ако има нужния успех
	void upYearGroup() {
		for (int i = 0; i < this.students.length; i++) {
			if (students[i].grade > 2) {
				students[i].upYear();
			} else {
				System.out.println(students[i].name + " lacked success to pass in the upper!");
			}
		}
	}
}
