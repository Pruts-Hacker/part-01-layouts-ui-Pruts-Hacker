package org.adainf.javapro1uipart01.screens;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import jdk.javadoc.internal.doclets.formats.html.markup.HtmlStyle;

import java.util.concurrent.Flow;

import static jdk.javadoc.internal.doclets.formats.html.markup.HtmlStyle.*;

public class HomeScreen {

    private Scene homeScene;

    public HomeScreen() {
        FlowPane root = new FlowPane();
        FlowPane cfilms = new FlowPane();
        FlowPane content = new FlowPane();
        FlowPane sidebar = new FlowPane();
        FlowPane header = new FlowPane();


        sidebar.setPrefSize(130, 650);
        sidebar.setStyle("-fx-border-color: black; -fx-border-width: 1 1 1 1;");


        header.setPrefSize(1032, 40);


        Label label = new Label("INF CINEMA");


        Label label2 = new Label("    Search for films..");
        label2.setTextFill(Color.web("#727272FF"));


        Label link1 = new Label("New Releases");
        link1.setTextFill(Color.web("#727272FF"));


        Label link2 = new Label("Coming Soon");
        link2.setTextFill(Color.web("#727272FF"));


        Label link3 = new Label("Favourites");
        link3.setTextFill(Color.web("#727272FF"));


        Label link4 = new Label("Watch Later");
        link4.setTextFill(Color.web("#727272FF"));


        double sidebarWidth = sidebar.getPrefWidth();
        label.setPrefWidth(sidebarWidth);
        label.setMinHeight(39);
        label.setStyle("-fx-alignment: Center; -fx-border-color: Black; -fx-border-width: 0 0 1 0; -fx-font-weight: Bold; -fx-font-size: 14;");
        label.setAlignment(Pos.CENTER);


        label2.setPrefSize(1052, 40);
        label2.setStyle("-fx-border-color: Black; -fx-border-width: 1 1 1 0; -fx-font-size: 14;");


        Text films = new Text("Christmas Films");
        films.setStyle("-fx-font-weight: bold; -fx-font-size: 18");


        Text film1 = new Text ("The Nightmare Before");
        film1.setStyle("-fx-font-weight: bold");
        Text film2 = new Text ("Christmas");
        film2.setStyle("-fx-font-weight: bold");
        Text date = new Text ("1993");


        Text film3 = new Text ("How The Grinch Stole");
        film3.setStyle("-fx-font-weight: bold");
        Text film4 = new Text ("Christmas");
        film4.setStyle("-fx-font-weight: bold");
        Text date2 = new Text ("2000");


        Text film5 = new Text ("National Lampoon's");
        film5.setStyle("-fx-font-weight: bold");
        Text film6 = new Text ("Christmas Vacation");
        film6.setStyle("-fx-font-weight: bold");
        Text date3 = new Text ("1983");


        Text film7 = new Text ("A Christmas Story");
        film7.setStyle("-fx-font-weight: bold");
        Text date4 = new Text ("1989");


        Text film8 = new Text ("A Christmas Carol");
        film8.setStyle("-fx-font-weight: bold");
        Text date5 = new Text ("2009");


        Text film9 = new Text ("Office Christmas Party");
        film9.setStyle("-fx-font-weight: bold");
        Text date6 = new Text ("2016");


        Text film10 = new Text ("Lost Christmas");
        film10.setStyle("-fx-font-weight: bold");
        Text date7 = new Text ("2019");


        Text film11 = new Text ("The Christmas");
        film11.setStyle("-fx-font-weight: bold");
        Text film12 = new Text ("Chronicles");
        film12.setStyle("-fx-font-weight: bold");
        Text date8 = new Text ("2018");


        VBox txt1 = new VBox();
        VBox txt2 = new VBox();
        VBox txt3 = new VBox();
        VBox txt4 = new VBox();
        VBox txt5 = new VBox();
        VBox txt6 = new VBox();
        VBox txt7 = new VBox();
        VBox txt8 = new VBox();


        Rectangle greyRectangle = new Rectangle(120, 180);
        greyRectangle.setFill(Color.LIGHTGRAY);


        Rectangle greyRectangle2 = new Rectangle(120, 180);
        greyRectangle2.setFill(Color.LIGHTGRAY);


        Rectangle greyRectangle3 = new Rectangle(120, 180);
        greyRectangle3.setFill(Color.LIGHTGRAY);


        Rectangle greyRectangle4 = new Rectangle(120, 180);
        greyRectangle4.setFill(Color.LIGHTGRAY);


        Rectangle greyRectangle5 = new Rectangle(120, 180);
        greyRectangle5.setFill(Color.LIGHTGRAY);


        Rectangle greyRectangle6 = new Rectangle(120, 180);
        greyRectangle6.setFill(Color.LIGHTGRAY);


        Rectangle greyRectangle7 = new Rectangle(120, 180);
        greyRectangle7.setFill(Color.LIGHTGRAY);


        Rectangle greyRectangle8 = new Rectangle(120, 180);
        greyRectangle8.setFill(Color.LIGHTGRAY);


        FlowPane.setMargin(txt1, new Insets(0, 0, 0, 15));
        FlowPane.setMargin(txt2, new Insets(0, 0, 0, 40));
        FlowPane.setMargin(txt3, new Insets(0, 0, 0, 40));
        FlowPane.setMargin(txt4, new Insets(0, 0, 0, 40));
        FlowPane.setMargin(txt5, new Insets(0, 0, 0, 40));
        FlowPane.setMargin(txt6, new Insets(0, 0, 0, 40));
        FlowPane.setMargin(txt7, new Insets(20, 0, 0, 15));
        FlowPane.setMargin(txt8, new Insets(20, 0, 0, 40));


        txt1.getChildren().addAll(greyRectangle, film1, film2, date);
        txt2.getChildren().addAll(greyRectangle2, film3, film4, date2);
        txt3.getChildren().addAll(greyRectangle3, film5, film6, date3);
        txt4.getChildren().addAll(greyRectangle4, film7, date4);
        txt5.getChildren().addAll(greyRectangle5, film8, date5);
        txt6.getChildren().addAll(greyRectangle6, film9, date6);
        txt7.getChildren().addAll(greyRectangle7, film10, date7);
        txt8.getChildren().addAll(greyRectangle8, film11, film12, date8);


        FlowPane.setMargin(link1, new Insets(15, 0, 0, 15));
        FlowPane.setMargin(link2, new Insets(15, 0, 0, 15));
        FlowPane.setMargin(link3, new Insets(15, 0, 0, 15));
        FlowPane.setMargin(link4, new Insets(15, 0, 0, 15));


        link1.setStyle("-fx-alignment: Center; -fx-font-size: 12;");
        link2.setStyle("-fx-alignment: Center; -fx-font-size: 12;");
        link3.setStyle("-fx-alignment: Center; -fx-font-size: 12;");
        link4.setStyle("-fx-alignment: Center; -fx-font-size: 12;");


        cfilms.getChildren().add(films);
        content.getChildren().addAll(txt1, txt2, txt3, txt4, txt5, txt6, txt7, txt8);
        content.setAlignment(Pos.BOTTOM_LEFT);


        FlowPane.setMargin(cfilms, new Insets(25, 0, 0, 15));
        FlowPane.setMargin(content, new Insets(30, 0, 0, 0));


        content.setPrefWidth(1032);


        sidebar.getChildren().addAll(label, link1, link2, link3, link4);
        header.getChildren().addAll(label2, cfilms, content);


        root.getChildren().addAll(sidebar, header);










        homeScene = new Scene(root, 1200, 600);




    }

    public Scene getHomeScene() {
        return homeScene;
    }
}
