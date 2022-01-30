import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class GradebookTester {

    GradeBook2 GradebookOne;
    GradeBook2 GradebookTwo;


    @BeforeEach
    void setUp() throws Exception{

        GradebookOne = new GradeBook2(3);
        GradebookTwo = new GradeBook2(4);

        GradebookOne.addScore(5);
        GradebookOne.addScore(2);
        GradebookOne.addScore(2.3);

        GradebookTwo.addScore(1);
        GradebookTwo.addScore(7.6);
        GradebookTwo.addScore(4);
        GradebookTwo.addScore(9);
    }

    @AfterEach
    void tearDown() throws Exception{
        GradebookOne = null;
        GradebookTwo = null;
    }

    @Test
    void testAddScore(){

        GradeBook2 g1 = GradebookOne;
        GradeBook2 g2 = GradebookTwo;


        assertEquals(3, g1.getScoresSize(), 0.0001);
        assertEquals(4, g2.getScoresSize(), 0.0001);

        assertTrue(g1.toString().equals("5.0 2.0 2.3 "));
        assertTrue(g2.toString().equals("1.0 7.6 4.0 9.0 "));
    }

    @Test
    void testSum(){

        assertEquals(9.3, GradebookOne.sum(), 0.001);
        assertEquals(21.6, GradebookTwo.sum(), 0.001);

    }

    @Test
    void testMinimum(){
        assertEquals(2.0, GradebookOne.minimum(), 0.0001);
        assertEquals(1.0, GradebookTwo.minimum(), 0.0001);
    }

    @Test
    void testFinalScore(){
        assertEquals(7.3, GradebookOne.finalScore(), 0.0001);
        assertEquals(20.6, GradebookTwo.finalScore(), 0.0001);
    }
}
