package com.lilin.client.Class;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;

/**
 * @author lilin
 * @date 2019/10/6  -  9:32 下午
 */
public class ChangeView {


    public ChangeView(String path, String title, ActionEvent event) throws IOException {
        URL resource = getClass().getClassLoader().getResource(path);
        Parent root = FXMLLoader.load(resource);
        Scene scene = new Scene(root, 900, 500);
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.hide();
        stage.setScene(scene);
        stage.setTitle(title);
        stage.show();
    }


}
