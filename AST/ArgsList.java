/*	Vinicius Yamamoto	RA:490105
	Daniel Valim		RA:511315
*/
package AST;
import java.util.*;

public class ArgsList{
	public ArgsList(NameArray nay, String tipopar){
		this.nay = nay;
		this.tipopar = tipopar;
	}

	public String gettipo(){
		return tipopar;
	}

	private NameArray nay;
	private String tipopar;
}