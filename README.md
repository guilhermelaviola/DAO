# Data Access Object (DAO)

# Definition (from Wikipedia):
In software, a data access object (DAO) is a pattern that provides an abstract interface to some type of database or other persistence mechanism. By mapping application calls to the persistence layer, the DAO provides data operations without exposing database details.

This isolation supports the single responsibility principle. It separates the data access the application needs, in terms of domain-specific objects and data types (the DAO's public interface), from how these needs can be satisfied with a specific DBMS (the implementation of the DAO).

# Advantages os the DAO Pattern:
- It makes it easier to change the persistence mechanism as all changes are isolated to the DAO layer only;
- Emphasizes loose coupling between the application layers;
- Makes it easier to write unit tests for the application;
- Emphasizes the OOP principle of coding to an interface instead of an implementation.

Source: Java Code Junkie (YouTube Channel)
