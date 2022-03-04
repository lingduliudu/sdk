package sample;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.ToolBar;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class Controller extends Application {
    private double xOffset = 0;
    private double yOffset = 0;

    @Override
    public void start(Stage stage) throws Exception {
        try {
            stage.setTitle("测试");
            stage.initStyle(StageStyle.UNDECORATED);
            WebView w = new WebView();
            WebEngine e = w.getEngine();
            e.load("http://localhost:10001/loading.html");
           /* Scene scene = new Scene(w, w.getPrefWidth(),
                    w.getPrefHeight());*/
            w.setOnMousePressed(event -> {
                xOffset = event.getSceneX();
                yOffset = event.getSceneY();
            });
            w.setOnMouseDragged(event -> {
                stage.setX(event.getScreenX() - xOffset);
                stage.setY(event.getScreenY() - yOffset);
            });
            Scene scene = new Scene(w,502,81);

            stage.setScene(scene);

            // 设置工具栏
            ToolBar toolBar = new ToolBar(w);
            stage.setResizable(false);

            stage.show();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static void main(String[] args) {
        launch(Controller.class, args);
    }
}
