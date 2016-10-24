# jonas_site
Jonas leert programmeren

## Doel
Hoe zet ik een simpele, hedendaagse site op
1.versioned code
 a. versioning system
  - connecteert met repository
  - houdt lokale changes bij
  - regelt merges ?!? in de mate van het mogelijke
2. db als persisten storage systeem
 a. SQL, mongo, ...  ???
3. java als backend
 a. build tool
  - compiled code per module
  - draait lokale testen
    - unit
    - integration
    - end-to-end
  - regelt packaging
4. javascript als frontend
 a. build tool
  - regelt packaging
  - draait testen
  - mogelijkheid tot lokaal serven van code --> speelt voor frontend server
 b. package manager
  -  gaat packages afhalen van nexus
5. lokale of embedded deployment server
  a. tomcat
  b. jetty
  c. `...`
6. pushen naar versioning systeem
7. automatische build triggeren
 a. draait testen op andere machine
 b. deployen nieuwe versie online

### buiten de kwestie
1. docker
2. hudson/jenkins/jarvis
3. heroku

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
