package com.example.pokestar.aitutravel.bean.circle;

public class Circle_Item {
    private int image;
    private String title;
    private String source;

    public Circle_Item(int image, String title, String source) {
        this.image = image;
        this.title = title;
        this.source = source;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }
}
