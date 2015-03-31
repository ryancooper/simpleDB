package simpledb;

public class Table {
	private DbFile file;
	private String name;
	private String pkeyField;
	
	public Table(DbFile f, String n, String pkf) {
		file = f;
		n = name;
		pkf = pkeyField;
	}
	
	public DbFile getDbFile() {
		return file;
	}
	
	public String getName() {
		return name;
	}
	
	public String getPrimaryKeyField() {
		return pkeyField;
	}
	
}
