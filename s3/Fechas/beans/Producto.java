package beans;


public class Producto {
private int codigo;
private String nombre;
private double precio;
private String fechavencimiento;
public int getCodigo() {
	return codigo;
}
public void setCodigo(int codigo) {
	this.codigo = codigo;
}
public String getNombre() {
	return nombre;
}
public void setNombre(String nombre) {
	this.nombre = nombre;
}
public double getPrecio() {
	return precio;
}
public void setPrecio(double precio) {
	this.precio = precio;
}
public String getFechavencimiento() {
	return fechavencimiento;
}
public void setFechavencimiento(String fechavencimiento) {
	this.fechavencimiento = fechavencimiento;
}
public Producto(int codigo, String nombre, double precio,
		String fechavencimiento) {
	this.codigo = codigo;
	this.nombre = nombre;
	this.precio = precio;
	this.fechavencimiento = fechavencimiento;
}

}
