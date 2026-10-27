1. What is the purpose of the try and catch blocks?

Answer: The try block contains code that may cause an exception, while the catch block handles the exception and prevents the program from terminating unexpectedly.

2. Explain the difference between throw and throws.

Answer:

* throw: Used to explicitly throw an exception.
* throws: Used in a method declaration to indicate that the method may pass an exception to the calling method.

3. What is the purpose of the finally block?

Answer: The finally block contains code that normally executes whether an exception occurs or not. It is commonly used to close files or release resources.

4. Why is a custom exception useful in this application?

Answer: A custom exception allows us to create specific error messages for application rules, such as when a student’s age is below 18 or an examination mark is invalid. It makes errors easier to identify and handle.