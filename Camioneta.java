package CamionetaPOOURU;

public class Camioneta {
	
	private int ruedas;
	private int largo;
	private int ancho;
	private int motor;
	private int peso;
	private int pesoTotal;
	private int pesoPlataforma;
	private String color;
	private boolean ttraccion, asientosCuero, climatizador;
		
	public Camioneta() {
		ruedas = 4;
		largo = 4500;
		ancho = 600;
		motor = 1600;
		peso = 600;
		pesoPlataforma = 600;
	}
	
	
	public String dameCaracteristicasGenerales() {
		return "La plataforma de la camioneta tiene " + ruedas + " ruedas. Mide " + largo/1000 + " metros de largo y de ancho " + ancho + " cm, con un peso de plataforma de " + pesoPlataforma + " kg";
	}
	
	public void estableceColor(String colorCamioneta) {
		color = colorCamioneta;
	}
	
	public String DimeColor() {
		return "El color de la camioneta es " + color;
	}
	
	public void configuraAsientos(String asientosCuero) {
		if(asientosCuero.equalsIgnoreCase("si")) {
			this.asientosCuero = true;
		}
		else{
			this.asientosCuero = false;
		}
	}
	
	public String dimeAsientos() {
		if(asientosCuero == true) {
			return "La camioneta tiene asientos de cuero";
		}
		else {
			return "La camioneta NO tiene asientos de cuero";
		}
	}
	
	public void configuraClimatizador(String climatizador) {
		if(climatizador.equalsIgnoreCase("si")) {
			this.climatizador = true;
		}
		else{
			this.climatizador = false;
		}	
	}
	
	public String dimeClimatizador() {
		if(climatizador) {
			return "La camioneta tiene climatizador";
		}
		else {
			return "La camioneta NO tiene climatizador";
		}
	}
	
	public void TipoDeTraccion(String ttraccion) {
		if(ttraccion.equalsIgnoreCase("si")){
			this.ttraccion = true;
		}
		else{
			this.ttraccion = false;
		}
	}
	
	public String dimeTipoDeTraccion() {
		if(ttraccion) {
			return "La camioneta es automatica";
		}
		else {
			return "La camioneta es sincronica";
		}
	}
	
	public String PesoCamioneta() {
		int pesoCarroceria = 500;
		
		pesoTotal = pesoCarroceria + pesoPlataforma;
		
		if(asientosCuero) {
			pesoTotal = pesoTotal + 20;
		}
		
		if(climatizador) {
			pesoTotal = pesoTotal + 50;
		}
		
		return "El peso del coche es " + pesoTotal;
	}
	
	public int precioCamioneta() {
		int precioFinal = 10000;
		
		if(asientosCuero) {
			precioFinal += 2000;
		}
		
		if(climatizador) {
			precioFinal += 1500;
		}
		
		return precioFinal;
	}
}