import org.junit.Test;

import static org.junit.Assert.*;


public class StudentTest {
    @Test
    public void testCreateStudent() {
        Student esai = new Student (1L, "esai");
        Student adam = null;
        assertNull (adam);
        assertNotNull(esai);
    }

    @Test
    public void testStudentFields(){
        Student esai = new Student (1L, "esai");
        assertSame(1L, esai.getId());
        assertSame("esai", esai.getName());
        assertSame(0, esai.getGrades().size());
    }


    @Test
    public void testAddGrade(){
        Student esai = new Student(1L, "esai");
        esai.addGrade(100);
        assertSame(100, esai.getGrades().get(0));
        esai.addGrade(80);
        assertSame(80, esai.getGrades().get(1));
    }

    @Test
    public void testAverageGrade(){
        Student esai = new Student(1L, "esai");
        esai.addGrade(100);
        esai.addGrade(80);
        assertEquals(90, esai.getGradeAverage(), 0);
    }



}
