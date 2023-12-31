package profile.service.dev.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("profile/v1.0/api")
public class PeopleController {

    @GetMapping("data")
    public ResponseEntity<String> test(){
        return new ResponseEntity<>("Hello, world", HttpStatus.OK);
    }
}