package main;

public class Memento {

    private String article;

    public Memento(String articleSave){

        this.article = articleSave;
    }

    public String getSavedArticle(){ return article; }
}
