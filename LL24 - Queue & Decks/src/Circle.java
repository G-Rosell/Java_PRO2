public class Circle {


    private static class Node {
        private Person person;
        private Node next;

        public Node(Person person) {
            this.person = person;
            this.next = null;
        }
    }

    private Node current;
    private int size;

    public Circle() {
      current = null;
      size = 0;
    }

    public void addPerson(Person p) {
        Node newNode = new Node(p);
        if (current == null) {
            current = newNode;
            current.next = current;
        } else {
            newNode.next = current.next;
            current.next = newNode;
            current = newNode;
        }
        size++;
    }

//    public void printPersons() {
//        Node currentNode = current;
//        for (int i = 0; i < size; i++) {
//            System.out.println(currentNode.person.getName());
//            currentNode = currentNode.next;
//        }
//    }

    public void printPersons() {
        Node firstNode = current.next;
        Node currentNode = firstNode;
        for (int i = 0; i < size; i++) {
            System.out.println(currentNode.person.getName());
            currentNode = currentNode.next;
        }
    }

    public Person removeFirst() {
        if (current == null) {
            return null;
        }
        int randomMakker = (int) (Math.random() * size); // generating a random number between 0 and size
        Node currentNode = current;
        for (int i = 0; i < randomMakker; i++) {
            currentNode = currentNode.next;
        }
        Person removed = currentNode.next.person;
        currentNode.next = currentNode.next.next;
        size--;
        return removed;
    }

    public Person removeNext(int count) {
        if (current == null) {
            return null;
        }

        Node currentNode = current;
        for (int i = 0; i < count; i++) {
            currentNode = currentNode.next;
        }
        Person removed = currentNode.next.person;
        currentNode.next = currentNode.next.next;
        size--;
        return removed;
    }
}
