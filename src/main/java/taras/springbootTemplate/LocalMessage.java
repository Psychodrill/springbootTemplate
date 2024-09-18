package taras.springbootTemplate;

//import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;
//import org.springframework.stereotype.Service;

@Component
@Profile("local")
@Primary
public class LocalMessage implements Messagable{
    private String text;

     public LocalMessage(){
        this.text = "Hello, motherfucker from local!";
     }
    public void setText(String text) {
        this.text = text;
    }
    @Override
     public String getText() {
         return text;
     }

    
}
