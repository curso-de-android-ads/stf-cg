package stf.gestordemandas.persistencia;

/**
*
* @author WitaloCarlos
*/
public class DaoConsultarException extends RuntimeException {

   
   /**
	 * 
	 */
	private static final long serialVersionUID = 6354947098410109053L;

/**
    * Constructs an instance of <code>DaoConsultarException</code> with the
    * specified detail message.
    *
    * @param msg the detail message.
    */
   public DaoConsultarException(String msg) {
       super(msg);
   }
}