package com.nims.strategy;

public class PNGCompressor implements Compressor{
    @Override
    public void compress() {
        System.out.println("PNG compression");
    }
}
