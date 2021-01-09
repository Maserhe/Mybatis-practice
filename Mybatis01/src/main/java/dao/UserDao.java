package dao;

import entity.User;

import java.util.List;
import java.util.Map;

/**
 * 描述:
 * dao等于mapper
 *
 * @author Maserhe
 * @create 2021-01-07 18:37
 */
public interface UserDao {
    List<User> getUserList();
    // 查询通过Id
    User getUserById(int id);
    // 增加通过传入参数
    int addUser(User user);
    // 更新用户
    int updateUser(User user);
    // 删除用户
    int deleteUser(int id);
    // 模糊查询
    List<User> getUserByLike(String value);

}
