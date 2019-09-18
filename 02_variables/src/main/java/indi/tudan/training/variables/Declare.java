package indi.tudan.training.variables;

/**
 * 定义变量
 *
 * @author wangtan
 * @date 2019-09-18 15:19:45
 * @since 1.0
 */
public class Declare {

    public static void main(String... args) {

        var a = 10;
        var b = "java";
        var c = 4.17;
        var d = true;
        var e = "Hello";
        var f = """
            Do you like my hat?
            """;
        var g = 'M';
        var h = 36L;

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
        System.out.println(g);
        System.out.println(h);
    }
}
