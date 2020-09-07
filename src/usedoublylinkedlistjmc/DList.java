/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package usedoublylinkedlistjmc;

/**
 *
 * @author Enubs
 * @param <E>
 */
public class DList<E> {
    private DNode<E> header, trailer;
    private int size;
    
    public DList(){
        header = new DNode<>(null, null, null);
        trailer = new DNode<>(header, null, null);
        header.setNext(trailer);
    }
    
    public int size(){
        return size;
    }
    
    public boolean isEmpty(){
        return size == 0;
    }
    
    public E first(){
        return header.getNext().getElement();
    }
    
    public E last(){
        return trailer.getPrev().getElement();
    }
    
    private void addBetween(DNode<E> prev, E element, DNode<E> next){
        DNode<E> newNode = new DNode<E>(prev, element, next);
        prev.setNext(newNode);
        next.setPrev(newNode);
        size++;
    }
    
    public void addFirst(E element){
        addBetween(header, element, header.getNext());
    }
    
    public void addLast(E element){
        addBetween(trailer.getPrev(), element, trailer);
    }
    
    private E remove(DNode<E> node){
        node.getPrev().setNext(node.getNext());
        node.getNext().setPrev(node.getPrev());
        E temp = node.getElement();
        node.setElement(null);
        node.setNext(null);
        node.setPrev(null);
        size--;
        return temp;
    }
    
    public E removeFirst(){
        return remove(header.getNext());
    }
    
    public E removeLast(){
        return remove(trailer.getPrev());
    }
}
