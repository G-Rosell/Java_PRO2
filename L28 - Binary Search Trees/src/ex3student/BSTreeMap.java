package ex3student;

import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

/**
 * BSTreeMap implements a sorted map, sorted according to the keys' natural ordering.
 * Keys in the map of type K must implement the Comparable<K> interface.
 * Note: Equal keys are not allowed in the map. Equality of two keys is
 * decided by the keys' compareTo() method.
 * Note: Keys must have a compareTo() method that is consistent with equals(),
 * that is, k1.compareTo(k2) == 0 <=> k1.equals(k2) == true.
 * Note: null is not allowed as a key or a value.
 */
public class BSTreeMap<K extends Comparable<K>, V> implements MapI<K, V> {
    // BSTreeMap is implemented as a binary search tree.

    private Node root;
    // number of pairs in the tree
    private int size;

    /**
     * Create an empty BSTreeSet.
     */
    public BSTreeMap() {
        root = null;
        size = 0;
    }

    //-------------------------------------------------------------------------

    // Return a NodePair consisting of the node
    // containing 'key' and the node's parent node.
    // If root contains 'key', node is root, and parent is null.
    // If no node contains 'key', node is null,
    // and parent is the node where 'key' would be added.
    // Pre: The tree is not empty.
    private NodePair findNodeAndParent(K key) {
        Node parent = null;
        Node node = root;
        boolean found = false;
        while (!found && node != null) {
            int d = key.compareTo(node.key);
            if (d == 0) {
                found = true;
            } else {
                parent = node;
                if (d < 0) {
                    node = node.left;
                } else {
                    node = node.right;
                }
            }
        }
        return new NodePair(node, parent);
    }

    private class NodePair {
        private Node node;
        private Node parent;

        public NodePair(Node node, Node parent) {
            this.node = node;
            this.parent = parent;
        }
    }

    //-------------------------------------------------------------------------

    /**
     * Return the value corresponding to the key 'key'.
     * Return null, if the key is not in the map.
     */
    @Override
    public V get(K key) {
        // TODO
        return null;
    }

    /**
     * Insert a (key, value) pair in the map.
     * Return the old value, if the key was in the map before this insertion.
     * If not, return null.
     */
    @Override
    public V put(K key, V value) {
        //TODO
        return null;
    }

    /**
     * Remove the (key, value) pair with the key as key from the map.
     * Return the value, if the the key was in the map before this removal.
     * If not, return null.
     */
    @Override
    public V remove(K key) {
        // TODO
        return null;
    }

    /**
     * Return a set with all the keys in the map.
     */
    @Override
    public Set<K> keys() {
        Set<K> keySet = new LinkedHashSet<>();
        // TODO
        return keySet;
    }

    /**
     * Return a list with all the values in the map.
     */
    @Override
    public List<V> values() {
        List<V> valueList = new LinkedList<>();
        // TODO
        return valueList;
    }

    /**
     * Return the number of (key,value)-pairs in the map.
     */
    @Override
    public int size() {
        return size;
    }

    /**
     * Return true on an empty map, false on a non-empty map.
     */
    @Override
    public boolean isEmpty() {
        return root == null;
    }

    //-------------------------------------------------------------------------

    /**
     * Return a string containing all elements in sorted order.
     */
    @Override
    public String toString() {
        // TODO
        return null;
    }

    //-------------------------------------------------------------------------

    private class Node {
        private K key;
        private V value;
        private Node left;
        private Node right;

        public Node(K key, V value) {
            this.key = key;
            this.value = value;
            left = null;
            right = null;
        }
    }
}
