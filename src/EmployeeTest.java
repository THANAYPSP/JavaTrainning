import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeTest {
    @Test
    @DisplayName("When create employee by default constructor")
    public void case01(){
        String expectedResult = "Thana : Yok";

        Employee test = new Employee();
        String result = test.getFullName();
        //Assert (Check)
        assertEquals(result,expectedResult);
        //System.out.println(result);

    }

    @Test
    @DisplayName("When create employee by ThanaTest YokTest constructor")
    public void case02(){
        String expectedResult = "ThanaTest : YokTest";

        Employee test = new Employee("ThanaTest","YokTest");
        String result = test.getFullName();
        //Assert (Check)
        assertEquals(result,expectedResult);
        //System.out.println(result);

    }
}