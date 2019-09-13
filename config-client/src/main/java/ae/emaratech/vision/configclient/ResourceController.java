package ae.emaratech.vision.configclient;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Ramesh.Yaleru on 9/13/2019
 */
@RestController
@RefreshScope
public class ResourceController {

    @Value("${msg:Hello world - Config Server is not working..pelase check}")
    private String msg;

    @GetMapping("/msg")
    public String message(){
    return this.msg;
    }
}
