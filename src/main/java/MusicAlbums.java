public class MusicAlbums {

    private String albumTitle;
    private String artistName;
    private String releaseYear;

    public String getAlbumTitle() {
        return albumTitle;
    }

    public void setAlbumTitle(String albumTitle) {
        this.albumTitle = albumTitle;
    }

    public String getArtistName() {
        return artistName;
    }

    public void setArtistName(String artistName) {
        this.artistName = artistName;
    }

    public String getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(String releaseYear) {
        this.releaseYear = releaseYear;
    }

    public MusicAlbums(String albumTitle, String artistName, String releaseYear) {
        this.albumTitle = albumTitle;
        this.artistName = artistName;
        this.releaseYear = releaseYear;
    }
}
