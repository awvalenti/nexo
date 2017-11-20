package com.github.awvalenti.now.main;

import java.nio.charset.Charset;

import com.github.awvalenti.now.mvc.controller.Controller;
import com.github.awvalenti.now.mvc.model.factory.ModelFactory;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class App extends Application {

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage stage) throws Exception {
		FXMLLoader loader = new FXMLLoader(Charset.forName("US-ASCII"));

		Parent root = loader.load(getClass().getResourceAsStream(
				"/com/github/awvalenti/now/mvc/view/View.fxml"));

		Controller controller = loader.getController();
		controller.setModel(ModelFactory.forTcc(controller,
				"C:\\desenvolvimento\\ferramentas\\c\\tcc\\win32"));

		stage.setScene(new Scene(root));
		stage.setTitle("Now");
		stage.show();
	}

}
