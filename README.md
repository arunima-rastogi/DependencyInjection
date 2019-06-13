# DependencyInjection
Dependency Injection frameworks in java

If the Java class creates an instance of another class via the "new" operator, it creates a hard dependency with this class.  This class cannot be used (and tested) independently from this class.

General approach available in Java (Java Specification Request JSR330) are @Inject and @Named annotations usage to desribe dependencies directly in your classes.

Two popular dependency injection frameworks are Spring and Google Guice.
