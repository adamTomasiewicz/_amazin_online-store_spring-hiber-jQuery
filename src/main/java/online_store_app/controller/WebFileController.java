package online_store_app.controller;

import online_store_app.auth.Users;
import online_store_app.model.WebFile;
import online_store_app.responses.UploadResponse;
import online_store_app.services.WebFileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ByteArrayResource;
import org.springframework.core.io.Resource;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

//@RestController
//public class WebFileController {

//    @Autowired
//WebFileService webFileService;



    //    @GetMapping(value = "/myAccount")
//    public String getHome(Model model) {
//        model.addAttribute("webFiles", webFileService.getAllFilesFromDB());
//        return "my-account";
//    }
//    @PostMapping("/webfile/upload")
//    public UploadResponse uploadFile(@RequestParam("file") MultipartFile file) {
//        webFileService.saveFile(file);
//
//        return null;
//    }
//    @PostMapping("/webfile/upload")
//    public String uploadFile(@RequestParam("file") MultipartFile file) {
//        try {
//            // save file to PostgreSQL
//          //  WebFile webFile = new WebFile(file.getOriginalFilename(), file.getContentType(), file.getBytes());
//            webFileService.uploadFile(file);
//            return "success uploading: " + file.getOriginalFilename();
//        } catch (Exception e) {
//            return "error uploading";
//        }
//    }
//
//    @PostMapping("/webfile/uploads")
//    public List<UploadResponse> uploadMultipleFiles(@RequestParam("files") MultipartFile[] files) {
//        return List.of(files)
//                .stream()
//                .map(file -> uploadFile(file))
//                .collect(Collectors.toList());
//    }

//    @GetMapping("/webfile/download/{fileId}")
//    public ResponseEntity<Resource> downloadFile(@PathVariable String fileId) {
//
//        WebFile webFile = webFileService.getFileByID(fileId);
//
//        //todo do poprawki
//        return ResponseEntity.ok()
//                .contentType(MediaType.parseMediaType(webFile.getWebFileType()))
//                .header(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename=\"" + webFile.getWebFileName() + "\"")
//                .body(new ByteArrayResource(webFile.getFile()));
//    }
//    /** MY-ACCOUNT PAGE MAPPINGS */
//
//    @PostMapping(value = "/myAccount")
//    public String postSaveUser(@ModelAttribute Users user) {
//        if (user.getEmail().equals("adam") & user.getPassword().equals("adam1")) {
//            System.out.println("zalogowano użytkownika adam");
//            return "redirect:/home";
//        }
//        else return "my-account";
// }   }

