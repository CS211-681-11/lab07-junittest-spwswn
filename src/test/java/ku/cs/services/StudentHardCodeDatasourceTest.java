package ku.cs.services;

import ku.cs.models.StudentList;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentHardCodeDatasourceTest {

    @Test
    void testReadData(){
        StudentHardCodeDatasource data = new StudentHardCodeDatasource();
        StudentList studentList = data.readData();

    }
}