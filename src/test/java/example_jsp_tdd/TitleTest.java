package example_jsp_tdd;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

public class TitleTest {


    @Test
    public void pageTitle() throws Exception {

        Document page = Jsoup.connect("http://localhost:9999/example_jsp_tdd/").get();

        assertThat(page.title(), equalTo("Example JSP TDD"));
    }
}
