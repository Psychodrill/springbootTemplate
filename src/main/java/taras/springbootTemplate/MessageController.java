package taras.springbootTemplate;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageController{
    @Autowired
    Messagable msg;

    @GetMapping("/msg")
    public String showMessage(){

        return msg.getText();
    }
}