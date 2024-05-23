package org.example;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ExampleClassTest {

  private ExampleClass exampleClass;

  private ExampleCollaborator exampleCollaborator;

  @BeforeEach
  void setUp() {
    exampleCollaborator = mock(ExampleCollaborator.class);
    exampleClass = new ExampleClass(exampleCollaborator);
  }

  @Test
  void switchExpressionsWorks() {
    final String result = exampleClass.switchExpressionWorks("hello");

    assertThat(result).isEqualTo("world");
  }

  @Test
  void mockingWorks() {
    when(exampleCollaborator.sum(1, 2)).thenReturn(4);
    final int result = exampleClass.doSum(1, 2);

    assertThat(result).isEqualTo(4);
  }
}
