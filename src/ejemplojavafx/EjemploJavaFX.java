/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplojavafx;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


/**
 *
 * @author lamorenoca
 */
public class EjemploJavaFX extends Application {
    
    @Override
    public void start(Stage primaryStage) throws FileNotFoundException {
        VBox vlayout=new VBox(); 
        HBox hlayout=new HBox();
        FileInputStream input=new FileInputStream("Save.png");
        Image image=new Image(input);
        Button btn = new Button("Number 1");
        Button btn2 = new Button("Number 2");
        Button btn3 = new Button("Number 3");
        Button btn4 = new Button("Number 4",new ImageView(image));
        Label label=new Label("JIJIJIJEJE");
         Label label2 = new Label("Hola",new ImageView(image));
        TableView table = new TableView();
table.setEditable(true);
TableColumn firstNameCol = new TableColumn("First Name");
TableColumn lastNameCol = new TableColumn("Last Name");
TableColumn emailCol = new TableColumn("Email");
table.getColumns().addAll(firstNameCol, lastNameCol,
emailCol);
GridPane pane = new GridPane();
pane.setAlignment(Pos.CENTER);
pane.setPadding(new Insets(11.5, 12.5, 13.5, 14.5));
pane.setHgap(5.5);
pane.setVgap(5.5);
pane.add(new Label("First Name:"), 0, 0);
pane.add(new TextField(), 1, 0);
pane.add(new Label("MI:"), 0, 1);
pane.add(new TextField(), 1, 1);
pane.add(new Label("Last Name:"), 0, 2);
pane.add(new TextField(), 1, 2);
Button btAdd = new Button("Add Name");
pane.add(btAdd, 1, 3);
GridPane.setHalignment(btAdd, HPos.RIGHT);
       hlayout.getChildren().add(label);
       hlayout.getChildren().add(btn);
       hlayout.getChildren().add(btn2);
       vlayout.getChildren().add(btn3);
       vlayout.getChildren().add(label2);
       vlayout.getChildren().add(btn4); 
       vlayout.getChildren().add(hlayout);
       vlayout.getChildren().add(table);
       vlayout.getChildren().add(pane);
       Scene scene=new Scene(vlayout,200,250);
     primaryStage.setTitle("My JavaFX");
    primaryStage.setScene(scene);
        primaryStage.show();
            
        }
    public static void main(String[] args) {
        Application.launch(args);
    }
    
}
