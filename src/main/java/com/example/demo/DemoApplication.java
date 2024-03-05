package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }
}

@RestController
class SampleController {

    @PostMapping("/dummyEndpoint")
    public ResponseData handleRequest(@RequestBody RequestData requestData) {
        // Возвращаем новый JSON объект с данными из входящего запроса
        ResponseData responseData = new ResponseData();
        responseData.setMessage("Received: " + requestData.getMessage());
        return responseData;
    }
}

class RequestData {
    private String message;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}

class ResponseData {
    private String message;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}

