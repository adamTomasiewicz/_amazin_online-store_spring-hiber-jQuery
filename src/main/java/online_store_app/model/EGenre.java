package online_store_app.model;

public enum EGenre {
    SCI_FI("scifi"), FANTASY("fantasy"),
    ROMANSE("romanse"), DRAMA("drama"),
    BIOGRAPHY("biography"), NOVEL("novel");
    private String genre;

    EGenre(String genre) {
        this.genre = genre;
    }
    // Science fiction
}
