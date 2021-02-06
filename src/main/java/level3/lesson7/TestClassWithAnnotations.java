package level3.lesson7;

public class TestClassWithAnnotations {

    @BeforeSuite
    public void beforeTest() {
        System.out.println("working beforeTest() with @BeforeSuite annotation");
    }

    @Test(order = 3)
    public void m1() {
        System.out.println("working m1() with @Test annotation");
    }

    @Test(order = 2)
    public void m2() {
        System.out.println("working m2() with @Test annotation");
    }

    @Test(order = 1)
    public void m3() {
        System.out.println("working m3() with @Test annotation");
    }

    @AfterSuite
    public void afterTest() {
        System.out.println("working afterTest() with @afterTest annotation");
    }
}
