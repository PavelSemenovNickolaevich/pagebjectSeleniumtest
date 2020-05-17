import org.junit.*;

public class MainClassTest {

 //   @BeforeClass
 //   public void beforeClassMethod() {
//
 //   }
//
//    @Before
//    public void setUp() {
//
//    }

    @Test
    public void method1() {
        Assert.assertTrue(1 + 1 == 2 ); //проверка что значение тру
        Assert.assertFalse(1 + 1 == 10 ); //проверка что значение фолс

    }

    @Test
    @Ignore // игнорирование теста
    public void method2() {
        Assert.assertNull( 1 ); //проверка что значение будет нул
        Assert.assertNotNull(""); //проверка что значение будет  не нул

    }

    @Test
    public void method3() {
        Assert.assertEquals(10, 5 +5 );//ожидается 10 , текущйий пример
        Assert.assertNotEquals(10, 2+2 );// проверка что не равны


    }

//
//    @After
//    public void tearDown() {
//
//    }
//
//    @AfterClass
//    public void afterClassMethod() {
//
//    }
}
