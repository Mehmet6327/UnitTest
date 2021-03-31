import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class CheckingAccountTest {

    CheckingAccount checkingAccount;
    private static  int count;

    @BeforeAll
    static void beforeAll(){
        count++;
    }

    @BeforeEach
    void setUp() {
        checkingAccount = new CheckingAccount();
        checkingAccount.setInfo(100,123457L,"Mehmet");
    }

    @AfterEach
    void tearDown() {
        System.out.println("count++ = " + count++);
    }
    @AfterAll
    static void afterAll(){
        System.out.println("This executes after any test cases.Count:" + count++);
    }

    @Test
    void deposit() {


        assertEquals(200,checkingAccount.deposit(100));
    }

    @Test
    void withdraw() {



        assertEquals(80,checkingAccount.withdraw(20));


    }


    @Test
    void purchase() {



        assertEquals(-65,checkingAccount.purchase("Shoes",130));
    }
}