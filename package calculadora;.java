package calculadora;
/**
 * Clase la cual tiene las distintas variaciones de numeros los cuales se pueden restar entre si
 * @author Antonio Manuel Aragon
 * @since 0.0.1
 * @version 0.0.1
 */
public class Resta {
	
	public float valorAcumulado;
	
	public float getValorAcumulado() {
		return valorAcumulado;
	}

	public void setValorAcumulado(float valorAcumulado) {
		this.valorAcumulado = valorAcumulado;
	}
	
	public float dosReales(float a, float b) {
		return a-b;
	}
	
	public int dosEnteros(int a, int b) {
		return a-b;
	}
	
	public float tresReales(float a, float b, float c) {
		return a-b-c;
	}
	
	public float restaAcumulado(float a) {
		valorAcumulado = valorAcumulado - a;
		return valorAcumulado;
	}
}