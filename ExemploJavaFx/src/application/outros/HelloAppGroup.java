package application.outros;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class HelloAppGroup extends Application{

	public static void main(String[] args) {
		launch(args);

	}

	@Override
	public void start(Stage stage) throws Exception {
		
		Text text = new Text("Oi Pessoal");
		text.setFont(Font.font("Verdana", 50));
		text.setFill(Color.AQUAMARINE);
		text.setX(50);
		text.setX(50);
		
		Group group = new Group();
		
		group.getChildren().add(text);
		

		Text text2 = new Text("Text2");
		text2.setFont(Font.font("Verdana", 20));
		text2.setFill(Color.YELLOW);
		text2.setX(300);
		text2.setX(300);
		
		
		group.getChildren().add(text2);
		VBox vbox = new VBox(group);
	
		
		stage.setScene(new Scene(vbox, 400, 400));
		stage.show();
	}

	

}
