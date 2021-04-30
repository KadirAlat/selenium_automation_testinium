import org.junit.jupiter.api.Test;

public class GittiGidiyorTest extends BaseTest {


    @Test
    public void test_setLogin(){
        gittigidiyor.setLogin();

    }
    @Test
    public void test_setLoginForm(){
        gittigidiyor.setLoginForm();
        Assertions.assertEquals("kadiralat559@gmail.com",gittigidiyor.getLoginMail(),"mail name Failed");

    }

    @Test
    public void test_setSearch(){

       gittigidiyor.setSearch();
    }

    @Test
    public void test_set_second_page(){
        gittigidiyor.setSecondPage();
    }






}
