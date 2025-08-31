package passBy;

public class QuickStart {

    public static void main(String[] args) {
        QuickStart.demonstratePassByValue();
    }

    // 基本数据类型值传递
    public static void changePrimitive(int x) {
        x = 100;
        System.out.println("方法内修改后 x = " + x);
    }

    // 引用类型值传递 - 修改引用指向
    public static void changeReference(ValueExample obj) {
        obj = new ValueExample(200);
        System.out.println("方法内修改引用后 obj = " + obj);
    }

    // 引用类型值传递 - 修改对象内容
    public static void modifyObject(ValueExample obj) {
        obj.setValue(300);
        System.out.println("方法内修改对象后 obj = " + obj);
    }

    public static void demonstratePassByValue() {
        System.out.println("=== Java 值传递示例 ===");

        // 基本数据类型
        int x = 10;
        System.out.println("调用前 x = " + x);
        changePrimitive(x);
        System.out.println("调用后 x = " + x); // x 的值没有改变

        // 引用类型 - 修改引用
        ValueExample obj1 = new ValueExample(10);
        System.out.println("调用前 obj1 = " + obj1);
        changeReference(obj1);
        System.out.println("调用后 obj1 = " + obj1); // obj1 的引用没有改变

        // 引用类型 - 修改对象内容
        ValueExample obj2 = new ValueExample(20);
        System.out.println("调用前 obj2 = " + obj2);
        modifyObject(obj2);
        System.out.println("调用后 obj2 = " + obj2); // obj2 指向的对象内容被改变了
    }
}
