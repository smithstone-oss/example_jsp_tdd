package example_jsp_tdd;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

public class TitleTest {


    private Document page;

    @Before
    public void setUp() throws Exception {
        page = Jsoup.connect("http://localhost:9999/example_jsp_tdd/").get();
    }

    @Test
    public void pageTitle() throws Exception {

        assertThat(page.title(), equalTo("Example JSP TDD"));
    }

    @Test
    public void nameShouldBeDisplayed() throws Exception {

        assertThat(page.getElementById("greeting").text(), equalTo("Hello Stephen"));
    }
}
