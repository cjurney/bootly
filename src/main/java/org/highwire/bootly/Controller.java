package org.highwire.bootly;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping("/")
    String index() {
        return "Bonjour, mon ami!";
    }
}
