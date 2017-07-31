/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapplication001;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.URL;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

/**
 *
 * @author Nilay
 */
public class FXMLDocumentController implements Initializable {
    private String FILE = "C:/Users/Nilay/Documents/NetBeansProjects/JavaFXApplication001/playlist.txt";
    MP3  song;
    int play_on=-1;
    int number_list=0;
    private Stage stage;
    
    @FXML
    private Label song_name;
    
    @FXML
    private Label beat_it;

    @FXML
    private Button play;

    @FXML
    private Button Open;

    @FXML
    private Button Stop;
      @FXML
    private Button exit;
      @FXML
    private ListView<String> list_view;
    ArrayList<String> list_copy = new ArrayList<>();
    ObservableList<String> list = FXCollections.observableArrayList(); 

    @FXML
    void exit(ActionEvent event) throws FileNotFoundException, IOException {
            
            File file = new File (FILE);
        try (PrintWriter printWriter = new PrintWriter (file)) {
            list.stream().forEachOrdered(item -> printWriter.println(item));
        }

            System.exit(0x0);
    }
    
    public void init(Stage stage){
        
        this.stage=stage;
    }
    
    
    @FXML
    void open(ActionEvent event) throws IOException {
            FileChooser fileChooser = new FileChooser();
            File file = fileChooser.showOpenDialog(stage);
            if(file!=null){
                play_on=0;
                play.setDisable(false);
                song = new MP3(file.getAbsolutePath());
            }
    }

    @FXML
    void play(ActionEvent event) {
       
        if(song!=null&& play_on==0 ){
            
            song.play();
            play_on=-1;
            Stop.setDisable(false);
            Open.setDisable(true);
            String name_file;
            name_file = song.filename;
            if(list.contains(name_file) && number_list < 6 ){
            list_view.setItems(list);
            song_name.setText(name_file);
            }
           
            else{
                number_list++;
                if(number_list>6){
                list.set(number_list%7,name_file);
                list_copy.set(number_list%7,name_file);
                }
                else{
                    list.add(name_file);
                    list_copy.add(name_file);
                }
                list_view.setItems(list);
                song_name.setText(name_file); 
            }
        }
       
    }

    @FXML
    void stop(ActionEvent event) {
       
        if(song!=null){
            play_on=0;   
            Open.setDisable(false);
            song.close();
            song_name.setText("Press Open or Play to continue enjoying!");
        }
    }
    
    @FXML
    void handleButtonAction(ActionEvent event) {
        System.exit(0x0);
      
    }

   
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
            play.setDisable(true);
            Stop.setDisable(true);
            song=null;
            song_name.setText("No Song Playing");
            File file = new File(FILE);
            List<String> readFile = Collections.emptyList();
        try {
            readFile = Files.readAllLines(file.toPath());
        } catch (IOException ex) {
            Logger.getLogger(FXMLDocumentController.class.getName()).log(Level.SEVERE, null, ex);
        }
            list.setAll(readFile);
            list_view.setItems(list);
   
   
    }    
   
}
