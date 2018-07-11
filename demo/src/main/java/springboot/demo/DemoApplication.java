package springboot.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class DemoApplication {
    @Value(value = "${book.author}")
    private String bookAuthor;
    @Value(value = "${book.name}")
    private String bookName;
    @Value(value = "${book.pinyin}")
    private String bookPinYin;
    @Value(value = "${book.author}")

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }
    @RequestMapping(value = "/demo", produces = "text/plain;charest/UTF-8")
    String index() {
        return "Hello Spring Boot! The BookName is "+bookName+";and Book Author is "+bookAuthor+";and Book PinYin is "+bookPinYin;
    }
}
