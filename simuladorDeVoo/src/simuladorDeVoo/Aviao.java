package simuladorDeVoo;

public class Aviao {
private double altitude;
private double velocidade;

public double getAltitude() {
	return this.altitude;
}
public void setAltitude(double altitude) {
	this.altitude = altitude;
}
public double getVelocidade() {
	return this.velocidade;
}
public void setVelocidade(double velocidade){
	this.velocidade = velocidade;
}
public Aviao (double altitude,double velocidade) {
	this.altitude = altitude;
	this.velocidade = velocidade;
}
public void reduzirVelocidade(double desaceleracao) {
	if (this.velocidade >= desaceleracao) {
	this.velocidade = velocidade - desaceleracao;
	System.out.println("Velocidade atual: " + this.velocidade);
	} else {
		this.velocidade -= velocidade;
		System.out.println("Sua altitude não pode ser reduzida abaixo de zero");
		System.out.println("Velocidade atual: " + this.velocidade);
	}
}
public void reduzirAltitude(double reduzirAltitude) {
	if (this.altitude >= reduzirAltitude) {
	this.altitude -= reduzirAltitude;
	System.out.println("Altitude atual: " + this.altitude);
	} else {
		this.altitude -= altitude;
		System.out.println("Sua altitude não pode ser reduzida abaixo de zero");
		System.out.println("Altitude atual: " + this.altitude);
	}
}
}
