package io.datajek.springmvc.UnitTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
//import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class StudentServiceMockTest {
	
	@Mock
	StudentDao studentDaoMock;
	@InjectMocks
	StudentService studentService;
	
	@Test
	void testfindTotal() {
//	    StudentDao studentDaoMock = mock(StudentDao.class);  // using @Mock instead  of this
	    when(studentDaoMock.getMarks()).thenReturn(new int[] {15, 20, 5});
	    
//	    StudentService studentService = new StudentService(studentDaoMock);  //
	    int total = studentService.findTotal();
	    assertEquals(40, total);
	}
	
	@Test
	void testFindTotal_EmptyArray() {
//		StudentDao studentDaoMock = mock(StudentDao.class);   // using @Mock instead  of this
		when(studentDaoMock.getMarks()).thenReturn(new int[] {});
		
//		StudentService studentService = new StudentService(studentDaoMock);   // using @InjectMocks instead of this
		int total = studentService.findTotal();
		assertEquals(0, total);
	}
}
