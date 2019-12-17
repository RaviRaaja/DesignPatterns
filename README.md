# DesignPatterns
This repo contains very basic examples of GOF design patterns.

### Strategy Pattern
It defines a family of algorithms, encapsulates each one and makes them interchangable. Strategy lets the algorithm vary independtly from 
clients that use it.

### Observer Pattern
It defines a one to many dependency between object so that when one object changes state, all its dependents are notified and updated automatically. 

### Design Principles
<details>
  <summary>Rule 1: Identify the aspect of your application that vary and seperate thme from what stays the same.</summary>
  <p>Take the parts that vary and encapsulate them so that later you can alter (or) extend the parts that vary without affecting those
  don't.</p>
</details>
<details>
  <summary>Rule 2: Program to Interface, not Implementaion</summary>
  <p>Here Interface is not Java interface, it is Super type of some entity. (Use of polymorphism - we no need to mention the type of objects)</p>
</details>
<details>
  <summary>Rule 3: Favor composition over inhertance</summary>
  <p>Refer strategy pattern for example.</p>
</details>
<details>
  <summary>Rule 4: Strive Loosely cpupled design between objects that interact.</summary>
  <p>Refer observer pattern for example.</p>
</details>
<details>
  <summary>Rule 5: Classes should be open for extension and closed for modification.</summary>
  <p>Refer Decorator pattern for example.</p>
</details>
