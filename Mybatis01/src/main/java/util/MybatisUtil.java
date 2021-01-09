package util;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

/**
 * 描述:
 * sqlSession
 *
 * @author Maserhe
 * @create 2021-01-07 18:22
 */
public class MybatisUtil {

    private static SqlSessionFactory sqlSessionFactory = null;

    // 加载资源
    static {
        // 获取sqlSessionFactory对象。
        String resource = "mybatis-config.xml";
        try {
            InputStream inputStream = Resources.getResourceAsStream(resource);
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    // 获取SqlSession对象。
    public static SqlSession getSqlSession() {
        return sqlSessionFactory.openSession();
    }
}
