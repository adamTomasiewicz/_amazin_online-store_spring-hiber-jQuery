-------
### ABOUT:
--------
```
OnlineStore to serwis internetowy, na którym można kupić:
książki, gry planszowe i gry video

```
-------
### BACK END:
--------
```
controller:
-OnlineStoreController
model:
-klasy: Book, BoardGame, VideoGame 
-klasa AbstractProductUtils
dao:
Hibernate JPA/postgresSQL

service:
-upload file/download file
pdf z ksiazka, jar/zip z grą, jpg z okladka

```
--------
### FRONT END i STRUNKTURA STRONY:
--------
```
kolorystyka:
-ciemny niebieski górny pasek menu
-reszta strony biel i odcienie szarości
-zauważalne granice pomiędzy divami w odcieniach szarości

top menu strony:
-klikalne logo, home, onlineStore, o nas, pasek wyszukiwania, zaloguj

podstrony:
-index.html , online-store.html , add-product.html , about-us.html , my-account.html
-style.css
-thymeleaf=>mapowanie obiektów java do html

strony na których mozemy sie wzorować:
```
#-spolecznosciówki
- [https://www.facebook.com/](https://www.facebook.com/)
- [https://www.linkedin.com/](https://www.linkedin.com/)
- [https://github.com/](https://github.com/)
- [https://www.filmweb.pl/](https://www.filmweb.pl/)
- [https://www.youtube.com/](https://www.youtube.com/)

#-sklepy
- [https://allegro.pl/](https://allegro.pl/)
- [https://www.x-kom.pl/](https://www.x-kom.pl/)
- [https://www.morele.net/](https://www.morele.net/)
- [https://www.amazon.com/](https://www.amazon.com/)
- [https://www.empik.com/](https://www.empik.com/)

--------
### POMYSLY:
--------
```
-koszyk produktow
-zaloguj/moje konto
-wyskakujace okienko formularza logowania
-klasa Users tabela users => spring auth
-klasa Comments => mongoDB+hibernate
-po zalogowaniu przycisk resetujący bazy i stronę do stanu poczatkowego
-rest webserwis z możliwością dodawania produktów
-aplikacja w Javie FX do wyswietlania produktow
-symulowanie ruchu na stronie, zamowień i dostaw produktow
-możliwość dodania komentarze pod produktem
```