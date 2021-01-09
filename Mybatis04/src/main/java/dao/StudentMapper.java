package dao;

import entity.Student;

import java.util.List;

/**
 * 描述:
 * 学生接口
 *
 * @author Maserhe
 * @create 2021-01-08 23:17
 */
public interface StudentMapper {

    // 查询 学生信息 以及 老师 信息
    List<Student> getStudent();

    List<Student> getStudent1();
}
