package com.sofka.blockchain.core;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CreateBlockTest {

    @Test
    @DisplayName("Hola Mundo en Test1")
    void generateBlock() {
        // Arrange 🛠 - Preparación
        String previousHash = "JulianEscobar;AlexanderReyes;CamiloCastañeda";
        String from = "Luisa Avila";
        String to = "Juan Daniel";
        Integer nonce = -180048235;
        Integer level = 5;
        String expected = "000007d062b6502670c7d91217c59449d0748a25dcd0a86a59b8df7240733f56";

        // Act ⚙️ - Ejecución
        CreateBlock block = new CreateBlock(previousHash, from, to, nonce);
        String answer = block.generateBlock(level);

        // Assert ✅ - Verificación o Confirmación
        assertEquals(expected, answer);
    }

    @Test
    @DisplayName("Hola Mundo en Test2")
    void generateBlock2() {
        // Arrange 🛠 - Preparación
        String previousHash = "JulianEscobar;AlexanderReyes;CamiloCastañeda";
        String from = "Luisa Avila";
        String to = "Juan Daniel";
        Integer nonce = -180048235;
        Integer level = 5;
        String expected = "000007d062b6502670c7d91217c59449d0748a25dcd0a86a59b8df7240733f57";

        // Act ⚙️ - Ejecución
        CreateBlock block = new CreateBlock(previousHash, from, to, nonce);
        String answer = block.generateBlock(level);

        // Assert ✅ - Verificación o Confirmación
        assertEquals(nonce, block.getBlock().getNonce());
        assertNotEquals(expected, answer);
    }
}