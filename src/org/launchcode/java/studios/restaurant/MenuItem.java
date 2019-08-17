package org.launchcode.java.studios.restaurant;

public class MenuItem {
    private Double price;
    private String description;
    private String category;
    private Boolean newItem;

    public MenuItem(Double price, String description, String category) {
        this.price = price;
        this.description = description;
        this.category = category;
        this.newItem = true;
    }

    public Double getPrice() {
        return price;
    }
    public String getDescription() {
        return description;
    }
    public String getCategory() {
        return category;
    }
    public Boolean getNewItem() {
        return newItem;
    }

    protected void setNewItem(Boolean aValue) {
        this.newItem = aValue;
    }

}
