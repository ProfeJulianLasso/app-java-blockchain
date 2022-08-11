package com.sofka.blockchain;

import static org.junit.jupiter.api.Assertions.*;

import com.sofka.blockchain.core.CreateBlock;
import com.sofka.blockchain.model.DataBlock;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {

    @Test
    @DisplayName("Ejemplo")
    void tamplete() {
        // Arrange 🛠 - Preparación

        // Act ⚙️ - Ejecución

        // Assert ✅ - Verificación o Confirmación
    }

    @Test
    @DisplayName("Creación de bloque")
    void createBlock() {
        // Arrange 🛠 - Preparación
        CreateBlock blockchain = new CreateBlock(
                "000001d8503c0c5fa7be8801f22f53d3e841bd2883f1efd11ca1205032d423da",
                "julian.lasso@sofka.com.co",
                "raul.alzate@sofka.com.co",
                1227050731
        );
        Integer level = 5;
        String expectedBlock = "{ " +
                "previousHash='000001d8503c0c5fa7be8801f22f53d3e841bd2883f1efd11ca1205032d423da', " +
                "nonce='1227050731', " +
                "from='julian.lasso@sofka.com.co', " +
                "to='raul.alzate@sofka.com.co' " +
                "}";

        // Act ⚙️ - Ejecución
        String hash = blockchain.generateBlock(level);
        DataBlock block = blockchain.getBlock();

        // Assert ✅ - Verificación o Confirmación
        assertEquals(expectedBlock, block.toString());
    }
}
