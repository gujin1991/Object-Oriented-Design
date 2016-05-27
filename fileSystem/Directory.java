package fileSystem;
import java.util.*;

public class Directory extends Entry{
	private LinkedList<Entry> contents;
	private String name;
	private long size;
	
	public Directory(Directory parent, String name) {
		super(parent, name);
		this.contents = new LinkedList<>();
		this.size = 0;
	}

	@Override
	public long getSize() {
		// TODO Auto-generated method stub
		return size;
	}
	
	public static long countSize(Directory d) {
		long curSize = 0;
		for(Entry e : d.contents) {
			if(e instanceof Directory) {
				curSize++;
				Directory temp = (Directory) e;
				curSize += temp.getSize();
			} else {
				curSize++;
			}
		}
		return curSize;
	}
	
	public boolean addEntry(Entry e) {
		if(e instanceof Directory) {
			Directory temp = (Directory) e;
			this.size += Directory.countSize(temp);
		} else {
			this.size++;
		}
		return this.contents.add(e);

	}
	
	public boolean removeEntry(Entry e) {
		if(e instanceof Directory) {
			Directory temp = (Directory) e;
			this.size -= Directory.countSize(temp);
		} else {
			this.size--;
		
		}
		return this.contents.remove(e);
	}

}
