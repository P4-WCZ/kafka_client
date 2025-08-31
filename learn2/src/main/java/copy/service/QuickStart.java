package copy.service;

import copy.entity.Address;
import copy.entity.Person;

public class QuickStart {

    public static void main(String[] args) {
        try {
            QuickStart.demonstrateShallowCopy();
            QuickStart.demonstrateDeepCopy();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }

    public static void demonstrateShallowCopy() throws CloneNotSupportedException {
        System.out.println("=== 浅拷贝示例 ===");
        Address address = new Address("北京");
        Person person1 = new Person("张三", address);
        Person person2 = person1.clone(); // 浅拷贝

        System.out.println("原始对象: " + person1);
        System.out.println("拷贝对象: " + person2);
        System.out.println("是否为同一对象: " + (person1 == person2));
        System.out.println("地址属性是否为同一对象: " + (person1.getAddress() == person2.getAddress()));

        // 修改原始对象的地址信息
        person1.getAddress().setCity("上海");
        System.out.println("修改原始对象地址后:");
        System.out.println("原始对象: " + person1);
        System.out.println("拷贝对象: " + person2); // 注意：拷贝对象的地址也被改变了
    }

    public static void demonstrateDeepCopy() throws CloneNotSupportedException {
        System.out.println("\n=== 深拷贝示例 ===");
        Address address = new Address("广州");
        Person person1 = new Person("李四", address);
        Person person2 = person1.deepClone(); // 深拷贝

        System.out.println("原始对象: " + person1);
        System.out.println("拷贝对象: " + person2);
        System.out.println("是否为同一对象: " + (person1 == person2));
        System.out.println("地址属性是否为同一对象: " + (person1.getAddress() == person2.getAddress()));

        // 修改原始对象的地址信息
        person1.getAddress().setCity("深圳");
        System.out.println("修改原始对象地址后:");
        System.out.println("原始对象: " + person1);
        System.out.println("拷贝对象: " + person2); // 注意：拷贝对象的地址没有被改变
    }
}
