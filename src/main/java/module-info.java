module prakasit.work.monopoly {
    requires javafx.controls;
    requires javafx.fxml;


    opens prakasit.work.monopoly to javafx.fxml;
    exports prakasit.work.monopoly;
}