package org.example.chiperspringbackend;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/chiper")
public class ChiperController {

    private final Chiper chiper;

    public ChiperController(Chiper chiper) {
        this.chiper = chiper;
    }

    @PostMapping("encrypt")
    public String encrypt(@RequestBody String password) {
        return chiper.encrypt(password);
    }

    @PostMapping("decrypt")
    public String decrypt(@RequestBody String encryptedpassword) {
        return chiper.decrypt(encryptedpassword);
    }

}
