package ku.cs.models;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class StudentListTest {

    @Test
    void testConstructor(){
        StudentList studentList = new StudentList();
        assertEquals(new ArrayList<>(),studentList.getStudents());
    }

    @Test
    void testAddNewStudentWithNoScore(){
        StudentList studentList=new StudentList();
        studentList.addNewStudent("6710405222","Suprawee Sowanna");
        assertEquals("6710405222",studentList.getStudents().get(0).getId());
        assertEquals("Suprawee Sowanna",studentList.getStudents().get(0).getName());
    }

    @Test
    void testAddNewStudentWithScore(){
        StudentList studentList=new StudentList();
        studentList.addNewStudent("6710405222","Suprawee Sowanna",67);
        assertEquals("6710405222",studentList.getStudents().get(0).getId());
        assertEquals("Suprawee Sowanna",studentList.getStudents().get(0).getName());
        assertEquals(67,studentList.getStudents().get(0).getScore());
    }
    StudentList studentList;
    @BeforeEach
    void init(){
        studentList = new StudentList();
        studentList.addNewStudent("6710400000", "Kimiwa Melody",59);
        studentList.addNewStudent("6710400001", "Suki Nanda",60);
        studentList.addNewStudent("6710400002", "Aita Katta",49);
        studentList.addNewStudent("6710400003", "Koi suru",79);
        studentList.addNewStudent("6710400004", "Hoshi Zora",80);
        studentList.addNewStudent("6710400005", "Sayo Nara",90);
        studentList.addNewStudent("6710400006", "First Rabbit",65);
        studentList.addNewStudent("6710400007", "Sho Nichi",70);
        studentList.addNewStudent("6710400008", "Ja Baja",69);
        studentList.addNewStudent("6710400009", "Naju Nana",50);
        studentList.addNewStudent("6710400010", "Color Con",53);
        studentList.addNewStudent("6710400011", "Kimiwa Melody",74);

    }


    @Test
    void testFindStudentById(){
        assertEquals("6710400000",studentList.findStudentById("6710400000").getId());
        assertEquals("Kimiwa Melody",studentList.findStudentById("6710400000").getName());

        assertEquals("6710400001",studentList.findStudentById("6710400001").getId());
        assertEquals("Suki Nanda",studentList.findStudentById("6710400001").getName());
    }

    @Test
    void testFilterByName(){
        StudentList studentList2 = new StudentList();
        studentList2 = studentList.filterByName("Kimiwa Melody");
        assertEquals("6710400000",studentList2.getStudents().get(0).getId());
        assertEquals("Kimiwa Melody",studentList2.getStudents().get(0).getName());

        assertEquals("6710400011",studentList2.getStudents().get(1).getId());
        assertEquals("Kimiwa Melody",studentList2.getStudents().get(1).getName());

    }

    @Test
    void testGiveScoreToId(){
        studentList.giveScoreToId("6710400000", 20);
        studentList.giveScoreToId("6710400003", 10);
        assertEquals(79,studentList.getStudents().get(0).getScore());
        assertEquals(89,studentList.getStudents().get(3).getScore());
    }

    @Test
    void testViewGradeOfId(){
        assertEquals("D",studentList.viewGradeOfId("6710400000"));
        assertEquals("C",studentList.viewGradeOfId("6710400001"));
        assertEquals("F",studentList.viewGradeOfId("6710400002"));
        assertEquals("B",studentList.viewGradeOfId("6710400003"));
        assertEquals("A",studentList.viewGradeOfId("6710400004"));
        assertEquals("A",studentList.viewGradeOfId("6710400005"));
        assertEquals("C",studentList.viewGradeOfId("6710400006"));
        assertEquals("B",studentList.viewGradeOfId("6710400007"));
        assertEquals("C",studentList.viewGradeOfId("6710400008"));
        assertEquals("D",studentList.viewGradeOfId("6710400009"));
        assertEquals("D",studentList.viewGradeOfId("6710400010"));
        assertEquals("B",studentList.viewGradeOfId("6710400011"));
    }

}