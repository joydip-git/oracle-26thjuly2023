
/*public abstract class FileDataAccess {
	private String filePath;
	public FileDataAccess() {}
	public FileDataAccess(String path) {
		this.filePath = path;
	}
	
	public String getFilePath() {
		return filePath;
	}
	public void setFilePath(String filePath) {
		this.filePath = filePath;
	}
	public abstract String getData();
}*/

/*public class FileDataAccess {
	private String filePath;

	public FileDataAccess() {
	}

	public FileDataAccess(String path) {
		this.filePath = path;
	}

	public String getFilePath() {
		return filePath;
	}

	public void setFilePath(String filePath) {
		this.filePath = filePath;
	}

	public String getData() {
		return "data from some file";
	}
}*/
public interface FileDataAccess {
	public String getData();
}
