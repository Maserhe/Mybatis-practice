import dao.UserMapper;
import entity.User;
import org.apache.ibatis.session.SqlSession;
import utils.MybatisUtils;

/**
 * 描述:
 * 测试
 *
 * @author Maserhe
 * @create 2021-01-08 20:40
 */
public class Test {

    @org.junit.Test
    public void Test0() {
        SqlSession session = MybatisUtils.sqlSession();
        // 进行查询
        UserMapper mapper = session.getMapper(UserMapper.class);

        User user = mapper.getUerById(2);
        System.out.println(user);

        session.close();
    }
}
