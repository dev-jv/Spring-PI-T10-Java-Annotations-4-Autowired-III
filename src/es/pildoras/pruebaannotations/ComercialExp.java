package es.pildoras.pruebaannotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component // Toma el nombre de la clase comercialExp
public class ComercialExp implements Empleados {
		
//	@Autowired // Aplicado a un método cualquiers
//	public void nombreIndiferente(CreacionInformeFinanciero nuevoInforme) {
//		this.nuevoInforme = nuevoInforme;
//	}
		
//	@Autowired // Aplicado a un método Setter
//	public void setNuevoInforme(CreacionInformeFinanciero nuevoInforme) {
//		this.nuevoInforme = nuevoInforme;
//	}
	
/*	@Autowired // Busca una clase que implemente CreacionInformeFinanciero y devuelve algo, algo que luego será inyectado en nuevoInforme
	public ComercialExp(CreacionInformeFinanciero nuevoInforme) { 
		this.nuevoInforme = nuevoInforme; // this.nuevoInforme toma lo devuelto al final
	}*/

	@Override
	public String getTareas() {
		// TODO Auto-generated method stub
		return "Vender, vender y vender más!!";
	}

	@Override
	public String getInforme() {
		// TODO Auto-generated method stub
//		return "Informe generado por el comercial";
		return nuevoInforme.getInformeFinanciero(); // Referenciando al actualizado nuevoInforme, llama al método getInformeFinanciero
	}
	
//	private CreacionInformeFinanciero nuevoInforme; // Recibe toda la info. Aquí almacemos la inyección

	@Autowired // Aplicado a un campo de clase
	private CreacionInformeFinanciero nuevoInforme;
}





/*Dependiendo de cual forma nos sea más conveniente, las utilizaremos. */