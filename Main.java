import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCode;
import javafx.scene.paint.ImagePattern;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

import java.awt.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.concurrent.atomic.AtomicInteger;

public class Main extends Application {
    public static void main(String[] args) {launch(args);}

    @Override
    public void start(Stage stage) {

        stage.setWidth(900);
        stage.setHeight(900);
        stage.setResizable(false);
        stage.setTitle("Casse-tête");
        AtomicInteger var= new AtomicInteger();
        var.set(0);

        Image[] imageMario = {
                new Image("mario0.jpg"),
                new Image("mario1.jpg"),
                new Image("mario2.jpg"),
                new Image("mario3.jpg"),
                new Image("mario4.jpg"),
                new Image("mario5.jpg"),
                new Image("mario6.jpg"),
                new Image("mario7.jpg"),
                new Image("mario8.jpg")
        };
        Image[] imagesCharles ={
                new Image("carl0.jpg")
                ,new Image("carl1.jpg")
                ,new Image("carl2.jpg")
                ,new Image("carl3.jpg")
                ,new Image("carl4.jpg")
                ,new Image("carl5.jpg")
                ,new Image("carl6.jpg")
                ,new Image("carl7.jpg")
                ,new Image("carl8.jpg")
        };

        Image[] imageNic = {
                new Image("nic0.jpg"),
                new Image("nic1.jpg"),
                new Image("nic2.jpg"),
                new Image("nic3.jpg"),
                new Image("nic4.jpg"),
                new Image("nic5.jpg"),
                new Image("nic6.jpg"),
                new Image("nic7.jpg"),
                new Image("nic8.jpg")
        };

        Image[] imageRaph = {
                new Image("raph0.jpg"),
                new Image("raph1.jpg"),
                new Image("raph2.jpg"),
                new Image("raph3.jpg"),
                new Image("raph4.jpg"),
                new Image("raph5.jpg"),
                new Image("raph6.jpg"),
                new Image("raph7.jpg"),
                new Image("raph8.jpg")
        };

        Image[] imageSimon = {
                new Image("sim0.jpg"),
                new Image("sim1.jpg"),
                new Image("sim2.jpg"),
                new Image("sim3.jpg"),
                new Image("sim4.jpg"),
                new Image("sim5.jpg"),
                new Image("sim6.jpg"),
                new Image("sim7.jpg"),
                new Image("sim8.jpg")
        };
        Image[] imageChoisi= new Image[9];
        for (int i=0;i<9;i++){
            imageChoisi[i]=imageMario[i];
        }

        ImagePattern imagePattern0 = new ImagePattern(imageChoisi[0]);
        ImagePattern imagePattern1 = new ImagePattern(imageChoisi[1]);
        ImagePattern imagePattern2 = new ImagePattern(imageChoisi[2]);
        ImagePattern imagePattern3 = new ImagePattern(imageChoisi[3]);
        ImagePattern imagePattern4 = new ImagePattern(imageChoisi[4]);
        ImagePattern imagePattern5 = new ImagePattern(imageChoisi[5]);
        ImagePattern imagePattern6 = new ImagePattern(imageChoisi[6]);
        ImagePattern imagePattern7 = new ImagePattern(imageChoisi[7]);
        ImagePattern imagePattern8 = new ImagePattern(imageChoisi[8]);

        Rectangle rectangle0 = new Rectangle(0,0,298,298);
        rectangle0.setRotate((int)(Math.random()*3+1)*90);
        rectangle0.setOnMouseClicked((event)->{
            rectangle0.setRotate(rectangle0.getRotate()+90);
        });
        Rectangle rectangle1 = new Rectangle(300,0,298,298);
        rectangle1.setRotate((int)(Math.random()*3+1)*90);
        rectangle1.setOnMouseClicked((event)->{
            rectangle1.setRotate(rectangle1.getRotate()+90);
        });
        Rectangle rectangle2 = new Rectangle(600,0,298,298);
        rectangle2.setRotate((int)(Math.random()*3+1)*90);
        rectangle2.setOnMouseClicked((event)->{
            rectangle2.setRotate(rectangle2.getRotate()+90);
        });
        Rectangle rectangle3 = new Rectangle(0,300,298,298);
        rectangle3.setRotate((int)(Math.random()*3+1)*90);
        rectangle3.setOnMouseClicked((event)->{
            rectangle3.setRotate(rectangle3.getRotate()+90);
        });
        Rectangle rectangle4 = new Rectangle(300,300,298,298);
        rectangle4.setRotate((int)(Math.random()*3+1)*90);
        rectangle4.setOnMouseClicked((event)->{
            rectangle4.setRotate(rectangle4.getRotate()+90);
        });
        Rectangle rectangle5 = new Rectangle(600,300,298,298);
        rectangle5.setRotate((int)(Math.random()*3+1)*90);
        rectangle5.setOnMouseClicked((event)->{
            rectangle5.setRotate(rectangle5.getRotate()+90);
        });
        Rectangle rectangle6 = new Rectangle(0,600,298,298);
        rectangle6.setRotate((int)(Math.random()*3+1)*90);
        rectangle6.setOnMouseClicked((event)->{
            rectangle6.setRotate(rectangle6.getRotate()+90);
        });
        Rectangle rectangle7 = new Rectangle(300,600,298,298);
        rectangle7.setRotate((int)(Math.random()*3+1)*90);
        rectangle7.setOnMouseClicked((event)->{
            rectangle7.setRotate(rectangle7.getRotate()+90);
        });
        Rectangle rectangle8 = new Rectangle(600,600,298,298);
        rectangle8.setRotate((int)(Math.random()*3+1)*90);
        rectangle8.setOnMouseClicked((event)->{
            rectangle8.setRotate(rectangle8.getRotate()+90);

        });

        melanger(imagePattern0,imagePattern1,imagePattern2,imagePattern3,imagePattern4,imagePattern5,imagePattern6,imagePattern7,imagePattern8,rectangle0,rectangle1,rectangle2,rectangle3,rectangle4,rectangle5,rectangle6,rectangle7,rectangle8);

        Group root = new Group(rectangle0,rectangle1,rectangle2,rectangle3,rectangle4,rectangle5
        ,rectangle6,rectangle7,rectangle8);
        Scene scene = new Scene(root);

        scene.setOnKeyPressed((event -> {
            if (event.getCode()== KeyCode.C){
                var.set(var.get()+1);

                switch (var.get()){
                    case 0:
                        for (int i =0;i<9;i++){
                            imageChoisi[i]=imageMario[i];
                        }
                        break;
                    case 1:
                        for (int i =0;i<9;i++){
                            imageChoisi[i]=imagesCharles[i];
                        }
                        break;
                    case 2:
                        for (int i =0;i<9;i++){
                            imageChoisi[i]=imageNic[i];
                        }
                        break;
                    case 3:
                        for (int i =0;i<9;i++){
                            imageChoisi[i]=imageSimon[i];
                        }
                        break;
                    case 4:
                        for (int i =0;i<9;i++){
                            imageChoisi[i]=imageRaph[i];
                        }
                        break;
                }
                if (var.get()==4){
                    var.set(-1);
                }
                changerImage(imageChoisi,imagePattern0,imagePattern1,imagePattern2,imagePattern3,imagePattern4,imagePattern5,imagePattern6,imagePattern7,imagePattern8,rectangle0,rectangle1,rectangle2,rectangle3,rectangle4,rectangle5,rectangle6,rectangle7,rectangle8);


            }
            else if (event.isControlDown() && event.getCode()==KeyCode.M){
                melanger(imagePattern0,imagePattern1,imagePattern2,imagePattern3,imagePattern4,imagePattern5,imagePattern6,imagePattern7,imagePattern8,rectangle0,rectangle1,rectangle2,rectangle3,rectangle4,rectangle5,rectangle6,rectangle7,rectangle8);
            }
        }));
        stage.setScene(scene);
        stage.show();
    }
    public ArrayList melanger(ImagePattern imagePattern0,ImagePattern imagePattern1,ImagePattern imagePattern2,ImagePattern imagePattern3,ImagePattern imagePattern4,ImagePattern imagePattern5,ImagePattern imagePattern6,ImagePattern imagePattern7,ImagePattern imagePattern8, Rectangle rectangle0, Rectangle rectangle1,Rectangle rectangle2,Rectangle rectangle3,Rectangle rectangle4, Rectangle rectangle5, Rectangle rectangle6, Rectangle rectangle7, Rectangle rectangle8){
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
        return melange;
    }
    public void changerImage(Image[] image,ImagePattern imagePattern0,ImagePattern imagePattern1,ImagePattern imagePattern2,ImagePattern imagePattern3,ImagePattern imagePattern4,ImagePattern imagePattern5,ImagePattern imagePattern6, ImagePattern imagePattern7, ImagePattern imagePattern8,Rectangle rectangle0,Rectangle rectangle1, Rectangle rectangle2,Rectangle rectangle3,Rectangle rectangle4,Rectangle rectangle5,Rectangle rectangle6,Rectangle rectangle7,Rectangle rectangle8){
            ImagePattern [] ip={new ImagePattern(image[0]),
                new ImagePattern(image[1]),
                    new ImagePattern(image[2]),
                    new ImagePattern(image[3]),
                    new ImagePattern(image[4]),
                    new ImagePattern(image[5]),
                    new ImagePattern(image[6]),
                    new ImagePattern(image[7]),
                    new ImagePattern(image[8])};
            melanger(ip[0],ip[1],ip[2],ip[3],ip[4],ip[5],ip[6],ip[7],ip[8],rectangle0,rectangle1,rectangle2,rectangle3,rectangle4,rectangle5,rectangle6,rectangle7,rectangle8);
            imagePattern0=ip[0];
            imagePattern1=ip[1];
            imagePattern2=ip[2];
            imagePattern3=ip[3];
            imagePattern4=ip[4];
            imagePattern5=ip[5];
            imagePattern6=ip[6];
            imagePattern7=ip[7];
            imagePattern8=ip[8];
    }

}

