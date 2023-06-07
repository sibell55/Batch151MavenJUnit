package techproed.day08_Junit;

import org.junit.*;

public class C02_BeforeClassAfterClass {

    /*
      @BeforeClass class'da en once calısan methoddur.1 kez çalışır
      @AfterClass class'da en son calısan methoddur.

      @BeforeClass ve @AfterClass methodları sadece static methodlar ile calısır.
    */

    @BeforeClass
    public static void beforeClass() throws Exception {
        System.out.println("Class'ta en  önce çalışır ");
    }

    @AfterClass
    public static void afterClass() throws Exception {
        System.out.println("Class'ta en son çalışır");
    }

    @Before
    public void setUp() throws Exception {
        System.out.println("Her test methodundan önce çalışır");
    }

    @After
    public void tearDown() throws Exception {
        System.out.println("Her test methodundan sonra çalışır.");
    }

    @Test
    public void test01() {
        System.out.println("hello everbody");
    }

    @Test
    public void test02() {
        System.out.println("hello");
    }
}
