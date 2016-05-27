package fileSystem;

public class File extends Entry{
	private String name;
	private long size;
	private String content;
	
	public File(Directory parent, long size, String name) {
		super(parent, name);
		this.size = size;
	}

	@Override
	public long getSize() {
		// TODO Auto-generated method stub
		return this.size;
	}
	
	public String getContent() {
		return this.content;
	}
	
	public void setContent(String c) {
		this.content = new String(c);
	}
}
