package cn.bugstack.springframework.test.bean;

import java.util.HashMap;
import java.util.Map;

/**
 * @author ssqswyf
 * @date 2022/1/14
 */
public class UserDao {

    private static Map<String, String> hashMap = new HashMap<>();

    static {
        hashMap.put("10001", "张三");
        hashMap.put("10002", "李四");
        hashMap.put("10003", "王二");
        hashMap.put("10004", "麻子");
    }

    public String queryUserName(String uid) {
        return hashMap.get(uid);
    }
}
