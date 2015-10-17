package demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * Created by cdavis on 10/16/15.
 */
@Component
public class StandardMessageTransformer implements MessageTransformer {

    private String prefix;

    @Autowired
    public StandardMessageTransformer(@Value("${demo.prefix:Hello}") String prefix) {
        this.prefix = prefix;
    }

    @Override
    public String transform(String message) {
        return String.format("%s %s", prefix, message);
    }
}
