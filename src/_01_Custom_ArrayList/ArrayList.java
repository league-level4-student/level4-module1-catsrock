package _01_Custom_ArrayList;

import java.util.List;

@SuppressWarnings("unchecked")

public class ArrayList <T>{
	//private ArrayList<T> array=new ArrayList<T>();
	List <T> list;
	
	public ArrayList() {
		
		list = (List<T>) new Object();
	}
	
	public T get(int loc) throws IndexOutOfBoundsException {
		//array.add((T[])loc);
		
		return null;
	}
	
	public void add(T val) {
		
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