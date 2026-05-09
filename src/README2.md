# OOP Relationships Revision Notes

## 1. Dependency

### Meaning
One class temporarily uses another class.

- Weakest relationship
- No ownership
- Usually method parameter or local variable
- Short-lived interaction

### Example

```java
class ReportGenerator {

    void generate(PdfFormatter formatter) {
        formatter.format();
    }
}
```

### Key Idea

- `ReportGenerator` only uses `PdfFormatter`
- Does not store or own it

### Memory Line

> "I use you."

---

## 2. Association

### Meaning
One object knows about another object.

- Long-term relationship
- No strong ownership
- Both can exist independently

### Example

```java
class Student {
    Teacher teacher;
}
```

### Key Idea

- Student knows Teacher
- Teacher can exist without Student

### Memory Line

> "I know you."

---

## 3. Aggregation

### Meaning
A weak "has-a" relationship.

- Parent contains child
- Child can still exist independently
- Weak ownership

### Example

```java
class Library {
    List<Book> books;
}
```

### Key Idea

- Library has Books
- Books can move to another Library
- Destroy Library → Books still exist

### Memory Line

> "I have you, but you can live without me."

---

## 4. Composition

### Meaning
A strong "has-a" relationship.

- Strong ownership
- Child lifecycle depends on parent
- Parent creates/manages child

### Example

```java
class House {

    private final Room room;

    House() {
        room = new Room();
    }
}
```

### Key Idea

- House owns Room
- Destroy House → Room also gone

### Strong Signals

#### Internal object creation

```java
room = new Room();
```

#### Shared lifecycle

- Child cannot meaningfully exist without parent

### Memory Line

> "I own you completely."

---

# Quick Comparison Table

| Relationship | Ownership | Independent Lifecycle | Typical Usage |
|---|---|---|---|
| Dependency | No | Yes | Temporary use |
| Association | No | Yes | Long-term connection |
| Aggregation | Weak | Yes | Container relationship |
| Composition | Strong | No | Owned part |

---

# Important Practical Insight

## Aggregation vs Composition

### Aggregation
Child survives parent destruction.

Examples:
- Team → Players
- Library → Books

### Composition
Child dies with parent.

Examples:
- House → Rooms
- Car → Engine

---

# Important Service-Layer Insight

```java
class OrderService {

    private PaymentGateway paymentGateway;

    OrderService(PaymentGateway paymentGateway) {
        this.paymentGateway = paymentGateway;
    }
}
```

This is usually:
- Association structurally
- Dependency behaviorally

NOT typically aggregation.

### Why?

- `PaymentGateway` is not a "part" of `OrderService`
- It is a collaborating service

---

# Final Mental Model

## Dependency
> I use you.

## Association
> I know you.

## Aggregation
> I have you, but you can survive without me.

## Composition
> I own you completely.
