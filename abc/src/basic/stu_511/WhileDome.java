package basic.stu_511;

public class WhileDome {
    public static void main(String[] args) {
        for(int i=0;i<10;i++)
        {
            if (3==i)
            {
                continue;
            }
            if(6==i)
            {
                break;
            }
            System.out.println(i );
        }
    }
}
