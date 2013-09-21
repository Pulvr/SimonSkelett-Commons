package de.hsb.simon.commons;

import java.io.Serializable;

import de.root1.simon.SimonRemote;
import de.root1.simon.SimonUnreferenced;


public interface ClientInterface/* extends Serializable, SimonUnreferenced,SimonRemote*/{
	public void callback(String text);
}
