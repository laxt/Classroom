import static org.junit.Assert.*;

import org.junit.Test;

import otherclasses.Person;

public class PersonTest {
	Person p=new Person("Julian","Silva",30,'M');

	@Test
	public void testFirstName() {
		p.setFirstName("Julian");
		assertEquals(p.getFirstName().equals("Julian"),true);
		assertTrue(p.getFirstName().equals("Julian"));
		assertEquals(p.getFirstName(),"Julian");
		
}
	
	@Test
	public void testLastName() {
		p.setLastName("Silva");
		assertEquals(p.getLastName(),"Silva");
		
}


	@Test
	public void testAge() {
		p.setAge(30);
		assertEquals(p.getAge(),30);
		
}

	@Test
	public void testGender() {
		p.setGender('M');
		assertEquals(p.getGender(),'M');
		
}

	
}
