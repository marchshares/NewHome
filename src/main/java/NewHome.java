import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.*;

/**
 * Created by VikaTimur on 08.05.2015.
 */
public class NewHome {

    public static void main(String[] args) throws IOException {

        for (NewHomes newHome : NewHomes.values()) {
            FileWriter fw = new FileWriter("output\\" + newHome.id + ".csv");

            Document doc = Jsoup.connect(newHome.url).get();
            Element table = doc.getElementById("realize_table");

            boolean isFirst = true;
            for (Element tr : table.getElementsByTag("tr")) {
                StringBuilder sb = new StringBuilder();

                for (Element td : tr.getElementsByTag("td")) {
                    sb.append(td.text()).append(";");
                }

                String res = correct(sb.toString(), isFirst);
                isFirst = false;

                fw.write(res + "\n");
            }

            fw.close();
            System.out.println(newHome.id + " is done!");
        }
    }

    private static String correct(String sb, boolean isFirst) {
        if (!isFirst) {
            sb = sb.replaceAll("\\.", ",");
            sb = sb.replace(" ", "");
        }

        sb = sb.substring(0, sb.length()-1);

        return sb;
    }
}
