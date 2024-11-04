package org.example.chiperspringbackend;


import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/chiper")
public class CipherController{

    Cipher cipher = new Cipher(3);


    @PostMapping("encrypt")
    public String encrypt(@RequestBody String password) {
        return cipher.encrypt(password);
    }

    @PostMapping("decrypt")
    public String decrypt(@RequestBody String encryptedpassword) {
        return cipher.decrypt(encryptedpassword);
    }

}
