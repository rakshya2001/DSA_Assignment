package Week1;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
public class ExpOperatorsTest {

    @Test
    void test1() {
        ExpOperators obj = new ExpOperators(15,new int[]{3,4,3});
        assertEquals(obj.output,"3+4*3 3*4+3 ");

    }
    @Test
    void test2() {
        ExpOperators obj = new ExpOperators(6,new int[]{1,2,3});
        assertEquals(obj.output,"1+2+3 1*2*3 ");

    }
    @Test
    void test3() {
        ExpOperators obj = new ExpOperators(20,new int[]{7,2});
        assertEquals(obj.output,"There cannot be any combination of +,-,* with input array : [7, 2] to reach target : 20");

    }

}
