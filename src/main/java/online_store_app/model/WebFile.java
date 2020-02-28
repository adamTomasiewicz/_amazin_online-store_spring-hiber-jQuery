package online_store_app.model;


import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;


@Entity
@Table(name = "files")
public class WebFile {
    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    private String webFileID;
    private String webFileName;
    private String webFileType;
    @Lob
    private byte[] file;

    public WebFile() {
    }

    public WebFile(String webFileName, String webFileType, byte[] file) {
        this.webFileName = webFileName;
        this.webFileType = webFileType;
        this.file = file;
    }

    public String getWebFileID() {
        return webFileID;
    }
    public void setWebFileID(String webFileID) {
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


