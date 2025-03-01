package de.EKS.Jan.obs;

import java.net.Socket;

public class Client {
	/**
	 * Der Socket des Clients
	 */
	private Socket socket; 
	/**
	 * Die IP des Clients
	 */
	private String ip; 
	/**
	 * Der Port des Clients
	 */
	private String port;
	/**
	 * Die Lokale ID des Cleints
	 */
	private int id; 
	
	/**
	 * Der User welcher mit dem Client den Server ansteuert.
	 */
	private User user; 
	public Client(String ip, String port) {
		this.ip = ip;
		this.port = port;
	}
	/**
	 * Gibt den Socket des Clients
	 * @return Der Socket
	 */
	public Socket getSocket() {
		return socket;
	}
	/**
	 * Setzt den Socket des Clients
	 * @param socket Der Socket
	 */
	public void setSocket(Socket socket) {
		this.socket = socket;
	}
	/**
	 * Gibt die IP des Clients
	 * @return Die IP
	 */
	public String getIp() {
		return ip;
	}
	/**
	 * Settz die IP des Clients
	 * @param ip Die IP
	 */
	public void setIp(String ip) {
		this.ip = ip;
	}
	/**
	 * Gibt den Port des Clients
	 * @return Den Port
	 */
	public String getPort() {
		return port;
	}
	/**
	 * Setzt den Port desClients 
	 * @param port Den port 
	 */
	public void setPort(String port) {
		this.port = port;
	}
	/**
	 * Gibt die ID des Clients
	 * @return Die ID 
	 */
	public int getId() {
		return id;
	}
	/**
	 * Setzt die ID
	 * @param id Die ID
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * Gibt den User des Clients 
	 * @return Den {@link User}
	 */
	public User getUser() {
		return user;
	}
	/**
	 * Setzt den User des Clients
	 * @param user Der {@link User}
	 */
	public void setUser(User user) {
		this.user = user;
	}
}
