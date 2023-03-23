module com.example.lambda_expressions {
    requires javafx.controls;
    requires javafx.fxml;
            
                            
    opens com.example.lambda_expressions to javafx.fxml;
    exports com.example.lambda_expressions;
}