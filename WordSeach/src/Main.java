import dal.Data;
import gui.SearchProgram;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.FileReader;

public class Main extends Application {
    public static void main(String[] args) throws Exception{
        Application.launch();
        FileReader fr = new FileReader("/Users/mfm/Projekter Datamatiker/WordSearch/WordSeach/Resources/brit-a-z.txt");
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        SearchProgram searchProgram = new SearchProgram();
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/SearchProgram.fxml"));
        Parent root = loader.load();
        primaryStage.setTitle("Search for Word App");
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
        searchProgram.insertWordsInListView(primaryStage);
    }
}