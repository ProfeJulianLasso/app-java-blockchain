package com.sofka.blockchain;

import com.sofka.blockchain.core.CreateBlock;
import com.sofka.blockchain.model.DataBlock;

public class App
{
    public static void main( String[] args )
    {
        CreateBlock blockchain = new CreateBlock(
                "JulianEscobar;AlexanderReyes;CamiloCastañeda",
                "Luisa Avila",
                "Juan Daniel",
                null
        );
        String hash = blockchain.generateBlock(5);
        DataBlock block = blockchain.getBlock();

        System.out.println("nonce: " + block.getNonce());
        System.out.println("hash:  " + hash);
        System.out.println("transaction:  " + block);
    }
}
