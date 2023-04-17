/**
 * Clase la cual tiene las distintas variaciones de numeros los cuales se pueden restar entre si
 * @author Antonio Manuel Aragon
 * @since 0.0.1
 * @version 0.0.1
 */
public class Resta {
	/**
	 * Declaracion de la variable de tipo float del valor acumulado
	 */
	public float valorAcumulado;
	/**
	 * Metodo el cual devuelve un float
	 * @return el valor acumulado de las distintas operaciones
	 */
	public float getValorAcumulado() {
		return valorAcumulado;
	}
	/**
	 * Metodo el cual se utiliza para Setear el valor acumulado donde le facilitaremos el nuevo valor
 	 * @param valorAcumulado apunta al nuevo valor Seteado del valor acumulado
	 */
	public void setValorAcumulado(float valorAcumulado) {
		this.valorAcumulado = valorAcumulado;
	}
	/**
	 * Metodo el cual calcula la resta de dos valores decimales
	 * @param a valor de tipo float
	 * @param b valor de tipo float
	 * @return devuelve el resultado de la resta entre la variable a y b de tipo float
	 */
	public float dosReales(float a, float b) {
		return a-b;
	}
	/**
	 * Metodo el cual calcula la resta de dos valores enteros
	 * @param a valor de tipo entero
	 * @param b valor de tipo entero
	 * @return devuelve el resultado de la resta entre la variable a y b de tipo entero
	 */
	public int dosEnteros(int a, int b) {
		return a-b;
	}
	/**
	 * Metodo el cual calcula la resta de 3 valores de tipo float
	 * @param a valor de tipo float
	 * @param b valor de tipo float
	 * @param c valor de tipo float
	 * @return devuelve el resultado entre la resta de la variable a, b y c de tipo float
	 */
	
	public float tresReales(float a, float b, float c) {
		return a-b-c;
	}
	/**
	 * Metodo el cual calcula el valor que se va acumulando y restandolo otro
	 * @param a valor que se encarga de restar al valor acumulado
	 * @return devuelve el valor acumulado restante a la hora de restarle a devolviendo un float
	 */
	public float restaAcumulado(float a) {
		valorAcumulado = valorAcumulado - a;
		return valorAcumulado;
	}
}