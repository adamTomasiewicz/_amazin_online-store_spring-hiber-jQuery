package online_store_app.model;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;


@Entity
@Table(name = "files")
public class WebFile {
    @Id
    private int webFileID;
    private String webFileName;
    private String webFileType;
    @Lob
    private byte[] file;

    public WebFile() {
    }
    public WebFile(String originalFileName, String originalFileType, byte[] originalFile) {
    }
    public int getWebFileID() {
        return webFileID;
    }
    public void setWebFileID(int webFileID) {
        this.webFileID = webFileID;
    }
    public String getWebFileName() {
        return webFileName;
    }
    public void setWebFileName(String webFileName) {
        this.webFileName = webFileName;
    }
    public String getWebFileType() {
        return webFileType;
    }
    public void setWebFileType(String webFileType) {
        this.webFileType = webFileType;
    }
    public byte[] getFile() {
        return file;
    }
    public void setFile(byte[] file) {
        this.file = file;
    }
}


