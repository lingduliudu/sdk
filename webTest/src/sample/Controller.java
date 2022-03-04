package sample;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.ToolBar;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class Controller extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        try {
            stage.setTitle("测试");
            stage.initStyle(StageStyle.UNDECORATED);
            WebView w = new WebView();
            WebEngine e = w.getEngine();
            //e.load("http://localhost:10001/index.html");
            e.loadContent("<body style='backgroud-color:red;height:30px;'>HELLO</bod>");
           /* Scene scene = new Scene(w, w.getPrefWidth(),
                    w.getPrefHeight());*/
            Scene scene = new Scene(w, 300, 30);
            stage.setScene(scene);
            // 设置工具栏
            ToolBar toolBar = new ToolBar(w);
            stage.show();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static void main(String[] args) {
        launch(Controller.class, args);
    }
}
