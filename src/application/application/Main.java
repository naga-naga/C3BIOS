package application;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;


public class Main extends Application {

	public static Main main_class;
	private BorderPane root;
	private Stage stage;
	private int window_width = 600;  // ウインドウの幅
	private int window_height = 600; // ウインドウの高さ

	@Override
	public void start(Stage primaryStage) {
		try {
			main_class = this;
			stage = primaryStage;
			setPage("TopPage.fxml");
			stage.setResizable(false); // ウインドウサイズ変更不可に設定
			stage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		launch(args);
	}

	// 表示するページを設定する
	public void setPage(String fxml) {
		try {
			root = (BorderPane)FXMLLoader.load(getClass().getResource(fxml));
			stage.setScene(new Scene(root, window_width, window_height));
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

	// Controller から Main クラスを呼び出す際に使う
	public static Main getInstance() {
		return main_class;
	}
}
