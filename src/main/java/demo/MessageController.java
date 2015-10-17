package demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.Map;

/**
 * Created by cdavis on 10/4/15.
 */
@RestController
public class MessageController {

    private MessageTransformer messageTransformer;

    @Autowired
    public MessageController(MessageTransformer messageTransformer) {
        this.messageTransformer = messageTransformer;
    }

    @RequestMapping(value = "/message", method = RequestMethod.GET)
    public Map<String, String> get(@RequestParam String message) {

        String transformedMessage = messageTransformer.transform(message);

        return Collections.singletonMap("message", transformedMessage);
    }
}
