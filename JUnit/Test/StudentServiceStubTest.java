package io.datajek.springmvc.UnitTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class StudentServiceStubTest {
	@Test
    void testfindTotal() {
        StudentService studentService = new StudentService(new StudentDaoStub());
        int total = studentService.findTotal();
        assertEquals(total, 40);
    }
	
	// creatting stubs as there is no connection to DB or Cloud service during unit testing
	class StudentDaoStub extends StudentDao{
		//@Override
		public int[] getMarks() {
			return new int[]{15, 20, 5};
		}
		
	}
}
