package online_store_app.model;

public enum EnumGenre {
    SCI_FI("scifi"), FANTASY("fantasy"),
    ROMANSE("romanse"), DRAMA("drama"),
    BIOGRAPHY("biography"), NOVEL("novel");
    private String genre;

    EnumGenre(String genre) {
        this.genre = genre;
    }
    // Science fiction
}
