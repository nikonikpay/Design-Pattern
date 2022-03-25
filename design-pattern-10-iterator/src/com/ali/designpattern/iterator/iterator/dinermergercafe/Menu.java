package com.ali.designpattern.iterator.iterator.dinermergercafe;

import java.util.Iterator;

public interface Menu {
	public Iterator<MenuItem> createIterator();
}
