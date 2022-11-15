package templateEj2;

import templateEj2.model.Message;
import templateEj2.model.Point;

public class SpamDetector extends Algorithm<Message>{
    @Override
    Point getValue(Message sample) {
        System.out.println("Sacar valor de mensaje spam");
        return null;
    }
}
