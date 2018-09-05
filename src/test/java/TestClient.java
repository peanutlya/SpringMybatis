import entity.User;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import service.UserService;

public class TestClient {
    private UserService userService;
    @Before
    public void init(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        userService = (UserService)context.getBean("userService");
    }

    @Test
    public void testAdd2(){
        User user = new User();
        user.setUsername("hhh");
        user.setPassword("hhh");
        boolean i = userService.add(user);
        System.out.println(i+":"+user.toString());
    }

  @Test
  public void test(){
      System.out.println("hello world");
  }


}
