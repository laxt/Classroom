import static org.junit.Assert.*;

import java.util.logging.Logger;

import org.junit.Test;

import otherclasses.Classroom;
import otherclasses.Student;

public class StudentTest {
	public static final Logger LOG = Logger.getLogger(Classroom.class.getName());
	Student stud1 = new Student("Rafael", "Silva", 30, 'M');
	Student stud2 = new Student("Leonardo", "DiCaprio", 41, 'M', 0.0, 0.0, 0.0);

	@Test
	public void testFirstGrade() {
		stud1.setFirstGrade(5.0);
		LOG.info("Testing for the methods setFirstGrade and getFirstGrade.");
		assertEquals(5.0, stud1.getFirstGrade(), 0.5);
	}

	@Test
	public void testSecondGrade() {
		stud1.setSecondGrade(6.0);
		LOG.info("Testing  for the methods setSecondGrade and getSecondGrade.");
		assertEquals(6.0, stud1.getSecondGrade(), 0.5);
	}

	@Test
	public void testThirdGrade() {
		stud1.setThirdGrade(7.0);
		LOG.info("Testing for the methods setThirdName and getThirdName.");
		assertEquals(7.0, stud1.getThirdGrade(), 0.5);
	}

	@Test
	public void testCalculateAverageGradeFirst() {
		stud1.setSecondGrade(6.0);
		stud1.setThirdGrade(7.0);
		LOG.info("Testing for the method calculateAverageFirst.");		
		assertEquals(6.0, stud1.calculateAverage(5.0), 0.5);
	}
	
	@Test
	public void testCalculateAverageGradeEmpty() {
		stud1.setFirstGrade(5.0);
		stud1.setSecondGrade(6.0);
		stud1.setThirdGrade(7.0);
		LOG.info("Testing for the method calculateAverageEmpty.");		
		assertEquals(6.0, stud1.calculateAverage(), 0.5);
	}

	@Test
	public void testCalculateAverageGradeAll() {
		LOG.info("Testing for the method calculateAverageAll.");		
		assertEquals(6.0, stud1.calculateAverage(5.0, 6.0, 7.0), 0.5);
	}
	
	@Test
	public void testToString() {
		stud1.setFirstGrade(7.0);
		stud1.setSecondGrade(8.0);
		stud1.setThirdGrade(9.0);
		
		String str1 = "Student: Rafael Silva\nGrades: 7.0 , 8.0 , 9.0\nFinalGrade: 8.0\nThe student has cleared the course\n-----------------------";
		String str2 = "Student: Leonardo DiCaprio\nGrades: 0.0 , 0.0 , 0.0\nFinalGrade: .0\nThe student has not cleared the course\n-----------------------";
		LOG.info("Testing for the method toString with: " + stud1);		
		assertEquals(str1, stud1.toString());
		LOG.info("Testing for the method toString with: " + stud2);		
		assertEquals(str2, stud2.toString());	
	}
	
	

}
