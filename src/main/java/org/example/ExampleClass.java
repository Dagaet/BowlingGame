package org.example;

public final class ExampleClass {

  private final ExampleCollaborator exampleCollaborator;

  public ExampleClass(final ExampleCollaborator exampleCollaborator1) {
    exampleCollaborator = exampleCollaborator1;
  }

  public String switchExpressionWorks(String command) {
    return switch (command) {
      case "hello" -> "world";
      default -> "unknown";
    };
  }

  public int doSum(int a, int b) {
    return exampleCollaborator.sum(a, b);
  }
}
