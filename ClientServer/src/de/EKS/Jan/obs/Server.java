package de.EKS.Jan.obs;

import java.net.Socket;
import java.util.List;

public class Server {
	/**
	 * Alle verbundenen Clients
	 */
	private List<Client> connectetClients; 
	/**
	 * Alle(Auch die Wieder verbunden sind) Clients die einmal Verbunden waren
	 */
	private List<Client> disconnectetClients; 
	
	/**
	 * Die IP des Servers
	 */
	private String myIP;
	/**
	 * Den Port des Servers
	 */
	private String myPort; 
	
	/**
	 * Erstellt einen Server mit Port und IP.
	 * @param myIP Die IP 
	 * @param myPort Der Port
	 */
	public Server(String myIP, String myPort) {
		this.myIP= myIP; 
		this.myPort = myPort; 
	}
	
	/**
	 * F�gt eine bestehende Connection zu der Liste hinzu
	 * @param client Der {@link Client} der Connection {@link Socket}
	 */
	public void addConnection(Client client) {
		this.connectetClients.add(client);
	}
	/**
	 * Entfertn eine {@link Socket}connection aus der Liste. Und f�gt diese zu einer weiteren liste hinzu.
	 * @param client
	 */
	public void removeConnection(Client client){
		if(!connectetClients.contains(client)) // Schaut ob der Client tats�chlich verbunden ist
			throw new NullPointerException("Dieser Client ist nicht Verbunden!");
		
		if(disconnectetClients.contains(client)){ // Schaut ob der Client nicht schon in der "Nicht mehr verbunden" Liste ist.
			connectetClients.remove(client); // Entfernt diese dann auch der Connection liste.(Und f�gt ihn nicht nocheinmal hinzu) 
			return; 
		}
		/*
		 *  Selbsterkl�rend 
		 *  		|
		 *  	   \ /
		 */
		connectetClients.remove(client); 
		disconnectetClients.add(client);
	}
}
