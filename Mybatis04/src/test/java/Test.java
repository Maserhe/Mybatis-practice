import com.mysql.cj.Session;
import dao.StudentMapper;
import dao.TeacherMapper;
import entity.Student;
import entity.Teacher;
import org.apache.ibatis.session.SqlSession;
import utils.MybatisUtils;

import java.util.List;

/**
 * 描述:
 * 测试
 *
 * @author Maserhe
 * @create 2021-01-08 23:26
 */
public class Test {

    @org.junit.Test
    public void Test1() {
        SqlSession session = MybatisUtils.sqlSession();

        // 查询所有学生信息 老师的信息也可以查询出来。
        StudentMapper mapper1 = session.getMapper(StudentMapper.class);
        List<Student> student = mapper1.getStudent1();
        for (Student student1 : student) {
            System.out.println(student1);
        }

        session.close();

    }
    @org.junit.Test
    public void Test2() {
        // 获取SqlSession
        SqlSession session = MybatisUtils.sqlSession();
        TeacherMapper mapper = session.getMapper(TeacherMapper.class);
        Teacher teacher = mapper.getTeacher(1);
        for (Student student : teacher.getStudents()) {
            System.out.println(student);
        }
        session.close();
    }

    @org.junit.Test
    public void Test3() {
        // 获取SqlSession
        SqlSession session = MybatisUtils.sqlSession();
        TeacherMapper mapper = session.getMapper(TeacherMapper.class);
        Teacher teacher = mapper.getTeacher1(1);
        for (Student student : teacher.getStudents()) {
            System.out.println(student);
        }
        session.close();
    }



}
