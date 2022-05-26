import static org.junit.Assert.*;
import org.junit.*;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

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

    @Test
    public void snippet1() throws IOException {
        Path filePath = Path.of("snippet1.md");
        String content = Files.readString(filePath);
        ArrayList<String> al = MarkdownParse.getLinks(content);
        assertEquals(List.of("url.com", "google.com", "google.com", "ucsd.edu"), al);
    }

    @Test
    public void snippet2() throws IOException {
        Path filePath = Path.of("snippet2.md");
        String content = Files.readString(filePath);
        ArrayList<String> al = MarkdownParse.getLinks(content);
        assertEquals(List.of("b.com", "a.com(())", "example.com"), al);
    }

    @Test
    public void snippet3() throws IOException {
        Path filePath = Path.of("snippet3.md");
        String content = Files.readString(filePath);
        ArrayList<String> al = MarkdownParse.getLinks(content);
        assertEquals(List.of("https://www.twitter.com", 
            "https://sites.google.com/eng.ucsd.edu/cse-15l-spring-2022/schedule",
            "https://cse.ucsd.edu/"), al);
    }
}
