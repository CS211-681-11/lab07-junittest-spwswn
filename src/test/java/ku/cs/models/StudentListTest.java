package ku.cs.models;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class StudentListTest {

    StudentList studentList;
    @BeforeEach
    void init(){
        studentList = new StudentList();
    }

    @Test
    void testAddNewStudent(){
        studentList.addNewStudent("6710400000", "Kimiwa Melody");

    }

}