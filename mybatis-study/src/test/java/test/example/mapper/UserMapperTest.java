package test.example.mapper;

import org.example.Application;
import org.example.mapper.UserMapper;
import org.example.model.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

//指定为Spring环境中的单元测试
@RunWith(SpringRunner.class)
//指定为SpringBoot环境的单元测试，Application为启动类
@SpringBootTest(classes = Application.class)
//使用事务，在SpringBoot的单元测试中会自动回滚
@Transactional
public class UserMapperTest {
    @Autowired
    private UserMapper userMapper;

    @Test
    public void selectById(){
        User user = userMapper.selectById(1);
        System.out.println(user);
    }

    @Test
    public void selectByCondition(){
        List<User> users = userMapper.selectByCondition(
                "%",2,4);
        System.out.println(users);
    }
    @Test
    public void selectByCondition2(){
        List<User> users = userMapper.selectByCondition2(
                "a%");
        System.out.println(users);
    }
    @Test
    public void selectByCondition3(){
        User user = new User();
        user.setUsername("a%");
        List<User> users = userMapper.selectByCondition3(
                user);
        System.out.println(users);
    }
    @Test
    public void insert() {
        User user = new User();
        user.setUsername("俺老孙到此一游");
        user.setPassword("紧箍咒");
        user.setNickname("弼马温");
        user.setSex(true);
        int n = userMapper.insert(user);
        System.out.println(user);
    }

    @Test
    public void selectAll() {
        List<User> list = userMapper.selectAll();
        list.stream()
                .forEach(System.out::println);
    }
}
