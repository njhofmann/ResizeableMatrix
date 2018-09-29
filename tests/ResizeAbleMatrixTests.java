import org.junit.Before;
import org.junit.Test;

public class ResizeAbleMatrixTests {

  ResizeableMatrix<String> testMatrix;

  //Testing height and width constructor creation
  @Test
  public void testHeightAndWidthConstructor() {
    testMatrix = new DefaultResizeableMatrix<>(3, 3);
  }

}
