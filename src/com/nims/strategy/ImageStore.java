package com.nims.strategy;

public class ImageStore {
    public void store(String name, Compressor compressor,Filter filter){
        compressor.compress();
        filter.filter();
    }
}
