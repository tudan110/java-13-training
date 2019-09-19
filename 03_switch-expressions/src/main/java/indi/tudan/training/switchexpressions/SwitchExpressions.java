package indi.tudan.training.switchexpressions;

/**
 * Java 13 预览功能：Switch表达式
 * <p>
 * JEP 354 引入了yield语句，用于返回值。这意味着，switch表达式(返回值)应该使用yield, switch语句(不返回值)应该使用break。
 * 在这之后，switch中就多了一个关键字用于跳出switch块了，那就是yield，他用于返回一个值。
 * 和return的区别在于：return会直接跳出当前循环或者方法，而yield只会跳出当前switch块。
 *
 * @author wangtan
 * @date 2019-09-19 09:17:41
 * @since 1.0
 */
public class SwitchExpressions {

    public static void main(String[] args) {

        System.out.println(returnValue("Hello World!"));
        System.out.println(returnValue1("1"));
        System.out.println(returnValue2("2"));
        System.out.println(returnValue3("Hello World!"));
    }

    /**
     * old version to return value
     *
     * @param s 字符串
     * @return int
     * @date 2019-09-19 09:20:57
     */
    private static int returnValue(String s) {
        int i;
        switch (s) {
            case "1":
                i = 1;
                break;
            case "2":
                i = 2;
                break;
            default:
                i = s.length();
                break;
        }
        return i;
    }

    /**
     * return value in JDK 13
     *
     * @param s 字符串
     * @return int
     * @date 2019-09-19 09:25:16
     */
    private static int returnValue1(String s) {
        return switch (s) {
            case "1":
                yield 1;
            case "2":
                yield 2;
            default: {
                yield s.length();
            }
        };
    }

    /**
     * return value in JDK 13 by lambda expressions
     *
     * @param s 字符串
     * @return int
     * @date 2019-09-19 09:23:36
     */
    private static int returnValue2(String s) {
        return switch (s) {
            case "1" -> 1;
            case "2" -> 2;
            default -> {
                yield s.length();
            }
        };
    }

    /**
     * simple return value in JDK 13
     *
     * @param s 字符串
     * @return int
     * @date 2019-09-19 09:27:24
     */
    private static int returnValue3(String s) {
        return switch (s) {
            case "1" -> 1;
            case "2" -> 2;
            default -> s.length();
        };
    }
}
