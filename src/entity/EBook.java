package entity;

import jakarta.persistence.*;

@Entity
public class EBook extends Book {
    private String downloadUrl;

    public EBook() {
    }

    public EBook(String title, String downloadUrl) {
        super(title);
        this.downloadUrl = downloadUrl;
    }

    public String getDownloadUrl() {
        return downloadUrl;
    }

    public void setDownloadUrl(String downloadUrl) {
        this.downloadUrl = downloadUrl;
    }

    @Override
    public String toString() {
        return "EBook{" +
                "id=" + getId() +
                ", title='" + getTitle() + '\'' +
                ", downloadUrl='" + downloadUrl + '\'' +
                '}';
    }
}
