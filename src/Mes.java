import java.util.ArrayList;
public class Mes {

	private  ArrayList <String> llistaMesos = new ArrayList<String>(); // això és com un atribut

	public Mes(String nom) {

		afegirMes();
	}

	public ArrayList<String> getLlistaMesos() {
		return llistaMesos;
	}

	public void setLlistaMesos(ArrayList<String> llistaMesos) {
		this.llistaMesos = llistaMesos;
	}


	public void afegirMes() {

		llistaMesos.add("gener");
		llistaMesos.add("febrer");
		llistaMesos.add("març");
		llistaMesos.add("abril");
		llistaMesos.add("maig");
		llistaMesos.add("juny");
		llistaMesos.add("juliol");
		llistaMesos.add("agost");
		llistaMesos.add("setembre");
		llistaMesos.add("octubre");
		llistaMesos.add("novembre");
		llistaMesos.add("desembre");

		

	}


}
