# Ohjelmistotekniikka, harjoitustyö

## Dokumentointi

- [Vaatimusmäärittely](https://github.com/kialindqvist/ot-harjoitustyo/blob/master/dokumentointi/vaatimusmaarittely.md)
- [Tuntikirjanpito](https://github.com/kialindqvist/ot-harjoitustyo/blob/master/dokumentointi/tuntikirjanpito.md)
- [Arkkitehtuurikuvaus](https://github.com/kialindqvist/ot-harjoitustyo/blob/master/dokumentaatio/arkkitehtuuri.md)

## Komentorivitoiminnot
### Testaus
Testit suoritetaan komennolla

    mvn test

Testikattavuusraportti luodaan komennolla
   
    mvn jacoco:report

Kattavuusraporttia voi tarkastella avaamalla selaimella tiedosto target/site/jacoco/index.html
### Checkstyle
Tarkistukset suoritetaan komennolla

    mvn jxr:jxr checkstyle:checkstyle

Mahdolliset virheilmoitukset selviävät avaamalla selaimella tiedosto target/site/checkstyle.html

