import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializerFeature;

import java.io.IOException;

public class Test1 {
    public static void main(String[] args){
        User user = null;
        try {
            user = new User();
        } catch (IOException e) {
            e.printStackTrace();
        }
        user.setUsername("admin");
        user.setPassword("123456");
        String entity1= JSON.toJSONString(user);
        System.out.println(entity1);

        String entity2 = JSON.toJSONString(user,SerializerFeature.WriteClassName);
        System.out.println(entity2);
    }
}
