/**
 * 测试this的用法
 * this：当前对象的地址，指向当前对象本身
 */

public class TestThis {
    int a,b,c;

    TestThis() {
        System.out.println("正要初始化对象："+this);
    }

    TestThis(int a, int b){
        //TestThis(); //这样是无法调用构造方法的！
        this(); //调用无参的构造方法，并且必须位于第一行！


        //a = a; // 这里指的都是局部变量而不是成员变量

        // 这样就区分了成员变量和局部变量
        this.a = a;
        this.b = b;
    }

    TestThis(int a, int b, int c) {
        this(a, b); // 调用带参的构造方法，并且必须位于第一行！
        this.c = c;
    }

    void sing() {
    }

    void eat() {
        System.out.println("当前对象："+this);
        this.sing();  //调用本类中的sing();
        System.out.println("你妈妈喊你回家吃饭");
    }


    public static void main(String[] args){
        TestThis hi = new TestThis(2, 3);
        //TestThis hi = new TestThis();
        hi.eat();
    }
}
