module cse.jungdaekyeom.testjavafx {
    requires javafx.controls;
    requires javafx.fxml;

    opens cse.jungdaekyeom.testjavafx to javafx.fxml;
    exports cse.jungdaekyeom.testjavafx;
}