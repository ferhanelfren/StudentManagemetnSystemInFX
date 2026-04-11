module com.mycompany.studentmanagementsystem {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.base;

    opens com.mycompany.studentmanagementsystem to javafx.fxml;
    exports com.mycompany.studentmanagementsystem;
}
