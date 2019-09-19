package indi.tudan.training.textblocks;

/**
 * Java 13 预览功能：文本块
 * <p>
 * 您需要下载 JDK 13。在 IntelliJ 中，转到 File → Project Structure 并确保在 Project SDK 下选择了 JDK 13。
 * 要将文本块作为预览功能启用，请务必选择 13 (Preview) - Switch expressions, text blocks
 * <p>
 * 在JDK 12中引入了Raw String Literals特性，但在发布之前就放弃了。这个JEP在引入多行字符串文字（text block）在意义上是类似的。
 * text block，文本块，是一个多行字符串文字，它避免了对大多数转义序列的需要，以可预测的方式自动格式化字符串，并在需要时让开发人员控制格式。
 *
 * @author wangtan
 * @date 2019-09-18 14:19:17
 * @since 1.0
 */
public class TextBlocks {

    public static void main(String... args) {

        var html = """
            <html>
                <body>
                    <p>Hello, world</p>
                </body>
            </html>
        """;
        System.out.println(html);

        System.out.println("""
            SELECT `EMP_ID`, `LAST_NAME` FROM `EMPLOYEE_TB`
            WHERE `CITY` = 'INDIANAPOLIS'
            ORDER BY `EMP_ID`, `LAST_NAME`;
        """);
    }

}
