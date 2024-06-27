module prakasit.work.monopoly {
    requires javafx.controls;
    requires javafx.fxml;


    opens prakasit.work.monopoly to javafx.fxml;
    exports prakasit.work.monopoly;
    exports prakasit.work.monopoly.controllers;
    opens prakasit.work.monopoly.controllers to javafx.fxml;
}