import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class DefaultResizeableMatrix<T> implements ResizeableMatrix<T> {

  private int width;

  private int height;

  private Node<T> upperLeftCorner;

  public DefaultResizeableMatrix(T[][] matrix) {

  }

  public DefaultResizeableMatrix(int width, int height) {
    if (width < 0) {
      throw new IllegalArgumentException("Given width must be >= 0");
    }
    else if (height < 0) {
      throw new IllegalArgumentException("Given height must be >= 0");
    }

    this.width = width;
    this.height = height;

    if (width == 0 && height == 0) {
      upperLeftCorner = null;
    }
    else if (width == 0) {
      throw new IllegalArgumentException("Can't have a matrix with no width but a given height!");
    }
    else if (height == 0) {
      throw new IllegalArgumentException("Can't have a matrix with no height but a given width!");
    }
    else {
      List<List<Node<T>>> tempMatrix = new ArrayList<>();
      for (int row = 0; row < width; row += 1) {
        List<Node<T>> tempColumn = new ArrayList<>();
        tempMatrix.add(tempColumn);
        Node<T> currentLeftNode = new Node<>();
        for (int column = 0; column < height; column += 1) {
          Node<T> currentNode = new Node<>();
          tempColumn.add(currentNode);

          if (row != 0) {
            Node<T> aboveNode;
            if (column == 0) {
              aboveNode = tempMatrix.get(row - 1).get(0);
            }
            else {
              aboveNode = currentLeftNode.getUpNeighbor().getRightNeighbor();
            }
            aboveNode.setDownNeighbor(currentNode);
            currentNode.setUpNeighbor(aboveNode);
          }

          if (column == 0) {
            currentLeftNode = currentNode;
          }
          else {
            currentLeftNode.setRightNeighbor(currentNode);
            currentNode.setLeftNeighbor(currentLeftNode);
            currentLeftNode = currentNode;
          }
        }
      }
      System.out.print(Arrays.toString(new String[5]));
      System.out.print(tempMatrix.get(0).size());
      upperLeftCorner = tempMatrix.get(0).get(0);
    }
  }

  public DefaultResizeableMatrix(T[][] matrix, int width, int height) {

  }

  public DefaultResizeableMatrix(T[][] matrix, int width, int height, boolean reduce) {

  }

  private void validMatrix(T[][] toCheck) {
    if (toCheck == null) {
      throw new IllegalArgumentException("Given array matrix can't be null!");
    }
  }

  @Override
  public T[][] toArrayMatrix() {
    return null;
  }

  @Override
  public void resizeTo(int newWidth, int newHeight) {

  }

  @Override
  public T[] getRow(int row) {
    return null;
  }

  @Override
  public T[] getColumn(int column) {
    return null;
  }

  @Override
  public T[] getRow(int row, int startingIndex) {
    return null;
  }

  @Override
  public T[] getColumn(int column, int startingIndex) {
    return null;
  }

  @Override
  public void insertRow(boolean resize, T... newRow) {

  }

  @Override
  public void insertColumn(boolean resize, T... newRow) {

  }

  @Override
  public void insertRow(boolean resize, int startingIndex, T... newRow) {

  }

  @Override
  public void insertColumn(boolean resize, int startingIndex, T... newRow) {

  }

  @Override
  public void clearRow(int row) {

  }

  @Override
  public void clearColumn(int column) {

  }

  @Override
  public void clearRow(int row, int startingIndex) {

  }

  @Override
  public void clearColumn(int column, int startingIndex) {

  }

  @Override
  public T getAt(int row, int column) {
    return null;
  }

  @Override
  public void clearAt(int row, int column) {

  }

  @Override
  public void insertAt(int row, int column, T newT) {

  }

  @Override
  public Iterator<T> getRowColumnIterator() {
    return null;
  }

  @Override
  public Iterator<T> getColumnRowIterator() {
    return null;
  }

  @Override
  public Iterator<T> getRowIterator(int row) {
    return null;
  }

  @Override
  public Iterator<T> getColumnIterator(int column) {
    return null;
  }
}
