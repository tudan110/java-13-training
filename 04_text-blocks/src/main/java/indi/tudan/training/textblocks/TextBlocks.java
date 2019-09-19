package indi.tudan.training.textblocks;

/**
 * Java 13 预览功能：文本块
 * <p>
 * 您需要下载 JDK 13。在 IntelliJ 中，转到 File → Project Structure 并确保在 Project SDK 下选择了 JDK 13。
 * 要将文本块作为预览功能启用，请务必选择 13 (Preview) - Switch expressions, text blocks
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
    }
}
