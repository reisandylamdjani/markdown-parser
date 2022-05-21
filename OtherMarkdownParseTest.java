import static org.junit.Assert.*;
import org.junit.*;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class OtherMarkdownParseTest {
    @Test
    public void OtherSnippet1() throws IOException {
        Path filePath = Path.of("snippet1.md");
        String content = Files.readString(filePath);
        ArrayList<String> al = MarkdownParse.getLinks(content);
        assertEquals(List.of("url.com", "google.com", "google.com", "ucsd.edu"), al);
    }

    @Test
    public void OtherSnippet2() throws IOException {
        Path filePath = Path.of("snippet2.md");
        String content = Files.readString(filePath);
        ArrayList<String> al = MarkdownParse.getLinks(content);
        assertEquals(List.of("b.com", "a.com", "example.com"), al);
    }

    @Test
    public void OtherSnippet3() throws IOException {
        Path filePath = Path.of("snippet3.md");
        String content = Files.readString(filePath);
        ArrayList<String> al = MarkdownParse.getLinks(content);
        assertEquals(List.of("https://www.twitter.com", 
            "https://sites.google.com/eng.ucsd.edu/cse-15l-spring-2022/schedule",
            "https://cse.ucsd.edu/"), al);
    }

}
