package online_store_app.services;

import online_store_app.exceptions.FileNotFoundException;
import online_store_app.repo.FileRepo;
import online_store_app.model.WebFile;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.util.List;
import java.util.Optional;

@Service
public class WebFileService {

    private  FileRepo fileRepo=new FileRepo() {
        @Override
        public List<WebFile> findAll() {
            return null;
        }

        @Override
        public List<WebFile> findAll(Sort sort) {
            return null;
        }

        @Override
        public List<WebFile> findAllById(Iterable<String> iterable) {
            return null;
        }

        @Override
        public <S extends WebFile> List<S> saveAll(Iterable<S> iterable) {
            return null;
        }

        @Override
        public void flush() {

        }

        @Override
        public <S extends WebFile> S saveAndFlush(S s) {
            return null;
        }

        @Override
        public void deleteInBatch(Iterable<WebFile> iterable) {

        }

        @Override
        public void deleteAllInBatch() {

        }

        @Override
        public WebFile getOne(String s) {
            return null;
        }

        @Override
        public <S extends WebFile> List<S> findAll(Example<S> example) {
            return null;
        }

        @Override
        public <S extends WebFile> List<S> findAll(Example<S> example, Sort sort) {
            return null;
        }

        @Override
        public Page<WebFile> findAll(Pageable pageable) {
            return null;
        }

        @Override
        public <S extends WebFile> S save(S s) {
            return null;
        }

        @Override
        public Optional<WebFile> findById(String s) {
            return Optional.empty();
        }

        @Override
        public boolean existsById(String s) {
            return false;
        }

        @Override
        public long count() {
            return 0;
        }

        @Override
        public void deleteById(String s) {

        }

        @Override
        public void delete(WebFile webFile) {

        }

        @Override
        public void deleteAll(Iterable<? extends WebFile> iterable) {

        }

        @Override
        public void deleteAll() {

        }

        @Override
        public <S extends WebFile> Optional<S> findOne(Example<S> example) {
            return Optional.empty();
        }

        @Override
        public <S extends WebFile> Page<S> findAll(Example<S> example, Pageable pageable) {
            return null;
        }

        @Override
        public <S extends WebFile> long count(Example<S> example) {
            return 0;
        }

        @Override
        public <S extends WebFile> boolean exists(Example<S> example) {
            return false;
        }
    };


    public List<WebFile> getAllFilesFromDB() {
        return fileRepo.findAll();
    }

    public WebFile getFileByID(String webFileId) {
         return fileRepo.findById(webFileId)
                 .orElseThrow(() -> new FileNotFoundException(webFileId));
    }

    public WebFile saveFile(MultipartFile file) {

        String fileName = StringUtils.cleanPath(file.getOriginalFilename());

        WebFile webFile = null;
        try {
            webFile = new WebFile(fileName, file.getContentType(), file.getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }


        return fileRepo.save(webFile);

    }



////        WebFile webFile = null;
////        try {
////            webFile = new WebFile(file.getOriginalFilename(), file.getContentType(), file.getBytes());
////        } catch (IOException e) {
////            e.printStackTrace();
////        } return fileRepo.save((WebFile) file);
//


}