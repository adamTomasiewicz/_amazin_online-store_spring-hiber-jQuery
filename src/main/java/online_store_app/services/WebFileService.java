package online_store_app.services;

import online_store_app.exceptions.FileNotFoundException;
import online_store_app.repository.FileRepo;
import online_store_app.model.WebFile;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

@Service
public class WebFileService {

    private final FileRepo fileRepo;
@Autowired
    public WebFileService(FileRepo fileRepo) {
        this.fileRepo = fileRepo;
    }

    public List<WebFile> getAllFilesFromDB() {
        return fileRepo.findAll();
    }

    public WebFile getFileByID(String webFileId) {
         return fileRepo.findById(webFileId)
                 .orElseThrow(() -> new FileNotFoundException(webFileId));
    }

    public WebFile saveFile(MultipartFile file) {
        WebFile webFile = null;
        try {
            webFile = new WebFile(file.getOriginalFilename(), file.getContentType(), file.getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }
        return fileRepo.save(webFile);

    }


}