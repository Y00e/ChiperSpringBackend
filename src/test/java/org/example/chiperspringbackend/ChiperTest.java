package org.example.chiperspringbackend;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ChiperTest {


    @Test
    void caesarChiperEncrypt() {

        //given
        Chiper chiper = new Chiper(3);

        //when
        String encrypted = chiper.encryptPassword("hello");
        String encrypted1 = chiper.encryptPassword("Hello");
        String encrypted3 = chiper.encryptPassword("@hello_H");
        String encrypted4 = chiper.encryptPassword("@hello123!");

        //then
        assertEquals("khoor", encrypted);
        assertEquals("Khoor", encrypted1);
        assertEquals("@khoor_K", encrypted3);
        assertEquals("@khoor123!", encrypted4);
    }

    @Test
    void testEncryptPasswordWithSpace() {
        //given
        Chiper chiper = new Chiper(3);

        //when & then
        assertThrows(IllegalArgumentException.class, () -> chiper.encryptPassword("hello world"));
    }

    @Test
    void caesarChiperDecrypt() {
        //given
        Chiper chiper = new Chiper(3);

        //when
        String decrypted = chiper.decryptPassword("khoor");
        String decrypted1 = chiper.decryptPassword("Khoor");
        String decrypted3 = chiper.decryptPassword("@khoor_K");
        String decrypted4 = chiper.decryptPassword("@khoor123!");

        //then
        assertEquals("hello",decrypted);
        assertEquals("Hello", decrypted1);
        assertEquals("@hello_H", decrypted3);
        assertEquals("@hello123!", decrypted4);
    }

}