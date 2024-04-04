package com.example.burgermenuproject;

public class Item {

    String nameItem;
    String descriptionItem;
    String image;

    public String getNameItem() {
        return nameItem;
    }

    public String getDescriptionItem() {
        return descriptionItem;
    }

    public String getImage() {
        return image;
    }

    public Item(String nameItem, String descriptionItem, String image) {
        this.nameItem = nameItem;
        this.descriptionItem = descriptionItem;
        this.image = image;
    }
}
