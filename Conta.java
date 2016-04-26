package br.unipe.mt3.modelo;

public class Conta {
private int id;
private String numero;
private double saldo;
private boolean status;
private String titular;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getNumero() {
	return numero;
}
public void setNumero(String numero) {
	this.numero = numero;
}
public double getSaldo() {
	return saldo;
}
public void setSaldo(double saldo) {
	this.saldo = saldo;
}
public boolean isStatus() {
	return status;
}
public void setStatus(boolean status) {
	this.status = status;
}
public String getTitular() {
	return titular;
}
public void setTitular(String titular) {
	this.titular = titular;
}

@Override
public String toString() {
	return "\nConta [id=" + id + ", numero " + numero + ", saldo=" + saldo + ", status" + status + "titular"+ titular +"]";
}

	
}
