package org.example;

public class Book {
    private String title;
    private  int cost;

    public Book(String title, int cost) {
        this.title = title;
        this.cost = cost;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getCost() {
        return cost;
    }


    public void setCost(int cost) {
        this.cost = cost;
    }


    @Override
    public String toString() {
        return "Tytuł: "+getTitle()+ " Cena: "+ getCost();
    }

}
