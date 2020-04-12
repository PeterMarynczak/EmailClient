module EmailClient {
    requires javafx.fxml;
    requires javafx.controls;
    requires javafx.graphics;
    requires activation;
    requires java.mail;

    opens com.marynczak;
    opens com.marynczak.view;
    opens com.marynczak.controller;
}