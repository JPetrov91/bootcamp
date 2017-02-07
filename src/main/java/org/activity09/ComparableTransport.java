package org.activity09;

import org.activity04.Transport;

// TODO Extend activity05.Transport as ComparableTransport class, and
// implement Comparable<Transport> interface

public class ComparableTransport extends Transport implements Comparable<Transport>
	{

	public ComparableTransport(String id) {
		super(id);
		// TODO Auto-generated constructor stub
	}
	
	public ComparableTransport(String id, float consumption, int tankSize) {
		super(id, consumption, tankSize);
	}

	// TODO reuse constructor of Transport for constructor of
	// ComparableTransport

	// TODO Implement equals(Object) method:
	// return true, if current transport and passed transport has the
	// same type (Transport) and id (i.e. registration number), otherwise return
	// false
	// HINT use "if(obj instanceof Transport)", to check, that passed object
	// has proper type

	// TODO Implement compareTo(Transport) method
	// Sort Transport by their Id.
	// HINT: reuse equals(Object) method.
	public boolean equals(Object obj) {
		if(obj instanceof Transport) return this.getId() == ((Transport) obj).getId();
		return false;
	}

	@Override
	public int compareTo(Transport o) {
		// TODO Auto-generated method stub
		if(this.equals(0)) return 0;
		else if(this.getId().compareTo(o.getId()) > 0) return 1;
		else if(this.getId().compareTo(o.getId()) < 0) return -1;
		return 0;
	}
}
