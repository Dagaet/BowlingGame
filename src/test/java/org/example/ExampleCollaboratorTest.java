package org.example;

import org.approvaltests.combinations.CombinationApprovals;
import org.junit.jupiter.api.Test;

class ExampleCollaboratorTest {

  @Test
  void sum() {
    CombinationApprovals.verifyAllCombinations(
        this::doSum,
        new Integer[] {-1, 2, 3, 4},
        new Integer[] {-1, 2, 3, 4}
    );
  }

  private int doSum(final Integer a, final Integer b) {
    final ExampleCollaborator exampleCollaborator = new ExampleCollaborator();
    return exampleCollaborator.sum(a, b);
  }
}