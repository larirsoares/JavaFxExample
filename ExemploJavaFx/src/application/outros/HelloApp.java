package application.outros;

import javafx.application.Application;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class HelloApp extends Application{

	public static void main(String[] args) {
		launch(args);

	}

	@Override
	public void start(Stage stage) throws Exception {
		// TODO Auto-generated method stub
		
		stage.setScene(new Scene(createContent(), 300, 400));
		stage.show();
	}

	private Parent createContent() {
		
		return new StackPane(new Text("Oi Pessoal"));
	}

}
