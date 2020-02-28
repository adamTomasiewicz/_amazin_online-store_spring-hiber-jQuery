package online_store_app.controller;

import online_store_app.model.LocalFile;
import online_store_app.services.LocalFileService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;


    @RestController
    @CrossOrigin
    public class LocalFileController {

        private LocalFileService localFileService;
        @Autowired
        public LocalFileController(LocalFileService localFileService) {
            this.localFileService = localFileService;
        }

        @GetMapping("/webfile/files")
        public List<LocalFile> getFiles() {
            return localFileService.getFiles();
        }

        @GetMapping("/webfile/files/download/{filename}")
        public ResponseEntity<?> getFile(@PathVariable String filename) {
            return localFileService.getFile(filename);
        }

        @DeleteMapping("/webfile/files/delete/{filename}") //todo tu powinien być @DeleteMapping
        public ResponseEntity<?> deleteFile(@PathVariable String filename) {
            return localFileService.deleteFile(filename);
        }

        @PostMapping("/webfile/files")
        public ResponseEntity<String> uploadFile(@RequestParam("file") MultipartFile file) {
            return localFileService.uploadFile(file);
        }


    }

