/**
 * 构造方法重载(创建不同用户对象)
 */
public class User {
    int id;
    String name;
    String pwd;

    public User(){
    }
    public User(int id,String name){
        this.id = id;
        this.name = name;
    }
    public User(int id,String name,String pwd){
        this.id = id;
        this.name = name;
        this.pwd = pwd;
    }

    public static void main(String[] args) {
        User u = new User();
        User u1 = new User(100,"沈德明");
        User u2 = new User(101,"沈德明","123456");
    }
}
