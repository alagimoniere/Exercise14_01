import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Exercise14_01 extends Application {

 @Override
 public void start(Stage primaryStage) {
  GridPane pane = new GridPane();
  
  Image image = new Image("images/uk.jpg");
  Image image2 = new Image("images/china.jpg");
  Image image3 = new Image("images/4.jpg");
  Image image4 = new Image("images/us.jpg");
  ImageView imageView = new ImageView(image);
  ImageView imageView2 = new ImageView(image2);
  ImageView imageView3 = new ImageView(image3);
  ImageView imageView4 = new ImageView(image4);
  
  pane.add(imageView, 0, 0);
  pane.add(imageView2, 0, 1);
  pane.add(imageView3, 1, 0);
  pane.add(imageView4, 1, 1);
  
  Scene scene = new Scene(pane);
  primaryStage.setTitle("Exercise14_01");
  primaryStage.setScene(scene);
  primaryStage.show();
 }

 public static void main(String[] args) {
  launch(args);
 }
}
