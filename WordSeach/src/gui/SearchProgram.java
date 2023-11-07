package gui;

import dal.Data;
import javafx.scene.control.ListView;
import javafx.stage.Stage;

public class SearchProgram {

    public void insertWordsInListView(Stage primaryStage){
        Data data = new Data();
        ListView<String> wordsListView = (ListView<String>) primaryStage.getScene().lookup("#wordsListView");
        if (wordsListView != null)
            wordsListView.setItems(data.getWordsFromFile());
    }
}
