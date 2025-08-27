package ku.cs.models;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {

    @Test
    void testConstructorWithNoScore(){
        Student s = new Student("6710405222","Suprawee Sowanna");

        assertEquals("6710405222", s.getId());
        assertEquals("Suprawee Sowanna", s.getName());
        assertEquals(0, s.getScore());
    }

    @Test
    void testConstructorWithScore(){
        Student s = new Student("6710405222","Suprawee Sowanna", 67);

        assertEquals("6710405222", s.getId());
        assertEquals("Suprawee Sowanna", s.getName());
        assertEquals(67, s.getScore());
    }



    Student s;
    @BeforeEach
    void init(){
        s=new Student("6710405222","Suprawee Sowanna");
    }

    @Test
    void testChangeName(){
        s.changeName("Sup Sow");
        assertEquals("Sup Sow", s.getName());
    }

    @Test
    @DisplayName("ทดสอบการเพิ่มคะแนน 40.1 คะแนน")
    void testAddScore(){
        s.addScore(40.1);
        assertEquals(40.1, s.getScore());
    }

    @Test
    void totalCalculateGrade(){
        s.addScore(20);
        assertEquals("F", s.grade());
        s.addScore(29);
        assertEquals("F", s.grade());
        s.addScore(1);
        assertEquals("D", s.grade());
        s.addScore(6);
        assertEquals("D", s.grade());
        s.addScore(3);
        assertEquals("D", s.grade());
        s.addScore(1);
        assertEquals("C", s.grade());
        s.addScore(4);
        assertEquals("C", s.grade());
        s.addScore(5);
        assertEquals("C", s.grade());
        s.addScore(1);
        assertEquals("B", s.grade());
        s.addScore(1);
        assertEquals("B", s.grade());
        s.addScore(8);
        assertEquals("B", s.grade());
        s.addScore(1);
        assertEquals("A", s.grade());
        s.addScore(7);
        assertEquals("A", s.grade());
    }

    @Test
    void testIsId(){
        assertEquals(true,s.isId("6710405222"));
    }

    @Test
    void testIsNameContains(){
        assertEquals(true, s.isNameContains("suprawee sowanna"));
    }


}