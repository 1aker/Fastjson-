import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializerFeature;

import java.io.IOException;

public class Test1 {
    public static void main(String[] args){
        String json1="{\"Username\":\"root\",\"password\":\"123456\"}";
        String json2="{\"@type\":\"fastjsondemo.User\",\"Username\":\"root\",\"password\":\"123456\"}";
        Object obj = JSON.parseObject(json1,User.class);
        System.out.println(obj);
        Object obj1 = JSON.parseObject(json2,User.class);
        System.out.println(obj1);
    }
}
