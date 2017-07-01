
/*
Vinicius Yamamoto     RA 490105
Daniel Valim    RA  511315
*/
package AST;
import java.util.*;

public class Details{
	public Details(Numbers ns, String sl, int flag){
		this.ns = ns;
		this.sl = sl;
		this.flag = flag;
	}

	public Details(OrList auxlist, int flag){
		this.auxlist = auxlist;
		this.flag = flag;
	}

	public void genC(PW pw){
		if(flag == 0){
			pw.out.print("[");
			if(ns != null){
				ns.genC(pw);
			}else{
				pw.out.print(sl);
			}
			pw.out.print("]");
		}else{
			pw.out.print("(");
			auxlist.genC(pw);
			pw.out.print(")");
		}
	}

	private int flag;
	private OrList auxlist;
	private Numbers ns; 
	private String sl;
}