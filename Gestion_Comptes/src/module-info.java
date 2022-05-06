 module Gestion_Comptes {
	requires javafx.controls;
	requires java.sql ;
	requires javafx.fxml;
	/*
	opens application.Controller to javafx.graphics, javafx.fxml;
	*/
	opens application.Controller to javafx.fxml ;
	exports application to javafx.graphics ;
	exports application.Controller to javafx.fxml ;
	
}
