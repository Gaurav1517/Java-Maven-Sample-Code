// package com.sample.app;

// import org.springframework.boot.SpringApplication;
// import org.springframework.boot.autoconfigure.SpringBootApplication;

// @SpringBootApplication
// public class AppApplication {

//     public static void main(String[] args) {
//         System.out.println("Hello"); // Print "Hello" to the console
//         SpringApplication.run(AppApplication.class, args);
//     }
// }

package com.sample.app;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {

    @GetMapping("/")
    @ResponseBody
    public String home() {
        return "Welcome to the Home Page!";
    }
}



