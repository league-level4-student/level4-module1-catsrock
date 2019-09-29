package _01_Custom_ArrayList;

import java.util.List;

@SuppressWarnings("unchecked")

public class ArrayList <T>{
	//private ArrayList<T> array=new ArrayList<T>();
	 T[] list;
	
	public ArrayList() {
		
		list = (T[])new Object[0];
	}
	
	public T get(int loc) throws IndexOutOfBoundsException {
		
		if (loc < 0 || loc >= list.length) throw new IndexOutOfBoundsException();
		
			return list[loc];
		/*
			if (loc>=0|| loc<=list.length) {
				return list[loc];
			}
			else {
				throw new IndexOutOfBoundsException();
			}*/
		
	}
	
	public void add(T val) {
		
		T[] newList= (T[]) new Object[list.length + 1 ];
		
		for (int i = 0; i < list.length; i++) {
			
			newList[i]=list[i];
		}
		
		newList[list.length] = val;
		
		list = newList;
	}
	
	public void insert(int loc, T val) throws IndexOutOfBoundsException {
		
	}
	
	public void set(int loc, T val) throws IndexOutOfBoundsException {
		
	}
	
	public void remove(int loc) throws IndexOutOfBoundsException {
		
	}
	
	public boolean contains(T val) {
		
		return false;
	}
}