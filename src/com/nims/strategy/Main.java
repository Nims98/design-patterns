package com.nims.strategy;

public class Main {
    public static void main(String[] args) {
        ImageStore imgStore = new ImageStore();
        imgStore.store("img1",new JPEGCompressor(),new VividFilter());
        imgStore.store("img1",new PNGCompressor(),new ContrastFilter());
    }
}
