package ku.cs.models;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class StudentListTest {
    StudentList studentList;

    @Test
    void testAddNewStudentWithNoScore(){
        studentList = new StudentList();
        studentList.addNewStudent("6710400000", "Kimiwa Melody");
        studentList.addNewStudent("6710400001", "Suki Nanda");
        assertEquals("6710400000",studentList.getStudents().get(0).getId());
        assertEquals("Kimiwa Melody",studentList.getStudents().get(0).getName());
        assertEquals(0,studentList.getStudents().get(0).getScore());
        assertEquals("6710400001",studentList.getStudents().get(1).getId());
        assertEquals("Suki Nanda",studentList.getStudents().get(1).getName());
        assertEquals(0,studentList.getStudents().get(1).getScore());
    }

    @Test
    void testAddNewStudentsWithScore(){
        studentList = new StudentList();
        studentList.addNewStudent("6710400000", "Kimiwa Melody",58);
        studentList.addNewStudent("6710400001", "Suki Nanda",67);
        assertEquals("6710400000",studentList.getStudents().get(0).getId());
        assertEquals("Kimiwa Melody",studentList.getStudents().get(0).getName());
        assertEquals(58,studentList.getStudents().get(0).getScore());
        assertEquals("6710400001",studentList.getStudents().get(1).getId());
        assertEquals("Suki Nanda",studentList.getStudents().get(1).getName());
        assertEquals(67,studentList.getStudents().get(1).getScore());
    }

    @BeforeEach
    void init(){
        studentList = new StudentList();
        studentList.addNewStudent("6710400000", "Kimiwa Melody",58);
        studentList.addNewStudent("6710400001", "Suki Nanda",67);
        studentList.addNewStudent("6710400002", "Aita Katta",73);
        studentList.addNewStudent("6710400003", "Koi suru",84);
        studentList.addNewStudent("6710400004", "Hoshi Zora",92);

    }

    @Test
    void testFindStudentById(){
        assertEquals("6710400000",studentList.findStudentById("6710400000").getId());
        assertEquals("Kimiwa Melody",studentList.findStudentById("6710400000").getName());
        assertEquals(58,studentList.findStudentById("6710400000").getScore());
        assertEquals("6710400001",studentList.findStudentById("6710400001").getId());
        assertEquals("Suki Nanda",studentList.findStudentById("6710400001").getName());
        assertEquals(67,studentList.findStudentById("6710400001").getScore());
    }

    @Test
    void testFilterByName(){
        studentList.addNewStudent("6710400002", "Kimiwa Melody", 94);
        StudentList studentList2 = new StudentList();
        studentList2 = studentList.filterByName("Kimiwa Melody");
        assertEquals("6710400000",studentList2.getStudents().get(0).getId());
        assertEquals("Kimiwa Melody",studentList2.getStudents().get(0).getName());
        assertEquals(58,studentList2.getStudents().get(0).getScore());
        assertEquals("6710400002",studentList2.getStudents().get(1).getId());
        assertEquals("Kimiwa Melody",studentList2.getStudents().get(1).getName());
        assertEquals(94,studentList2.getStudents().get(1).getScore());
    }

    @Test
    void testGiveScoreToId(){
        studentList.giveScoreToId("6710400000", 20);
        assertEquals(78,studentList.getStudents().get(0).getScore());
        assertEquals(67,studentList.getStudents().get(1).getScore());
    }

    @Test
    void testViewGradeOfId(){
        assertEquals("D",studentList.viewGradeOfId("6710400000"));
        assertEquals("C",studentList.viewGradeOfId("6710400001"));
    }

}