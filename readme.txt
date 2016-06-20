De volgende regels moeten door de generator ingevuld worden
13
14
66-71
197-210

Speekt allemaal redelijk voor zich hoop ik. Misschien 66-71 (connectToSlaves) niet helemaal: dit moet een lijstje zijn van alle directe volgers. Blijkbaar kan dat bluetooth ding maar 3 kanalen aan, dus er is een maximum van 3 volgers (dat is er in de Platoon taal niet geloof ik).

Regels 16-34 heb ik gekopieerd van hun bestand, was volgens mij de bedoeling om dat bestandje te includen/importen ofzo, maar geen idee hoe dat moest. Dit werkt ook.

Nog een design decision die ik heb gemaakt:
Turning (left or right) is only executed when the car in front is too far away. As long as the car is directly in front, the following car shouldn't turn yet. Only when the car in front drives away after turning, the following car should turn and follow. So only when the sensor detects that there is no car directly in front, it checks for the last received command, and turns left or right accordingly.

Dit werkt natuurlijk niet helemaal, maar het is zo'n beetje onmogelijk om het goed te laten werken, en dit laat iig zien dat we er een beetje over na hebben gedacht.