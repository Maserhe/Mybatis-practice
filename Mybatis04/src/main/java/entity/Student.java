package entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 描述:
 * 学生
 *
 * @author Maserhe
 * @create 2021-01-08 23:14
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student {
    private int id;
    private String name;

    // 学生需要关联一个老师
    private Teacher teacher;

}
