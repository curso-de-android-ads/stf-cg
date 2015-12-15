package stf.gestordemandas.controlador;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;


@ApplicationPath("/rest/*")
public class ControladorRest extends Application {
	
	Logger logger = Logger.getGlobal();
	
	public ControladorRest(){
		
		super();
		logger.log(Level.INFO, "Controlador Path");
	}
	
}