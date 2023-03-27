
package com.backendportfolio.controller;

import com.backendportfolio.model.*;
import com.backendportfolio.service.HomeService;
import com.backendportfolio.service.StorageService;
import jakarta.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.nio.file.Files;
import java.util.List;
import java.util.Map;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;


@RestController
@AllArgsConstructor
public class Controller {
    
    @Autowired
    private HomeService homeService;
    
    private final StorageService storageService;
    
    private final HttpServletRequest request;
    
    @PostMapping("media/upload/home")
    public ResponseEntity<?> uploadFile(@RequestParam("file")MultipartFile multipartFile){
        String path = storageService.store(multipartFile);
        String host = request.getRequestURL().toString().replace(request.getRequestURI(), "");
        String url = ServletUriComponentsBuilder
                .fromHttpUrl(host)
                .path("/media/")
                .path(path)
                .toUriString();
        
        return homeService.actualizarImagenHome(1L, url);
    }
    
    @PostMapping("uploadhome")
    public ResponseEntity<HomeEntity> uploadHome(@RequestBody HomeEntity homeEntity){    
        return new ResponseEntity<>(homeService.actualizarHome(1L, homeEntity), HttpStatus.OK);
    }
    
    
    @GetMapping("media/{filename:.+}")
    public ResponseEntity<Resource> getFile(@PathVariable String filename) throws IOException{
        Resource file = storageService.loadAsResource(filename);
        String contentType;
        contentType = Files.probeContentType(file.getFile().toPath());
        
        return ResponseEntity
                .ok()
                .header(HttpHeaders.CONTENT_TYPE, contentType)
                .body(file);
    }
    
    @GetMapping("/")
    public ResponseEntity<List<HomeEntity>> home(){
        return new ResponseEntity<>(homeService.mostrarHome(), HttpStatus.OK);
    }
}