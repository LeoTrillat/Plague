package application;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;


public class Main extends Application {
	
	@Override
	public void start(Stage primaryStage) {
		try {
			
			FXMLLoader monde = new FXMLLoader();
			monde.setLocation(Main.class.getResource("/view/Monde.fxml"));
			AnchorPane root = (AnchorPane) monde.load();
			Scene scene = new Scene (root);
			
			primaryStage.setResizable(false);
			primaryStage.setTitle("Plague");
			
			primaryStage.setScene(scene);
			primaryStage.show();
			
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}

}
