package week6;

public class LinkedListImpl {
    //Write a DoublyLinkedList class that has a head and a tail,
    //        both of which point to either a linked list Node or None / null.
    //
    //        The class should support:
    //
    //        Setting the head and tail of the linked list.
    //        Inserting nodes before and after other nodes as well as at given positions (the position of the head node is 1).
    //        Removing given nodes and removing nodes with given values.
    //        Searching for nodes with given values.
    //        Note that the setHead, setTail, insertBefore, insertAfter,
    //        insertAtPosition, and remove methods all take in actual Nodes as input
    //        parameters not integers (except for insertAtPosition, which also takes in an integer representing the position);
    //this means that you don't need to create any new Nodes in these methods.
    //
    //        The input nodes can be either stand-alone nodes or nodes that are already in the linked list.
    //        If they're nodes that are already in the linked list, the methods will effectively be moving the nodes within the linked list.
    //
    //        You won't be told if the input nodes are already in the linked list, so your code will have to defensively handle this scenario.
    //
    //        Each Node has an integer value as well as a prev node and a next node, both of which can point to either another node or None / null.
    //
    //        Sample Usage
    //
    //// Assume the following linked list has already been created:
    //        1 <-> 2 <-> 3 <-> 4 <-> 5
    //
    //// Assume that we also have the following stand-alone nodes:
    //        3, 3, 6
    //
    //        setHead(4): 4 <-> 1 <-> 2 <-> 3 <-> 5 // set the existing node with value 4 as the head
    //        setTail(6): 4 <-> 1 <-> 2 <-> 3 <-> 5 <-> 6 // set the stand-alone node with value 6 as the tail
    //        insertBefore(6, 3): 4 <-> 1 <-> 2 <-> 5 <-> 3 <-> 6 // move the existing node with value 3 before the existing node with value 6
    //        insertAfter(6, 3): 4 <-> 1 <-> 2 <-> 5 <-> 3 <-> 6 <-> 3 // insert a stand-alone node with value 3 after the existing node with value 6
    //        insertAtPosition(1, 3): 3 <-> 4 <-> 1 <-> 2 <-> 5 <-> 3 <-> 6 <-> 3 // insert a stand-alone node with value 3 in position 1
    //        removeNodesWithValue(3): 4 <-> 1 <-> 2 <-> 5 <-> 6 // remove all nodes with value 3
    //        remove(2): 4 <-> 1 <-> 5 <-> 6 // remove the existing node with value 2
    //        containsNodeWithValue(5): true
    //
    //
    //
    //        import org.junit.Test;
    //        import static org.junit.Assert.*;
    //        import org.junit.jupiter.api.BeforeEach;
    //        import java.util.*;
    //
    //public class ProgramTest {
    //    private List<Integer> getNodeValuesHeadToTail(Program.DoublyLinkedList linkedList) {
    //        List<Integer> values = new ArrayList<Integer>();
    //        Program.Node node = linkedList.head;
    //        while (node != null) {
    //            values.add(node.value);
    //            node = node.next;
    //        }
    //        return values;
    //    }
    //
    //    private List<Integer> getNodeValuesTailToHead(Program.DoublyLinkedList linkedList) {
    //        List<Integer> values = new ArrayList<Integer>();
    //        Program.Node node = linkedList.tail;
    //        while (node != null) {
    //            values.add(node.value);
    //            node = node.prev;
    //        }
    //        return values;
    //    }
    //
    //    private void bindNodes(Program.Node nodeOne, Program.Node nodeTwo) {
    //        nodeOne.next = nodeTwo;
    //        nodeTwo.prev = nodeOne;
    //    }
    //
    //    private boolean compare(List<Integer> array1, int[] array2) {
    //        if (array1.size() != array2.length) {
    //            return false;
    //        }
    //        for (int i = 0; i < array1.size(); i++) {
    //            if (array1.get(i) != array2[i]) {
    //                return false;
    //            }
    //        }
    //        return true;
    //    }
    //
    //    @Test
    //    public void SetHead() {
    //        Program.DoublyLinkedList linkedList = new Program.DoublyLinkedList();
    //
    //        Program.Node one = new Program.Node(1);
    //        Program.Node two = new Program.Node(2);
    //        Program.Node three = new Program.Node(3);
    //        Program.Node three2 = new Program.Node(3);
    //        Program.Node three3 = new Program.Node(3);
    //        Program.Node four = new Program.Node(4);
    //        Program.Node five = new Program.Node(5);
    //        Program.Node six = new Program.Node(6);
    //
    //        bindNodes(one, two);
    //        bindNodes(two, three);
    //        bindNodes(three, four);
    //        bindNodes(four, five);
    //
    //        linkedList.head = one;
    //        linkedList.tail = five;
    //
    //        linkedList.setHead(four);
    //
    //        assertTrue(compare(getNodeValuesHeadToTail(linkedList), new int[] {4, 1, 2, 3, 5}));
    //        assertTrue(compare(getNodeValuesTailToHead(linkedList), new int[] {5, 3, 2, 1, 4}));
    //
    //        linkedList.setHead(two);
    //
    //        assertTrue(compare(getNodeValuesHeadToTail(linkedList), new int[] {2, 4, 1, 3, 5}));
    //        assertTrue(compare(getNodeValuesTailToHead(linkedList), new int[] {5, 3, 1, 4, 2}));
    //    }
    //
    //    @Test
    //    public void SetHeadOrTail() {
    //        Program.DoublyLinkedList linkedList = new Program.DoublyLinkedList();
    //
    //        Program.Node one = new Program.Node(1);
    //        Program.Node two = new Program.Node(2);
    //        Program.Node three = new Program.Node(3);
    //        Program.Node three2 = new Program.Node(3);
    //        Program.Node three3 = new Program.Node(3);
    //        Program.Node four = new Program.Node(4);
    //        Program.Node five = new Program.Node(5);
    //        Program.Node six = new Program.Node(6);
    //
    //        bindNodes(one, two);
    //        bindNodes(two, three);
    //        bindNodes(three, four);
    //        bindNodes(four, five);
    //
    //        linkedList.head = one;
    //        linkedList.tail = five;
    //
    //        linkedList.setTail(four);
    //
    //        assertTrue(compare(getNodeValuesHeadToTail(linkedList), new int[] {1, 2, 3, 5, 4}));
    //        assertTrue(compare(getNodeValuesTailToHead(linkedList), new int[] {4, 5, 3, 2, 1}));
    //
    //        linkedList.setHead(six);
    //
    //        assertTrue(compare(getNodeValuesHeadToTail(linkedList), new int[] {6, 1, 2, 3, 5, 4}));
    //        assertTrue(compare(getNodeValuesTailToHead(linkedList), new int[] {4, 5, 3, 2, 1, 6}));
    //
    //        linkedList.setTail(six);
    //
    //        assertTrue(compare(getNodeValuesHeadToTail(linkedList), new int[] {1, 2, 3, 5, 4, 6}));
    //        assertTrue(compare(getNodeValuesTailToHead(linkedList), new int[] {6, 4, 5, 3, 2, 1}));
    //    }
    //
    //    @Test
    //    public void InsertBefore() {
    //        Program.DoublyLinkedList linkedList = new Program.DoublyLinkedList();
    //
    //        Program.Node one = new Program.Node(1);
    //        Program.Node two = new Program.Node(2);
    //        Program.Node three = new Program.Node(3);
    //        Program.Node three2 = new Program.Node(3);
    //        Program.Node three3 = new Program.Node(3);
    //        Program.Node four = new Program.Node(4);
    //        Program.Node five = new Program.Node(5);
    //        Program.Node six = new Program.Node(6);
    //
    //        bindNodes(one, two);
    //        bindNodes(two, three);
    //        bindNodes(three, four);
    //        bindNodes(four, five);
    //
    //        linkedList.head = one;
    //        linkedList.tail = five;
    //
    //        linkedList.insertBefore(two, three2);
    //
    //        assertTrue(compare(getNodeValuesHeadToTail(linkedList), new int[] {1, 3, 2, 3, 4, 5}));
    //        assertTrue(compare(getNodeValuesTailToHead(linkedList), new int[] {5, 4, 3, 2, 3, 1}));
    //
    //        linkedList.insertBefore(five, six);
    //
    //        assertTrue(compare(getNodeValuesHeadToTail(linkedList), new int[] {1, 3, 2, 3, 4, 6, 5}));
    //        assertTrue(compare(getNodeValuesTailToHead(linkedList), new int[] {5, 6, 4, 3, 2, 3, 1}));
    //
    //        linkedList.insertBefore(one, four);
    //
    //        assertTrue(compare(getNodeValuesHeadToTail(linkedList), new int[] {4, 1, 3, 2, 3, 6, 5}));
    //        assertTrue(compare(getNodeValuesTailToHead(linkedList), new int[] {5, 6, 3, 2, 3, 1, 4}));
    //    }
    //
    //    @Test
    //    public void InsertAfter() {
    //        Program.DoublyLinkedList linkedList = new Program.DoublyLinkedList();
    //
    //        Program.Node one = new Program.Node(1);
    //        Program.Node two = new Program.Node(2);
    //        Program.Node three = new Program.Node(3);
    //        Program.Node three2 = new Program.Node(3);
    //        Program.Node three3 = new Program.Node(3);
    //        Program.Node four = new Program.Node(4);
    //        Program.Node five = new Program.Node(5);
    //        Program.Node six = new Program.Node(6);
    //
    //        bindNodes(one, two);
    //        bindNodes(two, three);
    //        bindNodes(three, four);
    //        bindNodes(four, five);
    //
    //        linkedList.head = one;
    //        linkedList.tail = five;
    //
    //        linkedList.insertAfter(two, three2);
    //
    //        assertTrue(compare(getNodeValuesHeadToTail(linkedList), new int[] {1, 2, 3, 3, 4, 5}));
    //        assertTrue(compare(getNodeValuesTailToHead(linkedList), new int[] {5, 4, 3, 3, 2, 1}));
    //
    //        linkedList.insertAfter(two, one);
    //
    //        assertTrue(compare(getNodeValuesHeadToTail(linkedList), new int[] {2, 1, 3, 3, 4, 5}));
    //        assertTrue(compare(getNodeValuesTailToHead(linkedList), new int[] {5, 4, 3, 3, 1, 2}));
    //
    //        linkedList.insertAfter(five, six);
    //
    //        assertTrue(compare(getNodeValuesHeadToTail(linkedList), new int[] {2, 1, 3, 3, 4, 5, 6}));
    //        assertTrue(compare(getNodeValuesTailToHead(linkedList), new int[] {6, 5, 4, 3, 3, 1, 2}));
    //    }
    //
    //    @Test
    //    public void InsertAtPosition() {
    //        Program.DoublyLinkedList linkedList = new Program.DoublyLinkedList();
    //
    //        Program.Node one = new Program.Node(1);
    //        Program.Node two = new Program.Node(2);
    //        Program.Node three = new Program.Node(3);
    //        Program.Node three2 = new Program.Node(3);
    //        Program.Node three3 = new Program.Node(3);
    //        Program.Node four = new Program.Node(4);
    //        Program.Node five = new Program.Node(5);
    //        Program.Node six = new Program.Node(6);
    //
    //        bindNodes(one, two);
    //        bindNodes(two, three);
    //        bindNodes(three, four);
    //        bindNodes(four, five);
    //
    //        linkedList.head = one;
    //        linkedList.tail = five;
    //
    //        linkedList.insertAtPosition(1, three2);
    //
    //        assertTrue(compare(getNodeValuesHeadToTail(linkedList), new int[] {3, 1, 2, 3, 4, 5}));
    //        assertTrue(compare(getNodeValuesTailToHead(linkedList), new int[] {5, 4, 3, 2, 1, 3}));
    //
    //        linkedList.insertAtPosition(7, three3);
    //
    //        assertTrue(compare(getNodeValuesHeadToTail(linkedList), new int[] {3, 1, 2, 3, 4, 5, 3}));
    //        assertTrue(compare(getNodeValuesTailToHead(linkedList), new int[] {3, 5, 4, 3, 2, 1, 3}));
    //    }
    //
    //    @Test
    //    public void RemoveNodesWithValue() {
    //        Program.DoublyLinkedList linkedList = new Program.DoublyLinkedList();
    //
    //        Program.Node one = new Program.Node(1);
    //        Program.Node two = new Program.Node(2);
    //        Program.Node three = new Program.Node(3);
    //        Program.Node three2 = new Program.Node(3);
    //        Program.Node three3 = new Program.Node(3);
    //        Program.Node four = new Program.Node(4);
    //        Program.Node five = new Program.Node(5);
    //        Program.Node six = new Program.Node(6);
    //
    //        bindNodes(one, two);
    //        bindNodes(two, three);
    //        bindNodes(three, four);
    //        bindNodes(four, five);
    //
    //        linkedList.head = one;
    //        linkedList.tail = five;
    //
    //        linkedList.removeNodesWithValue(5);
    //
    //        assertTrue(compare(getNodeValuesHeadToTail(linkedList), new int[] {1, 2, 3, 4}));
    //        assertTrue(compare(getNodeValuesTailToHead(linkedList), new int[] {4, 3, 2, 1}));
    //
    //        linkedList.removeNodesWithValue(1);
    //
    //        assertTrue(compare(getNodeValuesHeadToTail(linkedList), new int[] {2, 3, 4}));
    //        assertTrue(compare(getNodeValuesTailToHead(linkedList), new int[] {4, 3, 2}));
    //
    //        linkedList.removeNodesWithValue(3);
    //
    //        assertTrue(compare(getNodeValuesHeadToTail(linkedList), new int[] {2, 4}));
    //        assertTrue(compare(getNodeValuesTailToHead(linkedList), new int[] {4, 2}));
    //    }
    //
    //    @Test
    //    public void Remove() {
    //        Program.DoublyLinkedList linkedList = new Program.DoublyLinkedList();
    //
    //        Program.Node one = new Program.Node(1);
    //        Program.Node two = new Program.Node(2);
    //        Program.Node three = new Program.Node(3);
    //        Program.Node three2 = new Program.Node(3);
    //        Program.Node three3 = new Program.Node(3);
    //        Program.Node four = new Program.Node(4);
    //        Program.Node five = new Program.Node(5);
    //        Program.Node six = new Program.Node(6);
    //
    //        bindNodes(one, two);
    //        bindNodes(two, three);
    //        bindNodes(three, four);
    //        bindNodes(four, five);
    //
    //        linkedList.head = one;
    //        linkedList.tail = five;
    //
    //        linkedList.remove(two);
    //
    //        assertTrue(compare(getNodeValuesHeadToTail(linkedList), new int[] {1, 3, 4, 5}));
    //        assertTrue(compare(getNodeValuesTailToHead(linkedList), new int[] {5, 4, 3, 1}));
    //
    //        linkedList.remove(one);
    //
    //        assertTrue(compare(getNodeValuesHeadToTail(linkedList), new int[] {3, 4, 5}));
    //        assertTrue(compare(getNodeValuesTailToHead(linkedList), new int[] {5, 4, 3}));
    //
    //        linkedList.remove(five);
    //
    //        assertTrue(compare(getNodeValuesHeadToTail(linkedList), new int[] {3, 4}));
    //        assertTrue(compare(getNodeValuesTailToHead(linkedList), new int[] {4, 3}));
    //    }
    //
    //    @Test
    //    public void ContainsNodeWithValue() {
    //        Program.DoublyLinkedList linkedList = new Program.DoublyLinkedList();
    //
    //        Program.Node one = new Program.Node(1);
    //        Program.Node two = new Program.Node(2);
    //        Program.Node three = new Program.Node(3);
    //        Program.Node three2 = new Program.Node(3);
    //        Program.Node three3 = new Program.Node(3);
    //        Program.Node four = new Program.Node(4);
    //        Program.Node five = new Program.Node(5);
    //        Program.Node six = new Program.Node(6);
    //
    //        bindNodes(one, two);
    //        bindNodes(two, three);
    //        bindNodes(three, four);
    //        bindNodes(four, five);
    //
    //        linkedList.head = one;
    //        linkedList.tail = five;
    //
    //        assertTrue(linkedList.containsNodeWithValue(4));
    //        assertFalse(linkedList.containsNodeWithValue(6));
    //        assertTrue(linkedList.containsNodeWithValue(3));
    //    }
    //
    //    @Test
    //    public void Suite() {
    //        Program.DoublyLinkedList linkedList = new Program.DoublyLinkedList();
    //
    //        Program.Node one = new Program.Node(1);
    //        Program.Node two = new Program.Node(2);
    //        Program.Node three = new Program.Node(3);
    //        Program.Node three2 = new Program.Node(3);
    //        Program.Node three3 = new Program.Node(3);
    //        Program.Node four = new Program.Node(4);
    //        Program.Node five = new Program.Node(5);
    //        Program.Node six = new Program.Node(6);
    //
    //        bindNodes(one, two);
    //        bindNodes(two, three);
    //        bindNodes(three, four);
    //        bindNodes(four, five);
    //
    //        linkedList.head = one;
    //        linkedList.tail = five;
    //
    //        linkedList.setHead(four);
    //        linkedList.setTail(six);
    //        linkedList.insertBefore(six, three);
    //        linkedList.insertAfter(six, three2);
    //        linkedList.insertAtPosition(1, three3);
    //        linkedList.removeNodesWithValue(3);
    //        linkedList.remove(two);
    //
    //        assertTrue(compare(getNodeValuesHeadToTail(linkedList), new int[] {4, 1, 5, 6}));
    //        assertTrue(compare(getNodeValuesTailToHead(linkedList), new int[] {6, 5, 1, 4}));
    //
    //        assertTrue(linkedList.containsNodeWithValue(5));
    //    }
    //}
    //
    //public class LinkedListConstruction {
    //    public static void main(String[] args) {
    //        // test you cases here
    //
    //    }
    //
    //
    //    public static class DoublyLinkedList {
    //        public Node head;
    //        public Node tail;
    //
    //        public void setHead(Node node) {
    //            // Write your code here.
    //        }
    //
    //        public void setTail(Node node) {
    //            // Write your code here.
    //        }
    //
    //        public void insertBefore(Node node, Node nodeToInsert) {
    //            // Write your code here.
    //        }
    //
    //        public void insertAfter(Node node, Node nodeToInsert) {
    //            // Write your code here.
    //        }
    //
    //        public void insertAtPosition(int position, Node nodeToInsert) {
    //            // Write your code here.
    //        }
    //
    //        public void removeNodesWithValue(int value) {
    //            // Write your code here.
    //        }
    //
    //        public void remove(Node node) {
    //            // Write your code here.
    //        }
    //
    //        public boolean containsNodeWithValue(int value) {
    //            // Write your code here.
    //            return false;
    //        }
    //    }
    //
    //    // Do not edit the class below.
    //    static class Node {
    //        public int value;
    //        public Node prev;
    //        public Node next;
    //
    //        public Node(int value) {
    //            this.value = value;
    //        }
    //    }
    //}

