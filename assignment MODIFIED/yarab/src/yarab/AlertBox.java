package yarab;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.geometry.*;

public class AlertBox {
	Scene scene;
	public static void display(String title, String massage) {
		GridPane grid=new GridPane();
		Stage window =new Stage();
		window.setMinWidth(400);
		window.initModality(Modality.APPLICATION_MODAL);
		window.setTitle(title);
		Label label= new Label();
		label.setText(massage);
		Button close=new Button("close");
		close.setOnAction(e->window.close());
		VBox layout = new VBox(10);
		layout.getChildren().addAll(label,close);
		layout.setAlignment(Pos.CENTER);
		Scene scene= new Scene(layout);
		window.setScene(scene);
		window.showAndWait();
		
	}

}
