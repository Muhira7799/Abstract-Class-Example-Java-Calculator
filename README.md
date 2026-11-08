# Abstract Class Example – Java Calculator

A small Java program that demonstrates **abstract classes** and **inheritance**. An abstract `Calculator` class defines one method that subclasses must implement and one that they inherit as is.

## What It Demonstrates

- Declaring an abstract class and an abstract method
- Writing a regular (non-abstract) method inside an abstract class
- Extending an abstract class and implementing its abstract method with `@Override`
- Why an abstract class cannot be instantiated directly

## Code Overview

| Class | Role |
|-------|------|
| `Calculator` | Abstract class with an abstract `add(int, int)` method and a concrete `multiply(int, int)` method |
| `MyCalculator` | Extends `Calculator` and implements `add` |
| `Main` | Creates a `MyCalculator` object and calls both methods |

```java
abstract class Calculator {
    abstract int add(int a, int b);        // must be implemented by subclasses

    int multiply(int a, int b) {           // inherited as is
        return a * b;
    }
}
```

## Requirements

- Java Development Kit (JDK) 8 or higher

## Getting Started

### Clone the repository

```bash
git clone https://github.com/<your-username>/<your-repo-name>.git
cd <your-repo-name>
```

### Compile

```bash
javac Main.java
```

### Run

```bash
java Main
```

## Output

```
Addition: 15
Multiplication: 50
```

## How It Works

1. `Calculator` declares `add` without a body, so every subclass must provide its own version.
2. `Calculator` also provides a complete `multiply` method that subclasses inherit automatically.
3. `MyCalculator` implements `add` to return `a + b`.
4. `Main` creates a `MyCalculator` object. `new Calculator()` would not compile, because abstract classes cannot be instantiated.

## Project Structure

```
.
├── Main.java
└── README.md
```

## Next Steps

- Add more abstract methods such as `subtract` and `divide`
- Create a second subclass with different behavior
- Compare with an `interface` and note when to use each
- Add `double` versions of the methods to handle decimals


