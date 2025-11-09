package topic;
public class conditional_statementl
{
    static void main() {
B4 b=new B4();
b.m1(23);

B6 v=new B6();
v.m2(3);

C2 c=new C2();
c.m3(4);
    }
}
class B4
{
    public static void m1(int a)
    {
        if(a < 19) {
            System.out.println("hello");
        }
        else if(a>22)
        {
            System.out.println("op");
        }
        else
        {
            System.out.println("hey");
        }
    }
    }
    class B6
    {
        public static void m2(int b)
        {
          String c=switch (b)
            {
                case 1 -> "hello";

                case 2 -> "hey";

                case 3 -> "hii";

                default -> "stop";
            };

            System.out.println(c);
        }
    }
    class C2
    {


            public static void m3(int m)
            {
                String d = switch (m) {
                    case 1 -> "monday";

                    case 2 -> "tuesday";

                    case 3 -> "wednesday";

                    case 4 ->
                    {
                        System.out.print("printing");
                        System.out.println("......");
                        yield "thursday";
                    }

                    case 5 -> "friday";

                    case 6 -> "saturday";

                    case 7 -> "sunday";


                    default -> "no more days";
                };
                System.out.println(d);
            }
    }