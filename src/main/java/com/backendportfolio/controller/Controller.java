
package com.backendportfolio.controller;

import com.backendportfolio.model.*;
import com.backendportfolio.service.HomeService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
public class Controller {
    
    @Autowired
    private HomeService homeService;
    
    @GetMapping("/")
    public ResponseEntity<List<HomeEntity>> home(){
        return new ResponseEntity<>(homeService.mostrarHome(), HttpStatus.OK);
    }
}
