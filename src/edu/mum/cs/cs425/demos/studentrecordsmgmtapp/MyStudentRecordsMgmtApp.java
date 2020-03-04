package edu.mum.cs.cs425.demos.studentrecordsmgmtapp;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import edu.mum.cs.cs425.demos.studentrecordsmgmtapp.model.Student;

public class MyStudentRecordsMgmtApp {
	public static void main(String[] args) {

		Student[] students = new Student[5];
		Student s1 = new Student("110001", "Dave", LocalDate.of(1951, 11, 18));
		Student s2 = new Student("110002", "Anna", LocalDate.of(1990, 12, 07));
		Student s3 = new Student("110003", "Erica", LocalDate.of(1974, 1, 31));
		Student s4 = new Student("110004", "Carlos", LocalDate.of(2009, 8, 22));
		Student s5 = new Student("110005", "Bob", LocalDate.of(1990, 3, 05));

		students[0] = s1;
		students[1] = s2;
		students[2] = s3;
		students[3] = s4;
		students[4] = s5;

		Arrays.sort(students, (a, b) -> a.getName().compareTo(b.getName()));
		printListOfStudents(students);
		Arrays.sort(students, (st1, st2) -> {

			return st2.getName().compareTo(st1.getName());
		});
		System.out.println("\n" + "------list of Platinum Alumni Students -------" + "\n"+ "\n" + getListOfPlatinumAlumniStudents(students));
		
		int[] numbers = {1,15,6,25,21,10,35};
		System.out.println("\n" + "------multiple of 5 form an array 1,15,6,25,21,10,35 -------" + "\n" );
		printHelloWorld(numbers);
		
		int[] secondBigest1 = {1,2,3,4,5};
		
		System.out.println("\n" + "------Second Biggest number for the array: 1,2,3,4,5 -------"  );
		System.out.println(findSecondBiggest(secondBigest1));
		
		int[] secondBigest2 = {19,9,11,0,12};
		System.out.println("\n" + "------Second Biggest number for the array: 19,9,11,0,12 -------"  );
		System.out.println(findSecondBiggest(secondBigest2));
	}

	static void printListOfStudents(Student[] students) {
		for (Student s : students) {
			System.out.println(s.toString());
		}
	}

	static List<Student> getListOfPlatinumAlumniStudents(Student[] students) {
		List<Student> platiniumStudents = new ArrayList<>();
		for (Student s : students) {
			if ((LocalDate.now().getYear() - s.getDateOfAdmission().getYear()) > 30) {
				platiniumStudents.add(s);
			}
		}
		return platiniumStudents;
	}	
	
	static void printHelloWorld(int[] numbers) {
		for(int i:numbers) {
			if(i % 5 ==0) {
				System.out.println("hello");
			} if(i % 7 == 0) {
				System.out.println("world");
			}if(i % 5 ==0 && i % 7 == 0) {
				System.out.println("HelloWorld");
			}
		}
	}
	
	static int findSecondBiggest(int[] numbers) {
		if(numbers.length == 0) {
			return 0;
		}
		
		int max = numbers[0];
		int second =0;
		
		for(int i:numbers) {
			if(i>max) {
				second = max;
				max = i;
			}
		}
		
		for(int j:numbers) {
			if(j == max) {
				continue;
			}else if(j > second) {
				second = j;
			}
		}
		
		return second;
	}
}
