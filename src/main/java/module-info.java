module com.mycompany.studentmanagementsystem {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.mycompany.studentmanagementsystem to javafx.fxml;
    exports com.mycompany.studentmanagementsystem;
}
