# jonas_site
Jonas leert programmeren

## Doel
Hoe zet ik een simpele, hedendaagse site op
. versioned code
.. versioning system
... connecteert met repository
... houdt lokale changes bij
... regelt merges ?!? in de mate van het mogelijke
. db als persisten storage systeem
.. SQL, mongo, ...  ???
. java als backend
.. build tool
... compiled code per module
... draait lokale testen
.... unit
.... integration
.... end-to-end
... regelt packaging
. javascript als frontend
.. build tool
... regelt packaging
... draait testen
... mogelijkheid tot lokaal serven van code --> speelt voor frontend server
.. package manager
... gaat packages afhalen van nexus
. lokale of embedded deployment server
.. tomcat
.. jetty
.. `...`
. pushen naar versioning systeem
. automatische build triggeren
.. draait testen op andere machine
.. deployen nieuwe versie online

### buiten de kwestie
. docker
. hudson/jenkins/jarvis
. heroku

## Steps
1. leer een versioning system kennen --> in jouw geval [git](https://git-scm.com/ "git website").
2. leer over [gradle](https://gradle.org/) en [maven](https://maven.apache.org/) --> build tools
3. optionele stap: package managers (zijn mee opgenomen in de build tools voor java, dit is echter niet het geval voor javascript, npm)
4. java basics, packages, classes, conventions, patronen, modules, app structure, design, TDD
5. Databases en persisteren
6. Main app, dependency injection, DDD, REST, modules
7. next step: build automation
8. Deploy van de app lokaal - online
?. vraag aan Sander hoe alles in elkaar steekt
