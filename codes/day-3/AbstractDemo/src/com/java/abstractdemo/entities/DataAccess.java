package com.java.abstractdemo.entities;

public abstract class DataAccess {
	String _path;

	public DataAccess() {
	}

	public DataAccess(String path) {
		_path = path;
	}

	public String getPath() {
		return _path;
	}

	public void setPath(String _path) {
		this._path = _path;
	}

	public abstract String getData();
}
