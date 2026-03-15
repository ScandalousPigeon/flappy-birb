module com.example.flappybird {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.almasb.fxgl.all;

    opens com.example.flappybird to javafx.fxml;
    exports com.example.flappybird;
}