import static org.junit.Assert.*;
import org.junit.*;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

import javax.print.attribute.standard.MediaSize.ISO;


public class MarkdownParseTest {
    
    @Test
    public void addition() {
        assertEquals(2, 1 + 1);
    }

    @Test
    public void testGetLinks() throws IOException {
        Path filePath = Path.of("test-file.md");
        String content = Files.readString(filePath);
        ArrayList<String> al = MarkdownParse.getLinks(content);
        assertEquals(List.of("https://something.com", "some-thing.html"), al);
    }

    @Test
    public void testGetLinksFile2() throws IOException {
        Path filePath = Path.of("test-file2.md");
        String content = Files.readString(filePath);
        ArrayList<String> al = MarkdownParse.getLinks(content);
        assertEquals(List.of("https://something.com", "some-page.html"), al);
    }

    @Test
    public void testGetLinksFile3() throws IOException {
        Path filePath = Path.of("test-file3.md");
        String content = Files.readString(filePath);
        ArrayList<String> al = MarkdownParse.getLinks(content);
        assertEquals(List.of(), al);
    }

    @Test
    public void testGetLinksFile4() throws IOException {
        Path filePath = Path.of("test-file4.md");
        String content = Files.readString(filePath);
        ArrayList<String> al = MarkdownParse.getLinks(content);
        assertEquals(List.of(), al);
    }

    @Test
    public void testGetLinksFile5() throws IOException {
        Path filePath = Path.of("test-file5.md");
        String content = Files.readString(filePath);
        ArrayList<String> al = MarkdownParse.getLinks(content);
        assertEquals(List.of("page.com"), al);
    }

    @Test
    public void testGetLinksFile6() throws IOException {
        Path filePath = Path.of("test-file6.md");
        String content = Files.readString(filePath);
        ArrayList<String> al = MarkdownParse.getLinks(content);
        assertEquals(List.of("page.com"), al);
    }

    @Test
    public void testGetLinksFile7() throws IOException {
        Path filePath = Path.of("test-file7.md");
        String content = Files.readString(filePath);
        ArrayList<String> al = MarkdownParse.getLinks(content);
        assertEquals(List.of(), al);
    }

    @Test
    public void testGetLinksFile8() throws IOException {
        Path filePath = Path.of("test-file8.md");
        String content = Files.readString(filePath);
        ArrayList<String> al = MarkdownParse.getLinks(content);
        assertEquals(List.of("a link on the first line"), al);
    }

    @Test
    public void test1FailsAndPasses() throws IOException {
        Path filePath = Path.of("test-file.md");
        String content = Files.readString(filePath);
        ArrayList<String> al = MarkdownParse.getLinks(content);
        assertEquals(List.of("https://something.com", "some-thing.html"), al);
    }
}