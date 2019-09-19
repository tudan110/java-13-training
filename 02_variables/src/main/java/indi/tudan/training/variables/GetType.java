package indi.tudan.training.variables;

/**
 * 获取类型
 *
 * @author wangtan
 * @date 2019-09-18 15:27:33
 * @since 1.0
 */
public class GetType {

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

        System.out.println(getType(a));
        System.out.println(getType(b));
        System.out.println(getType(c));
        System.out.println(getType(d));
        System.out.println(getType(e));
        System.out.println(getType(f));
        System.out.println(getType(g));
        System.out.println(getType(h));
    }

    /**
     * 获取变量类型方法
     *
     * @param object 对象
     * @return String
     * @author wangtan
     * @date 2019-09-18 15:28:20
     * @since 1.0
     */
    private static String getType(Object object) {
        return object.getClass().toString(); //使用int类型的getClass()方法
    }
}
