package techproed.day07_Maven_Junit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class C03_BeforeAfter {


    @Before
    public void setUp() throws Exception {
        System.out.println("*Her test methodu öncesi birkez çalışır*");

    }

    @After
    public void tearDown() throws Exception {
        System.out.println("*Her test methodu sonrası birkez çalışır*");

    }

    @Test
    public void test01() {
        System.out.println("İlk test");

    }

    @Test
    public void test02() {
        System.out.println("İkinci test");



    }
}
