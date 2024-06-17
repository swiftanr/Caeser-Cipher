import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CaeserCipherTest {

    @Test
    public void testCaeserCipher() {
        assertEquals("bcE", Main.caeserCipher("abD", 1));
        assertEquals("AZE", Main.caeserCipher("ZYD", 1));
        assertEquals("zaC", Main.caeserCipher("abD", -1));
        assertEquals("XyA SsU", Main.caeserCipher("ZaC UuW", -2));
    }
}