import static org.junit.Assert.*;

import org.junit.Test;

import otherclasses.Classroom;

import java.util.ArrayList;
import java.util.logging.Logger;

import org.junit.Test;

import otherclasses.Classroom;
import otherclasses.Student;


public class ClassroomTest {
	public static final Logger LOG = Logger.getLogger(Classroom.class.getName());
	ArrayList<Student> studList= new ArrayList<Student>();
	Classroom cr = new Classroom("", "", studList);
	Student stud1 = new Student("Rafael", "Silva", 31, 'M');
	Student stud2 = new Student("Laxmana", "Thapa", 30, 'F');
			
	@Test
	public void testClassroomName() {
		cr.setClassroomName("Testing");
		LOG.info("Testing for method setClassroomName.");
		assertEquals("Testing", cr.getClassroomName());
	}

	@Test
	public void testClassroomTerm() {
		cr.setClassroomTerm("Höst 2016");
		LOG.info("Testing for method setClassroomTerm.");
		assertEquals("Höst 2016", cr.getClassroomTerm());
	}

	@Test
	public void testAddANewStudent() {
		studList.clear();
		studList.add(stud1);
		cr.addANewStudent(stud1);
		LOG.info("Testing for the method addANewStudent with: " + stud1);
		assertEquals(studList,cr.getStudents());
	}
	
	@Test
	public void testSetGetStudents() {
		studList.clear();
		studList.add(stud1);
		cr.setStudents(studList);
		LOG.info("Testing for the method setGetStudents with: " + stud1);
		assertEquals(studList,cr.getStudents());
	}
	
	@Test
	public void testRemoveAStudent() {
		studList.clear();
		studList.add(stud1);
		studList.add(stud2);
		
		cr.setStudents(studList);
		
		LOG.info("Testing while removing name with the method removeAStudent");
		cr.removeAStudent("Laxmana");
		assertEquals(studList,cr.getStudents());
		
		LOG.info("Testing for removing second student with method removeAStudent");
		cr.removeAStudent("Rafael");
		studList.remove(stud2);
		assertEquals(studList,cr.getStudents());
	}
	
	@Test
	public void testPrintFullRelatory() {
		studList.clear();
		studList.add(stud1);
		studList.add(stud2);
		cr.setClassroomName("Test automation");
		cr.setClassroomTerm("Höst 2016");
		cr.setStudents(studList);
		LOG.info("Testing for the method printFullRelatory.");
		cr.printFullRelatory();
	}

}
