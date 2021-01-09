package dao;

import entity.User;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Map;

/**
 * 描述:
 * 接口
 *
 * @author Maserhe
 * @create 2021-01-08 12:05
 */
public interface UserMapper {

    // 使用注解进行查表
    @Select("SELECT * FROM mybatis.user WHERE id = #{id}")
    User getUerById(int id);

    //方法存在多个参数，使用注解
    @Select("select * from mybatis.user where id = #{id} and name = #{name}")
    User getUserByIdAndName(@Param("id") int id, @Param("name") String name);

}
