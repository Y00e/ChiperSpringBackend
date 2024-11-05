package org.example.chiperspringbackend;


import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/cipher")
public class CipherController{

    Cipher cipher = new Cipher(3);

    @CrossOrigin(origins = "http://localhost:5173")
    @PostMapping("encrypt")
    public String encrypt(@RequestBody String input) {
        return cipher.encrypt(input);
    }

    @CrossOrigin(origins = "http://localhost:5173")
    @PostMapping("decrypt")
    public String decrypt(@RequestBody String encryptedInput) {
        return cipher.decrypt(encryptedInput);
    }



}
