package com.multi.day12;

public class Product<T, M> {
	T kind;
	M model;

	public Product(T kind, M model) {
		super();
		this.kind = kind;
		this.model = model;
	}

	public T getKind() {
		return kind;
	}

	public void setKind(T kind) {
		this.kind = kind;
	}

	public M getModel() {
		return model;
	}

	public void setModel(M model) {
		this.model = model;
	}

	@Override
	public String toString() {
		return "Product [kind=" + kind + ", model=" + model + "]";
	}
	
	
}
