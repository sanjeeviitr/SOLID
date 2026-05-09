# OOP Relationships — Practical Backend Engineer Notes

---

# 🔴 Dependency

## Meaning

One object temporarily uses another object.

Weakest relationship.

---

## What To Think Practically

Ask:

- is this only needed temporarily?
- is it just collaboration?
- is no ownership involved?

---

## Common Backend Examples

- method parameters
- utility usage
- service calls
- strategy execution

---

## Example

```java
class ReportGenerator {

    void generate(PdfFormatter formatter) {
        formatter.format();
    }
}
```

---

## Biggest Insight For YOU

```text
Dependency is about behavior usage,
not ownership.
```

---

# 🔴 Association

## Meaning

One object knows another object.

---

## What To Think Practically

Ask:

- does object store reference long-term?
- can both survive independently?

---

## Common Backend Examples

- User → Address
- Student → Teacher
- Order → Customer

---

## Example

```java
class Student {
    Teacher teacher;
}
```

---

## Biggest Insight For YOU

```text
Association is connection,
not ownership.
```

---

# 🔴 Aggregation

## Meaning

Weak ownership.

Parent contains child,
but child can exist independently.

---

## What To Think Practically

Ask:

- can child move elsewhere?
- does child survive parent deletion?
- is this reusable domain data?

---

## Common Backend Examples

- Team → Players
- Library → Books
- Department → Employees

---

## Example

```java
class Library {
    List<Book> books;
}
```

---

## Biggest Insight For YOU

```text
Aggregation models containment,
not lifecycle control.
```

---

# 🔴 Composition

## Meaning

Strong ownership.

Child lifecycle depends on parent.

---

## What To Think Practically

Ask:

- who creates child?
- who destroys child?
- can child meaningfully exist alone?

---

## Strong Signals 🚨

- internal object creation
- tightly coupled lifecycle
- child has no standalone meaning

---

## Common Backend Examples

- House → Rooms
- Car → Engine
- Order → OrderItems (sometimes)

---

## Example

```java
class House {

    private final Room room;

    House() {
        room = new Room();
    }
}
```

---

## Biggest Insight For YOU

```text
Composition is lifecycle ownership.
```

---

# 🔴 Most Important Interview Insight

## Aggregation vs Composition

This is the REAL distinction:

| Question | Aggregation | Composition |
|---|---|---|
| Can child survive parent? | Yes | No |
| Strong ownership? | No | Yes |
| Shared lifecycle? | No | Yes |

---

# 🔴 Important Backend Insight

```java
class OrderService {

    private PaymentGateway gateway;

    OrderService(PaymentGateway gateway) {
        this.gateway = gateway;
    }
}
```

This is usually:

- association structurally
- dependency behaviorally

NOT aggregation.

---

## Why?

- `PaymentGateway` is not a domain part of `OrderService`
- it is a collaborating service
- relationship is behavior-oriented, not ownership-oriented

---

# 🔴 Final Mental Model

## Dependency

> I use you.

---

## Association

> I know you.

---

## Aggregation

> I have you, but you can survive without me.

---

## Composition

> I own you completely.
````
