package ennam;

/**
 * Every Server controller is responsible for 3 operations: to<p>
 * - STORE data in the DB<br>
 * - LOAD data form DB<br>
 * - REMOVE data from DB <br>
 * @see server.controllers.DBController
 * 
 * @author Group 7
 *
 */
public enum OperationType {
	STORE,
	LOAD,
	REMOVE
}