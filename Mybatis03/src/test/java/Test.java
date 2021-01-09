import dao.UserMapper;
import entity.User;
import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;
import utils.MybatisUtils;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 描述:
 * 测试
 *
 * @author Maserhe
 * @create 2021-01-08 12:09
 */
public class Test {

    private static Logger logger = Logger.getLogger(Test.class);

    @org.junit.Test
    public void test1() {

        SqlSession session = MybatisUtils.sqlSession();
        UserMapper mapper = session.getMapper(UserMapper.class);
        List<User> userList = mapper.getUserList();
        for (User i: userList) System.out.println(i);
        logger.info("查询全部信息表");

        // 分页查询
        Map<String, Integer> map = new HashMap<>();
        map.put("startIndex", 1);
        map.put("pageSize", 2);

        List<User> list = mapper.getUserByLimit(map);
        for (User i: list) System.out.println(i);

        // 通过RowBounds
        RowBounds rowBounds = new RowBounds(1, 2);
        List<User> users = session.selectList("dao.UserMapper.getUserByRowBounds", null, rowBounds);
        for (User user : users) {
            System.out.println(user);
        }
        session.close();
    }

    @org.junit.Test
    public void test2() {

        SqlSession session = MybatisUtils.sqlSession();
        UserMapper mapper = session.getMapper(UserMapper.class);
        // 使用注解 可以直接进行执行
        User user = mapper.getUerById(2);
        System.out.println(user);

        // 多个参数执行
        User user1 = mapper.getUserByIdAndName(2,"mmm");
        System.out.println(user1);


        session.close();
    }

}
