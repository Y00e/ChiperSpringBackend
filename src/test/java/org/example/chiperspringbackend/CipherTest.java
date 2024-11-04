package org.example.chiperspringbackend;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CipherTest {


    @Test
    void caesarChiperEncrypt() {

        //given
        Cipher chiper = new Cipher(3);

        //when
        String encrypted = chiper.encrypt("hello");
        String encrypted1 = chiper.encrypt("Hello");
        String encrypted3 = chiper.encrypt("@hello_H");
        String encrypted4 = chiper.encrypt("@hello123!");

        //then
        assertEquals("khoor", encrypted);
        assertEquals("Khoor", encrypted1);
        assertEquals("@khoor_K", encrypted3);
        assertEquals("@khoor123!", encrypted4);
    }

    @Test
    void testEncryptPasswordWithSpace() {
        //given
        Cipher chiper = new Cipher(3);

        //when & then
        assertThrows(IllegalArgumentException.class, () -> chiper.encrypt("hello world"));
    }

    @Test
    void caesarChiperDecrypt() {
        //given
        Cipher chiper = new Cipher(3);

        //when
        String decrypted = chiper.decrypt("khoor");
        String decrypted1 = chiper.decrypt("Khoor");
        String decrypted3 = chiper.decrypt("@khoor_K");
        String decrypted4 = chiper.decrypt("@khoor123!");

        //then
        assertEquals("hello",decrypted);
        assertEquals("Hello", decrypted1);
        assertEquals("@hello_H", decrypted3);
        assertEquals("@hello123!", decrypted4);
    }

}