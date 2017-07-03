/*	Vinicius Yamamoto	RA:490105
	Daniel Valim		RA:511315
*/
package AST;
import java.util.*;

public class ArgsList{
	public ArgsList(NameArray nay, String tipopar, int flagvirg){
		this.nay = nay;
		this.tipopar = tipopar;
		this.flagvirg = flagvirg;
	}

	public String gettipo(){
		return tipopar;
	}

	public int getflag(){
		return flagvirg;
	}

	public void genC(PW pw) {
		if(flagvirg == 0){
			pw.out.print(tipopar + " ");
			nay.genC(pw);
		}else{
			if(tipopar.equals("boolean")){
				pw.out.print(", " + "int" + " ");
			}else if(tipopar.equals("string")){
				pw.out.print(", " + "char[40]" + " ");
			}else{
				pw.out.print(", " + tipopar + " ");
			}
			nay.genC(pw);
		}
	}
	
	private NameArray nay;
	private String tipopar;
	private int flagvirg;
}