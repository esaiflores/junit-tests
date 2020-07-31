import org.junit.Test;

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
}
