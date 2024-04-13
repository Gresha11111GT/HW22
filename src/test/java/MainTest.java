import static org.junit.Assert.*;

public class MainTest {

    @org.junit.Before
    public void setUp() throws Exception {
    }

    @org.junit.After
    public void tearDown() throws Exception {
    }

    @org.junit.Test
    public void task_1() {
        assertEquals(Main.task_1(-1), "Невірно");
        assertEquals(Main.task_1(0), "Вірно");
        assertEquals(Main.task_1(1), "Невірно");
    }

    @org.junit.Test
    public void task_2() {
        assertEquals(Main.task_2(-1), "Невірно");
        assertEquals(Main.task_2(0), "Невірно");
        assertEquals(Main.task_2(1), "Вірно");
    }

    @org.junit.Test
    public void task_3() {
        assertEquals(Main.task_3(-1), "Вірно");
        assertEquals(Main.task_3(0), "Невірно");
        assertEquals(Main.task_3(1), "Невірно");
    }

    @org.junit.Test
    public void task_4() {
        assertEquals(Main.task_4(-1), "Невірно");
        assertEquals(Main.task_4(0), "Вірно");
        assertEquals(Main.task_4(1), "Вірно");
    }

    @org.junit.Test
    public void task_5() {
        assertEquals(Main.task_5(-1), "Вірно");
        assertEquals(Main.task_5(0), "Вірно");
        assertEquals(Main.task_5(1), "Невірно");
    }

    @org.junit.Test
    public void task_6() {
        assertEquals(Main.task_6(-1), "Вірно");
        assertEquals(Main.task_6(0), "Невірно");
        assertEquals(Main.task_6(1), "Вірно");
    }

    @org.junit.Test
    public void task_7() {
        assertEquals(Main.task_7("test"), "Вірно");
        assertEquals(Main.task_7("0"), "Невірно");
    }

    @org.junit.Test
    public void task_8() {
        assertEquals(Main.task_8("1"), "Невірно");
        assertEquals(Main.task_8("0"), "Невірно");
        assertEquals(Main.task_8("1"), "Вірно");
    }

    @org.junit.Test
    public void task_9_1() {
        assertEquals(Main.task_9_1(true), "Вірно");
        assertEquals(Main.task_9_1(false), "Невірно");
    }

    @org.junit.Test
    public void task_9_2() {
        assertEquals(Main.task_9_2(true), "Вірно");
        assertEquals(Main.task_9_2(false), "Невірно");
    }

    @org.junit.Test
    public void task_10_1() {
        assertEquals(Main.task_9_2(true), "Невірно");
        assertEquals(Main.task_9_2(false), "Вірно");
    }

    @org.junit.Test
    public void task_10_2() {
        assertEquals(Main.task_9_2(true), "Невірно");
        assertEquals(Main.task_9_2(false), "Вірно");
    }

    @org.junit.Test
    public void task_11() {
        assertEquals(Main.task_11(0), "Невірно");
        assertEquals(Main.task_11(1), "Вірно");
        assertEquals(Main.task_11(4), "Вірно");
        assertEquals(Main.task_11(5), "Невірно");
    }

    @org.junit.Test
    public void task_12() {
        assertEquals(Main.task_12(0), "Вірно");
        assertEquals(Main.task_12(2), "Вірно");
        assertEquals(Main.task_12(1), "Невірно");
        assertEquals(Main.task_12(-1), "Невірно");
        assertEquals(Main.task_12(3), "Невірно");
    }

    @org.junit.Test
    public void task_13() {
        assertEquals(Main.task_13(1, 4), 5);
        assertEquals(Main.task_13(2, 4), -2);
        assertEquals(Main.task_13(1, 2), -1);
        assertEquals(Main.task_13(2, 2), 0);
    }

    @org.junit.Test
    public void task_14() {
        assertEquals(Main.task_14(3, 6), "Вірно");
        assertEquals(Main.task_14(1, 20), "Невірно");
        assertEquals(Main.task_14(1, 6), "Невірно");
        assertEquals(Main.task_14(3, 1), "Невірно");
    }

    @org.junit.Test
    public void task_15() {
        assertEquals(Main.task_15(1), "Зима");
        assertEquals(Main.task_15(2), "Весна");
        assertEquals(Main.task_15(3), "Лето");
        assertEquals(Main.task_15(4), "Осінь");
    }
}