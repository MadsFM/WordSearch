package dal;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Data {

    public ObservableList<String> getWordsFromFile(){
        ObservableList<String> words = FXCollections.observableArrayList();
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader("/Users/mfm/Projekter Datamatiker/WordSearch/WordSeach/Resources/brit-a-z.txt"));
            String line;
            while ((line = bufferedReader.readLine()) != null){
                words.add(line);
            }
            bufferedReader.close();
        } catch (IOException ex){
            ex.printStackTrace();
        }
        return words;
    }



}
