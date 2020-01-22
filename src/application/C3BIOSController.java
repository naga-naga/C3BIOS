package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;

public class C3BIOSController {

	@FXML
	void onInButtonClick(ActionEvent event) {
		System.out.println("debug inButton");
	}

	@FXML
	void onOutButtonClick(ActionEvent event) {
		System.out.println("debug outButton");
	}

	@FXML
	void onHistoryButtonClick(ActionEvent event) {
		System.out.println("debug historyButton");
	}

	@FXML
	void onReturnButtonClick(ActionEvent event) {
		System.out.println("debug returnButton");
	}
}
