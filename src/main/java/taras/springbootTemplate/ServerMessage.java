package taras.springbootTemplate;

//import org.apache.logging.log4j.message.Message;
//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RestController;
@Component
@Profile("server")
public class ServerMessage implements Messagable{
    private String text;

     public ServerMessage(){
        this.text = "Hello, motherfucker from server!";
     }
    public void setText(String text) {
        this.text = text;
    }
    @Override
     public String getText() {
         return text;
     }


}
