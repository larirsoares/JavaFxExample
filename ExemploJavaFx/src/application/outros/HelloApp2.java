package application.outros;

import javafx.application.Application;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class HelloApp2 extends Application{

	public static void main(String[] args) {
		launch(args);

	}

	@Override
	public void start(Stage stage) throws Exception {
		
		Text text = new Text("Boa tarde");
		text.setFont(Font.font("Verdana", 50));
		text.setFill(Color.GREENYELLOW);
		
		StackPane stackpane = new  StackPane();
		stackpane.getChildren().add(text);
		

		Text text2 = new Text("Text2");
		text2.setFont(Font.font("Verdana", 20));
		text2.setFill(Color.YELLOW);
		
		
		stackpane.getChildren().add(text2);
	
		
		stage.setScene(new Scene(stackpane, 400, 400, Color.VIOLET));
		stage.show();
	}

	

}
