package com.cg.generics;
import java.util.ArrayList;
import java.util.Iterator;
public class Example3 {
	public static void main(String[] args) {
		ArrayList<String>obj=new ArrayList<>();
		obj.add("Niku");
		obj.add("Mou");
		String res=obj.get(1);
		System.out.println(res);
		System.out.println(obj);
		Iterator<String>i=obj.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}

	}

}
