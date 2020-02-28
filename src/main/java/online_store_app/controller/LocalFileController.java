package online_store_app.controller;

import online_store_app.services.LocalFileService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;


@Controller
    @CrossOrigin
    public class LocalFileController {

        private LocalFileService localFileService;
        @Autowired
        public LocalFileController(LocalFileService localFileService) {
            this.localFileService = localFileService;
        }

        @GetMapping("/myAccount")
        public String getFiles(Model model) {
                model.addAttribute("files", localFileService.getFiles());
            return "my-account";
        }

        @GetMapping("/files/download/{filename}")
        public ResponseEntity<?> getFile(@PathVariable String filename) {
            return localFileService.getFile(filename);
        }

        @DeleteMapping("/files/delete/{filename}") //todo tu powinien być @DeleteMapping
        public ResponseEntity<?> deleteFile(@PathVariable String filename) {
            return localFileService.deleteFile(filename);
        }

        @PostMapping("/files")
        public String uploadFile(@RequestParam("file") MultipartFile file) {
            localFileService.uploadFile(file);

            return "redirect:index";
        }

    }

