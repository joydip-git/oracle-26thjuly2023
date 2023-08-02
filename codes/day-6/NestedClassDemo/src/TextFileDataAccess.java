
/*public final class TextFileDataAccess extends FileDataAccess {

	public TextFileDataAccess() {
		super();
	}

	public TextFileDataAccess(String path) {
		super(path);
	}

	@Override
	public String getData() {
		return "data from text file";
	}
}
*/
public final class TextFileDataAccess implements FileDataAccess {

	private String filePath;
	public TextFileDataAccess() {
		super();
	}

	public TextFileDataAccess(String path) {
		this.filePath = path;
	}

	public String getFilePath() {
		return filePath;
	}

	public void setFilePath(String filePath) {
		this.filePath = filePath;
	}

	@Override
	public String getData() {
		return "data from text file";
	}
}
