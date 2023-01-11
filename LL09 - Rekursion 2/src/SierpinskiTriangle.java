import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Polygon;
import javafx.stage.Stage;

public class SierpinskiTriangle extends Application {
    private int order = 5;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        GridPane root = new GridPane();
        root.setAlignment(Pos.CENTER);
        root.setHgap(10);
        root.setVgap(10);
        root.setPadding(new Insets(25, 25, 25, 25));

        Pane trianglePane = new Pane();
        drawTriangle(trianglePane, order);

        root.add(trianglePane, 0, 0);

        Button increaseButton = new Button(">");
        increaseButton.setOnAction(e -> {
            order++;
            trianglePane.getChildren().clear();
            drawTriangle(trianglePane, order);
        });

        Button decreaseButton = new Button("<");
        decreaseButton.setOnAction(e -> {
            if (order > 1) {
                order--;
                trianglePane.getChildren().clear();
                drawTriangle(trianglePane, order);
            }
        });

        root.add(increaseButton, 0, 1);
        root.add(decreaseButton, 1, 1);

        Scene scene = new Scene(root, 400, 400);

        primaryStage.setTitle("Sierpinski Triangle");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private void drawTriangle(Pane pane, int order) {
        double width = pane.getWidth();
        double height = pane.getHeight();
        double x1 = width / 2;
        double y1 = 0;
        double x2 = 0;
        double y2 = height;
        double x3 = width;
        double y3 = height;
        drawTriangle(pane, order, x1, y1, x2, y2, x3, y3);
    }

    private void drawTriangle(Pane pane, int order, double x1, double y1, double x2, double y2, double x3, double y3) {
        if (order == 0) {
            Polygon triangle = new Polygon();
            triangle.getPoints().addAll(x1, y1, x2, y2, x3, y3);
            triangle.setFill(Color.BLACK);
            pane.getChildren().add(triangle);
        } else {
            double x12 = (x1 + x2) / 2;
            double y12 = (y1 + y2) / 2;
            double x23 = (x2 + x3) / 2;
            double y23 = (y2 + y3) / 2;
            double x13 = (x1 + x3) / 2;
            double y13 = (y1 + y3) / 2;
            drawTriangle(pane, order - 1, x1, y1, x12, y12, x13, y13);
            drawTriangle(pane, order - 1, x12, y12, x2, y2, x23, y23);
            drawTriangle(pane, order - 1, x13, y13, x23, y23, x3, y3);
        }
    }

}