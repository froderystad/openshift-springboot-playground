package simpleserver;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

@RestController
public class HelloController {

    @RequestMapping("/")
    public String index() {
        return greeting();
    }

    private String greeting() {
        LocalDateTime nowInOslo = LocalDateTime.now(ZoneId.of("Europe/Oslo"));
        DateTimeFormatter pattern = DateTimeFormatter.ofPattern("HH:mm:ss dd.MM.yyyy");
        return String.format("Local time in Oslo is now %s", nowInOslo.format(pattern));
    }

}