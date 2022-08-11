package com.sofka.blockchain.core;

import com.sofka.blockchain.model.DataBlock;
import lombok.Data;
import org.apache.commons.codec.digest.DigestUtils;

import java.util.Random;
import java.util.regex.Pattern;

@Data
public class CreateBlock {
    private DataBlock block;
    private Random random;

    public CreateBlock(String previousHash, String from, String to, Integer nonce) {
        this.block = new DataBlock(previousHash, from, to);
        random = new Random();
        block.setNonce(nonce == null ? random.nextInt() : nonce);
        this.block = block;
    }

    public DataBlock getBlock() {
        return block;
    }

    public String generateBlock(Integer level) {
        Pattern pattern = Pattern.compile("^(0){" + level + "}");
        String sha256hex = DigestUtils.sha256Hex(block.toString());
        while (!pattern.matcher(sha256hex).find()) {
            block.setNonce(random.nextInt());
            sha256hex = DigestUtils.sha256Hex(block.toString());
        }
        return sha256hex.toLowerCase();
    }
}
