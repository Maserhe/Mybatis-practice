package dao;

import entity.Student;
import entity.Teacher;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * 描述:
 * 老师接口
 *
 * @author Maserhe
 * @create 2021-01-08 23:18
 */
public interface TeacherMapper {

    // 根据 老师id 获取老师
    Teacher getTeacher(@Param("id") int id);
    // 按结果查询
    Teacher getTeacher1(@Param("tid") int id);

}
