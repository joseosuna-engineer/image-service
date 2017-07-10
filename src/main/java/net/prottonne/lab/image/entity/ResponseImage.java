/*
 * Copyright 2017 Prottonne
 */
package net.prottonne.lab.image.entity;

/**
 *
 * @author Jose Osuna
 */
public class ResponseImage {

    private String image;

    public ResponseImage() {
        super();
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    @Override
    public String toString() {
        return "ResponseImage{" + "image=" + image + '}';
    }

}
