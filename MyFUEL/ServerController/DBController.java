/*package ServerController;

import java.sql.Connection;

import Server.Server;
import commen.Com;
import commen.ReturnedObject;
import ennam.ObjectType;
//import commen.ReturnedObject;

/**
 * This class is a controller that checks a type of connections and 
 * due to chosen connection + operation (load/store/remove) is
 *  switching to required controller.<p>
 *  There are 3 types of operation:<br>
 *  @see server.controllers.ObjectManager
 *  @author_Group_7
 *
 */
/*public class DBController {
	
	private Connection conn;
	private Server server;
	
	public DBController(Connection conn){
		this.conn = conn;
	}
	
	
	public void setServer(Server server) {
		this.server = server;
	}



	/**
	 * @param cmd 
	 * @return
	 */
/*	public Object execute(Com cmd){
		ObjectManager ctrl = null;
		
		switch(cmd.getType()){
		
		case CHEKORDERSTATUS:{
			ctrl = new ChekOrderStatus(conn);
			break;
		}
			
		case LOGIN:{
			ctrl = new ChekLoginDetails(conn);
			break;
		}
		
		case LOGOUT:{
			ctrl = new Logout(conn);
			break;
		}
		
		case SALEFORHOME:{
			ctrl = new SaleFuelForHome(conn);
			break;
		}
		
		case UPDATERESPOND:{
			ctrl = new UpdateRespond(conn);
			break;
		}
		
		case ENTERNEWREQUEST:{
			ctrl = new EnterNewRequest(conn);
			break;
			
		}case ACTIVESALEACTION:{
			ctrl = new ActiveSaleAction(conn);
			break;
		}
		
		case ENTERPATTERN:{
			ctrl = new EnterPatternAction(conn);
			break;
		}
		
		case ADDNEWCUSTOMER:{
			ctrl = new AddnewCustomer(conn);
			break;
		}
		
		case REMOVECUTOMER:{
			ctrl = new RemoveCustomer(conn);
			break;
		}
		
		case CREATEREPORT:{
			ctrl = new CreateReport(conn);
			break;
		}
		
		case CHRGETYPE:{
			ctrl = new ChrageType(conn);
			break;
		}
		
		case SETMIN:{
			ctrl = new SetMinQuantity(conn);
			break;
		}
		
		case CHANGEORDERSTATUS:{
			ctrl = new ChangeOrderStuts(conn);
			break;
		}	
		
	}
		
		switch(cmd.getOperation()){
		case LOAD:{
			long reqnum = cmd.getRequestNumber();
			ReturnedObject ans = new ReturnedObject(reqnum);
			ans.setObject(ctrl.loadObject(cmd.getObject()));
			return ans;
		}
		case STORE:{
			long reqnum = cmd.getRequestNumber();
			ReturnedObject ans = new ReturnedObject(reqnum);
			ans.setObject(ctrl.storeObject(cmd.getObject()));
			if(ctrl.getClass().toString().equals("MailController"))
				server.sendToAllClients(ans);
		
			return ans;
			
			
		}
			
		case REMOVE:
			ctrl.removeObject(cmd.getObject());
		}
		
		return 0; ///DELETE THIS!!!!!!
	}
	
}*/
