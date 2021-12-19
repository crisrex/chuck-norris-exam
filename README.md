# Examen de prácticas PMDM 19/12/2021
Se trata de completar este programa de modo que quede totalmente funcional de modo que la app muestre un chiste sobre Chuck Norris cuando se lanza y se irá mostrando un chiste diferente cada vez que se pulse el botón Recargar. 

## Calificación
 El programa se calificará como APTO o No APTO. El calificarse como no APTO supondrá que no se calificarán las prácticas "Peliculeitor" y "GuasApp" al considerar que no las ha podido realizar el alumno por su cuenta.

## Nota Importante
Para la resolución de este ejercicio, no se podrá hacer uso de la navegación por ninguna página de Internet. Si se encuentra al alumno usando algún material de referencia que no sea la propia del IDE utilizado supondrá el considerarse "No APTO".

## Hora máxima de entrega 
20 diciembre de 2021 a las 11 horas.

## Repositorio de entrega
https://classroom.github.com/a/ogtZBIuj

## Ayuda API Chuck Norris
Retrieve a random chuck joke in JSON format.

https://api.chucknorris.io/jokes/random
Example response:

{
"icon_url" : "https://assets.chucknorris.host/img/avatar/chuck-norris.png",
"id" : "h9KhzVk2S7arQHjdm9a8fA",
"url" : "",
"value" : "There is a common misconception among Star Wars fans. Chuck Norris shot first, not Han Solo."
}
Get me a new one ... (press "r" to refresh)
Retrieve a random chuck norris joke from a given category.

https://api.chucknorris.io/jokes/random?category={category}
Retrieve a list of available categories.

https://api.chucknorris.io/jokes/categories
Free text search.

https://api.chucknorris.io/jokes/search?query={query} 
