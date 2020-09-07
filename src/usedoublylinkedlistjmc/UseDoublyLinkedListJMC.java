/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package usedoublylinkedlistjmc;

/**
 *
 * @author Enubs
 */
public class UseDoublyLinkedListJMC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        DList<String> stringsList = new DList<>();
        stringsList.addFirst("node1");//node1
        stringsList.addFirst("node2");//node2 node1
        stringsList.addFirst("node3");//node3 node2 node1
        stringsList.addFirst("node4");//node4 node3 node2 node1
        stringsList.addFirst("node5");//node5 node4 node3 node2 node1
        
        System.out.println("Before Remove First: ");
        System.out.print(stringsList.first() + "\n");
        
        System.out.println("After Remove First: ");
        System.out.print("REMOVED: " + stringsList.removeFirst() + "\n");
        System.out.print("New First: " + stringsList.first() + "\n");
        
        System.out.println("\nAfter Remove First: ");
        System.out.print("REMOVED: " + stringsList.removeFirst() + "\n");
        System.out.print("New First: " + stringsList.first() + "\n");
        
        System.out.println("LAST: " + stringsList.last());
        System.out.println("REMOVE LAST: " + stringsList.removeLast());
        System.out.println("NEW LAST: " + stringsList.last());
    }
    
}
