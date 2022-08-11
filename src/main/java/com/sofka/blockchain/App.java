package com.sofka.blockchain;

import com.sofka.blockchain.core.CreateBlock;
import com.sofka.blockchain.model.DataBlock;

public class App
{
    public static void main( String[] args )
    {
        CreateBlock blockchain = new CreateBlock(
                "000001d8503c0c5fa7be8801f22f53d3e841bd2883f1efd11ca1205032d423da",
                "julian.lasso@sofka.com.co",
                "raul.alzate@sofka.com.co",
                null
        );
        String hash = blockchain.generateBlock(5);
        DataBlock block = blockchain.getBlock();

        System.out.println("nonce: " + block.getNonce());
        System.out.println("hash:  " + hash);
        System.out.println("transaction:  " + block);
    }
}
