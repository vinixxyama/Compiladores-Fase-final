/*	Vinicius Yamamoto	RA:490105
	Daniel Valim		RA:511315
*/
package AST;
import java.util.*;

public class NameArray{
	public NameArray(String vetname){
		this.vetname = vetname;
	}

	public String getvetname(){
		return vetname;
	}

	public void genC(PW pw) {
		pw.out.print(vetname);
	}

	private String vetname;
}