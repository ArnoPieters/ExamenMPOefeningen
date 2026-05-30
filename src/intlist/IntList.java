package intlist;

import java.util.Arrays;
import java.util.stream.IntStream;
/**
 * creates an empty or a non empty IntList
 */
public class IntList {
	/**
	 * @representationObject
	 */
	private int[] elements;
	/**
	 * @post | getLength() == 0
	 */
	public IntList() {
		elements = new int[0];
	}
	/**
	 * @pre | lijst != null
	 * @creates | elements
	 * @post | getLength() == lijst.length
	 * @post | IntStream.range(0,lijst.length).allMatch(i->lijst[i]==toArray()[i])
	 */
	public IntList(int[] lijst) {
		elements = lijst.clone();
	}
	/**
	 * @inspects | this
	 * @post |result >=0
	 * @post | toArray().length == result
	 * 
	 */
	public int getLength() {
		return elements.length;
	}
	
	/**
	 * @pre | 0<=index && index<getLength()
	 * @inspects |  this
	 * @post | result == toArray()[index]
	 */
	public int getAt(int index) {
		return elements[index];
	}
	/**
	 * @creates | result
	 * @post | result != null
	 * 
	 */
	public int[] toArray() {
		return elements.clone();
	}
	/**
	 * @pre | toArray().length >0
	 * @mutates | this
	 * @post | toArray().length == old(toArray().length)-1
	 * @post | IntStream.range(0,toArray().length).allMatch(i->toArray()[i]==old(toArray())[i])
	 */
	public void remove() {
		int [] newElements = Arrays.copyOf(elements, getLength()-1);
		elements = newElements;
	}
	/**
	 *@mutates | this
	 *@post | toArray().length == old(toArray().length)+1
	 *@post | IntStream.range(0,toArray().length-1).allMatch(i->toArray()[i]==old(toArray())[i])
	 *@post | toArray()[getLength()-1] == element
	 */
	public void add(int element) {
		int[] newElements = Arrays.copyOf(elements, getLength()+1);
		newElements[getLength()] = element;
		elements = newElements;
	}
}
