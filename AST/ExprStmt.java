/*
Vinicius Yamamoto     RA 490105
Daniel Valim    RA  511315
*/
package AST;
import java.util.ArrayList;

public class ExprStmt {
 	public ExprStmt(String var, Atom at, ArrayList<OrTest> or, ArrayList<String> tipo, OrList auxlist){
		this.or = or;
    	this.var = var;
    	this.tipo = tipo;
    	this.at = at;
    	this.auxlist = auxlist;
	}

	public void genC(PW pw){
		int i=0;
		if(tipo.get(i).equals("string")){
            pw.out.print("strcpy("+var + " ,");
            or.get(i).genC(pw);
            pw.out.print(")");
            i++;
        }else{
			pw.print(var);
			if(at != null){
				pw.out.print("[");
				at.genC(pw);
				pw.out.print("]");
			}
			pw.out.print(" = ");
			if(auxlist == null){
				while(i<or.size()){
					or.get(i).genC(pw);
					i++;
				}
			}else{
				pw.out.print("[");
				auxlist.genC(pw);
				pw.out.print("]");
			}
		}
		pw.out.println(";");
    }

	private String var;
	private ArrayList<String> tipo;
	private Atom at;
	private ArrayList<OrTest> or;
	private OrList auxlist;
}
