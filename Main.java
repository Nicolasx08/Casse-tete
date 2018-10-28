import com.sun.glass.ui.Robot;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.*;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.ImagePattern;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicInteger;

import static javafx.scene.input.KeyCombination.CONTROL_DOWN;

public class Main extends Application {

    public static void main(String[] args) {launch(args);}
    public static boolean ok=false;
    @Override
    public void start(Stage stage) {

        AtomicInteger var= new AtomicInteger();
        var.set(0);
        final boolean[] fini = {false};

        ImageView[] imaaP = new ImageView[]{
                new ImageView(),
                new ImageView(),
                new ImageView(),
                new ImageView(),
                new ImageView(),
                new ImageView(),
                new ImageView(),
                new ImageView(),
                new ImageView()
        };

       Image [] exemple = new Image[]{
               new Image("mario0.jpg"),
               new Image("mario1.jpg"),
               new Image("mario2.jpg"),
               new Image("mario3.jpg"),
               new Image("mario4.jpg"),
               new Image("mario5.jpg"),
               new Image("mario6.jpg"),
               new Image("mario7.jpg"),
               new Image("mario8.jpg"),
       };

        stage.setWidth(900);
        stage.setHeight(900);
        stage.setResizable(false);
        stage.setTitle("Casse-tête");

        MenuItem mario = new MenuItem("Mario");
        MenuItem charles = new MenuItem("Charles");
        MenuItem nic = new MenuItem("Nicolas");
        MenuItem raph = new MenuItem("Raphael");
        MenuItem simon = new MenuItem("Simon");
        MenuItem melanger = new MenuItem("Mélanger");

        Menu action = new Menu("Images");
        action.getItems().addAll(mario,charles,nic,raph,simon,melanger);

        MenuBar mb= new MenuBar(action);

        BorderPane bp = new BorderPane();

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

        ArrayList<Rectangle> rect = new ArrayList<>();

        Rectangle rectangle0 = new Rectangle(0,0,298,298);
        rectangle0.setFill(imagePattern0);
        rectangle0.setRotate((int)(Math.random()*3+1)*90);

        Rectangle rectangle1 = new Rectangle(300,0,298,298);
        rectangle1.setFill(imagePattern1);
        rectangle1.setRotate((int)(Math.random()*3+1)*90);

        Rectangle rectangle2 = new Rectangle(600,0,298,298);
        rectangle2.setFill(imagePattern2);
        rectangle2.setRotate((int)(Math.random()*3+1)*90);

        Rectangle rectangle3 = new Rectangle(0,300,298,298);
        rectangle3.setFill(imagePattern3);
        rectangle3.setRotate((int)(Math.random()*3+1)*90);

        Rectangle rectangle4 = new Rectangle(300,300,298,298);
        rectangle4.setFill(imagePattern4);
        rectangle4.setRotate((int)(Math.random()*3+1)*90);

        Rectangle rectangle5 = new Rectangle(600,300,298,298);
        rectangle5.setFill(imagePattern5);
        rectangle5.setRotate((int)(Math.random()*3+1)*90);

        Rectangle rectangle6 = new Rectangle(0,600,298,298);
        rectangle6.setFill(imagePattern6);
        rectangle6.setRotate((int)(Math.random()*3+1)*90);

        Rectangle rectangle7 = new Rectangle(300,600,298,298);
        rectangle7.setFill(imagePattern7);
        rectangle7.setRotate((int)(Math.random()*3+1)*90);

        Rectangle rectangle8 = new Rectangle(600,600,298,298);
        rectangle8.setFill(imagePattern8);
        rectangle8.setRotate((int)(Math.random()*3+1)*90);

        rect.add(rectangle0);
        rect.add(rectangle1);
        rect.add(rectangle2);
        rect.add(rectangle3);
        rect.add(rectangle4);
        rect.add(rectangle5);
        rect.add(rectangle6);
        rect.add(rectangle7);
        rect.add(rectangle8);


        melanger(null,rectangle0,rectangle1,rectangle2,rectangle3,rectangle4,rectangle5,rectangle6,rectangle7,rectangle8);

       Group root = new Group(rectangle0,rectangle1,rectangle2,rectangle3,rectangle4,rectangle5,rectangle6,rectangle7,rectangle8);
        Scene scene = new Scene(bp);

        final KeyCombination keyComb1 = new KeyCodeCombination(KeyCode.M,
                CONTROL_DOWN);
        final KeyCombination keyComb2 = new KeyCodeCombination(KeyCode.C);
        final KeyCombination keyComb3 = new KeyCodeCombination(KeyCode.S);

        mario.setOnAction(event -> {
            Robot robot = com.sun.glass.ui.Application.GetApplication().createRobot();
            var.set(-1);
            robot.keyPress(KeyCode.C.impl_getCode());
        });
        charles.setOnAction(event -> {
            Robot robot = com.sun.glass.ui.Application.GetApplication().createRobot();
            var.set(0);
            robot.keyPress(KeyCode.C.impl_getCode());
        });
        nic.setOnAction(event -> {
            Robot robot = com.sun.glass.ui.Application.GetApplication().createRobot();
            var.set(1);
            robot.keyPress(KeyCode.C.impl_getCode());
        });
        simon.setOnAction(event -> {
            Robot robot = com.sun.glass.ui.Application.GetApplication().createRobot();
            var.set(2);
            robot.keyPress(KeyCode.C.impl_getCode());
        });
        raph.setOnAction(event -> {
            Robot robot = com.sun.glass.ui.Application.GetApplication().createRobot();
            var.set(3);
            robot.keyPress(KeyCode.C.impl_getCode());
        });
        melanger.setOnAction((ActionEvent event) -> {
            Robot robot = com.sun.glass.ui.Application.GetApplication().createRobot();
            robot.keyPress(KeyCode.S.impl_getCode());
        });


        scene.setOnKeyPressed((event -> {
            if (keyComb2.match(event)){
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
                changerImage(imageChoisi,rectangle0,rectangle1,rectangle2,rectangle3,rectangle4,rectangle5,rectangle6,rectangle7,rectangle8);


            }
            else if (keyComb1.match(event)|| keyComb3.match(event)){
                melanger(null,rectangle0,rectangle1,rectangle2,rectangle3,rectangle4,rectangle5,rectangle6,rectangle7,rectangle8);
            }
        }));
            for (int i=0;i<9;i++){
                final int constante=i;
                rect.get(i).setOnDragDetected(event -> {
                    Dragboard dragboard = rect.get(constante).startDragAndDrop(TransferMode.MOVE);
                    ClipboardContent contenu = new ClipboardContent();
                    contenu.putString("");
                    dragboard.setContent(contenu);
                } );
                rect.get(i).setOnDragDone(event -> {

                });
                rect.get(i).setOnDragOver(event -> {
                    event.acceptTransferModes(TransferMode.MOVE);
                });
                rect.get(i).setOnDragDropped(event -> {
                    double varX=0;
                    double varY=0;
                    double varX1=0;
                    double varY1=0;
                    varX= ((Rectangle)event.getGestureSource()).getX();
                    varY= ((Rectangle)event.getGestureSource()).getY();
                    varX1= (rect.get(constante).getX());
                    varY1=(rect.get(constante).getY());
                    ((Rectangle) event.getGestureSource()).setX(varX1);
                    ((Rectangle) event.getGestureSource()).setY(varY1);
                    rect.get(constante).setX(varX);
                    rect.get(constante).setY(varY);

                    for (int j=0;j<9;j++){

                        if (rect.get(j).getX()==0 && rect.get(j).getY()==0){
                            imaaP[0].setImage(Image.impl_fromPlatformImage((rect.get(j).getFill())));
                        }else if (rect.get(j).getX()==300 && rect.get(j).getY()==0){
                            imaaP[1].setImage(Image.impl_fromPlatformImage((rect.get(j).getFill())));
                        }else if (rect.get(j).getX()==600 && rect.get(j).getY()==0){
                            imaaP[2].setImage(Image.impl_fromPlatformImage((rect.get(j).getFill())));
                        }else if (rect.get(j).getX()==0 && rect.get(j).getY()==300){
                            imaaP[3].setImage(Image.impl_fromPlatformImage((rect.get(j).getFill())));
                        }else if (rect.get(j).getX()==300 && rect.get(j).getY()==300){
                            imaaP[4].setImage(Image.impl_fromPlatformImage((rect.get(j).getFill())));
                        }else if (rect.get(j).getX()==600 && rect.get(j).getY()==300){
                            imaaP[5].setImage(Image.impl_fromPlatformImage((rect.get(j).getFill())));
                        }else if (rect.get(j).getX()==0 && rect.get(j).getY()==600){
                            imaaP[6].setImage(Image.impl_fromPlatformImage((rect.get(j).getFill())));
                        }else if (rect.get(j).getX()==300 && rect.get(j).getY()==600){
                            imaaP[7].setImage(Image.impl_fromPlatformImage((rect.get(j).getFill())));
                        }else if (rect.get(j).getX()==600 && rect.get(j).getY()==600){
                            imaaP[8].setImage(Image.impl_fromPlatformImage((rect.get(j).getFill())));
                        }
                    }
                    verif(exemple,imaaP,fini);
                });
            }
        rectangle0.setOnMouseClicked((event)->{
            rectangle0.setRotate(rectangle0.getRotate()+90);
            verif(exemple,imaaP,fini);
        });
        rectangle1.setOnMouseClicked((event)->{
            rectangle1.setRotate(rectangle1.getRotate()+90);
            verif(exemple,imaaP,fini);
        });
        rectangle2.setOnMouseClicked((event)->{
            rectangle2.setRotate(rectangle2.getRotate()+90);
            verif(exemple,imaaP,fini);
        });
        rectangle3.setOnMouseClicked((event)->{
            rectangle3.setRotate(rectangle3.getRotate()+90);
            verif(exemple,imaaP,fini);
        });
        rectangle4.setOnMouseClicked((event)->{
            rectangle4.setRotate(rectangle4.getRotate()+90);
            verif(exemple,imaaP,fini);
        });
        rectangle5.setOnMouseClicked((event)->{
            rectangle5.setRotate(rectangle5.getRotate()+90);
            verif(exemple,imaaP,fini);
        });
        rectangle6.setOnMouseClicked((event)->{
            rectangle6.setRotate(rectangle6.getRotate()+90);
            verif(exemple,imaaP,fini);
        });
        rectangle7.setOnMouseClicked((event)->{
            rectangle7.setRotate(rectangle7.getRotate()+90);
            verif(exemple,imaaP,fini);
        });
        rectangle8.setOnMouseClicked((event)->{
            rectangle8.setRotate(rectangle8.getRotate()+90);
            verif(exemple,imaaP,fini);
        });
                if (fini[0]){
                    Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
                    alert.setTitle("Félicitations!!!!");
                    switch (var.get()){
                        case 0:alert.setHeaderText("Vous avez passé le casse-tête de Mario!");break;
                        case 1:alert.setHeaderText("Vous avez passé le casse-tête de Charles!");break;
                        case 2:alert.setHeaderText("Vous avez passé le casse-tête de Nicolas!");break;
                        case 3:alert.setHeaderText("Vous avez passé le casse-tête de Simon!");break;
                        case 4:alert.setHeaderText("Vous avez passé le casse-tête de Rapahel!");break;
                    }

                    alert.setContentText("Voulez-vous rejouer?");

                    Optional<ButtonType> result = alert.showAndWait();
                    if (result.get() == ButtonType.OK){
                        var.set(-1);
                        changerImage(imageChoisi,rectangle0,rectangle1,rectangle2,rectangle3,rectangle4,rectangle5,rectangle6,rectangle7,rectangle8);
                        fini[0] =false;
                    } else {
                        System.exit(0);
                    }

                }

        bp.setTop(mb);
        bp.setCenter(root);

        stage.setScene(scene);
        stage.show();
    }
    public void melanger(ImagePattern[] ip,Rectangle rectangle0, Rectangle rectangle1,Rectangle rectangle2,Rectangle rectangle3,Rectangle rectangle4, Rectangle rectangle5, Rectangle rectangle6, Rectangle rectangle7, Rectangle rectangle8){
        if (!ok){
            ArrayList<ImagePattern> melange = new ArrayList<>();
            melange.add((ImagePattern) rectangle0.getFill());
            melange.add((ImagePattern) rectangle1.getFill());
            melange.add((ImagePattern) rectangle2.getFill());
            melange.add((ImagePattern) rectangle3.getFill());
            melange.add((ImagePattern) rectangle4.getFill());
            melange.add((ImagePattern) rectangle5.getFill());
            melange.add((ImagePattern) rectangle6.getFill());
            melange.add((ImagePattern) rectangle7.getFill());
            melange.add((ImagePattern) rectangle8.getFill());
            Collections.shuffle(melange);
            rectangle0.setFill(melange.get(0));
            rectangle0.setRotate((int)(Math.random()*3+1)*90);
            rectangle1.setFill(melange.get(1));
            rectangle1.setRotate((int)(Math.random()*3+1)*90);
            rectangle2.setFill(melange.get(2));
            rectangle2.setRotate((int)(Math.random()*3+1)*90);
            rectangle3.setFill(melange.get(3));
            rectangle3.setRotate((int)(Math.random()*3+1)*90);
            rectangle4.setFill(melange.get(4));
            rectangle4.setRotate((int)(Math.random()*3+1)*90);
            rectangle5.setFill(melange.get(5));
            rectangle5.setRotate((int)(Math.random()*3+1)*90);
            rectangle6.setFill(melange.get(6));
            rectangle6.setRotate((int)(Math.random()*3+1)*90);
            rectangle7.setFill(melange.get(7));
            rectangle7.setRotate((int)(Math.random()*3+1)*90);
            rectangle8.setFill(melange.get(8));
            rectangle8.setRotate((int)(Math.random()*3+1)*90);
        }
        else {
            ArrayList<ImagePattern> melange = new ArrayList<>();
            rectangle0.setFill(ip[0]);
            rectangle1.setFill(ip[1]);
            rectangle2.setFill(ip[2]);
            rectangle3.setFill(ip[3]);
            rectangle4.setFill(ip[4]);
            rectangle5.setFill(ip[5]);
            rectangle6.setFill(ip[6]);
            rectangle7.setFill(ip[7]);
            rectangle8.setFill(ip[8]);
            melange.add((ImagePattern) rectangle0.getFill());
            melange.add((ImagePattern) rectangle1.getFill());
            melange.add((ImagePattern) rectangle2.getFill());
            melange.add((ImagePattern) rectangle3.getFill());
            melange.add((ImagePattern) rectangle4.getFill());
            melange.add((ImagePattern) rectangle5.getFill());
            melange.add((ImagePattern) rectangle6.getFill());
            melange.add((ImagePattern) rectangle7.getFill());
            melange.add((ImagePattern) rectangle8.getFill());
            Collections.shuffle(melange);
            rectangle0.setFill(melange.get(0));
            rectangle0.setRotate((int)(Math.random()*3+1)*90);
            rectangle1.setFill(melange.get(1));
            rectangle1.setRotate((int)(Math.random()*3+1)*90);
            rectangle2.setFill(melange.get(2));
            rectangle2.setRotate((int)(Math.random()*3+1)*90);
            rectangle3.setFill(melange.get(3));
            rectangle3.setRotate((int)(Math.random()*3+1)*90);
            rectangle4.setFill(melange.get(4));
            rectangle4.setRotate((int)(Math.random()*3+1)*90);
            rectangle5.setFill(melange.get(5));
            rectangle5.setRotate((int)(Math.random()*3+1)*90);
            rectangle6.setFill(melange.get(6));
            rectangle6.setRotate((int)(Math.random()*3+1)*90);
            rectangle7.setFill(melange.get(7));
            rectangle7.setRotate((int)(Math.random()*3+1)*90);
            rectangle8.setFill(melange.get(8));
            rectangle8.setRotate((int)(Math.random()*3+1)*90);
        }

        ok=false;
    }
    public void changerImage(Image[] image,Rectangle rectangle0,Rectangle rectangle1, Rectangle rectangle2,Rectangle rectangle3,Rectangle rectangle4,Rectangle rectangle5,Rectangle rectangle6,Rectangle rectangle7,Rectangle rectangle8){
            ImagePattern [] ip={new ImagePattern(image[0]),
                new ImagePattern(image[1]),
                    new ImagePattern(image[2]),
                    new ImagePattern(image[3]),
                    new ImagePattern(image[4]),
                    new ImagePattern(image[5]),
                    new ImagePattern(image[6]),
                    new ImagePattern(image[7]),
                    new ImagePattern(image[8])};
            ok=true;
            melanger(ip,rectangle0,rectangle1,rectangle2,rectangle3,rectangle4,rectangle5,rectangle6,rectangle7,rectangle8);
    }
    public void verif(Image[] exemple,ImageView[]imaaP,boolean[]fini){
        fini[0]=true;
        for (int k =0;k<9;k++){
            if (!exemple[k].equals(imaaP[k].getImage())){
                fini[0]=false;
            }
        }
    }

}

