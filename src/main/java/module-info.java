module org.adainf.javapro1uipart01 {
    requires javafx.controls;
    requires javafx.fxml;
    requires jdk.javadoc;


    opens org.adainf.javapro1uipart01 to javafx.fxml;
    exports org.adainf.javapro1uipart01;
}