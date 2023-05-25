package simuladorDeVoo;

public class Simulador {
public static void main(String[] args) {
	Aviao aviao1 = new Aviao(10,900);
	System.out.println("Altitude atual: " + aviao1.getAltitude());
	System.out.println("Velocidade atual: " + aviao1.getVelocidade());
	aviao1.reduzirAltitude(1);
	aviao1.reduzirVelocidade(100);
	aviao1.reduzirAltitude(10);
	aviao1.reduzirVelocidade(500);
	aviao1.reduzirVelocidade(200);
	
}
}
