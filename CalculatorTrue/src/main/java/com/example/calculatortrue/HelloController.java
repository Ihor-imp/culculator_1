package com.example.calculatortrue;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;

public class HelloController {
    @FXML
    private AnchorPane AnchorPane;
    @FXML
    private Button button_0;

    @FXML
    private Button button_1;

    @FXML
    private Button button_2;

    @FXML
    private Button button_3;

    @FXML
    private Button button_4;

    @FXML
    private Button button_5;

    @FXML
    private Button button_6;

    @FXML
    private Button button_7;

    @FXML
    private Button button_8;

    @FXML
    private Button button_9;

    @FXML
    private Button button_clear;

    @FXML
    private Button button_cr;

    @FXML
    private Button button_division;

    @FXML
    private Button button_equal;

    @FXML
    private Button button_minus;

    @FXML
    private Button button_mul;

    @FXML
    private Button button_plus;
    @FXML
    private GridPane gridPane;

    @FXML
    private Label label_display;

    @FXML
    private Label label_top;

    public double num1 = 0;
    public double num2 = 0;
    public char operation;
    public double result = 0;


    @FXML
    void button_0_click(ActionEvent event) {
        label_display.setText(label_display.getText() + "0");
    }

    @FXML
    void button_1_click(ActionEvent event) {
        label_display.setText(label_display.getText() + "1");
    }

    @FXML
    void button_2_click(ActionEvent event) {
        label_display.setText(label_display.getText() + "2");
    }

    @FXML
    void button_3_click(ActionEvent event) {
        label_display.setText(label_display.getText() + "3");
    }

    @FXML
    void button_4_click(ActionEvent event) {
        label_display.setText(label_display.getText() + "4");
    }

    @FXML
    void button_5_click(ActionEvent event) {
        label_display.setText(label_display.getText() + "5");
    }

    @FXML
    void button_6_click(ActionEvent event) {
        label_display.setText(label_display.getText() + "6");
    }

    @FXML
    void button_7_click(ActionEvent event) {
        label_display.setText(label_display.getText() + "7");
    }

    @FXML
    void button_8_click(ActionEvent event) {
        label_display.setText(label_display.getText() + "8");
    }

    @FXML
    void button_9_click(ActionEvent event) {
        label_display.setText(label_display.getText() + "9");
    }

    @FXML
    void button_clear_click(ActionEvent event) {
        label_display.setText("");
        label_top.setText("");
    }

    @FXML
    void button_cr_click(ActionEvent event) {
        label_display.setText(label_display.getText() + ".");
    }

    @FXML
    void button_division_click(ActionEvent event) {
        label_top.setText(label_display.getText() + "/");
        num1 = Double.parseDouble(label_display.getText());
        operation = '/';
        label_display.setText("");
    }

    @FXML
    public void button_equal_click(ActionEvent event) {
        label_top.setText(label_top.getText() + label_display.getText() + "=");
        num2 = Double.parseDouble(label_display.getText());
        label_display.setText(String.valueOf(Calculate()));
        num1 = 0;
        num2 = 0;
        result = 0;
    }
    public double Calculate(){
        switch (operation){
            case '/':
                if (num2 == 0){
                    label_display.setText("на нуль ділити не можна");
                }
                result = num1 / num2;
                    break;
            case '*':
                result = num1 * num2;break;
            case '+':
                result = num1 + num2;break;
            case '-':
                result = num1 - num2;break;
        }
        return result;
    }

    @FXML
    void button_minus_click(ActionEvent event) {
        label_top.setText(label_display.getText() + "-");
        num1 = Double.parseDouble(label_display.getText());
        operation = '-';
        label_display.setText("");
    }

    @FXML
    void button_mul_click(ActionEvent event) {
        label_top.setText(label_display.getText() + "*");
        num1 = Double.parseDouble(label_display.getText());
        operation = '*';
        label_display.setText("");
    }

    @FXML
    void button_plus_click(ActionEvent event) {
        label_top.setText(label_display.getText() + "+");
        num1 = Double.parseDouble(label_display.getText());
        operation = '+';
        label_display.setText("");
    }

}