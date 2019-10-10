package com.akpanda.structural.bridge;

public class RasterRenderer implements Renderer{
    @Override
    public String whatToRenderAs()
    {
        return "pixels";
    }
}
