# Esercizi base su classi e oggetti

## Esercizio 1  Bicicletta

### Classe Bicicletta

Creare una classe `Bicicletta` con due attributi:

- `marca`, di tipo `String`;
- `velocita`, di tipo `int`.

Creare un costruttore che:

- riceva la marca della bicicletta;
- assegni la marca ricevuta all'attributo `marca`;
- imposti la velocità iniziale a `0`.

Creare due metodi:

- `accelera()`, che aumenta la velocità di `5`;
- `frena()`, che diminuisce la velocità di `5`.

### Classe Main

Nel metodo `main`:

1. creare un oggetto `Bicicletta`;
2. stampare marca e velocità iniziale;
3. richiamare il metodo `accelera()`;
4. stampare nuovamente la velocità;
5. verificare che la velocità sia aumentata;
6. richiamare il metodo `frena()`;
7. stampare ancora la velocità;
8. modificare direttamente la marca;
9. stampare la nuova marca.


## Esercizio 2  Lampadina

### Classe Lampadina

Creare una classe `Lampadina` con due attributi:

- `colore`, di tipo `String`;
- `accesa`, di tipo `boolean`.

Creare un costruttore che:

- riceva il colore della lampadina;
- imposti `accesa` a `false`.

Creare due metodi:

- `accendi()`, che assegna `true` all'attributo `accesa`;
- `spegni()`, che assegna `false` all'attributo `accesa`.

### Classe Main

Nel metodo `main`:

1. creare una lampadina;
2. stampare il suo colore;
3. stampare il valore iniziale di `accesa`;
4. richiamare `accendi()`;
5. stampare nuovamente `accesa` e verificare il cambiamento;
6. richiamare `spegni()`;
7. stampare ancora `accesa`;
8. modificare direttamente il colore;
9. stampare il nuovo colore.

## Esercizio 3  Giocatore

### Classe Giocatore

Creare una classe `Giocatore` con due attributi:

- `nome`, di tipo `String`;
- `punteggio`, di tipo `int`.

Creare un costruttore che:

- riceva il nome del giocatore;
- imposti il punteggio iniziale a `0`.

Creare due metodi:

- `segnaPunto()`, che aumenta il punteggio di `1`;
- `azzeraPunteggio()`, che riporta il punteggio a `0`.

### Classe Main

Nel metodo `main`:

1. creare un giocatore;
2. stampare nome e punteggio iniziale;
3. richiamare `segnaPunto()` tre volte;
4. stampare il punteggio e verificare che sia diventato `3`;
5. modificare direttamente il punteggio assegnando il valore `10`;
6. stampare il nuovo punteggio;
7. richiamare `azzeraPunteggio()`;
8. verificare che il punteggio sia tornato a `0`.

## Esercizio 4  Conto telefonico

### Classe ContoTelefonico

Creare una classe `ContoTelefonico` con due attributi:

- `proprietario`, di tipo `String`;
- `credito`, di tipo `int`.

Creare un costruttore che riceva e assegni entrambi i valori iniziali.

Creare due metodi:

- `ricarica(int importo)`, che aggiunge `importo` al credito;
- `effettuaChiamata()`, che diminuisce il credito di `1`.

### Classe Main

Nel metodo `main`:

1. creare un conto telefonico con credito iniziale pari a `5`;
2. stampare proprietario e credito;
3. richiamare `ricarica(10)`;
4. stampare il credito e verificare che sia diventato `15`;
5. richiamare `effettuaChiamata()` due volte;
6. stampare il credito e verificare che sia diventato `13`;
7. modificare direttamente il proprietario;
8. stampare il nuovo proprietario.
