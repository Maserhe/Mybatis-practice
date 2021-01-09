package utils;

import org.junit.jupiter.api.Test;

import java.util.UUID;

/**
 * 描述:
 * id核心
 *
 * @author Maserhe
 * @create 2021-01-09 12:26
 */
public class IdUtils {

    public static String getId(){
        return UUID.randomUUID().toString().replaceAll("-","");
    }
    @Test
    public void Test() {
        System.out.println(IdUtils.getId());
        System.out.println(IdUtils.getId());
        System.out.println(IdUtils.getId());
        System.out.println(IdUtils.getId());
    }
}
