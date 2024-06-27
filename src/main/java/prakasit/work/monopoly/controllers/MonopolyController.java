// Nisit Code : 6510450585
// Name : Prakasit Jaiharn

package prakasit.work.monopoly.controllers;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.ImagePattern;
import javafx.scene.shape.Rectangle;
import javafx.util.Duration;
import prakasit.work.monopoly.modelsForUI.Die;
import prakasit.work.monopoly.modelsForUI.MGameWithUI;
import prakasit.work.monopoly.modelsForUI.Player;

public class MonopolyController {

    private static final String IMAGE_PATH = "file:src/main/resources/prakasit/work/monopoly/images/dice";

    @FXML
    private HBox bottomHbox;

    @FXML
    private Rectangle dice1;

    @FXML
    private Rectangle dice2;

    @FXML
    private VBox leftVbox;

    @FXML
    private Label playerLabel;

    @FXML
    private VBox rightVbox;

    @FXML
    private HBox topHbox;

    @FXML
    private Label turnLabel;

    MGameWithUI mGame;

    @FXML
    void initialize() {
        setDiceImage(dice1);
        setDiceImage(dice2);
        setKeyPressed();
        setImage();

        mGame = new MGameWithUI();
        mGame.addPlayer("Big");
        mGame.addPlayer("Palm");
        mGame.addPlayer("Ter");
        mGame.addPlayer("Non");
        mGame.addPlayer("Peak");
        mGame.addPlayer("Boss");
        mGame.addPlayer("Jeng");
        mGame.addPlayer("Jay");
    }

    private void setImage(){

        // Manual add because square tile not have Image variables yet
        Rectangle rectangle1 = (Rectangle) leftVbox.getChildren().get(9);
        rectangle1.setFill(new ImagePattern(new Image("file:src/main/resources/prakasit/work/monopoly/images/Go.jpg")));

        Rectangle rectangle2 = (Rectangle) leftVbox.getChildren().get(8);
        rectangle2.setFill(new ImagePattern(new Image("file:src/main/resources/prakasit/work/monopoly/images/Mediterranean Avenue.png")));

        Rectangle rectangle3 = (Rectangle) leftVbox.getChildren().get(7);
        rectangle3.setFill(new ImagePattern(new Image("file:src/main/resources/prakasit/work/monopoly/images/CommunityChest.png")));

        Rectangle rectangle4 = (Rectangle) leftVbox.getChildren().get(6);
        rectangle4.setFill(new ImagePattern(new Image("file:src/main/resources/prakasit/work/monopoly/images/Baltic Avenue.png")));

        Rectangle rectangle5 = (Rectangle) leftVbox.getChildren().get(5);
        rectangle5.setFill(new ImagePattern(new Image("file:src/main/resources/prakasit/work/monopoly/images/Income Tax.jpg")));
        // Manual add because square tile not have Image variables yet
    }

    private void setKeyPressed(){
        Platform.runLater(new Runnable() {
            @Override
            public void run() {
                dice1.getScene().getWindow().addEventHandler(KeyEvent.KEY_PRESSED, (KeyEvent event) -> {
                    if(event.getCode() == KeyCode.ENTER){
                        Player player = mGame.playGame(5);
                        if(player == null){
                            turnLabel.setText("Game Over");
                            turnLabel.setStyle("-fx-text-fill: red;");
                        } else {
                            turnLabel.setText("Turn " + mGame.getRoundCount());
                            playerLabel.setText(player.getName());
                            Die[] dice = player.takeTurn();
                            animateDice(dice1, dice[0].getFaceValue());
                            animateDice(dice2, dice[1].getFaceValue());
                        }
                    }
                });

            }
        });
    }

    private void setDiceImage(Rectangle dice) {
        int pictureNum = (int) Math.ceil(Math.random() * 6);
        try {
            Image image = new Image(IMAGE_PATH + pictureNum + ".png");
            dice.setFill(new ImagePattern(image));
        } catch (Exception e) {
            System.err.println("Error loading image: " + e.getMessage());
        }
    }

    private void setDiceImage(Rectangle dice,int number) {
        try {
            Image image = new Image(IMAGE_PATH + number + ".png");
            dice.setFill(new ImagePattern(image));
        } catch (Exception e) {
            System.err.println("Error loading image: " + e.getMessage());
        }
    }

    private void animateDice(Rectangle dice, int number) {
        KeyFrame keyFrame = new KeyFrame(Duration.millis(50), event -> setDiceImage(dice));
        Timeline timeline = new Timeline(keyFrame);
        timeline.setCycleCount(10);
        timeline.play();
        timeline.setOnFinished(event -> {
            setDiceImage(dice,number);
        });
    }
}