# SOLID Principles — Practical Backend Engineer Notes

---

# 🔴 SRP — Single Responsibility Principle

## Core Idea

A class/module should have:

> one reason to change.

NOT:

> one method only.

---

## What To Think Practically

Ask:

- who owns this responsibility?
- what changes together?
- what changes independently?

---

## Bad Sign 🚨

- giant service classes
- controller handling business logic
- one class doing:
    - validation
    - DB
    - email
    - analytics

---

## Good Design ✅

Separate:

- orchestration
- persistence
- notification
- analytics
- validation

---

## Biggest Insight For YOU

Don’t just move logic to another class.

Think:

> “Who should own this responsibility?”

---

# 🔴 OCP — Open Closed Principle

## Core Idea

Systems should be:

- open for extension
- closed for modification

---

## What To Think Practically

Ask:

> if new feature comes,
> do I modify stable old code,
> or only add new behavior?

---

## Bad Sign 🚨

- giant if-else chains
- switch-case explosion
- modifying same class repeatedly

---

## Good Design ✅

Use:

- abstractions
- strategy pattern
- processors/handlers
- extensible architecture

---

## Biggest Insight For YOU

Strong OCP means:

> future features should mostly ADD code,
> not MODIFY stable code.

---

# 🔴 LSP — Liskov Substitution Principle

## Core Idea

Child implementations should:

> safely honor parent abstraction behavior.

---

## What To Think Practically

Ask:

- can caller safely trust abstraction?
- will runtime behavior remain valid?
- are contracts consistent?

---

## Bad Sign 🚨

```java
throw new UnsupportedOperationException();