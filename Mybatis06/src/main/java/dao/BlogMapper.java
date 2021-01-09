package dao;

import entity.Blog;
import org.apache.ibatis.annotations.Insert;

import java.util.List;
import java.util.Map;

/**
 * 描述:
 * Blog接口
 *
 * @author Maserhe
 * @create 2021-01-09 12:22
 */
public interface BlogMapper {

    // 插入博客
    int addBlog(Blog blog);

    // 查询博客
    List<Blog> queryBlogIF(Map<String, String> map);

    // 查询博客， 只能查询一种属性。
    List<Blog> queryBlogChose(Map<String, Integer> map);

    // 跟新博客， 使用SET
    int updateBlog(Map<String, Object> map);

    // 使用Foreach 来动态sql查询blog
    List<Blog> getBlog(Map<String, Object> map);

}
