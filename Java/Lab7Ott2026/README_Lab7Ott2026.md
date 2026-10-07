# Metodi e costruttori nelle classi Java

## 1. Ripasso della classe e dell'oggetto

Una **classe** è un modello che descrive:

- i dati posseduti dagli oggetti, chiamati **attributi**;
- le operazioni che gli oggetti possono svolgere, chiamate **metodi**.

Un **oggetto** è un elemento concreto creato a partire da una classe.

```java
public class Automobile {
    String marca;
    int velocita;
}
```

In questo esempio:

- `Automobile` è il nome della classe;
- `marca` e `velocita` sono attributi;
- ogni oggetto `Automobile` possiede i propri valori.

## 2. I metodi di una classe

Un metodo rappresenta un comportamento che un oggetto può eseguire.

```java
public class Automobile {
    String marca;
    int velocita;

    void accelera() {
        velocita = velocita + 10;
    }
}
```

Il metodo `accelera` modifica la velocità dell'oggetto sul quale viene
richiamato.

```java
Automobile auto = new Automobile();
auto.velocita = 0;

auto.accelera();
IO.println(auto.velocita); // 10
```

La sintassi generale di un metodo è:

```java
tipoRestituito nomeMetodo(parametri) {
    // Istruzioni del metodo.
}
```

## 3. Metodi senza valore restituito

La parola `void` indica che il metodo non restituisce un risultato.

```java
void mostraVelocita() {
    IO.println("Velocità: " + velocita + " km/h");
}
```

Il metodo viene richiamato attraverso un oggetto:

```java
auto.mostraVelocita();
```

## 4. Metodi con parametri

I parametri permettono di fornire valori al metodo.

```java
void acceleraDi(int aumento) {
    velocita = velocita + aumento;
}
```

```java
auto.acceleraDi(20);
auto.acceleraDi(5);
```

`aumento` è un parametro. I valori `20` e `5` sono gli argomenti utilizzati
nelle due chiamate.

Un metodo può ricevere più parametri:

```java
void cambiaDati(String nuovaMarca, int nuovaVelocita) {
    marca = nuovaMarca;
    velocita = nuovaVelocita;
}
```

## 5. Metodi che restituiscono un valore

Un metodo può elaborare dei dati e restituire un risultato con `return`.

```java
int leggiVelocita() {
    return velocita;
}
```

Il valore restituito può essere salvato o utilizzato direttamente:

```java
int valore = auto.leggiVelocita();
IO.println(valore);
```

Il tipo dichiarato prima del nome del metodo deve corrispondere al tipo del
valore restituito.

```java
boolean èFerma() {
    return velocita == 0;
}
```

## 6. Che cos'è il costruttore

Il **costruttore** è una parte speciale della classe che viene eseguita quando
si crea un nuovo oggetto.

Serve a inizializzare gli attributi dell'oggetto.

```java
public class Automobile {
    String marca;
    int velocita;

    Automobile(String marcaIniziale) {
        marca = marcaIniziale;
        velocita = 0;
    }
}
```

Il costruttore:

- ha lo stesso nome della classe;
- non dichiara un tipo restituito;
- non utilizza nemmeno `void`;
- può ricevere dei parametri;
- viene richiamato attraverso la parola chiave `new`.

```java
Automobile primaAuto = new Automobile("Fiat");
Automobile secondaAuto = new Automobile("Toyota");
```

I due oggetti sono distinti e possiedono valori indipendenti.

## 7. La parola chiave this

`this` indica l'oggetto sul quale si sta lavorando.

È particolarmente utile quando un parametro e un attributo hanno lo stesso
nome.

```java
public class Automobile {
    String marca;
    int velocita;

    Automobile(String marca, int velocita) {
        this.marca = marca;
        this.velocita = velocita;
    }
}
```

Nell'istruzione:

```java
this.marca = marca;
```

- `this.marca` è l'attributo dell'oggetto;
- `marca` è il parametro ricevuto dal costruttore.