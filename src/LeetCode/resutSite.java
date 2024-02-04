package LeetCode;

import java.io.IOException;
import java.net.URI;

public class resutSite {
    public static void main(String[] args) throws IOException {

        int a = 7121;
        int n = 7130;
        for (int i = a; i <= n; i++) {
            String url = "https://ums.vnsgu.net/Result/StudentResultDisplay.aspx?HtmlURL=4653," + i;
            java.awt.Desktop.getDesktop().browse(URI.create(url));
        }

    }
}
