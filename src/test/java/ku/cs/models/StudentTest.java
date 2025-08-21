package ku.cs.models;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {
    Student s;
    @BeforeEach
    void init(){
        s=new Student("6710405222","Suprawee Sowanna");
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
    }



}