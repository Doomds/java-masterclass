# Implementing the ISaveable Interface: Storing & Retrieving Player & Monster Data

## Learning Objective
Create and implement an ISaveable interface that enforces read/write operations. Store fields in lists to persist Player and Monster data, and retrieve them as needed.

---

## 1. ISaveable (interface)
- **Methods:**
    - `write()`, takes no arguments and returns a List containing objects of type String.
    - `read()`, takes a List of type String and doesn't return anything.

---

## 2. Player (class)
- It implements `ISaveable`.
- **Fields:**
    - String `name`
    - String `weapon`
    - int `hitPoints`
    - int `strength`
- **Constructor:**
    - Accepts a String (`name`) and two ints (`hitPoints` and `strength`).
    - It initialises `name`, `hitPoints` and `strength` with the newly passed in values.
    - It initialises `weapon` with the default weapon "Sword".
- **Methods:**
    - Getters and setters for all four fields.
    - `write()`, same as interface. Return a List of the fields in the order they appear in `toString()`.
    - `read()`, same as interface. Store the values in the List, in the order they appear in `toString()`. Make sure the List is not null and the `size()` is greater than 0 before storing the values.
    - `toString()`, overriding Object's method. It takes no arguments and returns a String in the exact following format:
      `Player{name='Tim', hitPoints=10, strength=15, weapon='Sword'}`

---

## 3. Monster (class)
- It implements `ISaveable`.
- **Fields:**
    - String `name`
    - int `hitPoints`
    - int `strength`
- **Constructor:**
    - Accepts a String (`name`) and two ints (`hitPoints` and `strength`).
    - It initialises `name`, `hitPoints` and `strength` with the newly passed in values.
- **Methods:**
    - Only getters for the three fields (no setters).
    - `write()`, same as interface. Return a List of the fields in the order they appear in `toString()`.
    - `read()`, same as interface. Store the values in the List, in the order they appear in `toString()`. Make sure the List is not null and the `size()` is greater than 0 before storing the values.
    - `toString()`, overriding Object's method. It takes no arguments and returns a String in the exact following format:
      `Monster{name='Werewolf', hitPoints=20, strength=40}`

---

## TIPs (Tips for Implementation)
- **TIP 1:** Player and Monster need to implement ISaveable.
- **TIP 2:** Be extremely careful with the spelling of the names of the fields, constructors and methods.
- **TIP 3:** Be extremely careful about spaces and spelling in the returned String from the `toString()` method.

---

## NOTEs (Access Modifiers & Design)
- NOTE: All fields are private.
- NOTE: Both constructors are public.
- NOTE: All methods are public.
- NOTE: There are no static members.
- NOTE: Do not add a main method to the solution code.
- NOTE: Classes that are not in the java.lang package should be manually imported (e.g., `java.util.List`).
- NOTE: If you get an error from the Evaluate class, it's most likely the constructor. Check if you've added a constructor or if the constructor has the right arguments.