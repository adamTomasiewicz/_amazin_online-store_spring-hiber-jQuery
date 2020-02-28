package online_store_app.services;

import online_store_app.exceptions.ConfigPropertyException;
import online_store_app.exceptions.FileNotFoundException;
import online_store_app.model.WebFile;
import org.apache.logging.log4j.util.Strings;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;
import org.springframework.core.io.UrlResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.List;
import java.util.stream.Stream;

//@Service
public class WebFileService {
   // private static final Logger logger = LoggerFactory.getLogger(LocalFileService.class);



//    public List<WebFile> getAllFilesFromDB() {
//        return fileRepo.findAll();
//    }
//
//    public WebFile getFileByID(long webFileId) {
//         return fileRepo.findById(webFileId)
//                 .orElseThrow(() -> new FileNotFoundException(String.valueOf(webFileId)));
//    }

//    public WebFile saveFileDB(MultipartFile file) {
//        String fileName = StringUtils.cleanPath(file.getOriginalFilename());
//        WebFile webFile = null;
//        try {
//           webFile = new WebFile(fileName, file.getContentType(), file.getBytes());
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        return fileRepo.save(webFile);
//    }

////        WebFile webFile = null;
////        try {
////            webFile = new WebFile(file.getOriginalFilename(), file.getContentType(), file.getBytes());
////        } catch (IOException e) {
////            e.printStackTrace();
////        } return fileRepo.save((WebFile) file);
//


}