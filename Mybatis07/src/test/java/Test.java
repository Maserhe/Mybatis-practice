import dao.UserMapper;
import entity.User;
import org.apache.ibatis.session.SqlSession;
import utils.MybatisUtils;

/**
 * 描述:
 * 测试查询
 *
 * @author Maserhe
 * @create 2021-01-09 12:12
 */
public class Test {

    @org.junit.Test
    public void Test0() {
        SqlSession session = MybatisUtils.sqlSession();

        UserMapper mapper = session.getMapper(UserMapper.class);
        User userById = mapper.getUserById(1);
        System.out.println(userById);

        System.out.println("------------------");
        mapper.addUser(new User(5,"Maserhe", "321" ));

        User user = mapper.getUserById(1);
        System.out.println(user);
        session.close();
    }
    @org.junit.Test
    public void Test1() {
        SqlSession session0 = MybatisUtils.sqlSession();
        SqlSession session1 = MybatisUtils.sqlSession();

        // 第一个Session进行查询
        UserMapper mapper0 = session0.getMapper(UserMapper.class);
        User userById0 = mapper0.getUserById(1);
        System.out.println(userById0);
        session0.close();

        System.out.println("------------------");

        // 第二个Session进行查询
        UserMapper mapper1 = session1.getMapper(UserMapper.class);
        User userById1 = mapper1.getUserById(1);
        System.out.println(userById1);

        System.out.println("两者是否想等？ ");
        System.out.println( userById0 == userById1);
        session1.close();
    }


}
