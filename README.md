-------
### ABOUT:
--------
serwis internetowy, na którym będzie można kupić/wyporzyczyć:
1)Books, 2)BoardGames, 3)VideoGames
nazwa serwisu?:(polska czy angielska)
onlineStore? amazin?

-------
### BACK END:
--------
controller:
-web service controller=>spring boot
model:
-klasa AbstractProduct 
-klasy rozszerzające: Book, BoardGame, VideoGame 
dao:
a)ListRepository
b)PostgreSQLJDBC
c)Hibernate JPA

service:
-upload file/download file?=>spring framework
pdf z ksiazka, jar/zip z grą, jpg z okladka
view:
-index.html , shop.html , aboutUs.html/contactUs.html , myAccount.html
-style.css
-thymeleaf=>mapowanie obiektów java do html

--------
### FRONT END i STRUNKTURA STRONY:
--------
top menu div strony(od lewej):
-klikalne logo(przenoszące do sterony glownej)
-pasek wyszukiwania
-navbar do podstron (sklep, o nas, kontakt/czat,)
-koszyk produktow
-zaloguj/moje konto
lewy div:
-kategorie
środkowy div:
-glowna tresc podstrony
div po prawej:
-galeria?reklamy?wykorzystane technologie?
kolorystyka:
-ciemny niebieski górny pasek menu
-reszta strony biel i odcienie szarości
-granice pomiędzy divami w odcieniach szarości

strony na których mozemy sie wzorować:
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
### W PRZYSZLOŚCI:
--------
-klasa Users tabela users => postgres+hibernate_spring auth
-klasa Comments => mongoDB+hibernate
-wyskakujace okienko formularza logowania
-po zalogowaniu przycisk resetujący bazy i stronę do stanu poczatkowego
poczytać https://frontendmasters.com/books/front-end-handbook/2019/#3.1
Rest/Angular/Vue
opcjonalny rest webserwis: 
opcja dodawanie produktów?
opcjonalna aplikacja konsolowa/swing/javafx odwolujaca sie do serwisu:
symulowanie ruchu na stronie, zamowień i dostaw produktow?
po zakupie zadowolny klient mógłby ocenić produkt i zostawiać komentarz? 
:)