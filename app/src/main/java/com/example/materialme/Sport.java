package com.example.materialme;

/**
 * Data model for each row of the RecyclerView.
 */
class Sport {

    private String title;
    private String info;
    private int imageResource;

    Sport(String title, String info, int imageResource) {
        this.title = title;
        this.info = info;
        this.imageResource = imageResource;
    }

    String getTitle() {
        return title;
    }

    String getInfo() {
        return info;
    }

    int getImageResource() {
        return imageResource;
    }
}
