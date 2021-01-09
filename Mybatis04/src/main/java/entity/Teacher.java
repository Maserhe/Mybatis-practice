package entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * 描述:
 * 老师
 *
 * @author Maserhe
 * @create 2021-01-08 23:14
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Teacher {
    private int id;
    private String name;

    // 一个老师有多个学生
    private List<Student> students;
}