    public class DoublyLinkedList {
        Node head;
        Node tail;

        public static class Node {
            int value;
            Node prev;
            Node next;

            public Node(int value) {
                this.value = value;
                this.prev = null;
                this.next = null;
            }
        }

        // Set the head of the linked list
        public void setHead(Node node) {
            if (head == null) {
                head = tail = node;
                return;
            }
            insertBefore(head, node);
        }

        // Set the tail of the linked list
        public void setTail(Node node) {
            if (tail == null) {
                setHead(node);
                return;
            }
            insertAfter(tail, node);
        }

        // Insert a node before a given node
        public void insertBefore(Node node, Node nodeToInsert) {
            if (nodeToInsert == head && nodeToInsert == tail) return;
            remove(nodeToInsert);
            nodeToInsert.prev = node.prev;
            nodeToInsert.next = node;
            if (node.prev == null) {
                head = nodeToInsert;
            } else {
                node.prev.next = nodeToInsert;
            }
            node.prev = nodeToInsert;
        }

        // Insert a node after a given node
        public void insertAfter(Node node, Node nodeToInsert) {
            if (nodeToInsert == head && nodeToInsert == tail) return;
            remove(nodeToInsert);
            nodeToInsert.prev = node;
            nodeToInsert.next = node.next;
            if (node.next == null) {
                tail = nodeToInsert;
            } else {
                node.next.prev = nodeToInsert;
            }
            node.next = nodeToInsert;
        }

        // Insert a node at a given position
        public void insertAtPosition(int position, Node nodeToInsert) {
            if (position == 1) {
                setHead(nodeToInsert);
                return;
            }
            Node node = head;
            int currentPosition = 1;
            while (node != null && currentPosition++ != position) {
                node = node.next;
            }
            if (node != null) {
                insertBefore(node, nodeToInsert);
            } else {
                setTail(nodeToInsert);
            }
        }

        // Remove nodes with a given value
        public void removeNodesWithValue(int value) {
            Node node = head;
            while (node != null) {
                Node nodeToRemove = node;
                node = node.next;
                if (nodeToRemove.value == value) {
                    remove(nodeToRemove);
                }
            }
        }

        // Remove a given node from the list
        public void remove(Node node) {
            if (node == head) head = head.next;
            if (node == tail) tail = tail.prev;
            if (node.prev != null) node.prev.next = node.next;
            if (node.next != null) node.next.prev = node.prev;
            node.prev = null;
            node.next = null;
        }

        // Check if the list contains a node with a given value
        public boolean containsNodeWithValue(int value) {
            Node node = head;
            while (node != null) {
                if (node.value == value) return true;
                node = node.next;
            }
            return false;
        }
    }

}
