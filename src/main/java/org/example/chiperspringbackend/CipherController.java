package org.example.chiperspringbackend;


import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api/cipher")
public class CipherController{

    Cipher cipher = new Cipher(3);

    @CrossOrigin(origins = {"http://localhost:5173","https://y00e.github.io"})
    @PostMapping("encrypt")
    public String encrypt(@RequestParam String input) {
       return cipher.encrypt(input);
    }

    @CrossOrigin(origins = {"http://localhost:5173","https://y00e.github.io"})
    @PostMapping("decrypt")
    public String decrypt(@RequestParam String encryptedInput) {
        return cipher.decrypt(encryptedInput);
    }

}
