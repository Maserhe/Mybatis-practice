import dao.BlogMapper;
import entity.Blog;
import org.apache.ibatis.session.SqlSession;
import utils.IdUtils;
import utils.MybatisUtils;

import java.util.*;

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
        BlogMapper mapper = session.getMapper(dao.BlogMapper.class);
        Blog blog = new Blog(IdUtils.getId(), "你好", "Maserhe", new Date(), 123);
        mapper.addBlog(blog);

        session.commit();
        session.close();
    }

    @org.junit.Test
    public void Test1() {
        SqlSession session = MybatisUtils.sqlSession();
        BlogMapper mapper = session.getMapper(dao.BlogMapper.class);

        Map<String, String> map = new HashMap<>();
        map.put("author", "Maserhe");

        List<Blog> blogs = mapper.queryBlogIF(map);
        for (Blog blog : blogs) {
            System.out.println(blog);
        }
        session.close();
    }

    @org.junit.Test
    public void Test2() {
        SqlSession session = MybatisUtils.sqlSession();
        BlogMapper mapper = session.getMapper(dao.BlogMapper.class);

        Map<String, Integer> map = new HashMap<>();
        //map.put("author", "Maserhe");
        map.put("views", 321);
        List<Blog> blogs = mapper.queryBlogChose(map);
        for (Blog blog : blogs) {
            System.out.println(blog);
        }
        session.close();
    }


    @org.junit.Test
    public void Test3() {
        SqlSession session = MybatisUtils.sqlSession();
        BlogMapper mapper = session.getMapper(dao.BlogMapper.class);

        HashMap map = new HashMap();
        map.put("title", "哈哈哈哈");
        map.put("author", "maserhe");
        map.put("id", "fd0e6670910c4e41b18bf87a3357bb58");
        mapper.updateBlog(map);
        session.commit();
        session.close();
    }

    @org.junit.Test
    public void Test4() {
        SqlSession session = MybatisUtils.sqlSession();
        BlogMapper mapper = session.getMapper(dao.BlogMapper.class);

        HashMap map = new HashMap();
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        map.put("ids", list);

        List<Blog> blog = mapper.getBlog(map);
        for (Blog blog1 : blog) {
            System.out.println(blog1);
        }
        session.commit();
        session.close();
    }

}
