package com.nattysoft.popularmovies;

/**
 * Created by F3838284 on 2015/09/03.
 */

public class ImageItem {
    private String imageURL;
    private String title;

    public ImageItem(String image, String title) {
        super();
        this.imageURL = image;
        this.title = title;
    }

    public String getImageURL() {
        return imageURL;
    }

    public void setImageURL(String imageURL) {
        this.imageURL = imageURL;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
