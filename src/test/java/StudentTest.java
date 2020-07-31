import org.junit.Test;

public class StudentTest {
    @Test
    public void testCreateStudent() {
        Student esai = new Student (1L, "esai");
        Student adam = null;
        assertNull (adam);
        assertNotNull(esai);
    }
}
