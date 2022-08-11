package com.sofka.blockchain.model;

import lombok.Data;

@Data
public class DataBlock {
    private String previousHash;
    private Integer nonce;
    private String from;
    private String to;

    public DataBlock(String previousHash, String from, String to) {
        this.previousHash = previousHash;
        this.from = from;
        this.to = to;
    }

    @Override
    public String toString() {
        return "{" +
                " previousHash='" + previousHash + "'" +
                ", nonce='" + nonce + "'" +
                ", from='" + from + "'" +
                ", to='" + to + "'" +
                " }";
    }
}
