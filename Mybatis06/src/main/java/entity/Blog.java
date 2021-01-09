package entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * 描述:
 * 博客实体类
 *
 * @author Maserhe
 * @create 2021-01-09 12:19
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Blog {

    private String id;
    private String title;
    private String author;
    private Date createTime;
    private int views;

}
