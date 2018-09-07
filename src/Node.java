public class Node<T> {

  private T value;

  private Node<T> leftNeighbor = this;

  private Node<T> rightNeighbor = this;

  private Node<T> upNeighbor = this;

  private Node<T> downNeighbor = this;

  public Node(T value) {
    this.value = value;
  }

  public Node() {

  }

  void assignValue(T newValue) {
    if (newValue == null) {
      throw new IllegalArgumentException("Can't assign a null value to this Node!");
    }
    value = newValue;
  }

  void clearNode() {
    value = null;
  }

  public Node<T> getLeftNeighbor() {
    return leftNeighbor;
  }

  public void setLeftNeighbor(Node<T> leftNeighbor) {
    this.leftNeighbor = leftNeighbor;
  }

  public Node<T> getRightNeighbor() {
    return rightNeighbor;
  }

  public void setRightNeighbor(Node<T> rightNeighbor) {
    this.rightNeighbor = rightNeighbor;
  }

  public Node<T> getUpNeighbor() {
    return upNeighbor;
  }

  public void setUpNeighbor(Node<T> upNeighbor) {
    this.upNeighbor = upNeighbor;
  }

  public Node<T> getDownNeighbor() {
    return downNeighbor;
  }

  public void setDownNeighbor(Node<T> downNeighbor) {
    this.downNeighbor = downNeighbor;
  }
}
