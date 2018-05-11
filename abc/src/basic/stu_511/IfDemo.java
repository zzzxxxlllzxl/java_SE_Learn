package basic.stu_511;

public class IfDemo {
    public static void main(String[] args) {
        /* int a=0;
         a++;
         ++a;
        System.out.println(a++);
        System.out.println(++a);
        int b=0;
        b+=1;
        System.out.println(b);
        String str1="Hellow";
        String str11="Hellow";
        //System.out.println(str1.toString() );
        //System.out.println(str11.toString() );
        String  str2=",";
        String str3="World";
        String str=str1+str2 +str3 ;
        System.out.println(str);
        String str4=true?"我为真":"我为假";
        String str5=false?"我为真":"我为假";
        System.out.println(str4);
        System.out.println(str5);*/
        String str6 = "我满足条件";
        String str7 = "我不满足条件";
        if (true) {
            System.out.println(str6);

        }
        if (false) {

            System.out.println(str7);
        }
        if (false) {
            System.out.println(str7);
        } else {
            System.out.println(str7);
        }
        if (true) {
            System.out.println("条件1");
        } else if (false) {
            System.out.println("条件2");
        }
        if (false) {
            System.out.println("条件1");
        } else if (true) {
            System.out.println("条件2");

        }
        if (false) {
            System.out.println("条件1");
        } else if (false) {
            System.out.println("条件2");

        }
        else{
            System.out.println("条件三");
        }

    }
}


