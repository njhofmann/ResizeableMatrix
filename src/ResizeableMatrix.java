import java.util.Iterator;

public interface ResizeableMatrix<T> {

  T[][] toArrayMatrix();

  void resizeTo(int newWidth, int newHeight);

  T[] getRow(int row);

  T[] getColumn(int column);

  T[] getRow(int row, int startingIndex);

  T[] getColumn(int column, int startingIndex);

  void insertRow(boolean resize, T... newRow);

  void insertColumn(boolean resize, T... newRow);

  void insertRow(boolean resize, int startingIndex, T... newRow);

  void insertColumn(boolean resize, int startingIndex, T... newRow);

  void clearRow(int row);

  void clearColumn(int column);

  void clearRow(int row, int startingIndex);

  void clearColumn(int column, int startingIndex);

  T getAt(int row, int column);

  void clearAt(int row, int column);

  void insertAt(int row, int column, T newT);

  Iterator<T> getRowColumnIterator();

  Iterator<T> getColumnRowIterator();

  Iterator<T> getRowIterator(int row);

  Iterator<T> getColumnIterator(int column);

}
