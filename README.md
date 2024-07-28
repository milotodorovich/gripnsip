# gripnsip
Example repo to discuss composition.

This repo runs a simulation against two different ways of organizing
code. The results are _almost_ the same. Yet, the design using
**composition** leads to less code, simpler code, and more
flexibility.

Take a look and see for yourself.

## Commands
```sh
mvn clean
mvn test
mvn package
mvn exec:java
```

## Output
```sh
STARTING HIERARCHICAL SIMULATION:
Pouring your new coffee
Daniel is enjoying their drink.
Gripping coffee
Sipping coffee
Daniel is satisfied.

Pouring your new iced tea
Speedy is enjoying their drink.
Gripping iced tea
Protecting your shirt.
Sipping iced tea
Speedy is satisfied.

Pouring your new boiled tea
Sniffly is enjoying their drink.
Protecting your hands.
Gripping boiled tea
Sipping boiled tea
Sniffly is satisfied.

Pouring your new extra-hot coffee
Wired is enjoying their drink.
Protecting your hands.
Gripping extra-hot coffee
Protecting your shirt.
Sipping extra-hot coffee
Wired is satisfied.

STARTING COMPOSED SIMULATION:
Pouring your new coffee
Daniel is enjoying their drink.
Gripping coffee
Sipping coffee
Daniel is satisfied.

Pouring your new iced tea
Speedy is enjoying their drink.
Gripping iced tea
Protecting your shirt.
Sipping iced tea
Speedy is satisfied.

Pouring your new boiled tea
Sniffly is enjoying their drink.
Protecting your hands.
Gripping boiled tea
Sipping boiled tea
Sniffly is satisfied.

Pouring your new extra-hot coffee
Wired is enjoying their drink.
Protecting your hands.
Gripping extra-hot coffee
Protecting your shirt.
Sipping extra-hot coffee
Wired is satisfied.

COMPOSITION ALLOWS MORE OPTIONS!
Pouring your new extra-hot coffee
Quite Picky is enjoying their drink.
Protecting your hands.
Gripping extra-hot coffee
Protecting your shirt.
Sipping extra-hot coffee
Quite Picky is satisfied.

...and if it's still too hot...
Quite Picky is enjoying their drink.
Protecting your hands.
Protecting your hands.
Gripping extra-hot coffee
Protecting your shirt.
Sipping extra-hot coffee
Quite Picky is satisfied.

Just right!
```
