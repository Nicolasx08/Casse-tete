import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.paint.ImagePattern;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

import java.awt.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Main extends Application {
    public static void main(String[] args) {launch(args);}

    @Override
    public void start(Stage stage) {
        stage.setWidth(900);
        stage.setHeight(900);
        stage.setResizable(false);
        stage.setTitle("Casse-tête");

        Image image0 = new Image("mario0.jpg");
        Image image1 = new Image("mario1.jpg");
        Image image2 = new Image("mario2.jpg");
        Image image3 = new Image("mario3.jpg");
        Image image4 = new Image("mario4.jpg");
        Image image5 = new Image("mario5.jpg");
        Image image6 = new Image("mario6.jpg");
        Image image7 = new Image("mario7.jpg");
        Image image8 = new Image("mario8.jpg");

        ImageView imageview0 = new ImageView(image0);
        imageview0.setFitWidth(300);
        imageview0.setFitHeight(300);
        imageview0.setRotate((Math.random()*3)*90);
        ImageView imageview1 = new ImageView(image1);
        imageview1.setFitWidth(300);
        imageview1.setFitHeight(300);
        imageview1.setRotate((Math.random()*3)*90);
        ImageView imageview2 = new ImageView(image2);
        imageview2.setFitWidth(300);
        imageview2.setFitHeight(300);
        imageview2.setRotate((Math.random()*3)*90);
        ImageView imageview3 = new ImageView(image3);
        imageview3.setFitWidth(300);
        imageview3.setFitHeight(300);
        imageview3.setRotate((Math.random()*3)*90);
        ImageView imageview4 = new ImageView(image4);
        imageview4.setFitWidth(300);
        imageview4.setFitHeight(300);
        imageview4.setRotate((Math.random()*3)*90);
        ImageView imageview5 = new ImageView(image5);
        imageview5.setFitWidth(300);
        imageview5.setFitHeight(300);
        imageview5.setRotate((Math.random()*3)*90);
        ImageView imageview6 = new ImageView(image6);
        imageview6.setFitWidth(300);
        imageview6.setFitHeight(300);
        imageview6.setRotate((Math.random()*3)*90);
        ImageView imageview7 = new ImageView(image7);
        imageview7.setFitWidth(300);
        imageview7.setFitHeight(300);
        imageview7.setRotate((Math.random()*3)*90);
        ImageView imageview8 = new ImageView(image8);
        imageview8.setFitWidth(300);
        imageview8.setFitHeight(300);
        imageview8.setRotate((Math.random()*3)*90);

        ImagePattern imagePattern0 = new ImagePattern(image0);
        ImagePattern imagePattern1 = new ImagePattern(image1);
        ImagePattern imagePattern2 = new ImagePattern(image2);
        ImagePattern imagePattern3 = new ImagePattern(image3);
        ImagePattern imagePattern4 = new ImagePattern(image4);
        ImagePattern imagePattern5 = new ImagePattern(image5);
        ImagePattern imagePattern6 = new ImagePattern(image6);
        ImagePattern imagePattern7 = new ImagePattern(image7);
        ImagePattern imagePattern8 = new ImagePattern(image8);

        Rectangle rectangle0 = new Rectangle(0,0,298,298);
        Rectangle rectangle1 = new Rectangle(300,0,298,298);
        Rectangle rectangle2 = new Rectangle(600,0,298,298);
        Rectangle rectangle3 = new Rectangle(0,300,298,298);
        Rectangle rectangle4 = new Rectangle(300,300,298,298);
        Rectangle rectangle5 = new Rectangle(600,300,298,298);
        Rectangle rectangle6 = new Rectangle(0,600,298,298);
        Rectangle rectangle7 = new Rectangle(300,600,298,298);
        Rectangle rectangle8 = new Rectangle(600,600,298,298);

        ArrayList<ImagePattern> melange = new ArrayList<>();
        melange.add(imagePattern0);
        melange.add(imagePattern1);
        melange.add(imagePattern2);
        melange.add(imagePattern3);
        melange.add(imagePattern4);
        melange.add(imagePattern5);
        melange.add(imagePattern6);
        melange.add(imagePattern7);
        melange.add(imagePattern8);

        Collections.shuffle(melange);

        rectangle0.setFill(melange.get(0));
        rectangle1.setFill(melange.get(1));
        rectangle2.setFill(melange.get(2));
        rectangle3.setFill(melange.get(3));
        rectangle4.setFill(melange.get(4));
        rectangle5.setFill(melange.get(5));
        rectangle6.setFill(melange.get(6));
        rectangle7.setFill(melange.get(7));
        rectangle8.setFill(melange.get(8));

        Group root = new Group(rectangle0,rectangle1,rectangle2,rectangle3,rectangle4,rectangle5
        ,rectangle6,rectangle7,rectangle8);
        stage.setScene(new Scene(root));
        stage.show();
    }

}

