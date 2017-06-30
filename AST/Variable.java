/*
Vinicius Yamamoto     RA 490105
Daniel Valim    RA  511315
*/
package AST;
import java.util.ArrayList;

public class Variable {
	
	public Variable(Atom at, String name, String value ,String tipo) {
		this.at = at;
		this.name = name;
		this.value = value;
        this.tipo = tipo;
	}
	public Variable(OrList auxlist, Atom at, String name, String tipo) {
		this.at = at;
		this.name = name;
        this.tipo = tipo;
        this.auxlist = auxlist;
	}

	public String getname(){
		return name;
	}

    public String getTipo(){
            return tipo;
    }

	public String getvalue(){
		return value;
	}

	public void genC(PW pw) {
        if(tipo.equals("string")){
            pw.println("strcpy("+name + " ,\" " + value + "\");");
        }else{
			pw.print(name);
			if(at == null){
				pw.out.println(" = " + value + ";");
			}else{
				pw.out.print("[");
				at.genC(pw);
				pw.out.print("]");
				if(auxlist == null){
					pw.out.println(" = " + value + ";");
				}else{
					pw.out.print("[");
					auxlist.genC(pw);
				}
			}
        }
	}

	private OrList auxlist;
	private Atom at;
    private String name;
	private String value;
    private String tipo;
}
