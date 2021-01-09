package dao;

import entity.User;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import util.MybatisUtils;

import java.util.List;

/**
 * 描述:
 * 测试User
 *
 * @author Maserhe
 * @create 2021-01-07 18:54
 */
public class UserDaoTest {
    @Test
    public void test() {
        // 获取 SqlSession
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        // 执行sql
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        List<User> userList = mapper.getUserList();
        for (User i: userList) {
            System.out.println(i);
        }


        sqlSession.commit();
        sqlSession.close();
    }

    @Test
    public void test1() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        mapper.updateUser(new User(2,"mmm", "4321"));

        // 执行 删除操作， 第四部。
        mapper.deleteUser(3);

        sqlSession.commit();
        sqlSession.close();
    }
    @Test
    public void test2() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);

        // 模糊查询
        List<User> userByLike = mapper.getUserByLike("%M%");

        for (User user: userByLike) {
            System.out.println(user);
        }

        sqlSession.close();
    }
}
