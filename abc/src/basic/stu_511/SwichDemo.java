package basic.stu_511;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

public class SwichDemo {
    public static void main(String[] args) {
        String str1="B";
        switch(str1)
        {
            case("A"):
                System.out.println("我是A");break;
            case("B"):
                System.out.println("我是B");break;
            case("C"):
                System.out.println("我是C");break;
            default :
                System.out.println("前边条件不满足则执行本句");
        }
    }
}
