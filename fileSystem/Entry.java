package fileSystem;
import java.util.*;
public abstract class Entry {
	protected Directory parent;
	protected double lastUpdateTime;
	protected double createTime;
	protected double lastAccessedTime;
	private String name;
	
	public Entry(Directory p, String name) {
		this.parent = p;
		this.name = name;
		this.lastUpdateTime = System.currentTimeMillis();
		this.createTime = System.currentTimeMillis();
		this.lastAccessedTime = System.currentTimeMillis();
	}
	
	public abstract long getSize();
	
	public boolean delete() {
		
		if(this.parent == null) return false;
		return parent.removeEntry(this);

	}
	
	public String getFullPath() {
		if(this.parent == null) return this.name;
		else return this.parent.getFullPath() + "/" + this.name;
	}
	
	public double getLastAccessedTime() {
		return this.lastAccessedTime;
	}

	
	public double getCreateTime() {
		return this.createTime;
	}
	
	public double getLastUpdateTime() {
		return this.lastUpdateTime;
	}
	
	
}
