package entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

/**
 * 描述:
 * 测试lombok
 *
 * @author Maserhe
 * @create 2021-01-08 20:50
 */
@Data
public class UserTest {

    private int id;
    private String name;
    private String pwd;

}
