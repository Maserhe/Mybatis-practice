package dao;

import entity.User;

/**
 * 描述:
 * User的dao接口
 *
 * @author Maserhe
 * @create 2021-01-09 20:40
 */
public interface UserMapper {

    User getUserById(int id);

    // 增加通过传入参数
    int addUser(User user);
}
