package com.nims.strategy;

public class JPEGCompressor implements Compressor{
    @Override
    public void compress() {
        System.out.println("JPEG compression");
    }
}
