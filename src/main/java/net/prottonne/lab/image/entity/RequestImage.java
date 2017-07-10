/*
 * Copyright 2017 Prottonne
 */
package net.prottonne.lab.image.entity;

/**
 *
 * @author Jose Osuna
 */
public class RequestImage {

    private Long userId;

    public RequestImage() {
        super();
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    @Override
    public String toString() {
        return "RequestImage{" + "userId=" + userId + '}';
    }

}
