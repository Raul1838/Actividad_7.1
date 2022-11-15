package templateEj2;

import templateEj2.model.Image;
import templateEj2.model.Message;

public class Cliente {
    public static void main(String[] args) {
        ImageSatelite classificador = new ImageSatelite();
//        classificador.setInitGroups();
        classificador.execute(new Image());

        SpamDetector detector = new SpamDetector();
//        detector.setInitGroups();
        detector.execute(new Message());
    }
}
