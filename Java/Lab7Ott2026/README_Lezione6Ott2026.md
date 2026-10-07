# Introduzione alla programmazione a oggetti in Java

## 1. Che cos'è un metodo

Un metodo è un blocco di istruzioni che svolge un compito preciso.

- Ha un nome.
- Può ricevere dei valori chiamati **parametri**.
- Può restituire un risultato oppure non restituire nulla.
- Dopo essere stato scritto, può essere richiamato più volte.

Un primo esempio:

```java
public static void saluta() {
    IO.println("Ciao!");
}
```

Per eseguire il metodo bisogna richiamarlo usando il suo nome:

```java
saluta();
saluta();
```

In questo caso il metodo viene eseguito due volte.

### Metodo con un parametro

Un parametro permette al metodo di ricevere un valore.

```java
public static void salutaPersona(String nome) {
    IO.println("Ciao " + nome);
}
```

Il metodo può essere richiamato usando argomenti diversi:

```java
salutaPersona("Anna");
salutaPersona("Luca");
```

`nome` è il parametro dichiarato nel metodo. `"Anna"` e `"Luca"` sono gli
argomenti utilizzati nelle due chiamate.

### Metodo che restituisce un risultato

Un metodo può elaborare alcuni dati e restituire un risultato.

```java
public static int somma(int primoNumero, int secondoNumero) {
    int risultato = primoNumero + secondoNumero;
    return risultato;
}
```

Il valore restituito può essere salvato in una variabile:

```java
int totale = somma(4, 7);
IO.println(totale);
```

Parole importanti:

- `void`: il metodo non restituisce alcun valore;
- `int`: il metodo restituisce un numero intero;
- `return`: restituisce il risultato al punto in cui il metodo è stato chiamato;
- **parametri**: variabili dichiarate tra le parentesi del metodo;
- **argomenti**: valori utilizzati quando il metodo viene richiamato.

## 2. Perché usare i metodi

I metodi permettono di:

- evitare di ripetere le stesse istruzioni;
- rendere il programma più leggibile;
- dividere un problema grande in operazioni più piccole;
- modificare un'operazione in un solo punto del programma.

Se un programma deve mostrare il punteggio molte volte, è possibile creare un
metodo dedicato:

```java
public static void mostraPunteggio(int punteggio) {
    IO.println("Punteggio: " + punteggio);
}
```

```java
mostraPunteggio(10);
mostraPunteggio(25);
```

## 3. Che cos'è una classe

Una classe è un modello utilizzato per creare oggetti.

- Descrive quali dati possiedono gli oggetti.
- Descrive quali operazioni possono svolgere gli oggetti.
- Da una sola classe è possibile creare molti oggetti.

La classe può essere paragonata al progetto di una casa. Le case costruite
usando quel progetto sono gli oggetti. Ogni casa è distinta dalle altre, anche
se tutte derivano dallo stesso progetto.

Esempio di classe Java:

```java
public class Studente {
    String nome;
    int eta;
}
```

`nome` ed `eta` sono gli **attributi** della classe `Studente`.

## 4. Che cos'è un oggetto

Un oggetto è un elemento concreto creato a partire da una classe.

- Ogni oggetto possiede i propri valori.
- Oggetti della stessa classe possono contenere valori diversi.
- La parola chiave `new` crea un nuovo oggetto.

```java
Studente primoStudente = new Studente();
primoStudente.nome = "Anna";
primoStudente.eta = 16;

Studente secondoStudente = new Studente();
secondoStudente.nome = "Luca";
secondoStudente.eta = 17;
```

In questo esempio:

- `Studente` è la classe;
- `primoStudente` e `secondoStudente` fanno riferimento a due oggetti diversi;
- `new Studente()` crea un nuovo oggetto;
- il punto permette di accedere agli elementi dell'oggetto.

## 5. Attributi e metodi di un oggetto

- Gli attributi rappresentano lo **stato** di un oggetto.
- I metodi rappresentano il **comportamento** di un oggetto.

La classe `Studente` può contenere sia attributi sia metodi:

```java
public class Studente {
    String nome;
    int eta;

    void presentati() {
        IO.println("Mi chiamo " + nome + " e ho " + eta + " anni");
    }
}
```

La classe può essere utilizzata nel programma principale:

```java
public class Main {
    public static void main(String[] args) {
        Studente studente = new Studente();
        studente.nome = "Anna";
        studente.eta = 16;

        studente.presentati();
    }
}
```

L'espressione seguente accede a un attributo:

```java
studente.nome
```

L'espressione seguente richiama un metodo:

```java
studente.presentati();
```

## 6. Gestire gli errori con try-catch

Durante l'esecuzione di un programma può verificarsi un errore. Se l'errore non
viene gestito, il programma può interrompersi.

Il costrutto `try-catch` permette di provare a eseguire alcune istruzioni e di
stabilire cosa fare se si verifica un errore.

```java
try {
    // Istruzioni che potrebbero causare un errore.
} catch (Exception errore) {
    // Istruzioni eseguite se si verifica un errore.
}
```

Funzionamento:

- Java prova a eseguire le istruzioni presenti nel blocco `try`;
- se non si verificano errori, il blocco `catch` viene ignorato;
- se si verifica un errore, Java interrompe il blocco `try`;
- Java esegue le istruzioni presenti nel blocco `catch`;
- dopo il `catch`, il programma può continuare con le istruzioni successive.

Esempio con l'inserimento di un numero:

```java
try {
    String testo = IO.readln("Inserisci un numero intero: ");
    int numero = Integer.parseInt(testo);
    IO.println("Hai inserito: " + numero);
} catch (Exception errore) {
    IO.println("Il valore inserito non è valido");
}

IO.println("Fine del programma");
```

Il codice che potrebbe produrre un errore viene inserito nel `try`. Il `catch`
contiene invece le istruzioni da eseguire quando qualcosa non va come previsto.

`Exception errore` rappresenta in modo generico l'errore che è stato
intercettato. Il nome `errore` può essere scelto dal programmatore.

Il `try-catch` non serve a nascondere gli errori di programmazione. Serve a
gestire situazioni impreviste e a mostrare all'utente un messaggio comprensibile.

## 7. Riepilogo

| Concetto | Significato |
|---|---|
| Metodo | Blocco di istruzioni che svolge un compito. |
| Parametro | Variabile attraverso la quale un metodo riceve un valore. |
| Argomento | Valore utilizzato durante la chiamata di un metodo. |
| `return` | Restituisce il risultato prodotto da un metodo. |
| Classe | Modello che descrive dati e comportamenti. |
| Oggetto | Elemento concreto creato a partire da una classe. |
| Attributo | Dato appartenente a un oggetto. |
| `new` | Parola chiave utilizzata per creare un oggetto. |
| `try` | Blocco contenente istruzioni che potrebbero causare un errore. |
| `catch` | Blocco eseguito quando viene intercettato un errore. |

Una classe descrive che cosa possiedono e che cosa possono fare i suoi oggetti.
