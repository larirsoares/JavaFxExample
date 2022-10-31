package application;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class LoginController {

	@FXML
	private TextField txLogin;
	@FXML
	private TextField txsenhaLogin;
	@FXML
	private Button botaoLogin;
	
	@FXML
	public void botaoEntrarAoClicar(){
		System.out.println("btEntrarClicked");
		System.out.println("Login:"+txLogin.getText());
		System.out.println("Senha:"+txsenhaLogin.getText());
	}
	
}
